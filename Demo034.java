import java.util.Scanner;

public class Demo034 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number=scanner.nextInt();
        if(number % 2 == 0){
            System.out.println("The number is even: "+ number);
        }
        else {
            System.out.println("The number is odd: "+number);
        }
    }
    
}