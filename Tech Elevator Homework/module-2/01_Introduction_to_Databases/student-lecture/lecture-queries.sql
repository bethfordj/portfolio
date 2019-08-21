-- SELECT ... FROM
-- Selecting the names for all countries
SELECT name FROM country;

-- Selecting the name and population of all countries
Select name,population from country;

-- Selecting all columns from the city table

SELECT * FROM city;
-- SELECT ... FROM ... WHERE
-- Selecting the cities in Ohio
SELECT name,district FROM city WHERE district = 'Ohio';

-- Selecting countries that gained independence in the year 1776


-- Selecting countries not in Asia


-- Selecting countries that do not have an independence year

-- Selecting countries that do have an independence year

select * from country where indepyear is not null;
-- Selecting countries that have a population greater than 5 million

select * from country where population > 5000000;

-- SELECT ... FROM ... WHERE ... AND/OR
-- Selecting cities in Ohio and Population greater than 400,000
select * from city where district = 'Ohio' and population > 400000;
-- Selecting country names on the continent North America or South America

select name from country where continent = 'North America' or continent = 'SouthAmerica';

select name from country where continent in('North America', 'South America');
-- SELECTING DATA w/arithmetic
-- Selecting the population, life expectancy, and population per area
--	note the use of the 'as' keyword

select name, population, lifeexpectancy, (population / surfacearea) as population_per_area from country;

