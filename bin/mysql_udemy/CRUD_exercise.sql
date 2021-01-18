CREATE TABLE shirts(
	shirt_id INT NOT NULL AUTO_INCREMENT,
	article VARCHAR(100),
	color VARCHAR(100),
	shirt_size VARCHAR(12),
	last_worn INT, 
	PRIMARY KEY(shirt_id)
);

DESC shirts;

INSERT INTO shirts(article,color,shirt_size, last_worn) VALUES 
('t-shirt', 'white', 'S', 10),
('t-shirt', 'green', 'S', 200),
('polo shirt', 'black', 'M', 10),
('tank top', 'blue', 'S', 50),
('t-shirt', 'pink', 'S', 0),
('polo shirt', 'red', 'M', 5),
('tank top', 'white', 'S', 200),
('tank top', 'blue', 'M', 15);

SELECT * FROM shirts;

INSERT INTO shirts(article,color,shirt_size,last_worn) VALUES('polo shirt', 'Purple', 'M',50);

SELECT article, color FROM Shirts;

SELECT article,color,shirt_size,last_worn FROM Shirts WHERE shirt_size='M';
/* SELECT NOT id, * FROM Shirts WHERE Shirt_size='M';*/
SELECT * FROM Shirts WHERE article='polo shirt';

UPDATE shirts SET shirt_size='L' WHERE article='polo shirt';
SELECT * FROM Shirts WHERE article='polo shirt';

SELECT * FROM Shirts WHERE last_worn=15;

UPDATE Shirts SET last_worn=0 WHERE Last_worn=15;
SELECT * FROM Shirts WHERE last_worn=0;

SELECT * FROM shirts WHERE Color='white';

UPDATE Shirts SET Shirt_size='XS', color='off white' WHERE color='white';
SELECT * FROM shirts WHERE Color='off white';

SELECT * FROM Shirts WHERE Last_worn=200;

DELETE FROM shirts WHERE last_worn=200;

SELECT * FROM Shirts WHERE article='tank top';

