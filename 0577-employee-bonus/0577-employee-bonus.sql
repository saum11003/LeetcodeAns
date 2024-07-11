# Write your MySQL query statement below
SELECT A.name, b.bonus
FROM Employee AS A LEFT JOIN Bonus AS B on A.empId = B.empId
WHERE bonus < 1000 or bonus IS NULL