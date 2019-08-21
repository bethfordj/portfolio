-- The following queries utilize the "dvdstore" database.

-- 1. All of the films that Nick Stallone has appeared in
-- (30 rows)

Select film.title From actor
Join film_actor On actor.actor_id = film_actor.actor_id
Join film On film_actor.film_id = film.film_id
Where actor.first_name = 'NICK' And actor.last_name = 'STALLONE';

-- 2. All of the films that Rita Reynolds has appeared in
-- (20 rows)

Select film.title From actor
Join film_actor On actor.actor_id = film_actor.actor_id
Join film On film_actor.film_id = film.film_id
Where actor.first_name = 'RITA' And actor.last_name = 'REYNOLDS';


-- 3. All of the films that Judy Dean or River Dean have appeared in
-- (46 rows)

Select film.title From actor
Join film_actor On actor.actor_id = film_actor.actor_id
Join film On film_actor.film_id = film.film_id
Where actor.first_name = 'JUDY' Or actor.first_name = 'RIVER' And actor.last_name = 'DEAN';


-- 4. All of the the ‘Documentary’ films
-- (68 rows)

Select film.title From film
Join film_category fc On fc.film_id = film.film_id
Join category c On c.category_id = fc.category_id
Where c.name = 'Documentary';

-- 5. All of the ‘Comedy’ films
-- (58 rows)

Select film.title From film
Join film_category fc On fc.film_id = film.film_id
Join category c On c.category_id = fc.category_id
Where c.name = 'Comedy';

-- 6. All of the ‘Children’ films that are rated ‘G’
-- (10 rows)

Select film.title From film
Join film_category fc On fc.film_id = film.film_id
Join category c On c.category_id = fc.category_id
Where c.name = 'Children' And film.rating = 'G';

-- 7. All of the ‘Family’ films that are rated ‘G’ and are less than 2 hours in length
-- (3 rows)

Select film.title From film
Join film_category fc On fc.film_id = film.film_id
Join category c On c.category_id = fc.category_id
Where c.name = 'Family' And film.rating = 'G' And film.length < 120;

-- 8. All of the films featuring actor Matthew Leigh that are rated ‘G’
-- (9 rows)

Select film.title From actor
Join film_actor On actor.actor_id = film_actor.actor_id
Join film On film_actor.film_id = film.film_id
Where actor.first_name = 'MATTHEW' And actor.last_name = 'LEIGH' And film.rating = 'G';

-- 9. All of the ‘Sci-Fi’ films released in 2006
-- (61 rows)

Select film.title From film
Join film_category fc On fc.film_id = film.film_id
Join category c On c.category_id = fc.category_id
Where c.name = 'Sci-Fi' And film.release_year = 2006;

-- 10. All of the ‘Action’ films starring Nick Stallone
-- (2 rows)

Select film.title From actor
Join film_actor On actor.actor_id = film_actor.actor_id
Join film On film_actor.film_id = film.film_id
Join film_category fc On fc.film_id = film.film_id
Join category c On c.category_id = fc.category_id
Where actor.first_name = 'NICK' And actor.last_name = 'STALLONE' And c.name = 'Action';

-- 11. The address of all stores, including street address, city, district, and country
-- (2 rows)
Select address.address, city.city, address.district, country.country From address
Join store On store.address_id = address.address_id
Join city On address.city_id = city.city_id
Join country On country.country_id = city.country_id;

-- 12. A list of all stores by ID, the store’s street address, and the name of the store’s manager
-- (2 rows)

Select store.store_id, address.address, staff.first_name, staff.last_name From store
Join address On store.address_id = address.address_id
Join staff On staff.staff_id = manager_staff_id

