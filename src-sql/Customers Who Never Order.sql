-- Customers Who Never Order
--12 / 12 test cases passed.
-- Status: Accepted
-- Runtime: 447 ms

# Write your MySQL query statement below

SELECT Name AS Customers FROM Customers WHERE Id NOT IN
(SELECT CustomerId FROM Orders);