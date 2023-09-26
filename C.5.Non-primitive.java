Non-Primitive Data Types
Non-primitive data types are called reference types because they refer to objects.

The main difference between primitive and non-primitive data types are:

Primitive types are predefined (already defined) in Java. Non-primitive types are created by the programmer and is not defined by Java (except for String).
Non-primitive types can be used to call methods to perform certain operations, while primitive types cannot.
A primitive type has always a value, while non-primitive types can be null.
A primitive type starts with a lowercase letter, while non-primitive types starts with an uppercase letter.
Examples of non-primitive types are Strings, Arrays, Classes, Interface, etc.

  Strings
The String data type is used to store a sequence of characters (text). String values must be surrounded by double quotes:

public class Main {
public static void main(String[] args) {
String greeting = "Hello World";
System.out.println(greeting);
}
}
/*
Hello World
*/

The String type is so much used and integrated in Java, that some call it "the special ninth type".

A String in Java is actually a non-primitive data type, because it refers to an object. 
The String object has methods that are used to perform certain operations on strings.
  
