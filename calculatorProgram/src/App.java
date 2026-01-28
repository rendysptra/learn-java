import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // CALCULATOR PROGRAM
        // declare variable
        Scanner scanner = new Scanner(System.in);

        double number1;
        char operator;
        double number2;
        double result = 0;
        boolean validOperation = true;

        // enter the first number
        System.out.print("Enter the first number: ");
        number1 = scanner.nextDouble();

        // enter the operation
        System.out.print("Enter an operator (+, -, *, /, ^): ");
        operator = scanner.next().charAt(0);

        // enter the second number
        System.out.print("Enter the second number: ");
        number2 = scanner.nextDouble();

        // calculation & output
        switch (operator) {
            case '+' -> result = number1 + number2;
            case '-' -> result = number1 - number2;
            case '*' -> result = number1 * number2;
            case '/' -> {
                if (number2 == 0) {
                    System.out.println("Cannot divided by zero!");
                    validOperation = false;
                }
                else{
                    result = number1 / number2;
                }
            }
            case '^' -> result = Math.pow(number1, number2);
            default -> {
                System.out.println("Invalid operations!");
                validOperation = false;
            }
        }

        if (validOperation) {
            System.out.printf("The result is: %.2f\n", result);
        }


        scanner.close();

    }
}
