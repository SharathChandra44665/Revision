CREATE TABLE cats(
 name VARCHAR(100),
 age INT
)

SHOW COLUMNS FROM cats;

DESC cats;

DROP TABLE cats;
SHOW TABLES;
DESC cats;

CREATE TABLE pastries(
	cake_name VARCHAR(50),
	quantity INT
	
)

DESC pastries;
SHOW COLUMNs FROM pastries;
DROP TABLE pastries;

/*executed create table of cats*/
INSERT INTO cats(name,age) VALUES ('Blue',1);
INSERT INTO cats(age,name) VALUES(11, 'Draco');

/* inserting multiple values*/
INSERT INTO cats(name,age) VALUES('Charlie',10),('Sadie', 3), ('Lazy Bear',1);
SELECT * FROM cats;

CREATE TABLE people(
first_name VARCHAR(20),
last_name VARCHAR(20),
age INT);

INSERT INTO people VALUES('Tina',  'Belcher', 13)
SELECT * FROM people;
INSERT INTO People(age, last_name, first_name) VALUES (42, 'Belcher', 'Bob');
INSERT INTO people VALUES ('Linda','Belcher',45),('Phillip','Frond', 38),('Calvin', 'Fischoeder',70);

INSERT INTO cats(name, age)
VALUES('This is some text blah blah blah blah blah text text text something about cats lalalalal meowwwwwwwwwww', 10);
INSERT INTO cats(name, age) VALUES('Lima', 'dsfasdfdas');
SHOW WARNINGS;

INSERT INTO cats (name)
VALUES('Alabama');

SELECT * FROM cats

INSERT INTO cats() VALUES()

DROP TABLE cats2;
CREATE TABLE cats2(name VARCHAR(100) NOT NULL , 
age INT NOT NULL );
desc cats2

INSERT INTO cats2(name) VALUES ('Texas');
SHOW WARNINGS;
SELECT * FROM cats2;

CREATE TABLE cats3(name VARCHAR(100) DEFAULT 'no name exist',
age INT DEFAULT 99);

DESC cats3;

INSERT INTO Cats3(age) values(13);
SELECT * FROM Cats3;

INSERT INTO cats3(name,age)VALUES('Montana',NULL)/* You can manually insert null values */
/* to avoid we can do this*/

CREATE TABLE cats4(name VARCHAR(100) NOT NULL DEFAULT 'Un_named',
age INT NOT NULL DEFAULT 99);

INSERT INTO Cats4() VALUES();
SELECT * FROM Cats4;
INSERT INTO cats4(name) VALUES(NULL)/* you cannot do this now*/

CREATE TABLE unique_cats(cat_id INT NOT NULL,
name VARCHAR(20),
age INT,
PRIMARY KEY(cat_id));

DESC unique_cats;
INSERT INTO Unique_cats(cat_id,name, age) VALUES(1,'Bell',4);
SELECT * FROM unique_cats;
INSERT INTO Unique_cats(cat_id,name, age) VALUES(2,'Bell',4);
INSERT INTO Unique_cats(cat_id,name, age) VALUES(3,'trump',12);
INSERT INTO Unique_cats(cat_id,name, age) VALUES(2,'qwer',12);
SHOW WARNINGS;

/* auto increment*/

CREATE TABLE unique_cats2(cat_id INT NOT NULL AUTO_INCREMENT,
name VARCHAR(100),
age INT, PRIMARY KEY(cat_id) );