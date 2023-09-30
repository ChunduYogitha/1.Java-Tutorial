                            String Concatenation
The + operator can be used between strings to combine them. This is called concatenation:
public class Main {
public static void main(String args[]) {
String firstName = "John";
String lastName = "Doe";
System.out.println(firstName + " " + lastName);
}
}
/*
  John Doe
*/
Note that we have added an empty text (" ") to create a space between firstName and lastName on print.
You can also use the concat() method to concatenate two strings:
public class Main {
public static void main(String[] args) {
String firstName = "John ";
String lastName = "Doe";
System.out.println(firstName.concat(lastName));
}
}
/*
  John Doe
*/
