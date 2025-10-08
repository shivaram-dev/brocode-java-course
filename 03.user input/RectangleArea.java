import java.math.BigDecimal;
import java.util.Scanner;

class RectangleArea {
    public static void main(String[] args) {

        // Calculate area of a rectangle

        double width = 0;
        double height = 0;
        double area = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the width: ");
        width = scanner.nextDouble();

        System.out.print("Enter the height: ");
        height = scanner.nextDouble();

        // arithmetic operations with double data type can lead to unexpected results (4.5 * 6.2 = 27.900000000000002)
        // area = width * height;
        // better way
        area = multiplyDoubles(width, height);

        System.out.println("The area is: " + area + "cm^2");

        scanner.close();
    }

    private static double multiplyDoubles(double a, double b) {
        BigDecimal bd1 = new BigDecimal(String.valueOf(a));
        BigDecimal bd2 = new BigDecimal(String.valueOf(b));
        BigDecimal result = bd1.multiply(bd2);
        
        return result.doubleValue();
    }
}
