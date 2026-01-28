public class App {
    public static void main(String[] args) throws Exception {
        
        int age = 20;

        if (ageCheck(age)) {
            System.out.println("You can sign up");
        }
        else{
            System.out.println("You must be 18+ to sign up");
        }

    }
    static void happyBirthday(String name, int age){
        System.out.printf("HAPPY BIRTDAY %s!\n", name);
        System.out.printf("YOU ARE %d YEARS OLD NOW!\n", age);
    }
    static double square(int number){
        return number * number;
    }
    static double cube(int num){
        return num * num * num;
    }
    static boolean ageCheck(int age){
        return age >= 18;
    }
}