# Write your MySQL query statement below
#select name,bonus from Employee left join Bonus on Employee.empID=Bonus.empID where bonus < 1000 or Bonus is null;


SELECT e.name,b.bonus from Employee e
left join Bonus b on e.empId=b.empId where
b.bonus<1000 or b.bonus is null;