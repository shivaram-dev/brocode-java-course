class Main {
    public static void main(String[] args) {
        
        // Arithmetic Operators

        // int x = 10;
        // int y = 2;
        // int z;

        // z = x + y; // 12
        // z = x - y; // 8
        // z = x * y; // 20
        // z = x / y; // 5
        // z = x % y; // 0

        // System.out.println(z);

        // Augmented Assignment Operators
        
        // int x = 10;
        // int y = 3;

        // x += y; // x = x + y
        // x -= y; // x = x - y
        // x *= y; // x = x * y
        // x /= y; // x = x / y 
        // Since this is integer division, the output will be 3 instead of 3.3333333
        // x %= y; // x = x % y

        // System.out.println(x);

        // Increment and Decrement Operators

        // Pre-increment (++variable)
        // The value of the variable is incremented before it is used in the expression.
        int a = 5;
        int b = ++a; // 'a' becomes 6, then 'b' is assigned the value of 'a' (which is 6)
        System.out.println("a: " + a); // Output: a: 6
        System.out.println("b: " + b); // Output: b: 6

        // Post-increment (variable++)
        // The original value of the variable is used in the expression first, and then the variable is incremented.
        int x = 5;
        int y = x++; // 'y' is assigned the current value of 'x' (which is 5), then 'x' is incremented to 6
        System.out.println("x: " + x); // Output: x: 6
        System.out.println("y: " + y); // Output: y: 5

        // Pre-decrement (--variable)
        // The value of the variable is decremented before it is used in the expression.
        int p = 5;
        int q = --p; // p becomes 4, then q is assigned the value of p (which is 4)
        System.out.println("p: " + p); // Output: p: 4
        System.out.println("q: " + q); // Output: q: 4

        // Post-decrement (variable--)
        // The original value of the variable is used in the expression first, and then the variable is decremented.
        int r = 5;
        int s = r--; // s is assigned the current value of r (which is 5), then r is decremented to 4
        System.out.println("r: " + r); // Output: r: 4
        System.out.println("s: " + s); // Output: s: 5

        // ORDER OF OPERATIONS [P-E-M-D-A-S]
        // P = Parenthesis
        // E = Exponents
        // M = Multiplication
        // D = Division
        // A = Addition
        // S = Subtraction

        double result = 3 + 4 * (7 - 5) / 2.0;

        System.out.println(result);


    }
}
