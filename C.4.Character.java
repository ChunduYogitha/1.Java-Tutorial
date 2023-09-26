Characters
The char data type is used to store a single character. The character must be surrounded by single quotes, like 'A' or 'c':
import java.io.*;
public class Main{
public static void main(String[] args){
char letter = 'A';
System.out.println(letter);
}
}
/*
    A
*/

Alternatively, if you are familiar with ASCII values, you can use those to display certain characters:
ASCII alphabet characters are the letters 'A' through 'Z' and 'a' through 'z', 
which are assigned numbers 65 through 90 and 97 through 122 in the ASCII character encoding standard

import java.io.*;
public class Main{
public static void main(String[] args){
char var1 = 65;
char var2 = 110;
char var3 = 90;
System.out.println(var1);
System.out.println(var2);
System.out.println(var3);
}
}
/*
A
n
Z
*/
