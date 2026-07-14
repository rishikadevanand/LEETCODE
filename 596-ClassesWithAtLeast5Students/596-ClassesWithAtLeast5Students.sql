-- Last updated: 7/14/2026, 2:44:31 PM
# Write your MySQL query statement below
SELECT CLASS
FROM COURSES
GROUP BY CLASS
HAVING COUNT(STUDENT) >= 5;