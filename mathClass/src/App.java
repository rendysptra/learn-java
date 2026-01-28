import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        double a;
        double b;
        double c;

        double radius;
        double circumference;
        double area;
        double volume;

        // HYPOTENUSE CALCULATOR
        System.out.println("=====HYPOTONUSE CALCULATOR=====");
        System.out.print("Enter side a length: ");
        a = scanner.nextDouble();

        System.out.print("Enter side b length: ");
        b = scanner.nextDouble();

        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        System.out.println("\n HYPOTENUSE c = " + c + "cm");

        // CIRCLE CALCULATOR
        System.out.println("\n=====CIRCLE CALCULATOR=====");
        System.out.print("Enter circle radius: ");
        radius = scanner.nextDouble();

        circumference = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius, 2);
        volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

        System.out.println("\nCircumference of the circle is = " + circumference + "cm");
        System.out.println("Area of the circle is = " + area + "cm²");
        System.out.println("Volume of the circle is = " + volume + "cm³");

        scanner.close();

    }
}
