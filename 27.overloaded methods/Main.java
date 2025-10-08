class Main {
    public static void main(String[] args) {
        
        // overloaded methods = methods that share the same name,
        //                      but different parameters
        //                      signature = name + parameters

        System.out.println(add(1, 2));
        System.out.println(add(1, 2, 3));

        String pizza1 = bakePizza("flat bread");
        String pizza2 = bakePizza("flat bread", "mozzarella");
        String pizza3 = bakePizza("flat bread", "mozzarella", "pepperoni");
        System.out.println(pizza1);
        System.out.println(pizza2);
        System.out.println(pizza3);


    }

    static double add(double a, double b) {
        return a + b;
    }

    static double add(double a, double b, double c) {
        return a + b + c;
    }

    static String bakePizza(String bread) {
        return bread + " pizza";
    }

    static String bakePizza(String bread, String cheese) {
        return cheese + " " + bread + " pizza";
    }
    static String bakePizza(String bread, String cheese, String topping) {
        return topping + " " + cheese + " " + bread + " pizza";
    }
}
