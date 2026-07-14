-- Last updated: 7/14/2026, 2:43:41 PM
# Write your MySQL query statement below
SELECT p.product_name,s.year,s.price from Sales as s
left join Product as p
on s.product_id = p.product_id