A function is a stored program that you can pass parameters into to return a value.


EXAMPLE

SELECT COUNT(amount) FROM transactions;
This counts the rows in the amount column from the transactions table.
You can add a where clause so the the function can return rows that satisfy a certain criteria.

We can even rename the row returned.

SELECT COUNT(amount) AS Count FROM transactions;

SELECT COUNT(amount) AS "Transaction Amounts" FROM transactions;




TO GET MAX VALUE FROM A COLUMN

SELECT MAX(amount) AS maximum FROM transactions;

MINIMUM

SELECT MIN(amount) AS minimum FROM transactions;

AVERAGE

SELECT AVG(amount) AS average FROM transactions;

SUM OF ENTIRE COLUMN

SELECT MAX(amount) AS sum FROM transactions;

TO CONCANITTE TWO ROWS AND GIVE THE NEW ROW A NAME 

SELECT CONCAT (first_name," ",last_name) AS full_name FROM employees;







HERES MORE DETAILS 
-------------------------------------------------------------------------------------------------------------------------------------------------

In MySQL, a function is a piece of code that performs a specific task and returns a value.
Functions can be used to simplify database queries and make them more efficient.
There are many built-in functions available in MySQL, and you can also create your own custom functions.

MySQL functions can be classified into two categories: scalar functions and aggregate functions.

Scalar Functions:

Scalar functions operate on a single row of data and return a single value. Here are some commonly used scalar functions in MySQL:
CONCAT: Concatenates two or more strings together.
LENGTH: Returns the length of a string.
UPPER: Converts a string to uppercase.
LOWER: Converts a string to lowercase.
SUBSTRING: Returns a substring of a string.
Example of using the LENGTH function in MySQL:

SELECT LENGTH('Hello, World!'); -- Returns 13


Aggregate Functions:

Aggregate functions operate on a set of values and return a single value. They are often used with the GROUP BY clause to summarize data. Here are some commonly used aggregate functions in MySQL:
SUM: Calculates the sum of a set of values.
AVG: Calculates the average of a set of values.
COUNT: Counts the number of rows in a table or the number of non-null values in a column.
MIN: Returns the minimum value in a set of values.
MAX: Returns the maximum value in a set of values.
Example of using the AVG function in MySQL:


SELECT AVG(price) FROM products; -- Returns the average price of all products in the table


In addition to built-in functions, you can also create your own custom functions in MySQL using the CREATE FUNCTION statement.
Custom functions can be used to perform complex calculations or manipulate data in a specific way.














































