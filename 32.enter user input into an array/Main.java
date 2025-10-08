import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // String[] foods = {"pizza", "taco", "hamburger"};
        // System.out.println(foods.length);

        // Empty Array which can't be assigned value (length 0)
        // String[] foods = {};
        // foods[0] = "pizza"; // ArrayIndexOutOfBoundsException
        // System.out.println(foods.length);

        // Empty array of length 3
        // String[] foods = new String[3];
        // foods[0] = "pizza";
        // foods[1] = "taco";
        // foods[2] = "hamburger";

        // for (String food : foods) {
        //     System.out.println(food);
        // }

        Scanner scanner = new Scanner(System.in);

        String[] foods;
        int size;

        System.out.println("What # of food do you want?: ");
        size = scanner.nextInt();
        scanner.nextLine();

        foods = new String[size];

        for (int i = 0; i < foods.length; i++) {
            System.out.print("Enter a food: ");
            foods[i] = scanner.nextLine();
        }

        for (String food : foods) {
            System.out.println(food);
        }

        scanner.close();
    }
}