-- 13. The first and last name of the top ten customers ranked by number of rentals 
-- (#1 should be “ELEANOR HUNT” with 46 rentals, #10 should have 39 rentals)

Select (c.first_name || ' ' || c.last_name) as full_name, Count(rental_id) as number_of_rentals From rental
Join customer c On c.customer_id = rental.customer_id
Group By full_name 
Order By number_of_rentals DESC Limit 10;

-- 14. The first and last name of the top ten customers ranked by dollars spent 
-- (#1 should be “KARL SEAL” with 221.55 spent, #10 should be “ANA BRADLEY” with 174.66 spent)

Select (c.first_name || ' ' || c.last_name) as full_name, Sum(amount) as number_of_rentals From payment p
Join customer c On c.customer_id = p.customer_id
Group By full_name 
Order By number_of_rentals DESC Limit 10;

-- 15. The store ID, street address, total number of rentals, total amount of sales (i.e. payments), and average sale of each store 
-- (Store 1 has 7928 total rentals and Store 2 has 8121 total rentals)

Select st.store_id, a.address, Count(r.rental_id) As rental_count From inventory inv
Join rental r On r.inventory_id = inv.inventory_id
Join payment p On r.rental_id = p.rental_id
Join store st On st.store_id = inv.store_id
Join address a On a.address_id = st.address_id
Group By st.store_id, a.address
Order By rental_count;


-- 16. The top ten film titles by number of rentals
-- (#1 should be “BUCKET BROTHERHOOD” with 34 rentals and #10 should have 31 rentals)

Select film.title, Count(r.inventory_id) as number_of_rentals From inventory inv
Join film On film.film_id = inv.film_id
Join rental r On r.inventory_id = inv.inventory_id
Group By film.title
Order By number_of_rentals DESC Limit 10;

-- 17. The top five film categories by number of rentals 
-- (#1 should be “Sports” with 1179 rentals and #5 should be “Family” with 1096 rentals)

Select c.name, Count(r.rental_id) As rental_count From inventory inv
Join rental r On r.inventory_id = inv.inventory_id
Join film On inv.film_id = film.film_id
Join film_category fc On film.film_id = fc.film_id
Join category c On fc.category_id = c.category_id
Group By c.name
Order By rental_count DESC Limit 5;

-- 18. The top five Action film titles by number of rentals 
-- (#1 should have 30 rentals and #5 should have 28 rentals)

Select f.title, Count(r.rental_id) As number_of_rentals From film f
Join inventory inv On f.film_id = inv.film_id
Join rental r On inv.inventory_id = r.inventory_id
Join film_category fc On f.film_id = fc.film_id
Join category c On c.category_id = fc.category_id
Where c.name = 'Action'
Group By f.title
Order By number_of_rentals DESC Limit 5;

-- 19. The top 10 actors ranked by number of rentals of films starring that actor 
-- (#1 should be “GINA DEGENERES” with 753 rentals and #10 should be “SEAN GUINESS” with 599 rentals)

Select (actor.first_name || ' ' || actor.last_name) as full_name, Count(r.rental_id) As number_of_rentals From film f
Join inventory inv On f.film_id = inv.film_id
Join rental r On inv.inventory_id = r.inventory_id
Join film_actor fa On fa.film_id = f.film_id
Join actor On actor.actor_id = fa.actor_id
Group By full_name
Order By number_of_rentals DESC Limit 10 Offset 1;

-- 20. The top 5 “Comedy” actors ranked by number of rentals of films in the “Comedy” category starring that actor 
-- (#1 should have 87 rentals and #5 should have 72 rentals)

Select (actor.first_name || ' ' || actor.last_name) as full_name, Count(r.rental_id) As number_of_rentals From film f
Join inventory inv On f.film_id = inv.film_id
Join rental r On inv.inventory_id = r.inventory_id
Join film_category fc On f.film_id = fc.film_id
Join category c On c.category_id = fc.category_id
Join film_actor fa On fa.film_id = f.film_id
Join actor On actor.actor_id = fa.actor_id
Where c.name = 'Comedy'
Group By full_name
Order By number_of_rentals DESC Limit 5;
