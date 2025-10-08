class Main {
    public static void main(String[] args) {

        // method = a block of reusable code that is executed when called ()

        String name = "Patrick";
        int age = 30;

        happyBirthday(name, age);
        double result = square(3);
        System.out.println(result);
        System.out.println(cube(5));

        String fullName = getFullName("Bro", "Code");
        System.out.println(fullName);

        age = 21;

        if (ageCheck(age)) {
            System.out.println("You may sign up!");
        }
        else {
            System.out.println("You must be 18+ to sign up");
        }
        
    }

    // methods have to be static to be called inside a static method (main)
    static void happyBirthday(String birthdayBoy, int age) {
        System.out.println("Happy Birthday to you!");
        System.out.printf("Happy Birthday dear %s!\n", birthdayBoy);
        System.out.printf("You are %d years old!\n", age);
        System.out.println("Happy Birthday to you!\n");
    }
    static double square(double number) {
        return number * number;
    }
    static double cube(double number) {
        return number * number * number;
    }
    static String getFullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }
    static boolean ageCheck(int age) {
        return age >= 18;
    }
}
