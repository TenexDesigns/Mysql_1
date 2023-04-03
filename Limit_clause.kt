LIMIT CLAUSE


 The limit clause is used to limit the number of records returned
 
 It is useful when you are workin with a lot of data 
 
 It can be used to display a large data on different pages pages(pagination)
 
 
 HERE IS HOW WE CAN USE IT
 
 
 This return only one record from the customers table
 SELECT * FROM customers LIMIT 1;
 

 SELECT * FROM customers LIMIT 1;
 This returns ther first  theree records from the table.



WE CAN ALSO COMBINE THE LIMIT CLAUSE WITH THE ORDER CLAUSE.


SELECT * FROM customers ORDER BY last_name DESC LIMIT 3;
This returns the three records in decending order. 





HERE IS AN EXPLANANTIN 
__________________________________________________________________________________________________________________________________________________

In MySQL, the LIMIT clause is used to limit the number of rows returned by a SELECT statement. 
The general syntax for using the LIMIT clause is as follows:


SELECT column1, column2, FROM table_name LIMIT [offset,] row_count;
             or 
SELECT * FROM customers row_count;
             or 
SELECT * FROM customers LIMIT 10 OFFSET 10;

Here, row_count specifies the maximum number of rows to be returned by the query. 
The optional offset parameter specifies the number of rows to skip before starting to return rows.

REMEMBER ---> OFFSET -> specifies the number of rows to skip before starting to return rows.

For example, to retrieve the first 10 rows from a table called customers, you can use the following query:

SELECT * FROM customers LIMIT 10;


Note that the OFFSET parameter is optional, and if it is not specified,
the default value is 0, which means that the query will start returning rows from the beginning.























