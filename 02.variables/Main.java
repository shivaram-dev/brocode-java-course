public class Main {
    public static void main(String[] args) {

        // variable = a reusable container for a valuel
        // a variable behaves as if it was the value it contains
        // 
        // Primitive = simple value stored directly in memory (stack)
        // Reference = memory address (stack) that points to the (heap)

        // Primitive vs Reference
        // ---------    ---------
        // int          string
        // double       array
        // char         object
        // boolean

        // 2 Steps to creating a variable
        // ------------------------------
        // 1. declaration
        // 2. assignment

        // int age;
        // System.out.println(age); // error: variable age might not have been initialized

        // int age = 30.5; // error: incompatible types: possible lossy conversion from double to int
        // System.out.println(age);

        int age = 21;
        int year = 2025;
        int quantity = 1;

        System.out.println("You are " + age + " years old");
        System.out.println("The year is " + year);
        System.out.println("The quantity is " + quantity);

        double price = 19999.99;
        double gpa = 3.5;
        double temperature = -12.5;

        System.out.println("$" + price);
        System.out.println("Your gpa is: " + gpa);
        System.out.println(temperature);

        // char uses single quotes ('')
        char grade = 'A';
        char symbol = '!';
        char currency = '$';

        System.out.println("Your average letter grade is: " + grade);
        System.out.println(symbol);
        System.out.println(currency);

        // common naming convention for variables with 2 or more words is camelCase
        boolean isStudent = true;
        boolean forSale = false;
        boolean isOnline = true;

        System.out.println(isStudent);
        System.out.println(forSale);
        System.out.println(isOnline);

        // booleans are typically used in conditional statements
        if (isStudent) {
            System.out.println("You are a student!");
        }
        else {
            System.out.println("You are NOT a student!");
        }

        // string uses double quotes ("")
        String name = "Bro Code";
        String food = "pizza";
        String email = "fake123@gmail.com";
        String car = "Mustang";
        String color = "red";

        System.out.println("Hello " + name);
        System.out.println("Your favorite food is: " + food);
        System.out.println("Your email is: " + email);
        System.out.println("Your car is a " + color + " " + car);
        
        System.out.println("Your choice is a " + color + " " + year + " " + car);
        System.out.println("The price is: " + currency + price);

        if (forSale) {
            System.out.println("There is a " + car + " for sale");
        }
        else {
            System.out.println("The " + car + " is not for sale");
        }

    }
}