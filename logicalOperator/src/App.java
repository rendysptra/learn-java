import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        // username must be between 4-12 characters
        // username cannot contain spaces dan underscore
        
        Scanner scanner = new Scanner(System.in);

        String username;

        System.out.print("Enter new username: ");
        username = scanner.nextLine();

        if (username.length() < 4 || username.length() > 12) {
            System.out.println("Username must be between 4-12 characters");
        }
        else if (username.contains(" ") || username.contains("_")) {
            System.out.println("Username cannot contain spaces dan underscore");
        }
        else {
            System.out.printf("Hello %s\n", username);
        }

        scanner.close();

    }
}
