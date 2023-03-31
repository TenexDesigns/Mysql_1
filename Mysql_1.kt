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

);



HOW TO SELECT A TABLE 

----> SELECT * FROM employees
This selects the employess table and shoes all the data in the columns of the table


TO RENAME A TABLE
Here we can rename our table called emplyoyees to workers


----> RENAME TABLE employees TO workers


TO DROP OR DELETE A TABLE 

-----> DROP TABLE employess


TO ALTER A TABLE e.g add a new column to the table

-------> ALTER TABLE employees ADD phone_number INT;




TO RENAME A COLUMN IN A TABLE

How ever on renaming the column on the table, the data type does not change, it is style of type INT.

-------> ALTER TABLE employees RENAME COLUMN phone_number TO email;



TO CHANGE THE DATATYPE OF A COLUMN IN  A TABLE 
Here we change the data type of email from the previous datatype , which was INT , to the new datatype VARCHAR , which is a colllection of characters with a limit of 100 characters


-------> ALTER TABLE employees MODIFY COLUMN email VARCHAR(100);




TO CHANGE THE POSITION OF ONE OF OUR COLUMNS ,WE DO IT LIKE THIS 

Here we change the position of our email column to come afte the last_name column.
We have to include the data type of the coumn we are moving .

------> ALTER TABLE employees MODIFY email VARCHAR(100) AFTER last_name ;

 How ever if you just want the column to be first, you can simply put the  key word first,

------> ALTER TABLE employees MODIFY email VARCHAR(100) FIRST;



TO DROP A COLUMN OR TO DELETE A COLUMN

---------> ALTER TABLE employees DROP COLUMN email;





INSERTING DATA INTO ROWS OF TABLES 
________________________________________________________________________________________________________


 To insert data into rows of tables you have to give values of the the specified data type.
Here is an example to insert data into the folwing Eemployees table 


 -----> INSERT INTO employees VALUES (1,"eugune","Krabs",25.50,"2024-01-23")





TO INSERT MULTIPLE ROWS AT THE SAME TIME

------> INSERT INTO employees VALUES (1,"eugune","Krabs",25.50,"2024-01-23") 
                                     (2,"Spongebob","Squarepants",12.50,"2020-11-25")
                                     (3,"Patrick","Star",12.50,"2023-01-07")
                                     (4,"Squidward","Tentackes",15.00,"2024-06-19")



                                     
To insert data into selected columns and leave other columns empty
You have  to name the columns that you want to contain data in the parenthesis of the table name 
This puts a value of null in the values where ,we have not put values


------> INSERT INTO employees(employee_id,firstname,last_name) VALUES (1,"eugune","Krabs") 



TO SELECT DATA FROM SPCIFIC COLUMNS IN OUR TABLE
This will only show us data from the frist_name and last_name columns

-------> SELECT first_name,last_name FROM employees


TO SELECT SPECIFIC AREAS OF OUR DATA ,WE CAN USE THE WHERE CLAUSE
This retuns a list of all employess with an id of 2.

-------> SELECT * FROM employees WHERE employee_id =2 ;

We can also query our selection based on some condition
This returns a list ofemployess with an hourly rate greater than 15


------> SELECT * FROM employees WHERE houry_pay >= 15;


We can also make our query select data based on date.
This selects the list of employees who were hired on a date equal to or before the third of january 2023.

-------> SELECT * FROM employees WHERE hire_date <= "2023-01-03";


WE ALSO HAVE THE NOT EQUAL OPERATOR !=
  This returns a list of all employees whose id is not 1.
  
  SELECT * FROM employees WHERE employee_id != 1;


TO SELECT DATA WHICH MAY HAVE A NULL VALUE IN THE COLUMN
 This selects all the rows where the hire_date may not be assigned


----> SELECT * FROM employees WHERE hire_data IS NULL;


This returns a list where all the employees have a hire date

----> SELECT * FROM employees WHERE hire_data IS NOT  NULL;
  
  



































