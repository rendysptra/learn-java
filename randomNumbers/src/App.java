import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        
        Random random = new Random();

        int dice;
        boolean isHead;

        dice = random.nextInt(1, 7);
        isHead = random.nextBoolean();

        System.out.println(dice);

        if (isHead) {
            System.out.println("Head");
        }
        else{
            System.out.println("Tail");
        }


    }
}
