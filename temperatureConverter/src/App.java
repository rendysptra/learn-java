import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        // TEMPERATURE CONVERTER

        // Declare variable
        Scanner scanner = new Scanner(System.in);
        String unit;
        double temp;
        double newTemp;

        // enter temperature
        System.out.print("Enter the temperature: ");
        temp = scanner.nextDouble();

        // to C? or F?
        System.out.print("Convert to Celcius or Fahrenheit? (C or F): ");
        unit = scanner.next().toUpperCase();

        newTemp = (unit.equals("C")) ? (temp - 32) * 5 / 9 : (temp * 9 / 5) + 32;

        // print outpout
        System.out.printf("%.1f°%s\n", newTemp, unit);

        scanner.close();

    }
}
