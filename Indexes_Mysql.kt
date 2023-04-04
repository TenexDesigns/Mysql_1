indexes ()Btree data structure



Indexes are used to find values within a specific column more quickly.
Mysql normally searches sequentilay through a column
The longer the column , the more expensive the opeation is

UPDATE takes more time ,whilc searching with SELECT takes less time.


To show indees of the current table

SHOW INDEXES FROM customer;

In our case the index of the table only jas one index i.e the custome_id ,which is the primary_key


TO CREATE AN INDEX

CREATE INDEX last_name_idx ON customers(last_name)


So if we were to search for a customer by their last name , that process will be sped up now.


WHEN WE WANT TO SEARCH FOR A CUSTOMER IN OUR TABLE ,USING MULTIPLE COLUMNS, WE USE MULTIPLE COLUMNS INDES


Mysql uses the left most column first then procceds to the next. i,e first is the last_name , then if there is a second name ,mysql can use the first_name.

CREATE INDEX last_name_first_name_idx ON customers (last_name, first_name);


So here if we were to search for a last name ,we ould benefit from the above index

SELECT * FROM customers WHERE last_name = "puff"

WE WOULD ALSO BENEFIT IF WE SEARCHED FIRST_NAME AND LAST_NAME

SELECT * FROM customers WHERE last_name = "puff" AND first_name = "Poppy";
But if we were to search for only first_name ,we would not use the above create index, since first name has a lower priprty ,




TO DROP AN INDEX


ALTER TABLE customers DROP INDEX last_name_idx;






HERE IS SOME MORE EXPLANANTION

_____________________________________________________________________________________________________________________________________________________________


In MySQL, an index is a data structure that improves the speed of data retrieval operations on a table. 
Indexes work by creating a separate object that contains a sorted list of values from one or more columns in a table.
This allows MySQL to find and retrieve data more quickly, especially when dealing with large tables.

To create an index in MySQL, you can use the CREATE INDEX statement. Here is an example:



CREATE INDEX idx_name ON my_table (column1, column2);


In this example, we are creating an index named idx_name on the my_table table that includes the column1 and column2 columns.

When you query a table with an index, MySQL can use the index to quickly locate the rows that match your query criteria.
This can significantly improve the performance of your queries, especially when dealing with large tables.

It is important to note that indexes can also have drawbacks.
They can take up additional disk space and can slow down write operations (such as INSERT and UPDATE statements) 
because the index needs to be updated along with the table. Therefore, 
it is important to use indexes judiciously and to only create indexes on columns that are frequently used
in queries and that contain a high degree of selectivity (i.e., a small number of distinct values).






































































































