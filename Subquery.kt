SUB QUERY

A subquery in MySQL is a query that is nested inside another query.
The subquery is executed first and its results are used by the outer query to perform further processing.

A sub query is a query within another query
query(subquery)

Whatever woyld be returned from the innner query, will be used in the outer query


here is an example

SELECT AVG (hourly_pay) FROM employees AS avg_pay;  This gets the average pay of all the employeees
This retunrs 

avg_pay
15.56


How ever , if we want to display the average pay ,together with the names of the employess ,
then we use the above query as a subquery.

SELECT first_name, last_name ,hourly_pay (SELECT AVG (hourly_pay) FROM employees AS avg_pay ) FROM employees;

This reurns


first_name    last_name    hourly_pay     avg_pay
George        Gacau         23.45          15.56
Eliud         Wambu         12.50          15.56


HERE IS MORE EXPLANATION
________________________________________________________________

SELECT *
FROM customers
WHERE customer_id IN (SELECT customer_id FROM orders WHERE order_date > '2022-01-01')

In this example, the outer query selects all the customers whose customer_id is in the result set of the inner query.
The inner query selects all the customer_ids from the orders table where the order_date is greater than January 1st, 2022.

Note that the inner query is enclosed in parentheses and is used as a condition in the WHERE clause of the outer query.
This is a common use case for subqueries in MySQL,
but they can also be used in other parts of a SQL statement, such as the SELECT and FROM clauses.







































