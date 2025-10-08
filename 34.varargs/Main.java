public class Main {
    public static void main(String[] args) {
        // varargs = allow a method to accept a varying # of arguments
        //           makes methods more flexible, no need for overloaded methods
        //           java will pack the arguments into an array
        //           ... (ellipsis)
        // similar to rest (...) operator in javascript
        
        System.out.println(add(1, 2, 3, 4, 5, 6));
        System.out.println(average(1, 2, 3, 4, 5, 6));

    }

    static int add(int... numbers) {
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    static double average (double... numbers) {
        
        if (numbers.length == 0) {
            return 0;
        }
        
        double sum = 0;

        for (double number : numbers) {
            sum += number;
        }
        return sum / numbers.length;
    }
}
