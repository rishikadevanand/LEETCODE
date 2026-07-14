-- Last updated: 7/14/2026, 2:44:29 PM
# Write your MySQL query statement below
SELECT name
FROM SalesPerson
WHERE sales_id NOT IN
(
    SELECT o.sales_id
    FROM Orders o
    JOIN Company c
        ON c.com_id = o.com_id
    WHERE c.name = 'RED'
);