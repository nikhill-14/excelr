import java.util.Scanner;

public class demo8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String loginid =" ";
        String pwd =" ";
        String reply;
        do {
            System.out.println("welcome to Malla Reddy University");
            System.err.println("have you visited our site earlier");
            reply = sc.nextLine();
            if(reply == "no") {
                System.err.println("login here");
                System.err.println("enter ur id and pwd");
                loginid = sc.nextLine();
                pwd = sc.nextLine();
            }else
            System.err.println("you are our valued customer");
        }while ((loginid == "Nikhil") && (pwd == "12345"));
    }
}
