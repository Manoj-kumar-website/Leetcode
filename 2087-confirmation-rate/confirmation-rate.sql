# Write your MySQL query statement below
with conformed as(select s.user_id,count(s.user_id) as totalcount,
sum(case 
when action='confirmed' then 1
else 0
end) as validcount
from signups s
left join confirmations c
on s.user_id=c.user_id
group by s.user_id)

select user_id,ifnull(round(validcount/totalcount,2),0) as confirmation_rate 
from conformed;