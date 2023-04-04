In MySQL, a trigger is a database object that is associated with a specific table and is executed automatically in 
response to certain events, such as INSERT, UPDATE, or DELETE operations on the table.
The purpose of a trigger is to perform a set of actions or checks based on the event that has occurred.

Here is the basic syntax for creating a trigger in MySQL:

CREATE TRIGGER trigger_name
{BEFORE | AFTER} {INSERT | UPDATE | DELETE}
ON table_name
FOR EACH ROW
BEGIN
    -- trigger logic goes here

END;



In this syntax, "trigger_name" is the name of the trigger, "BEFORE" or "AFTER" specifies whether the trigger should execute before or
after the event, "INSERT", "UPDATE",
or "DELETE" specifies the type of event, "table_name" is the name of the table to which the trigger is attached, 
and "FOR EACH ROW" indicates that the trigger should execute once for each row affected by the event.

The trigger logic goes between the BEGIN and END keywords, and can include any valid SQL statements,
including SELECT, INSERT, UPDATE, and DELETE statements, as well as conditionals and loops.
The trigger can also access the values of the old and new rows being affected by the event using the "OLD" and "NEW" keywords, respectively.




Triggers can be useful for enforcing data integrity constraints, auditing changes to the database, or performing complex calculations or data transformations.
However, they can also introduce performance overhead and make it more difficult to maintain the database schema, so they should be used judiciously.










HERE IS AN EXAMPLE


CREATE TRIGGER trigger_name
BEFORE INSERT
ON table_name
FOR EACH ROW
BEGIN
    SET NEW.salaries = (NEW.hourly_pay * 2089)
END;

























































































































