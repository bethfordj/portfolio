SELECT * FROM students


INSERT INTO students VALUES ('123', 'no select', 'lastName');

CREATE USER rachelle WITH PASSWORD '123'

GRANT SELECT ON students TO rachelle;

GRANT INSERT ON students TO rachelle;

REVOKE SELECT ON students FROM rachelle;