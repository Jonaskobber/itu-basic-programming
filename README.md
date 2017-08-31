# Exercise
## 2.1
Create a TicketMachine object on the object bench and take a look at its methods. You should see the following: getBalance, getPrice, insertMoney, and printTicket. Try out the getPrice method. You should see a return value containing the price of the tickets that was set when this object was created. Use the insertMoney method to simulate inserting an amount of money into the machine. The machine stores as a balance the amount of money inserted. Use getBalance to check that the machine has kept an accurate record of the amount just inserted. You can insert several separate amounts of money into the machine, just like you might insert multiple coins or bills into a real machine. Try inserting the exact amount required for a ticket, and use getBalance to ensure that the balance is increased correctly. As this is a simple machine, a ticket will not be issued automatically, so once you have inserted enough money, call the printTicket method. A facsimile ticket should be printed in the BlueJ terminal window.
## 2.2
What value is returned if you get the machine’s balance after it has printed a ticket?
## 2.3
Experiment with inserting different amounts of money before printing tickets. Do you notice anything strange about the machine’s behavior? What happens if you insert too much money into the machine – do you receive any refund? What happens if you do not insert enough and then try to print a ticket?
## 2.4
Try to obtain a good understanding of a ticket machine’s behavior by interacting with it on the object bench before we start looking, in the next section, at how the TicketMachine class is implemented.
## 2.5
Create another ticket machine for tickets of a different price; remember that you have to supply this value when you create the machine object. Buy a ticket from that machine. Does the printed ticket look any different from those printed by the first machine?
## 2.6
Write out what you think the outer wrappers of the Student and LabClass classes might look like; do not worry about the inner part.
## 2.7
Does it matter whether we write
```
  public class TicketMachine
```
or
```
  class public TicketMachine
```
in the outer wrapper of a class? Edit the source of the TicketMachine class to make the change, and then close the editor window. Do you notice a change in the class diagram?
What error message do you get when you now press the Compile button? Do you think this message clearly explains what is wrong?
Change the class back to how it was, and make sure that this clears the error when you compile it.
## 2.8
Check whether or not it is possible to leave out the word public from the outer wrapper of the TicketMachine class.
## 2.9
Put back the word public, and then check whether it is possible to leave out the word class by trying to compile again. Make sure that both words are put back as they were originally before continuing.
## 2.10
From your earlier experimentation with the ticket machine objects within BlueJ, you can probably remember the names of some of the methods–printTicket, for instance. Look at the class definition in Code 2.1 and use this knowledge, along with the additional information about ordering we have given you, to make a list of the names of the fields, constructors, and methods in the TicketMachine class. Hint: There is only one constructor in the class.
## 2.11
What are the two features of the constructor that make it look significantly different from the methods of the class?
## 2.12
What do you think is the type of each of the following fields?
```
  private int count;
  private Student representative;
  private Server host;
```
## 2.13
What are the names of the following fields?
```
  private boolean alive;
  private Person tutor;
  private Game game;
```
## 2.14
From what you know about the naming conventions for classes, which of the type names in Exercises 2.12 and 2.13 would you say are class names?
## 2.15
In the following field declaration from the TicketMachine class
```
  private int price;
```
does it matter which order the three words appear in? Edit the TicketMachine class to try different orderings. After each change, close the editor. Does the appearance of the class diagram after each change give you a clue as to whether or not other orderings are possible? Check by pressing the Compile button to see if there is an error message.

