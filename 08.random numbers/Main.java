import java.util.Random;

public class Main {
    public static void main(String[] args) {

        // pseudo-random numbers = not truly random (a set of complex mathematical formulas are used to generate them)

        Random random = new Random();

        int number;

        number = random.nextInt(); // generates a random number between -2 billion and +2 billion

        // first number is inclusive, second number is exclusive
        number = random.nextInt(1, 6); // generates a random number from 1 to 5

        System.out.println(number);

        int number1 = random.nextInt(1, 7);
        int number2 = random.nextInt(1, 7);
        int number3 = random.nextInt(1, 7);

        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);

        int x = random.nextInt(6); // generates a random number from 0 to 5
        int x1 = random.nextInt(6) + 1; // generates a random number from 1 to 6

        double y = random.nextDouble(); // generates a random double from 0.0 to 0.999...

        boolean z = random.nextBoolean(); // generates a random boolean (true/false)

        System.out.println(x);
        System.out.println(x1);
        System.out.println(y);
        System.out.println(z);

    }

}
