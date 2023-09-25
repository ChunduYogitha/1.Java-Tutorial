Variables are containers for storing data values.

In Java, there are different types of variables, for example:

-> String - stores text, such as "Hello". String values are surrounded by double quotes
-> int - stores integers (whole numbers), without decimals, such as 123 or -123
-> float - stores floating point numbers, with decimals, such as 19.99 or -19.99
-> char - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes
-> boolean - stores values with two states: true or false

                          STRING - CODE

import java.io.*;
public class Main{
public static void main(String[] args){
String text = "Hello";
System.out.println(text);
}
}  

  /*
        Hello
     */


                          INTEGER-CODE

import java.io.*;
public class Main{
public static void main(String[] args){
int num = 15;
System.out.println(num);
}
}

/*
    15
*/
                
You can also declare a variable without assigning the value, and assign the value later:
                          
import java.io.*;
public class Main{
public static void main(String[] args){
int num;
num = 15;
System.out.println(num);
}
}
/*
    15
*/
                          
Note that if you assign a new value to an existing variable, it will overwrite the previous value:
Change the value of num from 15 to 20:

import java.io.*;
public class Main{
public static void main(String[] args){
int num = 15;
num = 20;
System.out.println(num);
}
}     
/*
    20
                          
*/
                          
Final Variables
If you don't want others (or yourself) to overwrite existing values, use the final keyword (this will declare the variable as "final" or "constant", which means unchangeable and read-only):
                          
import java.io.*;
public class Main{
public static void main(String[] args){
final int num = 15;
num = 20;
System.out.println(num);
}
}
/*
    Main.java:5: error: cannot assign a value to final variable num
    num = 20;
    ^
    1 error
*/


                    FLOAt - CODE

public class Main {
  public static void main(String[] args) {
    float num = 2.2f;
    System.out.println(num);
  }
} 
/*
      2.2
  */

              CHAR - CODE
public class Main {
  public static void main(String[] args) {
    char letter = 'A';
    System.out.println(letter);
  }
}
/*
 A
 */

Other Types
A demonstration of how to declare variables of other types:
import java.io.*;
public class Main{
public static void main(String[] args){
int num = 5;
float fnum = 2.2f;
char letter = 'A';
String str = "Hello";
boolean bool = true;
System.out.println(num);
System.out.println(fnum);
System.out.println(letter);
System.out.println(str);
System.out.println(bool);
}
}
/*
5
2.2
A
Hello
true
*/
                      
                          
