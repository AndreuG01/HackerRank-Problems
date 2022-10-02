/*
Andreu Garcies Ramon 2-10-2022

Write a query that prints a list of employee names for employees in Employee habing having a
salary greater than 2000 per month who have been employees for less than 10 months. Sort your
result by ascending employee_id
*/

SELECT name from Employee
WHERE salary > 2000 and months < 10
ORDER BY employee_id ASC