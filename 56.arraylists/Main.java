import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // ArrayList = A resizeable array that stores objects (autoBoxing).
        //             Arrays are fixed in size, but ArrayLists can change.

        // ArrayList<Integer> list = new ArrayList<>();

        // list.add(1);
        // list.add(2);
        // list.add(3);

        // System.out.println(list);

        ArrayList<Double> list = new ArrayList<>();

        list.add(3.14);
        list.add(1.99);
        list.add(2.01);

        System.out.println(list);

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Coconut");

        // fruits.remove(0);
        // fruits.remove(1);
        // fruits.set(1, "Pineapple");

        System.out.println(fruits);
        System.out.println(fruits.get(1));
        System.out.println(fruits.get(2));
        System.out.println(fruits.get(3)); 
        System.out.println(fruits.size()); 

        Collections.sort(fruits);

        System.out.println(fruits);

        for(String fruit : fruits) {
            System.out.println(fruit);
        }

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> foods = new ArrayList<>();

        System.out.print("Enter the # of food you would like: ");
        int numOfFood = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= numOfFood; i++) {
            System.out.print("Enter food #" + i + ": ");
            String food = scanner.nextLine();
            foods.add(food);
        }
        
        System.out.println(foods);

        scanner.close();
    }
}
