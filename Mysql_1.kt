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
It is used to limit what values can be placed inside a column.
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






THE DEFAULT CONSTRAINT
____________________________________________________________________________________________________________________________________________________________
This inserts a default value into the the column ,unless we change it manualy.
This can be used to overcome repetitive vlaue which arre the same in each row.
Here is an example
//Here all the values of the price column are the same an repetitive.

INSERT INTO products VALUES (104,"Starw",0.00),
                            (105,"napkin",0.00),
                            (106,"fork",0.00),
                            (107,"spoon",0.00);


TO ADD THE DEFAULTS CONSTRAINT WHEN CREATING THE TABLE AND ASSIGN A VALUE

CREATE TABLE products (
  
  product_id INT,
  product_name VARCHAR(25),
  price DECIMAL(4,2)  DEFAULT 0.00 // Here is where we put the default valu of the price column


)


TO ALTER A TABLE TO INCLUDE THE DEFAULT CONSTRIANT

-------> ALTER TABLE products ALTER price SET DEFAULTS 0.00;

After doing this ,when we come to inserting values , we can do the following
This will put the default value as 0.00  unless we overide the default value.

INSERT INTO products (product_id,product_name) VALUES  (104,"Starw"),
                                                       (105,"napkin"),
                                                       (106,"fork"),
                                                       (107,"spoon",5.67);









PRIMARY KEYS IN MYSQL
_____________________________________________________________________________________________________________________________________________________________

The orimay key is used on a column where each value must be UNIQUE   and NOT NULL.
A table can only have one primay key constraint.


Here is how we add a primary key when creating a table.
                                                      
-----> CREATE TABLE  transactions(
                            transaction_id INT PRIMARY KEY,   //Here we put our primary key.
                            amount DECIMAL(5,2)
                             );



HERE IS HOW TO ADD A PRIMARY KEY CONSTARINT TO AN ALREADY EXISTING TABLE.

                                                     // Here we add the column name that we would like to have our primary key
ALTER TABLE transactions ADD CONSTRAINT PRIMARY KEY (transaction_id);


to insert data as seen above 

INSERT INTO transactions VALUES (1001,4.99)//ALLOWED
INSERT INTO transactions VALUES (1002,4.99)//ALLLOWED
INSERT INTO transactions VALUES (1001,4.99)//NOT ALLOWED AS PRIMARY KEY HERE IS REPEADTED AND HENCE NOT UNIQUE
INSERT INTO transactions VALUES (NULL,4.99)//NOT ALLOWED AS THE PRIMARY KEY CAN NOT BE NULL.

 



THE AUTOINCREMENT ATTRIBUTE IN MYSQL
___________________________________________________________________________________________________________________________________________________

The autoincrement constraint can be set on a column that has been made to be a PRIMARY KEY.
When ever we insert a newrow. Our primary key can be autopoplated automaticaly.
By default the autoincrement value is set to 1

CREATE TABLE transactions (
  transaction_id INT PRIMARY KEY AUTO_INCREMENT,// The auto increment can only be set on a column which is the primary key.
  amount DECIMALS(5,2)



)

TO INSERT DATA INTO THE ABOVE TABLE
//The transactions will be increased automaticay from one,,so here we have to specify what value we are providing for.
INSERT INTO transactions (amount) VALUES (4.99)(5.77);




WILL GIVE OUT ----> transation_id    amount
                          1          4.99
                          2          5.77


WE CAN ALSO SET OUR AUTOINCREMENT VALUE TO INCREASE FROM ANOTHER NUMBER.

ALTER TABLE transactions AUTO_INCREMENT = 1000;

When we do this, our primay key will auto_increment from 1000


INSERT INTO transactions (amount) VALUES (4.99)(5.77);




WILL GIVE OUT ----> transation_id    amount
                          1001          4.99
                          1002          5.77










FOREIGN KEYS IN MYSQL.
____________________________________________________________________________________________________________________________________________________________________

Foreign key is a primary key on one table that can be found on a different table.
Using a foreign key, we can establish a link between two tables.
Mysql prevents any action that will destroy that link between them.

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


LET US CREATE A SECOND TABLE,AND USE THE CUSTOMERS ID(which is a primary key of our first table) TO CREATE A FOREIGN KEY BY USING IT ,IN THIS SECOND TABLE

CREATE TABLE transactions (
  
  transaction_id INT PRIMARY KEY AUTO_INCREMENT,
  amount DECIMALS(5,2),
  customer_id INT, //This is the foreign key.We create a column in the second table and give it the same name as the column with the primary key in the first table
  FOREIGN KEY (customer_id) REFERENCES customers(customer_id)  //Here we make sure theres a connectio between our first table and our second table.
      //Here we tell mysql that the foreign key is the customers_id and then refer to the customer Id column in the second table.     



);

To find any active foreign keys in mySql, go to that table and in the dropdown menu ,there is a foreign keys option.Enlarge it and see if there are any foreih=gn keys.
The  forein key will be given a random name , that starts with the table name e.g  transactions_ibfk_1



TO DROP A FOREIGN KEY,JUST USE ITS NAME, GIVEN IN THE FOREIGN KEYS DROP DOWN MENU OF THE SELECTED TABLE.

-------------> ALER TABLE transactions DROP FOREIGN KEY transactions_ibfk_1;



ADD A NAMED FOREIGN KEY TO AN EXISTIN TABLE
To apply a foreign key to a table that already exists 

-------> ALTER TABLE traansactions ADD CONSTRAINT fk_customer_id FOREIGN KEY (customer_id) REFERENCES customers(customer_id)


You dont need to neccesary name the foreign key, so you can remove the quoted part if you want
-------> ALTER TABLE traansactions " FOREIGN KEY (customer_id)" REFERENCES customers(customer_id)


TO INSERT DATA INTO OUR SECOND TABLE


INSERT INTO  transactions (amount,customer_id) VALUES (4.99,3),
                                                      (2.89,2),
                                                      (3.38,3),
                                                      (3.24,1),



This will be the result.
Here we can see that the first and the third transaction were made by the same customer. So if we go to our customers table and search for the customer with an Id of three. Then we can know who it is
This is how foreign keys work.They link up information in two tablses to show a relationship.We now have a link beteen our transactions table and our customers table.
My sql will prevent any actions that wll destroy that link between them, unless we explicity drop that foreign key constraint.

transaction_id     amount          customer_id
1                 4.99,            3
2                 2.89,            2
3                 3.38,            3
4                 3.24,            1

My sql will prevent any actions that wll destroy that link between them, unless we explicity drop that foreign key constraint.
Let us give it a try here
-----> DELETE FROM customers WHERE customers_id = 3
This above here is prohibited. Since this will ruin the established connection betwen the two tables
"cannot delete or update parent row .foreing key constraint fails"---> Is the erroe message gotten.


That is a foreign key. It is a priamry key of one table found on another table.and when we use that foreign key in another table, we refer to it as a foreign key.
e



































































































































































































































