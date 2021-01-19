CREATE TABLE books 
	(
		book_id INT NOT NULL AUTO_INCREMENT,
		title VARCHAR(100),
		author_fname VARCHAR(100),
		author_lname VARCHAR(100),
		released_year INT,
		stock_quantity INT,
		pages INT,
		PRIMARY KEY(book_id)
	);

INSERT INTO books (title, author_fname, author_lname, released_year, stock_quantity, pages)
VALUES
('The Namesake', 'Jhumpa', 'Lahiri', 2003, 32, 291),
('Norse Mythology', 'Neil', 'Gaiman',2016, 43, 304),
('American Gods', 'Neil', 'Gaiman', 2001, 12, 465),
('Interpreter of Maladies', 'Jhumpa', 'Lahiri', 1996, 97, 198),
('A Hologram for the King: A Novel', 'Dave', 'Eggers', 2012, 154, 352),
('The Circle', 'Dave', 'Eggers', 2013, 26, 504),
('The Amazing Adventures of Kavalier & Clay', 'Michael', 'Chabon', 2000, 68, 634),
('Just Kids', 'Patti', 'Smith', 2010, 55, 304),
('A Heartbreaking Work of Staggering Genius', 'Dave', 'Eggers', 2001, 104, 437),
('Coraline', 'Neil', 'Gaiman', 2003, 100, 208),
('What We Talk About When We Talk About Love: Stories', 'Raymond', 'Carver', 1981, 23, 176),
("Where I'm Calling From: Selected Stories", 'Raymond', 'Carver', 1989, 12, 526),
('White Noise', 'Don', 'DeLillo', 1985, 49, 320),
('Cannery Row', 'John', 'Steinbeck', 1945, 95, 181),
('Oblivion: Stories', 'David', 'Foster Wallace', 2004, 172, 329),
('Consider the Lobster', 'David', 'Foster Wallace', 2005, 92, 343);


DESC books;

SELECT * FROM books; 

SELECT author_fname, author_lname FROM books;

SELECT CONCAT('Hello',"World");

SELECT CONCAT(author_fname,' ',author_lname) as 'Full Name' FROM books;

SELECT author_fname AS first, author_lname AS last, CONCAT(author_fname,' ',author_lname) as Full FROM books;

/*
 * SELECT author_fname AS First, author_lname AS last, CONCAT(First,' ',last) AS Full FROM books;
 */

/*
 * WS = With Seperator
 */
SELECT CONCAT_WS(" - ",title, author_fname,author_lname) FROM Books;

SELECT SUBSTRING("Hello World",1,4);

SELECT SUBSTRING("Hello World",7); /*output--> World*/

/*
 * negative indexing
 */

SELECT SUBSTRING("Hello World",-3); /*output--> rld*/
SELECT SUBSTRING("Hello World",-7); /*output-->  o World */

SELECT title FROM books;
SELECT SUBSTRING(title,1,10) AS 'Short title' FROM books;

SELECT CONCAT(SUBSTRING(title,1,10),".....") AS 'Short Title' FROM books;

SELECT REPLACE("Hello World","Hell", "#$%^");

SELECT REPLACE("Hello World", "o", "7") AS "replaced";
/*
 * case sensitive
*/

SELECT REPLACE("HellO World", 'o','7') AS "replace";

SELECT REPLACE("Cheese bread coffee milk"," "," and ") AS "REPLACE";

SELECT REPLACE(title,"e",3) AS "e replaced 3" FROM Books;
-- hello this is a single line comment
--SELECT CONCAT(title )
SELECT CHAR_LENGTH("Hello world");

DESC books;

SELECT author_lname as "last name", CHAR_LENGTH(author_lname) as "last name length" FROM books;

--author_lname is 6 charecters long

SELECT CONCAT(author_lname," is ", CHAR_LENGTH(author_lname), " charecters long") AS "Lname length" FROM books;

SELECT REVERSE(UPPER("why does my cat look at me with such hatred?")) as "Text";

--I-like-cats

SELECT REPLACE(title," ","->") as "Title" FROM books;

SELECT author_lname AS "forwards", REVERSE(author_lname) AS "Backwards" FROM books;

SELECT CONCAT(UPPER(author_fname)," ",UPPER(author_lname)) AS "full name in caps" FROM Books;
-- modifying above code
SELECT UPPER(CONCAT((author_fname)," ",(author_lname))) AS "full name in caps" FROM Books;

DESC Books;
--select stock_quantity FROM books;

SELECT CONCAT(title," was released in ", released_year) AS "Blurb" FROM Books;

SELECT title, CHAR_LENGTH(title) AS "charecter count" FROM Books;

SELECT CONCAT(SUBSTRING(title,1,10),"...") AS "short title", 
	CONCAT(author_Lname,",",author_Fname) AS "author", 
	CONCAT(stock_quantity, " in stock") AS "quantity" 
	FROM BOOKS 
	WHERE BOOK_ID IN (3,9)

	
INSERT INTO books
    (title, author_fname, author_lname, released_year, stock_quantity, pages)
    VALUES ('10% Happier', 'Dan', 'Harris', 2014, 29, 256), 
           ('fake_book', 'Freida', 'Harris', 2001, 287, 428),
           ('Lincoln In The Bardo', 'George', 'Saunders', 2017, 1000, 367);

--DISTINCT

--SELECT DISTINCT author_lname FROM books;

INSERT INTO books (title, author_fname, author_lname, released_year, stock_quantity, pages) VALUES ( '10% Happier' , 'Dan' , 'Harris' , 2014 , 29 , 256 ), ( 'fake_book' , 'Freida' , 'Harris' , 2001 , 287 , 428 ), ( 'Lincoln In The Bardo' , 'George' , 'Saunders' , 2017 , 1000 , 367 );

SELECT title FROM Books;

