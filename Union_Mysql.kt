UNION  is used to take data from one table and combine it with the first table,if they have same number of columns, to come up with just one table.
Union does not allow for repetions odf same date.If there is same record in the two tables ,then only one is choosen and the other is discarded.
UNION ALL - allows for duplicates in the final data set
e.g SLECT first_name, last_name FROM employyes UNION SELECT first_name ,last_name FROM customers



In MySQL, the UNION operator is used to combine the result sets of two or more SELECT statements into a single result set.
The syntax for using the UNION operator is as follows:

SELECT column1, column2, FROM table1  WHERE condition UNION [ALL] SELECT column1, column2, FROM table2 WHERE condition;


Here, column1, column2, ... are the columns to be returned in the result set, table1 and table2 are the tables to be queried,
and condition is the WHERE condition that filters the rows to be included in the result set.
The optional ALL keyword is used to include all the rows from both SELECT statements, including duplicates.

Note that the number and data types of the columns in the result set of each SELECT statement must match, or you will get a syntax error.

Heres an example that demonstrates how to use the UNION operator to combine the result sets of two SELECT statements 
that retrieve customer information from two different tables:


SELECT customer_id, first_name, last_name
FROM customers
WHERE gender = 'F'
UNION
SELECT customer_id, first_name, last_name
FROM female_customers
WHERE age >= 18;


This query retrieves the customer_id, first_name, and last_name columns from the customers table for female customers,
and from the female_customers table for female customers who are 18 years or older, 
and combines the result sets into a single result set with no duplicates.

Note that UNION can be resource-intensive, as it requires the database to perform a sort operation on the combined result sets to eliminate duplicates.
If you dont need to eliminate duplicates, you can use the UNION ALL operator instead, which is faster because it doesnt perform the sort operation.























