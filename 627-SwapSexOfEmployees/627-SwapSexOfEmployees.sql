-- Last updated: 7/14/2026, 2:44:20 PM
# Write your MySQL query statement below
UPDATE Salary 
SET sex = (CASE WHEN sex = 'f' THEN 'm' ELSE 'f' END) 