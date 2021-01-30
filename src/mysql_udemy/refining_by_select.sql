
SELECT DISTINCT author_fname,author_lname FROM Books;

SELECT DISTINCT(CONCAT(author_fname," ",author_lname)) as "Full name" FROM Books;

SELECT author_lname FROM books ORDER BY author_lname DESC;

DESC books;

SELECT title FROM Books ORDER BY title;
SELECT released_year as yr FROM books ORDER BY yr ;
SELECT released_year as yr FROM books ORDER BY yr DESC ;

SELECT title, author_fname, author_lname from books ORDER BY 2; -- here 2 is index of author_fname,so sorted out by author_fname

SELECT title, author_fname, author_lname FROM books ORDER BY 3;

SELECT author_lname, author_fname FROM books ORDER BY author_lname, author_fname;

SELECT title, released_year FROM books ORDER BY Released_year DESC LIMIT 5;

SELECT title, released_year FROM books ORDER BY released_year DESC LIMIT 0,5;

SELECT title, released_year FROM books ORDER BY released_year DESC LIMIT 1,3;

SELECT title, released_year FROM BOOKS ORDER BY released_year DESC LIMIT 10,3;

/*
 *  LIKE
 */

SELECT title,author_fname FROM books WHERE author_fname LIKE "%da%";

DESC books;

SELECT Title, stock_quantity from Books where stock_quantity LIKE "____";

SELECT title, stock_quantity FROM books WHERE stock_quantity LIKE "__";

SELECT title FROM Books WHERE title like "%\%%";--'\%'='%' 
SELECT Title FROM Books WHERE title like "%\_%";   -- '\_' ='_'


-- excercise

SELECT Title FROM books WHERE title LIKE "%stories%";

--longest book
select Title, pages FROM Books ORDER BY pages DESC LIMIT 1;

SELECT CONCAT(Title," - ", released_year) as "summary" FROM Books ORDER BY Released_year DESC LIMIT 3;

SELECT title, author_lname FROM Books WHERE author_lname LIKE '% %';

SELECT Title, released_year, stock_quantity FROM Books ORDER BY Stock_quantity LIMIT 3;

SELECT title, author_lname FROM books ORDER BY author_lname, title;

SELECT upper(concat("my favourite ut is ", author_lname, "!")) as yell  FROM books ORDER BY author_lname;

/* 
 *aggregation functions
*/

SELECT COUNT(*) FROM books;

SELECT COUNT(author_fname) FROM books;

SELECT COUNT(DISTINCT author_fname) FROM books;

SELECT COUNT(DISTINCT author_lname, author_fname) FROM books;
SELECT DISTINCT author_fname,author_lname FROM Books;

SELECT title FROM books WHERE title LIKE '%the%';

SELECT count(*) FROM Books WHERE title LIKE '%the%';

SELECT title, author_lname, author_fname FROM books;

SELECT title,author_lname,author_fname FROM Books GROUP BY Author_lname;
SELECT author_lname, author_fname, count(*) FROM books GROUP BY author_lname,author_fname;

SELECT released_year, count(*) FROM books GROUP BY Released_year;

SELECT min(released_year) FROM Books;
SELECT MIN(pages) FROM books;

SELECT MAX(pages) FROM books;

SELECT Title, pages FROM books;

SELECT title,pages FROM books WHERE Pages=(SELECT MAX(pages) FROM books where pages<(SELECT MAX(pages) FROM Books));


--SELECT concat(author_fname," ",author_lname) as author, 
--		title, 
--		min(released_year) FROM Books 
--			GROUP BY author_lname,author_fname;

SELECT author_fname, author_lname, MIN(released_year)
	FROM books
	GROUP BY author_fname, author_lname
	
	
SELECT author_fname,author_lname, MAX(pages)as pages
	FROM books
	GROUP BY author_fname,author_lname;
	
SELECT SUM(pages) FROM Books;

SELECT SUM(released_year) FROM books;

SELECT author_fname,author_lname, SUM(pages)
	FROM books
	GROUP BY author_fname,author_lname;
	
SELECT author_fname,author_lname, SUM(released_year)
	FROM Books
	GROUP BY author_fname,author_lname
	

SELECT AVG(Released_year) FROM books;

DESC books;

SELECT AVG(Stock_quantity), released_year 
	FROM books
	GROUP BY released_year
	
SELECT author_fname, author_lname, AVG(Pages)
	FROM books
	GROUP BY author_lname,author_fname;

--print the number of books
SELECT COUNT(*) FROM BOOKS;

SELECT RELEASED_year, COUNT(RELEASED_year) 
	FROM books
	GROUP BY RELEASED_year;
	
SELECT SUM(Stock_quantity) FROM books;

SELECT author_fname,author_lname, AVG(released_year)
	FROM Books
	GROUP BY author_lname,author_fname
	
SELECT concat(author_fname," ",author_lname) as author,pages
	FROM books 
	WHERE pages=(SELECT MAX(pages) FROM Books)
	
--or

SELECT concat(author_fname," ",author_lname) as author,pages
	FROM books
	ORDER BY pages DESC LIMIT 1
	
SELECT released_year as "year", count(*) as "# books", AVG(pages) as "avg pages"
	FROM books
	GROUP BY released_year
	ORDER BY released_year