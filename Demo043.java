import java.util.Scanner;

public class Demo043 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an uppercase character: ");
        char upperCaseChar = scanner.next().charAt(0);
        if (upperCaseChar >= 'A' && upperCaseChar <= 'Z') {
            char lowerCaseChar = (char) (upperCaseChar + 'a' - 'A');
            System.out.println("Lowercase character: " + lowerCaseChar);
        } else {
            System.out.println("The input is not an uppercase character.");
        }

        scanner.close();
    }
}
