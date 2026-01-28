import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        
        String[] fruits = {"Apple", "Pineapple", "Mango", "Banana"};

        // Arrays.sort(fruits);
        Arrays.fill(fruits, "Blueberry");
        int numberOfFruits = fruits.length;

        for(String fruit : fruits){
            System.out.println(fruit);
        }

        System.out.println(numberOfFruits);
        
    }
}
