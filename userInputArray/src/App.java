import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

    Scanner scanner = new Scanner(System.in);
    int size;
    String[] foods;
    
    System.out.print("Enter the # of foods do you want: ");
    size = scanner.nextInt();
    scanner.nextLine();
    
    foods = new String[size];

    for(int i = 0; i < size; i++){
        System.out.print("Enter a food: ");
        foods[i] = scanner.nextLine();
    }

    for(String food : foods){
        System.out.println(food);
    }

    scanner.close();

    }
}
