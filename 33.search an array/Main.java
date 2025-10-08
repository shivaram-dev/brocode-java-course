import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        // SEARCH ARRAY
        
        // int[] numbers = {1, 9, 2, 8, 3, 5, 4};
        // int target = 7;
        // boolean isFound = false;
        
        // for (int i = 0; i < numbers.length; i++) {
        //     if(target == numbers[i]) {
        //         System.out.println("Element found at index: " + i);
        //         isFound = true;
        //         break;
        //     }
        // }
        
        // if(!isFound) {
        //     System.out.println("Element not found in the array");
        // }

        Scanner scanner = new Scanner(System.in);

        String[] fruits = {"apple", "orange", "banana"};
        String target;
        boolean isFound = false;
        
        System.out.print("Enter a fruit to search for: ");
        target = scanner.nextLine();

        for (int i = 0; i < fruits.length; i++) {
            if (target.equals(fruits[i])) {
                System.out.println("Element found at index: " + i);
                isFound = true;
                break;
            }
        }

        if (!isFound) {
            System.out.println("Element not found in the array");
        }




        scanner.close();

    }
}
