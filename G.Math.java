The Java Math class has many methods that allows you to perform mathematical tasks on numbers.

Math.max(x,y)
The Math.max(x,y) method can be used to find the highest value of x and y:
import java.io.*;
public class Main{
public static void main(String[] args){
int x = 10;
int y = 2;
System.out.println(Math.max(x,y));
}
}
/*
    10
*/
        (or)

public class Main {
public static void main(String[] args) {
System.out.println(Math.max(5, 10));  
}
}
/*
    10
*/

Math.min(x,y)
The Math.min(x,y) method can be used to find the lowest value of x and y:
public class Main {
public static void main(String[] args) {
System.out.println(Math.min(5, 10));  
}
}
/*
    5
*/

Math.sqrt(x)
The Math.sqrt(x) method returns the square root of x:
public class Main {
public static void main(String[] args) {
System.out.println(Math.sqrt(64));  
}
}
/*
    8.0
*/

Math.abs(x)
The Math.abs(x) method returns the absolute (positive) value of x:
public class Main {
public static void main(String[] args) {
System.out.println(Math.abs(-4.7));  
}
}
/*
    4.7
*/

Random Numbers
Math.random() returns a random number between 0.0 (inclusive), and 1.0 (exclusive):
public class Main {
public static void main(String[] args) {
System.out.println(Math.random());  
}
}
/*
    0.2441127028897183
*/
To get more control over the random number, for example, 
if you only want a random number between 0 and 100, you can use the following formula:
import java.io.*;
public class Main{
public static void main(String[] args){
int num = (int)(Math.random()*101);
System.out.println(num);
}
}
/*
    12
*/

