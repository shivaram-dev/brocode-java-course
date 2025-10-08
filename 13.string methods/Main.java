class Main {
    public static void main(String[] args) {
        String name = "   Bro Code       ";

        int length = name.length();
        char letter = name.charAt(0);
        int index = name.indexOf("o");
        int lastIndex = name.lastIndexOf("o");

        // name = name.toUpperCase();
        // name = name.toLowerCase();
        // name = name.trim();
        // name = name.replace("0", "a");
        


        System.out.println(length);
        System.out.println(letter);
        System.out.println(index);
        System.out.println(lastIndex);
        System.out.println(name.isEmpty());

        if (name.isEmpty()) {
            System.out.println("Your name is empty");
        }
        else {
            System.out.println("Hello " + name);
        }

        if (name.contains(" ")) {
            System.out.println("Your name contains space");
        }
        else {
            System.out.println("Your name DOESN'T contain any spaces");
        }

        name = "Password";

        if (name.equals("password")) {
            System.out.println("Your name can't be password");
        }
        else {
            System.out.println("Hello " + name);
        }

        if (name.equalsIgnoreCase("password")) {
            System.out.println("Your name can't be password");
        }
        else {
            System.out.println("Hello " + name);
        }

    }
}
