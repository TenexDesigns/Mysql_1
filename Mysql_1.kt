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
_______________________________________________________________________________________________________________________________________________________________


This will only show us data from the frist_name and last_name columns

-------> SELECT first_name,last_name FROM employees

We can also change the order in which the return columns are arranged

-------> SELECT last_name,first_name FROM employees  // This returns the last_name as the first column


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





HOW TO UPDATE AND DELETE DATA FROM A TABLE
_______________________________________________________________________________________________________________________________________________________________
To update data in a table we use

---------> UPDATE employees SET hourly_pay =10.25 WHERE employee_id = 6;


TO UPDATE MULTIPLE SETS OF DATA ,JUST SEPARATE THE DATA WITH A COMMA

Here we update the information of one employees whose id is 6.We update his hire date and his hourly pay.

---------> UPDATE employees SET  hourly_pay = 10.56, hire_date = "2023-01-07" WHERE employee_id = 6;

TO SET A VALUE EQUAL TO NULL
We hust set it to null

----------> UPDATE employees SET hourly_pay = NULL WHERE employee_id = 6;


TO UPDATE THE VALUE FOR THE WHOLE COLUMN INTO ONE VALUE,WE EXCLUDE THE WHERE CLAUSE
This will set alll values in the hourly_pay column equal to 12.45

----------> UPDATE employees SET hourly_pay = 12.45 ;



TO DELETE A ROW FROM A TABLE
________________________________________________________________________________
 To delete a row from a table ,use a WHERE clause, because else it will delete all of your rows.


This will delete the row whose employeee id is  6

-------> DELETE FROM employees WHERE employee_id = 6

DO NOT DO THIS AS IT WILL DELETE ALL OF YOUR ROWS IN YOU TABLE

-------> DELETE FROM employees




SAVE YOUR WORK MANUALRY USING AUTOCOMMIT ,COMMIT ,ROLLBACK
_________________________________________________________________________________________________________________________________________________________
BY DEFAUTL. AUTOCOMMIT IS ON.
The autocommit automaticaly saves your changes to the datasave.This even includes deleting your whole rows.
To avoid such a cercamstance you can be manualy saving your work .
First you turn off the autocommit.

--------> SET AUTOCOMMMIT = OFF;
With this,our transactins will not be saved aoutomaticaly,
We would manualy need to save each transaction. This creates a safe point
To create a safe point type in the word commit

----->COMMIT

Maybe in our workings wwe can accidenataly delete all of our rows e.g DELETE FROM employees;

Luckyly we create a safe point with that commit statement . Meaning all chages we made to our data upto that point where we typred commit ,those chages have not take effect yet
and we can use the ROLLBACK keyword to go back to the data we had at the point we used commit.

----->ROLLBACK 
This wii restor our transactions to the previous safe point ,which is commit.


TO MAKE A CHANGE A N SAVE IT 

-----> DELETE FROM employees WHERE employee_id =6;
------> COMIT
This saves the changes we made above.






GETTING CURRENT DATE AND TIME IN MYSQL
____________________________________________________________________________________________________________________________________

Here we create a table called test and give it three colmns of my_date,my_time and my_date time
To get the date we use CURRENT_DATE()
To get the time we use CURRENT_TIME()
To get the dateTime we user NOW()



 CREATE TABLE test(
      my_date DATE,
      my_time TIME,
      my_datetume DATETIME
 );
  


Then to insert data into the above created columns

-------> INSERT INTO test VALUES (CURRENT_DATE(), CURRENT_TIME(),NOW())

HERE WE CAN EVEN MAKE SOME VALUES NULL

-------> INSERT INTO test VALUES (CURRENT_DATE(), NULL,NULL)

HERE WE CAN EVEN MAKE THE DATE TODE BE TOMMROW BY ADDING 1 TO THE CUURENT DATE

INSERT INTO test VALUES (CURRENT_DATE() + 1 , null ,null)

You can do the same with your time,by either adding or subtracting the time.






THE UNIQUE CONSTRATNT
_____________________________________________________________________________________________________________________________________________________
  

This ensures all alues in a column are all different and unique.
We can add this constraint when we create a table or after.

ADDDING UNIQUE CONSTRAINT WHEN CRATING COLUMN.

CREATE TABLE products (
  product_id INT,
  product_name VARCHAR(25)  UNIQUE, // This means that no two product names can be the same. They all have to different 
  price DECIMAL(4,2)


)

ADDING UNIQUE CONSTRAINT AFTER YOU HAVE CREATED A COLUMN

Here you use the ADD CONSTARINT UNIQUE  and then add the column name in the  parenthesis.

ALTER TABLE products ADD CONSTRAINT UNIQUE (product_name)





THE NOT NULL CONSTARAINT
___________________________________________________________________________________________________________________________________________________________


This not null constant ensures that there is no null value in that column

To add the NOT NULL constartinet when creating a table

CREATE TABLE products (
  products_id INT,
  product_name VARCHAR(),
  price DECIMAL(4,2) NOT NULL // This means that ther is supposed to be no null value in this column.

)


To add the NOT NULL constrainet to an already created column.

ALTER TABLE  products MODIFY price DECIMAL(4,2) NOT NULL;
It can be zero but it cant be null


  

  THE CHECK CONSTRAINET
____________________________________________________________________________________________________________________________---

The check constraint is used to limit what values can be put in a column.
In this example it can be used to ensure that the values put in the hourly_pay are above 10.00


CREATE TABLE employees (
  employee_id INT,
  first_name VARCHAR(50),
  last_name VARCHAR(50),
  hourly_pay DECIMAL (5,2),
  hire_date DATE,                   // We use this constarint to ensure that all values in the hourly_pay are above 10.00
  CONSTRAINT check_hourly_Pay CHECK (hourly_pay >= 10.00)  // This is the check constatint. We have given it a name of check_hourly_pay ,so that we can easily identfy this constrainet

)


TO ADD A CHECK CONSTARINT TO A TABLE THAT ALREADY EXISTS.

---------> ALTER TABLE employees ADD CONSTRAINT chk_hourly_pay CHECK(hourly_pay >= 10.00);



TO DELETE A CHECK, YOU DO SO IN THE FOLLOWING MANNER
You pass in the name you gave to your check

-------> ALTER TABLE employees DROP CHECK check_houlr_pay;





























