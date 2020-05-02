Topic 1: JVM Concepts and Language Basics

Assignment 1: 
Write a java program to display “Welcome to Java Programming” and then print your name on a separate line.

Assignment 2: 
Write a Java program to print the result of the following operations. Declare variables and initialize them with given values a. -5 + 8 * 6 b. (55+9) % 9 c. 20 + -3*5 / 8 d. 5 + 15 / 3 * 2 - 8 % 3

Assignment 3: 
Write a Java program to convert minutes into a number of years and days.

Assignment 4:
Write a program to print month in words, based on input month in numbers.(using switch case)

Assignment 5:
Write a program that will accept a 4 digit number(assume that the user enters only 4 digit nos.) and print the sum of all the 4 digits. For ex : If the number passed is 3629, the program should print “The sum of all the digits entered is 20”

Assignment 6:
Write a program to find greatest number in an array

Assignment 7: 
Write a Java program to calculate the factorial of a number without using any loop.


Topic 2: Object Oriented Concepts

Assignment 1:
Write a program to create a class Book with the following
- attributes: -isbn, title, author, price
- methods :
i. Initialize the data members through parameterized constructor
ii. displaydeta ils() to display the details of the book
iii. discountedprice() : pass the discount percent, calculate the discount on price and find the amount to be paid after discount
- task :
Create an object book, initialize the book and display the details along with the discounted price


Assignment 2:
Define a class named Document that contains a member variable of type String named text that stores any textual content for the document. Create a method named toString that returns the text field and also include a method to set this value.
Next, define a class for Email that is derived from Document and includes member variables for the sender, recipient, and title of an email message. Implement appropriate accessor and mutator methods. [An accessor is a member function that accesses the contents of an object but does not modify that object; eg: int getX(return x;)A mutator is a member function that can modify an object void setX(int x){this.x=x;} ]The body of the email message should be stored in the inherited variable text. Redefine the toString method to concatenate all text fields.


Assignment 3:
Write a program to create a class Book with the following data members: isbn, title and price. Inherit the class Book to two derived classes : Magazine and Novel with the following data members:
Magazine: type
Novel : author
Populate the details using constructors.
Create a magazine and Novel and display the details.
Sensitivity: Internal & Restricted


Assignment 4:
Define a class named Payment that contains a member variable of type double that stores the amount of the payment and appropriate accessor and mutator methods. Also create a method named paymentDetails that outputs an English sentence to describe the amount of the payment.
Next, define a class named CashPayment that is derived from Payment. This class should redefine the paymentDetails method to indicate that the payment is in cash. Include appropriate constructor(s).
Define a class named CreditCardPayment that is derived from Payment. This class should contain member variables for the name on the card, expiration date, and credit card number. Include appropriate constructor(s). Finally, redefine the paymentDetails method to include all credit card information in the printout.
Create a main method that creates at least two CashPayment and two
CreditCardPayment objects with different values and calls paymentDetails for each.


Assignment 5:
Create an abstract class Instrument which is having the abstract function play.
Create three more sub classes from Instrument which is Piano, Flute, Guitar.
Override the play method inside all three classes printing a message
“Piano is playing tan tan tan tan ” for Piano class
“Flute is playing toot toot toot toot” for Flute class
“Guitar is playing tin tin tin ” for Guitar class
You must not allow the user to declare an object of Instrument class.
Create an array of 10 Instruments.
Assign different type of instrument to Instrument reference.
Check for the polymorphic behavior of play method.
Use the instanceof operator to print that which object stored at which index of instrument array.


Assignment 6:
Write an interface called Playable, with a method
void play();
Let this interface be placed in a package called music.
Write a class called Veena which implements Playable interface. Let this class be placed in a package music.string
Write a class called Saxophone which implements Playable interface. Let this class be placed in a package music.wind
Sensitivity: Internal & Restricted
Write another class Test in a package called live. Then,
a. Create an instance of Veena and call play() method
b. Create an instance of Saxophone and call play() method
c. Place the above instances in a variable of type Playable and then call play()


