# Write your MySQL query statement below
SELECT SUBSTR(trans_date,1,7) AS month, country, COUNT(id) AS trans_count, SUM(CASE WHEN state = 'approved' THEN 1 ELSE 0 End) as approved_count, SUM(amount) AS trans_total_amount, SUM(CASE WHEN state = 'approved' THEN amount ELSE 0 End) AS approved_total_amount
FROM Transactions
GROUP BY month, country



# SELECT  SUBSTR(trans_date,1,7) as month, country, count(id) as trans_count, SUM(CASE WHEN state = 'approved' then 1 else 0 END) as approved_count, SUM(amount) as trans_total_amount, SUM(CASE WHEN state = 'approved' then amount else 0 END) as approved_total_amount
# FROM Transactions
# GROUP BY month, country