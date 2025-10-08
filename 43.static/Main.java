class Main {
    public static void main(String[] args) {
        
        // static = Makes a variable or method belong to the class
        //          rather than to any specific object
        //          Commonly used for utility methods or shared resources.

        // Friend friend1 = new Friend("Spongebob");
        // Friend friend2 = new Friend("Patrick");
        // Friend friend3 = new Friend("Squidward");
        // Friend friend4 = new Friend("Sandy");
        // Friend friend5 = new Friend("Gary");

        // System.out.println(friend1.numOfFriends);
        // System.out.println(friend2.numOfFriends);
        // System.out.println(friend3.numOfFriends);
        // System.out.println(friend4.numOfFriends);
        // System.out.println(friend5.numOfFriends);
        // Output:
        // 1
        // 1
        // 1
        // 1
        // 1
        // Because each friend object has their own copy of numOfFriends variable
        // Make the numOfFriends static to make it common across both friend objects
        // It's better to access a static attribute/method by class name for clarity rather than its object
        System.out.println(Friend.numOfFriends);
        Friend.showFriends();

        // Hold Ctrl, click on Math and find "round(" to see round static method
        Math.round(3.99);
    }
}
