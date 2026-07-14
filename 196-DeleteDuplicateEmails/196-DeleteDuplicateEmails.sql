-- Last updated: 7/14/2026, 2:46:11 PM
DELETE p FROM Person p
JOIN Person p2 
ON p.Email = p2.Email AND p.Id > p2.Id;