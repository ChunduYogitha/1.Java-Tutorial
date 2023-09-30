If you add two numbers, the result will be a number:
public class Main {
public static void main(String[] args) {
int x = 10;
int y = 20;
int z = x + y;
System.out.println(z);
}
}
/*
    30
*/
If you add two strings, the result will be a string concatenation:
public class Main {
public static void main(String[] args) {
String x = "10";
String y = "20";
String z = x + y;
System.out.println(z);
}
}
/*
    1020
*/
If you add a number and a string, the result will be a string concatenation:
public class Main {
public static void main(String[] args) {
String x = "10";
int y = 20;
String z = x + y;
System.out.println(z);
}
}
/*
    1020
*/
