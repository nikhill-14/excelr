import java.util.Scanner;

public class UserVerification {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = "";
        String password = "";
        
        while (!username.equals("user001") || !password.equals("password001")) {
            System.out.print("Enter username: ");
            username = scanner.nextLine();
            System.out.print("Enter password: ");
            password = scanner.nextLine();
        }
        
        System.out.println("Happy New Year!");
        scanner.close();
    }
}
