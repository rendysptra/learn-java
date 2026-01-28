public class App {
    public static void main(String[] args) throws Exception {
        
        boolean isStudent = true;
        boolean isSenior = true;
        double price = 19.99;

        if (isStudent) {
            if (isSenior) {
                System.out.println("You get senior discount of 20%");
                System.out.println("You get student discount of 10%");
                price *= 0.7;
            }
            else{
                System.out.println("You get student discount of 10%");
                price *= 0.9;
            }
        }
        else{
            if (isSenior) {
                System.out.println("You get senior discount of 20%");
                price *= 0.8;
            }
            else{
                price *= 1;
            }
        }

        System.out.printf("The price of ticket is $%.2f\n", price);

    }
}
