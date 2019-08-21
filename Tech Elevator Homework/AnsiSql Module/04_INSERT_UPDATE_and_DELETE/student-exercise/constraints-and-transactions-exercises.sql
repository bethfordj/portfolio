-- Write queries to return the following:
-- The following changes are applied to the "dvdstore" database.**

-- 1. Add actors, Hampton Avenue, and Lisa Byway to the actor table.

Insert Into actor Values (201, 'Hampton', 'Avenue');
Insert Into actor Values (202, 'Lisa', 'Byway');

-- 2. Add "Euclidean PI", "The epic story of Euclid as a pizza delivery boy in
-- ancient Greece", to the film table. The movie was released in 2008 in English.
-- Since its an epic, the run length is 3hrs and 18mins. There are no special
-- features, the film speaks for itself, and doesn't need any gimmicks.

Select * From film
Insert Into film (film_id, title, description, release_year, language_id, length, rating)
Values (1001, 'Euclidean Pi', 'The epic story of Euclid as a pizza delivery boy in ancient Greece', 2008, 1, 198, 'PG');

-- 3. Hampton Avenue plays Euclid, while Lisa Byway plays his slightly
-- overprotective mother, in the film, "Euclidean PI". Add them to the film.

Insert Into film_actor (film_id, actor_id)
Values (1001, 201);

Insert Into film_actor (film_id, actor_id)
Values (1001, 202);

-- 4. Add Mathmagical to the category table.

Insert Into category (category_id, name)
Values(17, 'Mathmagical');

-- 5. Assign the Mathmagical category to the following films, "Euclidean PI",
-- "EGG IGBY", "KARATE MOON", "RANDOM GO", and "YOUNG LANGUAGE"

Select film_id, title From film
Where title = 'EGG IGBY' Or title = 'KARATE MOON' Or title = 'RANDOM GO' Or title = 'YOUNG LANGUAGE'  Or title = 'Euclidean PI' AND film_id = 1001;

Insert Into film (film_id, title, language_id)
Values(1002, 'EGG IGBY', 1)
Insert Into film (film_id, title, language_id)
Values(1003, 'KARATE MOON', 1)
Insert Into film (film_id, title, language_id)
Values(1004, 'RANDOM GO', 1)
Insert Into film (film_id, title, language_id)
Values(1005, 'YOUNG LANGUAGE', 1)

Insert Into film_category (film_id, category_id) Values (1001, 17);
Insert Into film_category (film_id, category_id) Values (1002, 17);
Insert Into film_category (film_id, category_id) Values (1003, 17);
Insert Into film_category (film_id, category_id) Values (1004, 17);
Insert Into film_category (film_id, category_id) Values (1005, 17);

-- 6. Mathmagical films always have a "G" rating, adjust all Mathmagical films
-- accordingly.
-- (5 rows affected)

Update film Set rating = 'G'
Where film_id = 1001 Or film_id = 1002 Or film_id = 1003 Or film_id = 1004 Or film_id = 1005

-- 7. Add a copy of "Euclidean PI" to all the stores.

Select * From inventory
Insert Into inventory Values (4582, 1001, 1)
Insert Into inventory Values (4583, 1001, 2)

-- 8. The Feds have stepped in and have impounded all copies of the pirated film,
-- "Euclidean PI". The film has been seized from all stores, and needs to be
-- deleted from the film table. Delete "Euclidean PI" from the film table.
-- (Did it succeed? Why?)
-- <YOUR ANSWER HERE>

Delete From film Where title = 'Euclidean PI';

-- It did not succeed because there was a foreign key restraint.


-- 9. Delete Mathmagical from the category table.
-- (Did it succeed? Why?)
Delete From category Where name = 'Mathmagical';

-- <No, it did not succeed because its primary key is in film_category.>


-- 10. Delete all links to Mathmagical in the film_category tale.
-- (Did it succeed? Why?)
Delete From film_category Where category_id = 17;

-- <Yes, it did work because there is no constraint on that column of film_category.>

-- 11. Retry deleting Mathmagical from the category table, followed by retrying
-- to delete "Euclidean PI".
-- (Did either deletes succeed? Why?)

-- <Deleting Mathmagical worked because the its key was no longer used in the film_category table. Deleting 'Euclidean PI' did not work because its keys are still used in other tables.>

