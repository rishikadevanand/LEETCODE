-- Last updated: 7/14/2026, 2:46:34 PM
# Write your MySQL query statement below


SELECT  MAX(SALARY) AS SecondHighestSalary FROM EMPLOYEE WHERE SALARY <>(SELECT MAX(SALARY) FROM EMPLOYEE);