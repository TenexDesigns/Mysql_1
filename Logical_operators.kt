Logical operators are used in MySQL to combine multiple conditions in a query to produce a result that meets specific criteria.
There are three logical operators in MySQL:

AND: The AND operator requires that both conditions on either side of it must be true for the overall condition to be true.
For example, if you wanted to select all records where the "age" column is greater than or equal to 18 AND the "gender" column is equal to "male", 
you would use the following syntax:

SELECT * FROM table_name WHERE age >= 18 AND gender = 'male';


OR: The OR operator requires that at least one condition on either side of it must be true for the overall condition to be true. For example,
if you wanted to select all records where the "age" column is less than 18 OR the "gender" column is equal to "female", you would use the following syntax:

SELECT * FROM table_name WHERE age < 18 OR gender = 'female';


NOT: The NOT operator is used to negate a condition, meaning that it will select all records that do not meet the specified condition.
For example, if you wanted to select all records where the "age" column is NOT equal to 18, you would use the following syntax:


SELECT * FROM table_name WHERE  NOT age >= 18;


We can also comine opreators.
Here below we can choose all pople that are bot aged 18+ anf that are not female.



SELECT * FROM table_name WHERE NOT gender ="female" AND NOT age >= 18+




BETWEEN : Between is used within the same column. It is like AND, only that it is used within a column.

SELECT * FROM  employees WHERE  hireDtate BETWEEN "2023-01-04" NAD "2023-01-07";

This selects ll employees hired between dates 4 and 7 on january 


IN: This returns a list of all queries that fit the description.In is usaully used inside acolumn

This selects all employess who meet the cruteria of cook, cashier and janitor from the jobs column.

SELECT * FROM employeees WHERE job IN ("cook","cashier","janitor")





IN
_____________________________________________________________________________________________________________________________________________________________

IN: The IN operator is used to match a value against a list of specified values. It is similar to using multiple OR conditions with the same column. For example, 
if you wanted to select all records where the "gender" column is either "male" or "female", you would use the following syntax:


SELECT * FROM table_name WHERE gender IN ('male', 'female');

This will select all records where the "gender" column is either "male" or "female".








BETWEEN: The BETWEEN operator is used to select values within a range.
For example, if you wanted to select all records where the "age" column is between 18 and 35 (inclusive), you would use the following syntax:



SELECT * FROM table_name WHERE age BETWEEN 18 AND 35;

This will select all records where the "age" column is greater than or equal to 18 and less than or equal to 35.

Note that the above examples assume that you have a table called "table_name" with columns called "age" and "gender".
You would need to replace "table_name", "age", and "gender" with the actual names of your table and columns.



