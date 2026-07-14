-- Last updated: 7/14/2026, 2:43:43 PM
select actor_id, director_id 
from(
select actor_id,director_id, 
count(timestamp) as cooperated 
from ActorDirector 
group by actor_id,director_id) 
table1
where cooperated>=3;