# JDBC-Exercise-Start
JDBC Exercise Start
Exercise 1
In NetBeans: Execute the SQL script: create_mail_order_DB.sql. 
For a description of the mail order DB  - see at the end of this doc.
a)	In NetBeans: Import the Java project “JDBC exercise start.zip”, or fetch it from 
GitHub: “https://github.com/tuehellstern/JDBC-Exercise-Start.git ”
b)	In the class DB.java: Insert your userid and password for your MySQL database. 
c)	Run the program =>  The content of the parts table is shown.
Exercise 2
Change, so the program selects and prints out only those tuples for which the price is below some limit (ex: 20).
Let the user enter the limit-value.
Exercise 3
Change, so only the attribute ”pname” is shown and only for products with a given product-number (pno).
Exercise 4
Write a program that inserts a new part in the parts-table. The values to be inserted may be hardcoded in a first version. In a better version, let the user enter the values. 
Exercise 5
Change the program from the previous exercise, so it uses a PreparedStatement-object instead of a Statement-object. Let the user add several new tuples.
(extra:) Read all the values for the new tubles from a text-file.
Exercise 6
Make a Web-version of original program from exercise 1.
Hint 1: Copy all content of main() to the processRequest(Request,Reply) method of the new servlet in a new web project. Remember to add the OJDBC lib to that project as well.

Hint 2: You need to delete the System part of the print lines command to get them out to the webpage.

Hint 3: You need to catch the SQLException after the closing statements

Hint 4: You need a <p> in start of your while loop, and a closing </p> at the end in order for it to look like this:
 
Exercise 7
Make a Web-version of the program from exercise 2 (select with a criterion).
Hint 1: Let the user enter the criterion in a JSP page with a form with an input field and a submit button.
Hint 2: You can make the servlet redirect to the same JSP page again, to reuse the inputfield and make the result from expression language ${}.
Exercise 9 (exstra)
Extend the web-application, so it enables the following “scenario”:
1)	The user enters an order-number
2)	The system shows the name of the employee responsible for that order.
Exercise 8 (exstra)
Extend the web-application, so it enables the following “scenario”:
1)	The user enters an employee-number.
2)	The system displays information about this employee.
3)	The user makes changes to the information and confirms the changes (submit-button) Hint 1: make all the data be displayed in a form and with inputfields.
4)	The system updates the employee-data in the database.
