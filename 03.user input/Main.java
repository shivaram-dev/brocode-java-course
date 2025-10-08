import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // A Scanner is an object that allows us to accept user input in Java
        // create Scanner object
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        // nextLine reads a string of characters including any spaces
        String name = scanner.nextLine();

        // next reads a single word, so it doesn't read spaces
        // String name = scanner.next();

        System.out.print("Enter your age: ");
        // nextInt reads an integer value
        int age = scanner.nextInt();
        // If you enter 30.9
        // Exception in thread "main" java.util.InputMismatchException

        System.out.print("What is your gpa: ");
        // nextDouble reads a double value
        double gpa = scanner.nextDouble();

        System.out.print("Are you a student? (true/false): ");
        // nextBoolean reads a boolean value
        boolean isStudent = scanner.nextBoolean();
        
        
        System.out.println("Hello " + name);
        System.out.println("Your are " + age + " years old");
        System.out.println("Your gpa is: " + gpa);
        System.out.println("Student: " + isStudent);

        if (isStudent) {
            System.out.println("You are enrolled as a student");
        }
        else {
            System.out.println("You are NOT enrolled");
        }

        // COMMON ISSUES

        // System.out.print("Enter your age: ");
        // int age = scanner.nextInt();
        // one solution to get rid of \n from the input buffer
        // scanner.nextLine();

        // System.out.print("Enter your favorite color: ");
        // String color = scanner.nextLine();

        // System.out.println("Your are " + age + " years old");
        // System.out.println("Your like the color " + color);
        // Output:
        // Enter your age: 25
        // Enter your favorite color:
        // Your are 25 years old
        // Your like the color

        // So when you type 25 and hit enter == 25\n, within the input buffer there is still \n, so the nextLine() is picking up that \n and using that as the input. So we need to get rid of that \n
        // one solution is to use scanner.nextLine() after nextInt()/nextDouble() to get rid of \n
        // This problem occurs with nextInt() and nextDouble()


        // It is good practice to close the scanner object at the end of your program. If you don't close your scanner, it can lead to unexpected behaviour
        scanner.close();

    }
}
