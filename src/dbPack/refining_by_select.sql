
SELECT DISTINCT author_fname,author_lname FROM Books;

SELECT DISTINCT(CONCAT(author_fname," ",author_lname)) as "Full name" FROM Books;