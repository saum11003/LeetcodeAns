# Write your MySQL query statement below
SELECT MAX(DISTINCT num) AS num
FROM MyNumbers
WHERE num in (SELECT num FROM MyNumbers GROUP BY num HAVING COUNT(num)=1)


# SELECT MAX(num) AS num
# FROM (
#     SELECT num
#     FROM MyNumbers
#     GROUP BY num
#     HAVING COUNT(num) = 1
# ) AS unique_numbers;