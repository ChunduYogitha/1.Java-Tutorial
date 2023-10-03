Java For Loop
When you know exactly how many times you want to loop through a block of code, use the for loop instead of a while loop:

SyntaxGet your own Java Server
for (statement 1; statement 2; statement 3) {
  // code block to be executed
}
Statement 1 is executed (one time) before the execution of the code block.

Statement 2 defines the condition for executing the code block.

Statement 3 is executed (every time) after the code block has been executed.

The example below will print the numbers 0 to 4:
import java.io.*;
public class Main{
public static void main(String[] args){
for(int i=0; i<5; i++)
{
System.out.println(i);
}}}
/*
    0
    1
    2
    3
    4
*/
Example explained
Statement 1 sets a variable before the loop starts (int i = 0).

Statement 2 defines the condition for the loop to run (i must be less than 5). 
If the condition is true, the loop will start over again, if it is false, the loop will end.

Statement 3 increases a value (i++) each time the code block in the loop has been executed.

Another Example
This example will only print even values between 0 and 10:
import java.io.*;
public class Main{
public static void main(String[] args){
for(int i=0; i<=10; i=i+2){
System.out.println(i);
}}}
/*
    0
    2
    4
    6
    8
    10
*/ 
Nested Loops
It is also possible to place a loop inside another loop. This is called a nested loop.

The "inner loop" will be executed one time for each iteration of the "outer loop":
import java.io.*;
public class Main{
public static void main(String[] args){
//outer loop
for(int i=0; i<=2; i++){
System.out.println("Outer : " + i);
//Inner loop
for(int j=0; j<=3; j++){
System.out.println("  Inner : " + j);
}}}}
/*
Outer : 0
  Inner : 0
  Inner : 1
  Inner : 2
  Inner : 3
Outer : 1
  Inner : 0
  Inner : 1
  Inner : 2
  Inner : 3
Outer : 2
  Inner : 0
  Inner : 1
  Inner : 2
  Inner : 3
*/
