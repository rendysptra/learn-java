public class App {
    public static void main(String[] args) throws Exception {

        char[][] telephone ={
            {'1', '2', '3'},
            {'4', '5', '6'},
            {'7', '8', '9'},
            {'*', '0', '#'}
        };

        for(char[] row : telephone){
            for(char column : row){
                System.out.print(column + " ");
            }
            System.out.println();
        }

        
    }
}
