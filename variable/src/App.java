public class App {
    public static void main(String[] args) throws Exception {
        String name = "Rendy Syahputra";
        int gta = 6;
        double pi = 3.141559;
        char gender = 'M';
        boolean isAdmin = true;

        System.out.println("My name is " + name);
        System.out.println("Im waiting for GTA " + gta);
        System.out.println("The number of pi is: " + pi);
        System.out.println("My gender is " + gender);
        
        if(isAdmin){
            System.out.println("You are admin");
        }
        else{
            System.out.println("You are not admin");
        }

        }
    }
