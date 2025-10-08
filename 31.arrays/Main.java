import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        
        // array = a collection of values of the name data type
        //         * think of it as a variable that can store more than 1 value *
        String[] fruits = {"apple", "orange", "banana", "coconut"};

        // fruits[0] = "pineapple";
        int numOfFruits = fruits.length;

        System.out.println(fruits[0]);
        // System.out.println(fruits[10]); // ArrayIndexOutOfBoundsException
        System.out.println(numOfFruits);

        for (int i = 0; i < fruits.length; i++) {
            System.out.print(fruits[i] + " ");
        }
        System.out.println();
        // Arrays.sort(fruits);
        Arrays.fill(fruits, "pineapple");

        // similar to for of ... loop in javascript
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

    }
}
