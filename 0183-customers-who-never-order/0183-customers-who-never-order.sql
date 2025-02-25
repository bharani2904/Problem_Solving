# Write your MySQL query statement below
select name as Customers FROM Customers
WHERE id not in (select customerId from orders);