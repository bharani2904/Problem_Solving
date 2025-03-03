# Write your MySQL query statement below
select B.id as Id
from Weather as A
join 
Weather as B
on date_sub(B.recordDate, INTERVAL 1 DAY) = A.recordDate 
where B.temperature > A.temperature;