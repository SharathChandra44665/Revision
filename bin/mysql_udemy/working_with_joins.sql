
CREATE TABLE customers(
	id int AUTO_INCREMENT,
	last_name VARCHAR(100),
	first_name VARCHAR(100),
	email VARCHAR(100),
	PRIMARY KEY (id)
);

CREATE TABLE orders(
	id int AUTO_INCREMENT PRIMARY KEY,
	order_date DATE,
	amount DECIMAL(8,2),
	customer_id INT,
	FOREIGN KEY (customer_id) REFERENCES Customers(id)
);


INSERT INTO customers (first_name, last_name, email) 
VALUES ('Boy', 'George', 'george@gmail.com'),
       ('George', 'Michael', 'gm@gmail.com'),
       ('David', 'Bowie', 'david@gmail.com'),
       ('Blue', 'Steele', 'blue@gmail.com'),
       ('Bette', 'Davis', 'bette@aol.com');
       
INSERT INTO orders (order_date, amount, customer_id)
VALUES ('2016/02/10', 99.99, 1),
       ('2017/11/11', 35.50, 1),
       ('2014/12/12', 800.67, 2),
       ('2015/01/03', 12.50, 2),
       ('1999/04/11', 450.25, 5);
       
INSERT INTO orders (order_date, amount, customer_id)
VALUES ('2016/02/10', 99.99, 81)      

SELECT * from customers;
SELECT * FROM orders;


SELECT * FROM ORDERS WHERE customer_id=(SELECT id FROM customers WHERE last_name="george")

/*
 * Inner join
 * */


/*
 * implicit join
 */
SELECT * FROM orders,customers where orders.customer_id=customers.id;

select first_name,last_name, order_date, amount FROM orders,customers WHERE orders.customer_id=customers.id;

/*
 * explicit join
 */
SELECT * FROM customers
	JOIN orders
		ON customers.id=orders.customer_id;

SELECT first_name,last_name, order_date, amount FROM customers
	JOIN orders
		ON customers.id=orders.customer_id;
		

SELECT first_name,last_name,order_date, amount FROM customers,orders
	WHERE customers.id=orders.customer_id order by amount;
	
SELECT first_name,last_name,order_date,amount FROM customers,orders
	WHERE Customers.id=orders.customer_id 
	GROUP BY customers.id;
	
SELECT first_name,last_name,order_date,SUM(amount) AS total_spent FROM customers,orders
	WHERE Customers.id=orders.customer_id 
	GROUP BY customers.id
	ORDER BY total_spent DESC;
	
	
-- LEFT JOIN

SELECT * FROM Customers
	LEFT JOIN orders
		ON Customers.id=orders.customer_id;
		

SELECT first_name,last_name,order_date,amount FROM Customers
	LEFT JOIN orders
		ON Customers.id=orders.customer_id;		
		
		
SELECT First_name,
		last_name, 
		IFNULL(SUM(Amount),0) as total_amount
	FROM customers
		LEFT JOIN orders
		ON customers.id=orders.customer_id
	GROUP BY customers.id;
	
	
/*
 * exercise
 */

desc students;

CREATE TABLE students(
	id int AUTO_INCREMENT PRIMARY KEY,
	first_name varchar(100)
);

CREATE TABLE papers(
	title VARCHAR(100),
	grade INT,
	student_id int,
	FOREIGN KEY (student_id) REFERENCES Students(id)
		ON DELETE CASCADE
);

INSERT INTO students (first_name) VALUES 
('Caleb'), ('Samantha'), ('Raj'), ('Carlos'), ('Lisa');

INSERT INTO papers (student_id, title, grade ) VALUES
(1, 'My First Book Report', 60),
(1, 'My Second Book Report', 75),
(2, 'Russian Lit Through The Ages', 94),
(2, 'De Montaigne and The Art of The Essay', 98),
(4, 'Borges and Magical Realism', 89);

SELECT first_name,title,grade 
	FROM Students
	INNER JOIN papers
		ON Students.id=papers.student_id
			ORDER BY papers.grade DESC;

SELECT first_name,title,grade 
	FROM Students
	LEFT JOIN papers
		ON Students.id=papers.student_id;		

SELECT first_name,IFNULL(title,"MISSING") AS title,IFNULL(grade,0) 
	FROM Students
	LEFT JOIN papers
		ON Students.id=papers.student_id;	

SELECT First_name,IFNULL(AVG(grade),"0") AS average
	FROM Students
		LEFT JOIN Papers
			ON students.id=papers.student_id
	GROUP BY students.id
	ORDER BY average DESC

SELECT First_name,IFNULL(AVG(grade),"0") AS average,
	CASE
		WHEN AVG(Grade) IS NULL THEN "FAILING"
		WHEN AVG(grade)>=75 THEN "PASSING"
		ELSE "FAILING"
	END AS Passing_status
	FROM Students
		LEFT JOIN Papers
			ON students.id=papers.student_id
	GROUP BY students.id
	ORDER BY average DESC	
 */
	