-- Last updated: 7/14/2026, 2:43:36 PM
# Write your MySQL query statement below
SELECT player_id, MIN(event_date) AS first_login
FROM Activity
GROUP BY player_id;