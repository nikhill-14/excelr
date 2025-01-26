import java.util.Scanner;
public class Demo038 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Character: ");
        char ch=scanner.next().charAt(0);
        if (Character.isUpperCase(ch)){
            System.out.println("The character '"+ ch +"' is uppercase: ");
        } else if (Character.isLowerCase(ch)){
            System.out.println("The character '"+ ch +"' is lowercase: ");
        } else {
            System.out.println("The character '" + ch + "' is not a letter.");
        }
    }
}