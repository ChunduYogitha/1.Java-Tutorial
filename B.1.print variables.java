Display Variables
The println() method is often used to display variables.

To combine both text and a variable, use the + character:
import java.io.*;
public class Main{
public static void main(String[] args){
String name = "Apple";
System.out.println("Hello " + name);
}
}
/*
 Hello Apple
*/

You can also use the + character to add a variable to another variable:
import java.io.*;
public class Main{
public static void main(String[] args){
String fname = "Yogitha ";
String lname = "Chowdary";
String fullname = fname + lname;
System.out.println(fullname);
}
}
/*
Yogitha Chowdary
*/

