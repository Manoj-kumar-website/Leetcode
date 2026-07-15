# Write your MySQL query statement below
select  e1.name
from employee e1
join employee e2
on e2.managerid=e1.id
group by e1.id,e1.name
having count(e2.id)>=5;