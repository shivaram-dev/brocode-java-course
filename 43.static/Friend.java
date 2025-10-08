public class Friend {

    // int numOfFriends;
    static int numOfFriends;
    String name;

    Friend(String name) {
        this.name = name;
        numOfFriends++;
    }

    static void showFriends() {
        // we don't need "this" to access static attributes
        System.out.println("You have " + numOfFriends + " total friends.");
    }
}
