import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        // Calculate the area of rectangle

        double widht = 0;
        double height = 0;
        double area = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the witdh: ");
        widht = scanner.nextDouble();

        System.out.print("Enter the height: ");
        height = scanner.nextDouble();

        area = widht * height;

        System.out.println("The area is: " + area + "cm²");

        scanner.close();

    }
}
