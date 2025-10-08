import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // .substring() = A method used to extract a portion of a string
        //                .substring(start, end)

        
        String email = "Bro123@gmail.com";
        String username = email.substring(0, 6);
        String domain = email.substring(7, 16);
        email = "BroCode1@gmail.com";
        username = email.substring(0, email.indexOf("@"));
        domain = email.substring(email.indexOf("@") + 1);
        
        
        System.out.println(username);
        System.out.println(domain);


        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your email: ");
        email = scanner.nextLine();

        if (email.contains("@")){
            username = email.substring(0, email.indexOf("@"));
            domain = email.substring(email.indexOf("@") + 1);

            System.out.println("Your username is: " + username);
            System.out.println("Your domain is: " + domain);
        }
        else {
            System.out.println("Emails must contain @");
        }

        scanner.close();
    }
}
