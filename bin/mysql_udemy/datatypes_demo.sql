
CREATE TABLE People(
	name VARCHAR(100),
	birth_date DATE,
	Birth_time TIME,
	Birth_dt DATETIME
);

INSERT INTO people(name,birth_date,birth_time,birth_dt)
	VALUES("Sharath",'1985-06-06','10:35:55', '1985-06-06 10:35:55');

INSERT INTO people(name,birth_date,birth_time,birth_dt)
	VALUES("Larry",'1943-12-25','04:10:42', '1943-12-25 04:10:42');

SELECT * FROM People;

CURDATE()--gives current date
CURTIME()--gives current TIME
NOW() --Gives current date_time


SELECT CURDATE();
SELECT CURTIME();
SELECT NOW();

INSERT INTO people(name,birth_date,birth_time,birth_dt)
	VALUES('ASUS',CURDATE(),CURTIME(),NOW());
SELECT * FROM People;

SELECT name,birth_date FROM people;

SELECT name,birth_date, DAY(birth_date) FROM people;

SELECT name,birth_date,DAYNAME(birth_date) FROM People;

SELECT name,birth_date,DAYOFWEEK(birth_date) FROM people;

SELECT name,birth_date,DAYOFYEAR(Birth_date) FROM people;

SELECT name,birth_date,MONTHNAME(Birth_date) FROM people;

SELECT name,birth_time,MONTH(birth_time) FROM people;

SELECT CONCAT(MONTHNAME(birth_date),' ',DAY(birth_date),' ',YEAR(birth_date)) AS "date1" FROM people;

SELECT DATE_FORMAT(birth_date, "was born on %W") FROM people;

SELECT DATE_FORMAT(birth_date,"%c/%D/%Y") FROM people;

SELECT DATE_FORMAT(birth_date,"%c/%d/%Y") FROM people;

SELECT name, birth_date, DATEDIFF(NOW(), birth_date) FROM people;


CREATE TABLE comments(
	content VARCHAR(100),
	created_at TIMESTAMP DEFAULT NOW()
);

INSERT INTO comments (content) VALUES("LOL What a funny article");
INSERT INTO comments (content) VALUES("I found it very offensive");

SELECT * FROM comments;
INSERT INTO comments (content) VALUES("blah blah... i dont care");

SELECT Content, created_at FROM Comments ORDER BY created_at DESC;

CREATE TABLE comments2(
	content VARCHAR(100),
	created_at TIMESTAMP DEFAULT NOW() ON UPDATE CURRENT_TIMESTAMP--or use now()
);
INSERT INTO comments2 (content) VALUES("LOL What a funny article");
INSERT INTO comments2 (content) VALUES("I found it very offensive");
INSERT INTO comments2 (content) VALUES("blah blah... i dont care");
INSERT INTO comments2 (content) VALUES("Its too hot in India");
SELECT * FROM comments2 WHERE content LIKE '%blah%'

SELECT * FROM comments2 WHERE content LIKE '%blah%'

UPDATE comments2 SET Content= 'blah blah... updated2' WHERE content LIKE '%blah%';
SELECT * FROM comments2 WHERE content LIKE '%blah%';
SELECT Content,Created_at FROM comments2 ORDER BY created_at DESC


--varchar, decimal(7,2),int
--size is different, datetime stores any dates, but timestamp have restrictions like start date end future date

SELECT TIME(NOW());
SELECT DATE(NOW());
SELECT DAYOFWEEK(NOW());
SELECT DAYNAME(NOW());
SELECT DATE_FORMAT(NOW(),'%m/%d/%Y')

SELECT DATE_FORMAT(NOW(),'%M %D at %h:%i')
DROP TABLE tweets;
CREATE TABLE Tweets(
		tweet_content VARCHAR(150),
		username VARCHAR(50),
		tweet_time TIMESTAMP DEFAULT NOW()
	);
	

SELECT * FROM people;

SELECT name, birth_dt FROM people WHERE Birth_dt BETWEEN '2020-01-01' AND now();

SELECT name,birth_dt FROM PeopLE WHERE birth_dt BETWEEN CAST('2020-01-01' AS DATETIME) AND CAST('2021-01-30' AS DATETIME);
