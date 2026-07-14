-- Last updated: 7/14/2026, 2:46:24 PM

# Write your MySQL query statement below
SELECT email
FROM Person
GROUP BY email
HAVING COUNT(email) > 1;
