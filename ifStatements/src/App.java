import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
            Scanner scanner = new Scanner(System.in);

            String name;
            int age;
            boolean isStudent;

            System.out.print("What is your name: ");
            name = scanner.nextLine();

            System.out.print("What is your age: ");
            age = scanner.nextInt();

            System.out.print("Are you a student (true/false): ");
            isStudent = scanner.nextBoolean();

            // Name
            if (name.isEmpty()) {
                System.out.println("\nYou did not enter your name");
            }
            else{
                System.out.println("\nHello " + name);
            }

            // Age
            if (age >= 65) {
                System.out.println("You are a senior");
            }
            else if (age >= 18) {
                System.out.println("You are an adult");
            }
            else if (age == 0) {
                System.out.println("You are a baby");
            }
            else if (age < 0) {
                System.out.println("You are not even born yet");
            }
            else{
                System.out.println("You are a child");
            }

            // Student
            if (isStudent) {
                System.out.println("You are not enrolled");
            }
            else{
                System.out.println("You are enrolled");
            }
            scanner.close();
    }
}