-- Last updated: 7/14/2026, 2:46:20 PM
# Write your MySQL query statement below
SELECT name AS "Customers"
FROM Customers WHERE Customers.id not in (
    SELECT customerId FROM Orders
);
