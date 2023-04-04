Here we create a stored procedure and give it a custom name of get_customers.
We write our query on where we write begin and it ends where we write END



CREATE PROCEDURE get_customers() 
BEGIN 
     SELECT * FROM customers;
END;


How ever there is a problem. How do we show sqpl where the semicolon for the end of the query is i.e ;


For this we use delimeter to change the delimetr from ; to either $$ or "//" so as not to confuse mysql.
Then at the end , we revert our sql delimeter to what it was ini





DELIMITER $$
CREATE PROCEDURE get_customers() 
BEGIN 
     SELECT * FROM customers;
END$$
DELIMITER ;





Then to call the above stored procedure , we can do so by 

CALL get_customers()


To drop a procedure we would do this.

DROP PROCEDURE get_customers


HERE IS MORE EXPLANATION
-----------------------------------------------------------------------------------------------------


A stored procedure in MySQL is a set of pre-compiled SQL statements that are stored in the database server 
and can be executed repeatedly by calling the procedure name.
Stored procedures can accept input parameters and return output values or result sets.

Here is an example of how to create a stored procedure in MySQL:

CREATE PROCEDURE get_customer_orders (IN c_id INT)
BEGIN
  SELECT * FROM orders WHERE customer_id = c_id;
END;




In this example, we create a stored procedure named get_customer_orders that takes an input parameter customer_id 
of type INT. The procedure uses a simple SELECT statement to retrieve all orders for the specified
customer from the orders table.

To execute the stored procedure, we can simply call its name and pass in the required input parameter:


CALL get_customer_orders(123);


This will execute the get_customer_orders stored procedure and return all orders for the customer with ID 123.

Stored procedures can be very useful in many scenarios, such as:

Reducing network traffic by sending complex SQL queries to the server in a single call instead of multiple calls.
Enhancing security by granting appropriate permissions to execute stored procedures instead of direct table access.
Improving performance by pre-compiling and caching frequently used SQL statements.




















































