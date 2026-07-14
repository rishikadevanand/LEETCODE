-- Last updated: 7/14/2026, 2:44:34 PM
# Write your MySQL query statement below
SELECT customer_number
FROM Orders
GROUP BY customer_number
ORDER BY count(order_number) DESC
LIMIT 1;