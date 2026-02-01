public class Friend {
    
    static int numOfFriend;
    String name;

    Friend(String name){
        this.name = name;
        numOfFriend++;
    }

    static void showFriend(){
        System.out.println("You have " + numOfFriend + " total friends");
    }
}
