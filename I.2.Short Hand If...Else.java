Short Hand If...Else
There is also a short-hand if else, which is known as the ternary operator because it consists of three operands.

It can be used to replace multiple lines of code with a single line, and is most often used to replace simple if else statements:

Syntax
variable = (condition) ? expressionTrue :  expressionFalse;
Instead of writing:
public class Main {
public static void main(String[] args) {
int time = 20;
if (time < 18) {
System.out.println("Good day.");
} 
else {
System.out.println("Good evening.");
}  
}
}
/*
      Good evening 
*/
You can simply write:
import java.io.*;
public class Main{
public static void main(String[] args){
int time = 10;
String result;
result = (time < 5)? "Good morning" : "Good evening";
System.out.println(result);
}}
/*
    Good evening
*/
