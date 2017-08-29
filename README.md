# Exercise
## 1.1
Create another circle. Then create a square.

## 1.2
What happens if you call moveDown twice? Or three times? What happens if you call makeInvisible twice?

## 1.3
Try invoking the moveVertical, slowMoveVertical, and changeSize methods before you read on. Find out how you can use moveHorizontal to move the circle 70 pixels to the left.

## 1.4
Invoke the changeColor method on one of your circle objects and enter the string "red". This should change the color of the circle. Try other colors.

## 1.5
This is a very simple example, and not many colors are supported. See what happens when you specify a color that is not known.

## 1.6
Invoke the changeColor method, and write the color into the parameter field without the quotes. What happens?

## 1.7
Create several circle objects on the object bench. You can do so by select- ing new Circle() from the pop-up menu of the Circle class. Make them visible, then move them around on the screen using the “move” methods. Make one big and yellow; make another one small and green. Try the other shapes too: create a few triangles, squares, and persons. Change their positions, sizes, and colors.

## 1.8
Make sure you have several objects on the object bench, and then inspect each of them in turn. Try changing the state of an object (for example, by calling the moveLeft method) while the object inspector is open. You should see the values in the object inspector change.

## 1.9
Figure 1.8 shows two different images. Choose one of these images and recreate it using the shapes from the figures project. While you are doing this, write down what you have to do to achieve this. Could it be done in different ways?

## 1.10
Select Show Terminal from the View menu. This shows another window that BlueJ uses for text output. Then select Record method calls from the terminal’s Options menu. This function will cause all our method calls (in their textual form) to be written to the terminal. Now create a few objects, call some of their methods, and observe the output in the terminal window.

## 1.11
Select Show Code Pad from the View menu. This should display a new pane next to the object bench in your main BlueJ window. This pane is the Code Pad. You can type Java code here.

## 1.12
In the Code Pad, type the code shown above to create a person object and call its makeVisible and moveRight methods. Then go on to create some other objects and call their methods.

## 1.13
Open the house project. Create an instance of class Picture and invoke its draw method. Also, try out the setBlackAndWhite and setColor methods.

## 1.14
How do you think the Picture class draws the picture?

## 1.15
Look at the pop-up menu of class Picture again. You will see an option labeled Open Editor. Select it. This will open a text editor displaying the source code of the class.

## 1.16
In the source code of class Picture, find the part that actually draws the picture. Change it so that the sun will be blue rather than yellow.

## 1.17
Add a second sun to the picture. To do this, pay attention to the field definitions close to the top of the class. You will find this code:
  ```
  private Square wall;
  private Square window;
  private Triangle roof;
  private Circle sun;
  ```
You need to add a line here for the second sun. For example:
  ```
  private Circle sun2;
  ```
Then write the appropriate code for creating the second sun.

## 1.18
Challenge exercise (This means that this exercise might not be solved quickly. We do not expect everyone to be able to solve this at the moment. If you do, great. If you don’t, then don’t worry. Things will become clearer as you read on. Come back to this exercise later.) Add a sunset to the single-sun version of Picture. That is, make the sun go down slowly. Remember: The circle has a method slowMoveVertical that you can use to do this.

## 1.19
Challenge exercise If you added your sunset to the end of the draw method (so that the sun goes down automatically when the picture is drawn), change this now. We now want the sunset in a separate method, so that we can call draw and see the picture with the sun up, and then call sunset (a separate method!) to make the sun go down.

## 1.20
Challenge exercise Make a person walk up to the house after the sunset.

## 1.21
Create an object of class Student. You will notice that this time you are prompted not only for a name of the instance, but also for some other parameters. Fill them in before clicking OK. (Remember that parameters of type String must be written within double quotes.)

## 1.22
Create some student objects. Call the getName method on each object. Explain what is happening.

## 1.23
Create an object of class LabClass. As the signature indicates, you need to specify the maximum number of students in that class (an integer).

## 1.24
Call the numberOfStudents method of that class. What does it do?

## 1.25
Look at the signature of the enrollStudent method. You will notice that the type of the expected parameter is Student. Make sure you have two or three students and a LabClass object on the object bench, then call the enrollStudent method of the LabClass object. With the input cursor in the dialog entry field, click on one of the student objects; this enters the name of the student object into the parameter field of the enroll- Student method (Figure 1.9). Click OK and you have added the student to the LabClass. Add one or more other students as well.

## 1.26
Call the printList method of the LabClass object. You will see a list of all the students in that class printed to the BlueJ terminal window (Figure 1.10).

## 1.27
Create three students with the following details:
  ```
  Snow White, student ID: A00234, credits: 24
  Lisa Simpson, student ID: C22044, credits: 56
  Charlie Brown, student ID: A12003, credits: 6
  ```
Then enter all three into a lab and print a list to the screen.

## 1.28
Use the inspector on a LabClass object to discover what fields it has.

## 1.29
Set the instructor, room, and time for a lab, and print the list to the terminal window to check that these new details appear.

## 1.30
In this chapter we have mentioned the data types int and String. Java has more predefined data types. Find out what they are and what they are used for. To do this, you can check Appendix B, or look it up in another Java book or in an online Java language manual. One such manual is at [Oracle](http://download.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html).

## 1.31
What are the types of the following values?
  ```
  0
  "hello"
  101
  -1
  true
  "33"
  3.1415
  ```

## 1.32
What would you have to do to add a new field, for example one called name, to a circle object?

## 1.33
Write the signature for a method named send that has one parameter of type String, and does not return a value.

## 1.34
Write the signature for a method named average that has two parameters, both of type int, and returns an int value.

## 1.35
Look at the book you are reading right now. Is it an object or a class? If it is a class, name some objects. If it is an object, name its class.

## 1.36
Can an object have several different classes? Discuss.
