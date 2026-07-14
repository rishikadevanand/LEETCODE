-- Last updated: 7/14/2026, 2:44:21 PM
# Write your MySQL query statement below

SELECT *
FROM cinema c
WHERE c.id % 2 =1 
    AND 
    c.description != 'boring'
ORDER BY c.rating DESC;