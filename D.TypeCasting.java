Java Type Casting
Type casting is when you assign a value of one primitive data type to another type.

In Java, there are two types of casting:

Widening Casting (automatically) - converting a smaller type to a larger type size
byte -> short -> char -> int -> long -> float -> double

Narrowing Casting (manually) - converting a larger type to a smaller size type
double -> float -> long -> int -> char -> short -> byte

Widening Casting
Widening casting is done automatically when passing a smaller size type to a larger size type:
import java.io.*;
public class Main{
public static void main(String[] args){
int num = 20;
double num2 = num;
System.out.println(num);
System.out.println(num2);
}
}
/*
    20
    20.0
*/

Narrowing Casting
Narrowing casting must be done manually by placing the type in parentheses in front of the value:
import java.io.*;
public class Main{
public static void main(String[] args){
double num = 14.5;
int num2 = (int) num;
System.out.println(num);
System.out.println(num2);
}
}
/*
14.5
14
*/