Make sure that you reinstate the original version after your experiments!
## 2.16
Is it always necessary to have a semicolon at the end of a field declaration? Once again, experiment via the editor. The rule you will learn here is an important one, so be sure to remember it.
## 2.17
Write in full the declaration for a field of type int whose name is status.
## 2.18
To what class does the following constructor belong?
```
  public Student(String name)
```
## 2.19
How many parameters does the following constructor have, and what are their types?
```
  public Book(String title, double price)
```
## 2.20
Can you guess what types some of the Book class’s fields might be, from the parameters in its constructor? Can you assume anything about the names of its fields?
## 2.21
Suppose that the class Pet has a field called name that is of type String. Write an assignment statement in the body of the following constructor so that the name field will be initialized with the value of the constructor’s parameter.
```
  public Pet(String petsName)
  {
  }
```
## 2.22
Challenge exercise The following object creation will result in the constructor of the Date class being called. Can you write the constructor’s header?
```
  new Date("March", 23, 1861)
```
Try to give meaningful names to the parameters.
## 2.23
Compare the header and body of the getBalance method with the header and body of the getPrice method. What are the differences between them?
## 2.24
If a call to getPrice can be characterized as “What do tickets cost?” how would you characterize a call to getBalance?
## 2.25
If the name of getBalance is changed to getAmount, does the return statement in the body of the method also need to be changed for the code to compile? Try it out within BlueJ. What does this tell you about the name of an accessor method and the name of the field associated with it?
## 2.26
Write an accessor method getTotal in the TicketMachine class. The new method should return the value of the total field.
## 2.27
Try removing the return statement from the body of getPrice. What error message do you see now when you try compiling the class?
## 2.28
Compare the method headers of getPrice and printTicket in Code 2.1. Apart from their names, what is the main difference between them?
## 2.29
Do the insertMoney and printTicket methods have return statements? Why do you think this might be? Do you notice anything about their headers that might suggest why they do not require return statements?
## 2.30
Create a ticket machine with a ticket price of your choosing. Before doing anything else, call the getBalance method on it. Now call the insertMoney method (Code 2.6) and give a non-zero positive amount of money as the actual parameter. Now call getBalance again. The two calls to getBalance should show different outputs, because the call to insertMoney had the effect of changing the machine’s state via its balance field.
## 2.31
How can we tell from just its header that setPrice is a method and not a constructor?
```
  public void setPrice(int cost)
```
## 2.32
Complete the body of the setPrice method so that it assigns the value of
its parameter to the price field.
## 2.33
Complete the body of the following method, whose purpose is to add the
value of its parameter to a field named score.
```
  /**
   * Increase score by the given number of points.
   */
  public void increase(int points)
  {
    ...
  }
```
## 2.34
Is the increase method a mutator? If so, how could you demonstrate this?
## 2.35
Complete the following method, whose purpose is to subtract the value of its
parameter from a field named price.
```
  /**
   * Reduce price by the given amount.
   */
  public void discount(int amount)
  {
    ...
  }
```
## 2.36
Write down exactly what will be printed by the following statement:
```
  System.out.println("My cat has green eyes.");
```
## 2.37
Add a method called prompt to the TicketMachine class. This should have a void return type and take no parameters. The body of the method should print the following single line of output:
```
  Please insert the correct amount of money.
```
## 2.38
What do you think would be printed if you altered the fourth statement of printTicket so that price also has quotes around it, as follows?
```
  System.out.println("# " + "price" + " cents.");
```
## 2.39
What about the following version?
```
  System.out.println("# price cents.");
```
## 2.40
Could either of the previous two versions be used to show the price of tickets in different ticket machines? Explain your answer.
## 2.41
Add a showPrice method to the TicketMachine class. This should have a void return type and take no parameters. The body of the method should print:
```
  The price of a ticket is xyz cents.
```
where xyz should be replaced by the value held in the price field when the method is called.
## 2.42
Create two ticket machines with differently priced tickets. Do calls to their showPrice methods show the same output, or different? How do you explain this effect?
## 2.43
Modify the constructor of TicketMachine so that it no longer has a parameter. Instead, the price of tickets should be fixed at 1,000 cents. What effect does this have when you construct ticket-machine objects within BlueJ?
## 2.44
Give the class two constructors. One should take a single parameter that specifies the price, and the other should take no parameter and set the price to be a default value of your choosing. Test your implementation by creating machines via the two different constructors.
## 2.45
Implement a method, empty, that simulates the effect of removing all money from the machine. This method should have a void return type, and its body should simply set the total field to zero. Does this method need to take any parameters? Test your method by creating a machine, inserting some money, printing some tickets, checking the total, and then emptying the machine. Is the empty method a mutator or an accessor?
## 2.46
Check that the behavior we have discussed here is accurate by creating a TicketMachine instance and calling insertMoney with various actual parameter values. Check the balance both before and after calling insertMoney. Does the balance ever change in the cases when an error message is printed? Try to predict what will happen if you enter the value zero as the parameter, and then see if you are right.
## 2.47
Predict what you think will happen if you change the test in insertMoney to use the greater-than or equal-to operator:
```
  if(amount >= 0)
```
Check your predictions by running some tests. What difference does it make to the behavior of the method?
## 2.48
Rewrite the if-else statement so that the error message is printed if the boolean expression is true but the balance is increased if the expression is false. You will obviously have to rewrite the condition to make things happen this way around.
## 2.49
In the figures project we looked at in Chapter 1 we used a boolean field to control a feature of the circle objects. What was that feature? Was it well suited to being controlled by a type with only two different values?
## 2.50
In this version of printTicket, we also do something slightly different with the total and balance fields. Compare the implementation of the method in Code 2.1 with that in Code 2.8 to see whether you can tell what those differences are. Then check your understanding by experimenting within BlueJ.
## 2.51
Is it possible to remove the else part of the if statement in the printTicket method (i.e., remove the word else and the block attached to it)? Try doing this and seeing if the code still compiles. What happens now if you try to print a ticket without inserting any money?
## 2.52
After a ticket has been printed, could the value in the balance field ever be set to a negative value by subtracting price from it? Justify your answer.
## 2.53
So far, we have introduced you to two arithmetic operators, + and -, that can be used in arithmetic expressions in Java. Take a look at Appendix C to find out what other operators are available.
## 2.54
Write an assignment statement that will store the result of multiplying two variables, price and discount, into a third variable, saving.
## 2.55
Write an assignment statement that will divide the value in total by the value in count and store the result in mean.
## 2.56
Write an if statement that will compare the value in price against the value in budget. If price is greater than budget, then print the message “Too expensive”; otherwise print the message “Just right”.
## 2.57
Modify your answer to the previous exercise so that the message includes the value of your budget if the price is too high.
## 2.58
Why does the following version of refundBalance not give the same results as the original?
```
  public int refundBalance()
  {
    balance = 0;
    return balance;
  }
```
What tests can you run to demonstrate that it does not?
## 2.59
What happens if you try to compile the TicketMachine class with the following version of refundBalance?
```
  public int refundBalance()
  {
    return balance;
    balance = 0;
  }
```
What do you know about return statements that helps to explain why this version does not compile?
## 2.60
What is wrong with the following version of the constructor of TicketMachine?
```
  public TicketMachine(int cost)
  {
    int price = cost;
    balance = 0;
    total = 0;
  }
```
Try out this version in the better-ticket-machine project. Does this version compile? Create an object and then inspect its fields. Do you notice something wrong about the value of the price field in the inspector with this version? Can you explain why this is?
## 2.61
Add a new method, emptyMachine, that is designed to simulate emptying the machine of money. It should reset total to be zero but also return the value that was stored in total before it was reset.
## 2.62
Rewrite the printTicket method so that it declares a local variable, amountLeftToPay. This should then be initialized to contain the difference between price and balance. Rewrite the test in the conditional statement to check the value of amountLeftToPay. If its value is less than or equal to zero, a ticket should be printed; otherwise, an error message should be printed stating the amount left to pay. Test your version to ensure that it behaves in exactly the same way as the original version. Make sure that you call the method more than once, when the machine is in different states, so that both parts of the conditional statement will be executed on separate occasions.
## 2.63
Challenge exercise Suppose we wished a single TicketMachine object to be able to issue tickets of different prices. For instance, users might press a button on the physical machine to select a discounted ticket price. What further methods and/or fields would need to be added to TicketMachine to allow this kind of functionality? Do you think that many of the existing methods would need to be changed as well?
Save the better-ticket-machine project under a new name, and implement your changes in the new project.
## 2.64
List the name and return type of this method:
```
  public String getCode()
  {
       return code;
  }
```
## 2.65
List the name of this method and the name and type of its parameter:
```
  public void setCredits(int creditValue)
  {
      credits = creditValue;
  }
```
## 2.66
Write out the outer wrapping of a class called Person. Remember to include the curly brackets that mark the start and end of the class body, but otherwise leave the body empty.

