public class Main {
public static void main(String[] args) {
String greeting = "Hello";
System.out.println(greeting);
}
}
/*
  Hello
*/

              STRING LENGTH
A String in Java is actually an object, which contain methods that can perform certain operations on strings. 
For example, the length of a string can be found with the length() method:                
import java.io.*;
public class Main{
public static void main(String[] args){
String str = "yogitha";
System.out.println("The length of the string is : " + str.length());
}
}
/*
  7
*/

            More String Methods
There are many string methods available, for example toUpperCase() and toLowerCase():
import java.io.*;
public class Main{
public static void main(String[] args){
String str = "Hello World";
System.out.println(str.toUpperCase());
System.out.println(str.toLowerCase());
}
}
/*
  HELLO WORLD
  hello world
*/

            Finding a Character in a String
The indexOf() method returns the index (the position) of the first occurrence of a specified text in a string (including whitespace):
import java.io.*;
public class Main{
public static void main(String[] args){
String str = "My name is yogitha chowdary";
System.out.println(str.indexOf("yogitha"));
}
}
/*
  11
*/
Java counts positions from zero.
0 is the first position in a string, 1 is the second, 2 is the third ...
