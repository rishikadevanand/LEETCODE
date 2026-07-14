-- Last updated: 7/14/2026, 2:46:27 PM
SELECT e2.name as Employee
FROM employee e1
INNER JOIN employee e2 ON e1.id = e2.managerID
WHERE
e1.salary < e2.salary