import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);

        String day;

        System.out.print("Enter a day: ");
        day = scanner.nextLine();

        switch (day) {
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> System.out.println("This is weekday");
            case "Saturday", "Sunday" -> System.out.println("This is weekend");
            default -> System.out.printf("%s is not a day\n", day);
        }

        scanner.close();

    }   
}
