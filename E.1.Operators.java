Java Operators
Operators are used to perform operations on variables and values.

In the example below, we use the + operator to add together two values:
public class Main {
public static void main(String[] args) {
int x = 100 + 50;
System.out.println(x);
}
}
/*
    150
*/

Although the + operator is often used to add together two values, like in the example above, 
it can also be used to add together a variable and a value, or a variable and another variable:
public class Main{
public static void main(String[] args){
int num1 = 10 + 69;
int num2 = 15 +num1;
int num3 = num1 + num2;
System.out.println(num1);
System.out.println(num2);
System.out.println(num3);
}
}
/*
      79
      94
      173
*/

Java divides the operators into the following groups:

Arithmetic operators
Assignment operators
Comparison operators
Logical operators
Bitwise operators
