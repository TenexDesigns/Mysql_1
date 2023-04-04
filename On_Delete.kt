In MySQL, the ON DELETE clause is used in the definition of a foreign key constraint to
specify what should happen when a record in the parent table is deleted.

The possible options for the ON DELETE clause are:


1.---> CASCADE: This option deletes all the child records in the child table that reference the deleted 
record in the parent table. 
This is useful when you want to ensure that no orphaned records are left in the child table.

2.---> SET NULL: This option sets the foreign key value in the child records to NULL when the parent record is deleted. 
This is useful when you want to allow the child record to exist without a reference to the parent record.


3.---> RESTRICT: This option prevents the deletion of a record in the parent table if there are any child records that reference it.
This is useful when you want to ensure that the data integrity is maintained and no orphaned records are left in the child table.

4.---> NO ACTION: This option is similar to RESTRICT and prevents the deletion of a record in the parent table if 
there are any child records that reference it. 
However, it is not supported by all database engines.


Heres an example of how to create a foreign key constraint with the ON DELETE CASCADE option:

CREATE TABLE orders (
  order_id INT PRIMARY KEY,
  customer_id INT,
  order_date DATE,
  FOREIGN KEY (customer_id)
    REFERENCES customers(customer_id)
    ON DELETE CASCADE
);




In this example, the orders table has a foreign key constraint on the customer_id column that references the customers table. The ON DELETE CASCADE option ensures that
if a record is deleted from the customers table, all the corresponding records in the orders table are deleted as well.


TIS IS A SUMARY OF THE ABOVE


ON DELETE SET NULL - When foreign key is deleted , replace foreign key with null.
ON DELETE CASCADE - When foreign key is deleted , delete the row.





















