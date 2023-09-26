Assignment Operators
Assignment operators are used to assign values to variables.
 
                A list of all assignment operators:

Operator	          Example	                Same As	
    =	               x = 5	                 x = 5	
    +=	             x += 3	                 x = x + 3	
    -=	             x -= 3	                 x = x - 3	
    *=	             x *= 3	                 x = x * 3	
    /=	             x /= 3	                 x = x / 3	
    %=	             x %= 3	                 x = x % 3	
    &=	             x &= 3	                 x = x & 3	
    |=	             x |= 3	                 x = x | 3	
    ^=	             x ^= 3	                 x = x ^ 3	
    >>=	             x >>= 3	               x = x >> 3	
    <<=	             x <<= 3	               x = x << 3

In the example below, we use the assignment operator (=) to assign the value 10 to a variable called x:
public class Main {
public static void main(String[] args) {
int x = 10;
System.out.println(x);
}
}
/*
    10
*/

The addition assignment operator (+=) adds a value to a variable:
public class Main {
public static void main(String[] args) {
int x = 10;
x += 5;
System.out.println(x);
}
}
/*
 15
*/

The subtraction assignment operator (-=) adds a value to a variable:
public class Main {
public static void main(String[] args) {
int x = 5;
x -= 3;
System.out.println(x);
}
}
/*
    2
*/

The Multiplication assignment operator (*=) adds a value to a variable:
public class Main {
public static void main(String[] args) {
int x = 5;
x *= 3;
System.out.println(x);
}
}
/*
    15
*/


The Division assignment operator (/=) adds a value to a variable:
public class Main {
public static void main(String[] args) {
double x = 5;
x /= 3;
System.out.println(x);
}
}
/*
    1.6666666666666667
*/

public class Main {
public static void main(String[] args) {
int x = 5;
x %= 3;
System.out.println(x);
}
}
/*
    2
*/

The Modulus assignment operator (%=) adds a value to a variable:


