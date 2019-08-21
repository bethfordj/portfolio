CREATE TABLE ourtable (
        id serial primary key,
        name varchar(10)
);

SELECT * FROM ourtable;

-- Can select the next sequence to use using nextval()
SELECT nextval('ourtable_id_seq');

-- Can use nextval() as a subquery in an insert
INSERT INTO ourtable (id, name) VALUES ( (SELECT nextval('ourtable_id_seq')), 'Steve');

-- Can use DEFAULT to get the next value
INSERT INTO ourtable (id, name) VALUES ( DEFAULT, 'John');

-- Can ignore the column to get the next sequence
INSERT INTO ourtable (name) VALUES ('Andrew');

-- Can add the next number manually
INSERT INTO ourtable (id, name) VALUES (14, 'Stephanie');

-- BUT If the number you use is not yet been the sequence, it will causes a conflict when that number is used the sequence
INSERT INTO ourtable (name) VALUES ('Rachelle');

-- Create a custom sequence and optionally set its initial value
CREATE SEQUENCE our_custom_sequence START 101;

SELECT nextval('our_custom_sequence');

-- Can Alter an sequence to restart it OR change its increment
ALTER SEQUENCE our_custom_sequence RESTART 1000 INCREMENT BY 2;

-- Drop a Sequence
DROP SEQUENCE our_custom_sequence;

START TRANSACTION;
        INSERT INTO ourtable (name) VALUES ('Ben');
ROLLBACK;

SELECT * FROM ourtable;

DROP TABLE ourtable;

