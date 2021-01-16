SELECT * FROM Pet;
SELECT * FROM pET LIMIT 3;
SELECT * FROM employees;
select * from persons;

SELECT CONCAT(lastname,", ",firstname) as Name from persons;
SELECT USER(), CURRENT_Date();

select curdate();
/* calculating the age of pet*/
SELECT name, sex, birth, curdate(), timestampdiff(YEAR,birth, curdate()) as age from pet;
