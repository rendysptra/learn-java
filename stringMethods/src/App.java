public class App {
    public static void main(String[] args) throws Exception {
        
        String name = "Rendy";

        // int length = name.length();
        // char letter = name.charAt(4);
        // int index = name.indexOf("n");
        // int lastIndex = name.lastIndexOf("y");

        // name = name.toUpperCase();
        // name = name.toLowerCase();
        // name = name.trim();
        // name = name.replace("y", "i");

        /* 
        if (name.isEmpty()) {
            System.out.println("Your name is empty");
        }
        else{
            System.out.printf("Hello %s\n", name);
        }
        */

        /* 
        if (name.contains("R")) {
            System.out.println("Your name contain R");
        }
        else{
            System.out.println("Your name doesn`t contain R");
        }
        */

        if (name.equalsIgnoreCase("rendyy")) {
            System.out.printf("Hello %s\n", name);
        }
        else{
            System.out.println("Your name is not rendyy");
        }
    }
}
