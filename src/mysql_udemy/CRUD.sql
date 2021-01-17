DROP table cats;

CREATE TABLE cats(
cat_id INT NOT NULL AUTO_INCREMENT,
name VARCHAR(100),
breed VARCHAR(100),
age INT,
PRIMARY KEY(cat_id)

);

INSERT INTO cats(name, breed, age) 
VALUES ('Ringo', 'Tabby', 4),
       ('Cindy', 'Maine Coon', 10),
       ('Dumbledore', 'Maine Coon', 11),
       ('Egg', 'Persian', 4),
       ('Misty', 'Tabby', 13),
       ('George Michael', 'Ragdoll', 9),
       ('Jackson', 'Sphynx', 7);
       
SELECT * FROM cats;

SELECT name, age FROM cats;

SELECT * FROM Cats WHERE age=4;

SELECT * FROM Cats WHERE name='Egg';
SELECT * FROM Cats WHERE name='EGG';

SELECT cat_id FROM cats;
SELECT name,age FROM cats;

SELECT name,age FROM cats where breed='Tabby';

SELECT cat_id, age FROM cats where cat_id=age;


/*ALIASES*/
SELECT cat_id AS id, name AS 'cat name', breed AS 'Kitty Breed' FROM cats;

UPDATE cats SET breed='Short hair' WHERE breed='Tabby';
SELECT * FROM cats

UPDATE cats SET age=14 WHERE name='misty';
SELECT * FROM cats


UPDATE cats set name='Jack' where cat_id=7
SELECT * FROM cats

UPDATE cats SET breed='British Shorthair' WHERE name='Ringo';
SELECT * FROM cats WHERE name='rINgo';
UPDATE cats SET age=12 WHERE breed='Maine Coon';
SELECT * FROM cats WHERE breed='Maine Coon';

/* delete*/
SELECT * FROM cats WHERE name='egg';

DELETE FROM cats WHERE name="Egg";
SELECT * FROM cats;

DELETE FROM cats WHERE age=4;
SELECT * FROM cats;

SELECT * FROM CATS WHERE Cat_id =age;
DELETE FROM Cats WHERE Cat_id =age;
SELECT * FROM cats;
DELETE FROM cats