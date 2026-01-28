public class App {
    public static void main(String[] args) throws Exception {
        
        // %[flags][width][.precision][specified-character]

        String name = "Spongebob";
        char firstLetter = 'S';
        int age = 30;
        double height = 60.5;
        boolean isEmployed = true;

        double price1 = 19.99;
        double price2 = 25000.667;
        double price3 = -100.1;
        double price4 = 15.69;

        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;
        
        // [specified-character]
        System.out.printf("Hello %s\n", name);
        System.out.printf("Your name start with a %c\n", firstLetter);
        System.out.printf("You are %d years old\n", age);
        System.out.printf("You are %.1f centimeters tall\n", height);
        System.out.printf("Employed: %b\n", isEmployed);

        // [.precision] & [flags]
        System.out.printf("%+.1f\n", price1);
        System.out.printf("%,.2f\n", price2);
        System.out.printf("%(.1f\n", price3);
        System.out.printf("% .1f\n", price4);

        // [width]
        System.out.printf("%04d\n", id1);
        System.out.printf("%4d\n", id2);
        System.out.printf("%-4d\n", id3);
        System.out.printf("%04d\n", id4);

    }
}