## 2.67
Write out definitions for the following fields:
* a field called name of type String
* a field of type int called age
* a field of type String called code
* a field called credits of type int
## 2.68
Write out a constructor for a class called Module. The constructor should take a single parameter of type String called moduleCode. The body of the constructor should assign the value of its parameter to a field called code. You don’t have to include the definition for code, just the text of the constructor.
## 2.69
Write out a constructor for a class called Person. The constructor should take two parameters. The first is of type String and is called myName. The second is of type int and is called myAge. The first parameter should be used to set the value of a field called name, and the second should set a field called age. You don’t have to include the definitions for the fields, just the text of the constructor.
## 2.70
Correct the error in this method:
```
  public void getAge()
  {
    return age;
  }
```
## 2.71
Write an accessor method called getName that returns the value of a field called name, whose type is String.
## 2.72
Write a mutator method called setAge that takes a single parameter of type int and sets the value of a field called age.
## 2.73
Write a method called printDetails for a class that has a field of type String called name. The printDetails method should print out a string of the form “The name of this person is”, followed by the value of the name field. For instance, if the value of the name field is “Helen”, then printDetails would print:
```
  The name of this person is Helen
```
## 2.74
Draw a picture of the form shown in Figure 2.3, representing the initial state of a Student object following its construction, with the following actual parameter values:
```
  new Student("Benjamin Jonson", "738321")
```
## 2.75
What would be returned by getLoginName for a student with name
"Henry Moore" and id "557214"?
## 2.76
Create a Student with name "djb" and id "859012". What happens when getLoginName is called on this student? Why do you think this is?
## 2.77
The String class defines a length accessor method with the following header:
```
  /**
   * Return the number of characters in this string.
   */
   public int length()
 ```
