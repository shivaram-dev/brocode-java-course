import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        // Enums = (Enumerations) A special kind of class that
        // represents a fixed set of constants.
        // They improve code readability and are easy to maintain.
        // More efficiency with switches when compared to Strings.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a day of the week: ");
        String response = scanner.nextLine().toUpperCase();

        try {
            Day day = Day.valueOf(response);
            // Day day = Day.SUNDAY;

            // System.out.println(day);
            // System.out.println(day.getDayNumber());

            switch (day) {
                case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> System.out.println("It is a weekday");
                case SATURDAY, SUNDAY -> System.out.println("It is the weekend");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Please enter a valid day");
        }

        scanner.close();
    }
}
