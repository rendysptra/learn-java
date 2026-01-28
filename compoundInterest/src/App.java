import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);

        char currency = '$';
        double principal;
        double rate;
        int compoundedPerYear;
        double years;
        double finalAmounts;
        double interestEarned;

        System.out.print("Enter the principal amount: ");
        principal = scanner.nextDouble();

        System.out.print("Enter the interest rate (in %): ");
        rate = scanner.nextDouble() / 100;

        System.out.print("Enter the # of times compounded per year: ");
        compoundedPerYear = scanner.nextInt();

        System.out.print("Enter the # of years: ");
        years = scanner.nextDouble();

        finalAmounts = principal * Math.pow((1 + rate / compoundedPerYear), compoundedPerYear * years);
        interestEarned = finalAmounts - principal;

        System.out.printf("The amount after %.1f years is %c%,.2f\n", years, currency, finalAmounts);
        System.out.printf("The compound interest earned is %c%,.2f\n", currency, interestEarned);

        scanner.close();

    }
}
