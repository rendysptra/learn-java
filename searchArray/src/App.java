import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        
        String[] foods = {"Pizza", "Taco", "Ramen", "Rice"};
        String target;
        boolean isFound =  false;

        System.out.print("Enter a food to seach for: ");
        target = scanner.nextLine();

        for(int i = 0; i < foods.length; i++){
            if (foods[i].equalsIgnoreCase(target)) {
                System.out.printf("%s is found at index: %d\n", target, i);
                isFound = true;
            }
        }

        if (!isFound) {
            System.out.printf("%s is not found\n", target);
        }
        
        scanner.close();
        
    }
}
