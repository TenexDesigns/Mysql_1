        --- watch more on youtube  -->// https://youtu.be/G3lJAxg1cy8?list=PLZPZq0r_RZOMskz6MdsMOgxzheIyjo-BZ
JOINS IN MYSQL.
___________________________________________________________________________________________________________________________________________________________________

A join is a clause used to combine rows from two or more tables based on a related column between them such as a foreign key.

In MySQL, a JOIN is a SQL operation that combines rows from two or more tables based on a related column between them.
A JOIN operation allows you to retrieve data from multiple tables as a single result set.

There are several types of JOIN in MySQL:

1. INNER JOIN: returns only the matching rows from both tables.
2. LEFT JOIN: returns all the rows from the left table and the matching rows from the right table, or NULL values if there is no match.
3. RIGHT JOIN: returns all the rows from the right table and the matching rows from the left table, or NULL values if there is no match.
4. FULL OUTER JOIN: returns all the rows from both tables, with NULL values if there is no match in either table.

The syntax for a JOIN in MySQL is:

SELECT column1, column2, FROM table1 JOIN table2 ON table1.column = table2.column;

Where column1, column2, ... are the columns you want to retrieve from the tables table1 and table2, and ON table1.column = table2.column specifies the condition for the join.




INNER JOIN
____________________________________________________________
Join together any matching rows ,based on some link.
LET US SEEE HOW AN INNER JOIN IS DONE

SELECT transaction_id,amount,first_name,last_name FROM transactions INNER JOIN customers ON transactions.customer_id = customer_id;


LEFT  JOIN
____________________________________________________________
With left join ,we are going to dispaly everything ftm the left table.however if there is matching customer id,pull any relevant data from the right even if ther is no data to be displayed
LET US SEEE HOW AN LEFT JOIN IS DONE

SELECT transaction_id,amount,first_name,last_name FROM transactions LEFT JOIN customers ON transactions.customer_id = customer_id;


RIGHT  JOIN
____________________________________________________________
With right join ,we are going to dispaly everything ftm the right table .however if there is matching customer id,pull any relevant data from the left even if ther is no data to be displayed
LET US SEEE HOW AN LEFT JOIN IS DONE

SELECT transaction_id,amount,first_name,last_name FROM transactions RIGHT JOIN customers ON transactions.customer_id = customer_id;








Here below we have two tables

LET US CRATE TWO TABLES
This is the cstomers table ,with the customers_id as the primary key.

CREATE TABLE customers (
   customer_id INT PRIMARY KEY AUTO_INCREMENT,
   firt_name VARCHAR(50),
   last_name VARCHAR(50)


);

Here let us populate our customers table.
INSERT INTO customers(first_name,last_name)VALUES ("Fred","Fish"),("Larry","Lobster"),("Bubble","Bass");

This will be the result.

customer_id     first_name          last_name
1                 "Fred",          "Fish"
2                 "Larry",         "Lobster"
3                 "Bubble",        "Bass"




This is our second table



TO INSERT DATA INTO OUR SECOND TABLE
CREATE TABLE transactions (
  
  transaction_id INT PRIMARY KEY AUTO_INCREMENT,
  amount DECIMALS(5,2),
  customer_id INT, 
  FOREIGN KEY (customer_id) REFERENCES customers(customer_id)


);

INSERT INTO  transactions (amount,customer_id) VALUES (4.99,3),
                                                      (2.89,2),
                                                      (3.38,3),
                                                      (3.24,1),


The result table is 


transaction_id     amount          customer_id
1                 4.99,            3
2                 2.89,            2
3                 3.38,            3
4                 3.24,            1


























































































































































































