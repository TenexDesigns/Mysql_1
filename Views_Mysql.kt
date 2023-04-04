VIEWS

Views - is a virtual table based on the result-set of an sql statememn in an actual tablet.
Views update automaticaly to reflect what is on the actual table.
When we use views ,we dont have to make changes across multiple places.

e.g  CREATE VIEW employee_attandance AS SELECT first_name,last_name FROM "emplyees";
employees - is a real table
employyes_attendance - is a virtual table we create from the real table.

The fields in a view are fields from one of more real tables in the database.
They are not real tables ,but they can be interacted with, as if they were.

The create views are found in a dropdown menu

YOU CAN EVEN DROP A VIEW

DROP VIEW employee_attendance;



HERE IS MORE EXPLANATION
_____________________________________________________________________________________________________________________________________________


In MySQL, a view is a virtual table that is based on the result of a SELECT statement.
Views can be used to simplify complex queries or to restrict access to sensitive data by allowing users to query a subset of the columns 
in a table or to see only certain rows.

Creating a view in MySQL is straightforward. Here is an example of how to create a view:

CREATE VIEW my_view AS
SELECT column1, column2, column3
FROM my_table
WHERE condition;




In MySQL, a view is a virtual table that is based on the result of a SELECT statement.
Views can be used to simplify complex queries or to restrict access to sensitive data by allowing users to query a subset of the columns 
in a table or to see only certain rows.

Creating a view in MySQL is straightforward. Here is an example of how to create a view:



CREATE VIEW my_view AS
SELECT column1, column2, column3
FROM my_table
WHERE condition;
In this example, we are creating a view named my_view based on a SELECT statement that 
selects three columns (column1, column2, and column3) from the my_table table based on a certain condition.

Once you have created a view, you can use it just like a regular table in your queries. For example, you can run a query like this:

SELECT *
FROM my_view
WHERE column1 = 'some value';






This query will return all rows from the my_view view where column1 equals 'some value'.

It is important to note that views are not physical tables and do not store any data themselves. 
Instead, they are stored as SELECT statements in the database and are executed on-the-fly when you query them.
Therefore, views can be a powerful tool for organizing and simplifying complex queries,
but they can also impact performance if they are used incorrectly or if they involve complex joins and subqueries.





























































































