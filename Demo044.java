import java.util.Scanner;
public class Demo044 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping the numbers:");
        System.out.println("first number is: "+a);
        System.out.println("second number is: "+b);
        scanner.close();

    }
}