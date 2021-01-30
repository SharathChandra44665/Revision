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

SELECT CAST('2021-1-30' AS DATETIME);

SELECT Title, author_lname FROM books where author_lname='lahiri' or author_lname='smith' OR author_lname='Carver';

SELECT Title, author_lname FROM books where 
	author_lname IN ('lahiri', 'smith', 'CarveR' );
	
SELECT * FROM books;

SELECT title, released_year FROM Books
	WHERE released_year >=2000 AND released_year%2=0 ORDER BY released_year;


SELECT title, released_year FROM Books
	WHERE released_year%2=1 ORDER BY released_year;
	
SELECT title, released_year FROM Books
	WHERE released_year >=2000 AND released_year%2=1 ORDER BY released_year;
	
SELECT title, released_year,
	case
		when released_year >=2000 then "Modern Lit"
		else "20th Century"
	end AS Genre
	FROM books;
	
	
	
SELECT title, stock_quantity,
	CASE
		
		WHEN stock_quantity<= 50 THEN "*"
		WHEN stock_quantity >50 AND stock_quantity <100 THEN "**"
		ELSE "***"
	END AS stock
	
	FROM books
	
/*
 * 0
 * 1
 * 1
 * 
	
*/
	
SELECT title, released_year FROM Books WHERE Released_year != 1980;
SELECT title, released_year FROM Books WHERE Released_year not in(1980) ;

SELECT Title, author_lname FROM books where author_lname in('Eggers', 'Chabon');

SELECT title,author_lname, released_year from books WHERE AUTHOR_lname ='Lahiri' and released_year> 2000;

desc books;


SELECT Title, pages FROM books where pages BETWEEN 100 AND 200;

SELECT Title, author_lname FROM Books WHERE Author_lname like 'C%' or Author_lname like 'S%';


SELECT Title, author_lname,
	CASE
		WHEN Title Like '%stories%' THEN 'Short stories'
		WHEN (Title Like '%Just Kids%') OR (Title Like '%A Heartbreaking Work%') then "Memoir"
		ELSE "Novel"
	END AS "TYPE"
	
	FROM books;

	
SELECT Title, author_lname, 
	CASE
		WHEN COUNT(author_lname)=1 THEN CONCAT(COUNT(author_lname)," book")
		ELSE CONCAT(COUNT(author_lname)," books")
	END as "count"
	FROM BOOKS
	group by author_lname;