--- GROUP BY = It agggregates all rows by a specific column.
It is often used with aggregate functions e.g SUM() , MAX(), MIN (), AVG() ,COUNT()



SELECT SUM(amount), order_date  FROM transactions GROUP BY (order_date)

This returns . This is beacuse it add all the transactions that happend on each day.----> GROUP BY(order_date)

sum(amount)        order_date
10.00             2023-03-01
17.00             2023-03-02
15.00             2023-03-03



customer_id         amount        order_fate
1                    5.00        2023-03-01
2                    3.00        2023-03-01
3                    2.00        2023-03-01
4                    8.00        2023-03-02
5                    9.00        2023-03-02
6                    4.00        2023-03-03
7                    5.00        2023-03-03
8                    6.00        2023-03-03


HERE IS MORE EXPLANATION
____________________________________________________________________________________________

n MySQL, the GROUP BY clause is used to group rows that have the same values in one or more columns into summary rows,
like for computing aggregates, counting occurrences or grouping categorical data.

Here is an example of a SELECT statement that uses GROUP BY:

SELECT department, SUM(salary) AS total_salary
FROM employees
GROUP BY department;



In this example, the SELECT statement retrieves the total salary for each department in the employees table. 
The GROUP BY clause groups the rows by the department column and then calculates the SUM of the salary column for each group.


Note that any column in the SELECT list that is not part of an
aggregate function (such as SUM, COUNT, AVG) must be listed in the GROUP BY clause. Otherwise, MySQL will produce an error.

The GROUP BY clause can also be used with other aggregate
functions like COUNT, AVG, MIN, MAX, and even with more than one column.
It is a very powerful feature of SQL that allows you to summarize data in various ways.



































































































