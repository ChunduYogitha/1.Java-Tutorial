Java Break
You have already seen the break statement used in an earlier chapter of this tutorial. It was used to "jump out" of a switch statement.

The break statement can also be used to jump out of a loop.

This example stops the loop when i is equal to 4:
import java.io.*;
public class Main{
public static void main(String[] args){
for(int i=0; i<=10; i++){
if(i == 5){
break;
}
System.out.println(i);
}}}
/*
    0
    1
    2
    3
    4
*/

Java Continue
The continue statement breaks one iteration (in the loop), if a specified condition occurs, and continues with the next iteration in the loop.

This example skips the value of 4:
public class Main {
public static void main(String[] args) {
for (int i = 0; i < 10; i++) {
if (i == 4) {
continue;
}
System.out.println(i);
}  
}
}
/*
    0
    1
    2
    3
    4
    5
    6
    7
    8
    9
*/
Break and Continue in While Loop
You can also use break and continue in while loops:

Break Example
import java.io.*;
public class Main{
public static void main(String[] args){
int i = 0;
while(i<10){
System.out.println(i);
i++;
if(i==5){
break;
}}}}
/*
        0
        1
        2
        3
        4
*/

Continue Example
import java.io.*;
public class Main{
public static void main(String[] args){
int i = 0;
while(i<10){
if(i==5){
i++;
continue;
}
System.out.println(i);
i++;
}}}
/*
        0
        1
        2
        3
        4
        5
        6
        7
        8
        9
*/
