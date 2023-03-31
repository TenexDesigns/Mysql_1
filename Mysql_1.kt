The video tutorial is https://youtu.be/5OdVJbNCSso    BROCODE -MySql full course
Think of a database as a folder and tables as files within that table that hod the data


First we are going to create querries .
This querrys are not case sensitive and can be in capital or small letter.

TO CREATE A DATABASE IN MYSQL

  -----> CREATE DATABASE myDb;  
We have to end the query with a semicolon.


TO USE A DATABASE

-----> USE myDB

TO DELETE OR DROP A DATABASE

-----> DROP DATABASE myDb

TO MAKE DATABASE READ ONLY

-----> ALTER DATABASE myDb READ ONLY = 1;
When we make our database read only ,it means we can only access it but not make changes to it.
We can not write new dta to it, delete the dta or even delete the database.

TO CHANHGE THE READ ONLY SETTING ON THE DATABASE


----> ALTER DATABASE myDB READ ONLY = 0;



MAKING TABLES IN RELATIONAL DATABASE
__________________________________________________________________________________
 A table in a relational database consists of rows and columns,kind of like an excel spread sheet.
The columns are used to identify the data held inside.
The rows is where we put the data


In mySql, we have to create a table and then inside the table , we have to name our columns and give them the data types that they are going t hold.


-------->  CREATE TABLE employees (
  employee_id INT, // Here the employee id is of thype integer
  first_Name VARCHAR(50),  // The first name is a collection of characters ,so we user varchar to signify this,we set a maximun number of characters to 50
  last_Name VARCHAR(50),  // The first name is a collection of characters ,so we user varchar to signify this,we set a maximun number of characters to 50
  hourly_pay DECIMAL(5,2),// Here we can expect the pay to be in decimal numbers ,so the decimal can have 5 digits but ,we give it a precision of 2 numbers
  hire_data DATE  // There is a date data type

)



HOW TO SELECT A TABLE 

----> SELECT * FROM employees
This selects the employess table and shoes all the data in the columns of the table


TO RENAME A TABLE
Here we can rename our table called emplyoyees to workers


----> RENAME TABLE employees TO workers


























