so the following is an example of its use with the String variable fullName:
```
  fullName.length()
```
Add conditional statements to the constructor of Student to print an error message if either the length of the fullName parameter is less than four characters or the length of the studentId parameter is less than three characters. However, the constructor should still use those parameters to set the name and id fields, even if the error message is printed. Hint: Use if statements of the following form (that is, having no else part) to print the error messages.
```
  if(perform a test on one of the parameters) {
    Print an error message if the test gave a true result
  }
```
See Appendix D for further details of the different types of if statements, if necessary.
## 2.78
Challenge exercise Modify the getLoginName method of Student so that it always generates a login name, even if either the name or the id field is not strictly long enough. For strings shorter than the required length, use the whole string.
## 2.79
Consider the following expressions. Try to predict their results, and then type them in the Code Pad to check your answers.
```
  99 + 3
  "cat" + "fish"
  "cat" + 9
  9 + 3 + "cat"
  "cat" + 3 + 9
  "catfish".substring(3,4)
  "catfish".substring(3,8)
```
Did you learn anything you did not expect from the exercise? If so, what was it?
## 2.80
Open the Code Pad in the better-ticket-machine project. Type the following in the Code Pad:
```
  TicketMachine t1 = new TicketMachine(1000);
  t1.getBalance()
  t1.insertMoney(500);
  t1.getBalance()
```
Take care to type these lines exactly as they appear here; pay particular attention to whether or not there is a semicolon at the end of the line. Note what the calls to getBalance return in each case.
## 2.81
Now add the following in the Code Pad:
```
  TicketMachine t2 = t1;
```
What would you expect a call to t2.getBalance() to return? Try it out.
## 2.82
Add the following:
```
  t1.insertMoney(500);
```
What would you expect the following to return? Think carefully about this before you try it, and be sure to use the t2 variable this time.
```
  t2.getBalance()
```
Did you get the answer you expected? Can you find a connection between the variables t1 and t2 that would explain what is happening?
## 2.83
Below is the outline for a Book class, which can be found in the book-exercise project. The outline already defines two fields and a constructor to initialize the fields. In this and the next few exercises, you will add features to the class outline.
Add two accessor methods to the class—getAuthor and getTitle—that return the author and title fields as their respective results. Test your class by creating some instances and calling the methods.
```
  /**
   * A class that maintains information on a book.
   * This might form part of a larger application such
   * as a library system, for instance.
   *
   * @author (Insert your name here.)
   * @version (Insert today’s date here.)
   */
  public class Book
  {
      // The fields.
      private String author;
      private String title;
      /**
       * Set the author and title fields when this object
       * is constructed.
       */
      public Book(String bookAuthor, String bookTitle)
      {
          author = bookAuthor;
          title = bookTitle;
      }
      // Add the methods here...
  }
```
## 2.84
Add two methods, printAuthor and printTitle, to the outline Book class. These should print the author and title fields, respectively, to the terminal window.
## 2.85
Add a field, pages, to the Book class to store the number of pages. This should be of type int, and its initial value should be passed to the single constructor, along with the author and title strings. Include an appropriate getPages accessor method for this field.

