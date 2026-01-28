import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // email splitter
        Scanner scanner = new Scanner(System.in);

        String email;
        String username;
        String domain;

        System.out.print("Enter your email: ");
        email = scanner.nextLine();
        
        if (email.contains("@")) {
            
            username = email.substring(0, email.indexOf("@"));
            domain = email.substring(email.indexOf("@") + 1);

            System.out.printf("Your email username is: %s\n", username);
            System.out.printf("Your email domain is: %s\n", domain);
        }
        else{
            System.out.println("You didn`t enter a valid email");
        }

        scanner.close();

    }
}
