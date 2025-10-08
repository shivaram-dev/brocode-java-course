class Main {
    public static void main(String[] args) {

        // Wrapper classes = Allow primitive values (int, char, double, boolean)
        //                   to be used as objects. "Wrap them in an object"
        //                   Generally, don't wrap primitives unless you need an object.
        //                   Allows use of Collections Framework and static Utility Methods.

        // Deprecated way
        // Integer a = new Integer(123);
        // Double b = new Double(3.14);
        // Character c = new Character('$');
        // Boolean d = new Boolean(true);

        // Autoboxing
        // Integer a = 123;
        // Double b = 3.14;
        // Character c = '$';
        // Boolean d = true;
        // similar to how we declare strings
        // String e = "Pizza";
        
        // Unboxing
        // int x = a;
        // double y = b;
        // char z = c;
        // boolean w = d;

        // String a = Integer.toString(123);
        // String b = Double.toString(3.14);
        // String c = Character.toString('@');
        // String d = Boolean.toString(false);

        // String x = a + b + c + d;

        // System.out.println(x);

        // int a = Integer.parseInt("123");
        // double b = Double.parseDouble("3.14");
        // char c = "Pizza".charAt(0);
        // boolean d = Boolean.parseBoolean("true");
        
        // String x = a + b + c + d; // The operator + is undefined for the argument type(s) double, boolean

        // char letter = 'b';
        // char letter = '$';
        char letter = 'B';

        System.out.println(Character.isLetter(letter));
        System.out.println(Character.isUpperCase(letter));
        System.out.println(Character.isLowerCase(letter));
        System.out.println(Character.isDigit(letter));

    }
}