Exercise 2.X Are the Book objects you have implemented immutable? Justify your answer.
## 2.86
Add a method, printDetails, to the Book class. This should print details of the author, title, and pages to the terminal window. It is your choice how the details are formatted. For instance, all three items could be printed on a single line, or each could be printed on a separate line. You might also choose to include some explanatory text to help a user work out which is the author and which is the title, for example
```
  Title: Robinson Crusoe, Author: Daniel Defoe, Pages: 232
```
## 2.87
Add a further field, refNumber, to the Book class. This field can store a reference number for a library, for example. It should be of type String and initialized to the zero length string ("") in the constructor, as its initial value is not passed in a parameter to the constructor. Instead, define a mutator for it with the following header:
```
  public void setRefNumber(String ref)
```
The body of this method should assign the value of the parameter to the refNumber field. Add a corresponding getRefNumber accessor to help you check that the mutator works correctly.
## 2.88
Modify your printDetails method to include printing the reference number. However, the method should print the reference number only if it has been set—that is, the refNumber string has a non-zero length. If it has not been set, then print the string "ZZZ" instead. Hint: Use a conditional statement whose test calls the length method on the refNumber string.
## 2.89
Modify your setRefNumber mutator so that it sets the refNumber field only if the parameter is a string of at least three characters. If it is less than three, then print an error message and leave the field unchanged.
## 2.90
Add a further integer field, borrowed, to the Book class. This keeps a count of the number of times a book has been borrowed. Add a mutator, borrow, to the class. This should update the field by 1 each time it is called. Include an accessor, getBorrowed, that returns the value of this new field as its result. Modify printDetails so that it includes the value of this field with an explanatory piece of text.
## 2.91
Add a further boolean field, courseText, to the Book class. This records whether or not a book is being used as a text book on a course. The field should be set through a parameter to the constructor and the field is immutable. Provide an accessor method for it called isCourseText.
## 2.92
Challenge exercise Create a new project, heater-exercise, within BlueJ. Edit the details in the project description—the text note you see in the diagram. Create a class, Heater, that contains a single field, temperature whose type is double-precision floating point—see Appendix B, section B.1, for the Java type name that corresponds to this description. Define a constructor that takes no parameters. The temperature field should be set to the value 15.0 in the constructor. Define the mutators warmer and cooler, whose effect is to increase or decrease the value of temperature by 5.0° respectively. Define an accessor method to return the value of temperature.
## 2.93
Challenge exercise Modify your Heater class to define three new double precision floating point fields: min, max, and increment. The values of min and max should be set by parameters passed to the constructor. The value of increment should be set to 5.0 in the constructor. Modify the definitions of warmer and cooler so that they use the value of increment rather than an explicit value of 5.0. Before proceeding further with this exercise, check that everything works as before.
Now modify the warmer method so that it will not allow the temperature to be set to a value greater than max. Similarly modify cooler so that it will not allow temperature to be set to a value less than min. Check that the class works properly. Now add a method, setIncrement, that takes a single parameter of the appropriate type and uses it to set the value of increment. Once again, test that the class works as you would expect it to by creating some Heater objects within BlueJ. Do things still work as expected if a negative value is passed to the setIncrement method? Add a check to this method to prevent a negative value from being assigned to increment.
