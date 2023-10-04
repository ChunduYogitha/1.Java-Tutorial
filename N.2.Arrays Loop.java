Loop Through an Array
You can loop through the array elements with the for loop, and use the length property to specify how many times the loop should run.

The following example outputs all elements in the fruits array:

Example
import java.io.*;
public class Main{
public static void main(String[] args){
String[] fruits = {"Apple","Banana","Grapes","Orange","Mango"};
for(int i=0; i<fruits.length; i++){
System.out.println(fruits[i]);
}}}
/*
    Apple
    Banana
    Grapes
    Orange
    Mango
*/
Loop Through an Array with For-Each
There is also a "for-each" loop, which is used exclusively to loop through elements in arrays:
Syntax
for (type variable : arrayname) {
  ...
}
The following example outputs all elements in the cars array, using a "for-each" loop:

Example
import java.io.*;
public class Main{
public static void main(String[] args){
String[] games = {"Running", "Short put", "Long jump", "kho-kho"};
for(String i : games){
System.out.println(i);
}}}
/*
    Running
    Short put
    Long jump
    kho-kho
*/
The example above can be read like this: for each String element (called i - as in index) in games, print out the value of i.

If you compare the for loop and for-each loop, you will see that the for-each method is easier to write, i
t does not require a counter (using the length property), and it is more readable
