In MySQL, wildcards are special characters that can be used in search queries to match patterns in data. 
There are three types of wildcards in MySQL 1. %  2. _ 3. []


_____________________________________________________________________________________________________________________________________________


%: This wildcard matches any number of characters, including zero characters. 
For example, the search condition "LIKE 'a%'" would match any string that starts with the letter "a", followed by any number of characters.


  HERE IS AN EXAMPLE OF US USING WILD CARDS

This selects all rows that have their last name starting with S.

SELECT * FROM employees WHERE last_name LIKE "S%"
returns Sarah


  This selects all names that end with a R  

    SELECT * FROM empoyees WHERE last_name LIKE  "%r";
returns Jostar
  
  
  You can add more characters
This selects all first names that start with sp
SELECT * FROM employees WHERE first_name LIKE "sp";
returns Spongbob
  












_____________________________________________________________________________________________________________________________________________



_: This wildcard matches any single character. 
For example, the search condition "LIKE 'a_c'" would match any string that starts with the letter "a", followed by any single character,
and ending with the letter "c". for example --> arc

SELECT * FROM table_name WHERE first_name LIKE "a_c"

Here is another example
This retuns all employes who were hired on the second date of any month any year
SELECT * FROM employees WHERE hire_date LIKE "____-__-02"


There is also one where we look for names with any first charater ,but ends with ook

SELECT * FROM table_name WHERE first_name LIKE "_OOK";

This returns look, cook, book, Because they fit the above cartegoty.





____WE CAN ALSO COMINE THE ABOVE TWO
SELECT * FROM employeees WHERE job LIKE "_a%";
This selects jobs whose second character is A
This can return manager, janitor ,cashier.



_____________________________________________________________________________________________________________________________________________

[]: This wildcard matches any character within the specified range. 
For example, the search condition "LIKE 'a[bcd]e'" would match any string that starts with the letter "a", 
followed by either the letter "b", "c", or "d", and ending with the letter "e".

Wildcards are commonly used in conjunction with the LIKE keyword in SQL queries to search for specific patterns of data in a database.
For example, you could use the % 
  
  
  
  
  HERE IS AN EXAMPLE OF US USING WILD CARDS

This selects all rows that have their last name starting with S.

SELECT * FROM employees WHERE last_name LIKE "S%"
returns Sarah


  This selects all names that end with a R  

    SELECT * FROM empoyees WHERE last_name LIKE  "%r";
returns Jostar
  
  
  You can add more characters
This selects all first names that start with sp
SELECT * FROM employees WHERE first_name LIKE "sp";
returns Spongbob
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
