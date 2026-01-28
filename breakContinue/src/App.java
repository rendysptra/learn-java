public class App {
    public static void main(String[] args) throws Exception {
        
        for(int i = 0; i < 10; i++){

            if (i == 5) {
                continue;
            }

            System.out.print(i + " ");
        }

    }
}
