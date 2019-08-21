-- ********* INNER JOIN ***********

-- Let's find out who made payment 16666:

Select *
From payment
Where payment_id = 16666;

-- Ok, that gives us a customer_id, but not the name. We can use the customer_id to get the name FROM the customer table

Select *
From payment
Join customer On payment.customer_id = customer.customer_id
Where payment_id = 16666;

-- We can see that the * pulls back everything from both tables. We just want everything from payment and then the first and last name of the customer:

Select payment.*, customer.first_name, customer.last_name
From payment
Join customer On payment.customer_id = customer.customer_id
Where payment_id = 16666;

-- But when did they return the rental? Where would that data come from? From the rental table, so let’s join that.

Select payment.*, customer.first_name, customer.last_name, rental.return_date
From payment
Join customer On payment.customer_id = customer.customer_id
Join rental On payment.rental_id = rental.rental_id
Where payment_id = 16666;

-- What did they rent? Film id can be gotten through inventory.

Select payment.*, customer.first_name, customer.last_name, rental.return_date, film.title
From payment
Join customer On payment.customer_id = customer.customer_id
Join rental On payment.rental_id = rental.rental_id
Join inventory On inventory.inventory_id = rental.inventory_id
Join film On film.film_id = inventory.film_id
Where payment_id = 16666;

-- What if we wanted to know who acted in that film?

Select * From film
Join film_actor On film_actor.film_id = film.film_id
Join actor On actor.actor_id = film_actor.actor_id
Where film.film_id = 948;

-- What if we wanted a list of all the films and their categories ordered by film title
Select f.title, c.name From film f
Join film_category fc ON f.film_id = fc.film_id
Join category c On c.category_id = fc.category_id
Order By f.title;
-- Show all the 'Comedy' films ordered by film title
Select f.title, c.name From film f
Join film_category fc ON f.film_id = fc.film_id
Join category c On c.category_id = fc.category_id
Where c.name = 'Comedy'
Order By f.title;
-- Finally, let's count the number of films under each category

Select c.name, Count(c.name) From film f
Join film_category fc ON f.film_id = fc.film_id
Join category c On c.category_id = fc.category_id
Group By c.name
Order By c.name;

-- ********* LEFT JOIN ***********

-- (There aren't any great examples of left joins in the "dvdstore" database, so the following queries are for the "world" database)

-- A Left join, selects all records from the "left" table and matches them with records from the "right" table if a matching record exists.

-- Let's display a list of all countries and their capitals, if they have some.

-- Only 232 rows
-- But we’re missing entries:

-- There are 239 countries. So how do we show them all even if they don’t have a capital?
-- That’s because if the rows don’t exist in both tables, we won’t show any information for it. If we want to show data FROM the left side table everytime, we can use a different join:

-- *********** UNION *************

-- Back to the "dvdstore" database...

-- Gathers a list of all first names used by actors and customers
-- By default removes duplicates

-- Gather the list, but this time note the source table with 'A' for actor and 'C' for customer