Topic 3: Exceptions, String Concepts

Assignment 1:
Write a program to accept name and age of a person from the command prompt(passed as arguments when you execute the class) and ensure that the age entered is >=18 and < 60. Display proper error messages. The program must exit gracefully after displaying the error message in case the arguments passed are not proper. (Hint : Create a user defined exception class for handling errors.)

Assignment 2:
Write a Program to take care of Number Format Exception if user enters values other that integer for calculating average marks of 2 students. The name of the students and marks in 3 subjects are passed as arguments while executing the program.

Assignment 3:
Write a program to accept 5 integers passed as arguments while executing the class. Find the average of these 5 nos. Use ArrayIndexOutofBounds exception to handle situation where the user might have entered less than 5 integers.

Assignment 4:
Write a program to check whether the given string is a palindrome or not.
[Hint :You have to extract each character from the beginning and end of the String and compare it with each other. String x=”Malayalam”; char c= x.charAt(i) where i is the index]

Assignment 5:
Write a program to check the no.of occurrences of a given character within the given string without using any loop. [Hint: String str=”How was your day today”; char c=’a’; no.of occurrences of a is=3]


Topic 4: Threads, Collection Framework, Garbage Collection

Assignment 1:
Write a Java Program, where one thread prints a number ( Generate a random number using Math.random) and another thread prints the factorial of that given number. Both the outputs should alternate each other.
Eg: Number : 2
Factorial of 2 : 2
Number : 5
Factorial of 5 : 120
The program can quit after executing 5 times.


Assignment 2:
Write a Java Program which will print the current time on the console every 2 seconds. After doing this activity for 20 seconds the program quits.


Assignment 3:
Create an Employee class with the related attributes and behaviours. Create one more class EmployeeDB which has the following methods.
a. boolean addEmployee(Employee e)
b. boolean deleteEmployee(int eCode)
c. String showPaySlip(int eCode)
d. Employee[] listAll()
Use an ArrayList which will be used to store the emplyees and use enumeration/iterator to process the employees.


Assignment 4:
Write a program creates a HashMap to store name and phone number (Telephone book). When name is give, we can get back the corresponding phone number.
Assignment 5:
Write a program to store a group of employee names into a HashSet, retrieve the elements one by one using an Iterator.
Assignment 6:
Develop a java class that has finalize method which displays “Finalize method called”. Create another class which creates objects of the previous class and it uses the same object reference for creating these objects. For example, if A1 is the class name, then the objects are created as
Sensitivity: Internal & Restricted
below :
A1 a = new A1();
a = new A1();
a = new A1();
When the statement Runtime.getRuntime().gc() is invoked, how many times the finalize method is called


Topic 5: Command Line Args, System Properties, Packaging

Assignment 1:
Create a package called test package;
Define a class called foundation inside the test package;
Inside the class, you need to define 4 integer variables;
Var1 as private;
Var2 as default;
Var3 as protected;
Var4 as public;
Import this class and packages in another class.
Try to access all 4 variables of the foundation class and see what variables are accessible and what are not accessible.


Assignment 2:
Write a Program to accept two Strings Wipro Bangalore as command line arguments and print the output “Wipro Technologies Bangalore” If the command line is “ABC Mumbai”, then it should print “ABC Technologies Mumbai” .


Assignment 3:
Create a package called Automobile. Define an abstract class called Vehicle.
Vehicle class has the following abstract methods:
public String modelName()
public String registrationNumber()
public String ownerName()
Create TwoWheeler subpackage under Automobile package
Hero class extends Automobile.vehicle class
public int speed() – Returns the current speed of the vehicle.
public void radio() – provides facility to control the radio device
Honda class extends Automobile.vehicle class
public int speed()– Returns the current speed of the vehicle.
Sensitivity: Internal & Restricted
public int cdplayer() – provides facility to control the cd player device which is available in the car and test all the methods by invoking them.