-- Delete Duplicate Emails
--22 / 22 test cases passed.
--Status: Accepted
--Runtime: 1805 ms

# Write your MySQL query statement below

DELETE p2 FROM Person p1, Person p2
WHERE p1.Email = p2.Email AND p2.Id > p1.Id;