Multidimensional Arrays
A multidimensional array is an array of arrays.

Multidimensional arrays are useful when you want to store data as a tabular form, like a table with rows and columns.

To create a two-dimensional array, add each array within its own set of curly braces:
ExampleGet your own Java Server
int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
myNumbers is now an array with two arrays as its elements.

Access Elements
To access the elements of the myNumbers array, specify two indexes: one for the array, and one for the element inside that array. This example accesses the third element (2) in the second array (1) of myNumbers:

Example
import java.io.*;
public class Main{
public static void main(String[] args){
int[][] num = { { 1,2,3,4},{5,6,7,8} };
System.out.println(num[0][1]);
}}
/*
    2
  */
Remember that: Array indexes start with 0: [0] is the first element. [1] is the second element, etc.

Change Element Values
You can also change the value of an element:

Exampleimport java.io.*;
public class Main{
public static void main(String[] args){
int[][] num = { {1,2,3,4} , {5,6,7,8} };
num [0][1] = 10;
System.out.println(num[0][1]);
}}
/*
    10
*/
import java.io.*;
public class Main{
public static void main(String[] args){
int[][] num = { {1,2,3,4} , {5,6,7,8} };
for(int i=0; i<num.length; i++){
for(int j=0; j<num[i].length; j++){
System.out.println(num[i][j]);
}}}}
/*
    1
    2
    3
    4
    5
    6
    7
    8
*/








