@@ -1,39 +0,0 @@

select username,created_at FROM users ORDER BY created_at LIMIT 5;

SELECT DAYOFWEEK(created_at),COUNT(DAYOFWEEK(created_at)) AS max_day from users GROUP BY DAYOFWEEK(created_at) order by max_day desc limit 2;

--SELECT DAYOFWEEK(created_at) as rr ,COUNT(DAYOFWEEK(created_at)) AS max_day from users GROUP BY DAYOFWEEK(created_at)

SELECT username FROM users
	LEFT JOIN photos
		ON users.id=photos.user_id
	WHERE photos.created_at IS NULL;
--Single photo likes
SELECT   username, count(photo_id)as photo_likes FROM users
	INNER JOIN photos
		ON users.id=photos.user_id
	INNER JOIN likes
		ON photos.id=likes.photo_id
	GROUP BY likes.photo_id
	ORDER BY photo_likes desc LIMIT 10;

--how many times does avg user posts
--total number of posts/total number of users

select ((SELECT COUNT(photos.id) FROM photos)/(SELECT COUNT(username)from users )) AS AVG 

--TOP 5 commonly used hashtags

SELECT tag_name, Count(tag_id) as popular_tags FROM photo_tags
	INNER JOIN tags 
		ON 	photo_tags.tag_id = tags.id
	GROUP BY tag_name
	ORDER BY popular_tags DESC LIMIT 5;
	
SELECT username, COUNT(photo_id) as total FROM LIKES
	INNER JOIN users 
		ON users.id=LIKES.user_id
	GROUP BY LIKES.user_id
	HAVING total=(SELECT COUNT(id) FROM photos)
	