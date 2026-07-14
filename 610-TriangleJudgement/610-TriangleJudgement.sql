-- Last updated: 7/14/2026, 2:44:27 PM
# Write your MySQL query statement below
select x,y,z,
 case
    when x+y>z and x+z>y and y+z>x then 'Yes'
    else 'No'end as triangle
from Triangle ;