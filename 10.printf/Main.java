class Main {
    public static void main(String[] args) {
        
        // printf() = is a method used to format output

        // %[flags][width][.precision][specifier-character]

        String name = "Spongebob";
        char firstLetter = 'S';
        int age = 30;
        double height = 60.5;
        boolean isEmployed = true;

        System.out.printf("Hello %s\n", name);
        System.out.printf("Your name starts with a %c\n", firstLetter);
        System.out.printf("You are %d years old\n", age);
        System.out.printf("You are %f inches tall\n", height);
        System.out.printf("Employed: %b\n", isEmployed);

        System.out.printf("%s is %d years old", name, age);

        double price1 = 900.99;
        double price2 = 100000.15;
        double price3 = -54000000000.01;

        System.out.printf("%.1f\n", price1);
        System.out.printf("%.2f\n", price2);
        System.out.printf("%.3f\n", price3);

        // [flags]

        // + = output a plus before positive numbers
        // , = comma grouping separator for big numbers (54,000,000,000)
        // ( = negative numbers are enclosed in () with no minus symbol
        // space = display a minus if negative, space if positive

        System.out.printf("%+.1f\n", price1);
        System.out.printf("%+.2f\n", price2);
        System.out.printf("%+.3f\n", price3);
        
        System.out.printf("%,.1f\n", price1);
        System.out.printf("%,.2f\n", price2);
        System.out.printf("%,.3f\n", price3);

        System.out.printf("%(.1f\n", price1);
        System.out.printf("%(.2f\n", price2);
        System.out.printf("%(.3f\n", price3);
        
        System.out.printf("% .1f\n", price1);
        System.out.printf("% .2f\n", price2);
        System.out.printf("% .3f\n", price3);

        // [width]

        // 0 = zero padding
        // number = right justified padding (spaces)
        // negative number = left justified padding (spaces)

        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;

        System.out.printf("%04d\n", id1);
        System.out.printf("%04d\n", id2);
        System.out.printf("%04d\n", id3);
        System.out.printf("%04d\n", id4);
        
        System.out.printf("%4d\n", id1);
        System.out.printf("%4d\n", id2);
        System.out.printf("%4d\n", id3);
        System.out.printf("%4d\n", id4);
        
        System.out.printf("%-4d something\n", id1);
        System.out.printf("%-4d something\n", id2);
        System.out.printf("%-4d something\n", id3);
        System.out.printf("%-4d something\n", id4);
    }
}
