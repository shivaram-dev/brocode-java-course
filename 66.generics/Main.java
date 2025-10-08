import java.util.ArrayList;

class Main {
    public static void main(String[] args) {

        // Generics = A concept where you can write a class, interface, or method
        //            that is compatible with different data types.
        //            <T> type parameter (placeholder that gets replaced with a real type)
        //            <String> type argument (specifies the type)

        ArrayList<String> fruits = new ArrayList<>();
        // Hold Ctrl and click ArrayList to see the generics
        
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Banana");
        
        ArrayList<Boolean> bools = new ArrayList<>();

        bools.add(true);
        bools.add(false);
        bools.add(true);

        // Box<String> box = new Box<>();
        // Box<Integer> box = new Box<>();
        Box<Double> box = new Box<>();


        // box.setItem("banana");
        // box.setItem(3);
        box.setItem(3.14);

        System.out.println(box.getItem());

        Product<String, Double> product1 = new Product<>("apple", 0.50);
        Product<String, Integer> product2 = new Product<>("apple", 15);

        System.out.println(product1.getItem());
        System.out.println(product1.getPrice());

        System.out.println(product2.getItem());
        System.out.println(product2.getPrice());
    }
}
