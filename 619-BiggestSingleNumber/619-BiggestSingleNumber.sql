-- Last updated: 7/14/2026, 2:44:25 PM
# Write your MySQL query statement below
select max(num) as num
from(
    select num
    from mynumbers
    group by num
    having count(num)=1
)as num