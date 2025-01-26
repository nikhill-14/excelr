import java.util.Scanner;

public class Demo041 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        for(int i=0;i<vowels.length;i++) {
            if(ch == vowels[i]){
                System.out.println("The character '"+ ch +"' is a vowel.");
                break;

            } else {
            System.out.println("The character '"+ ch +"' is a consonant.");
            break;
        }
            
        
    }
}
}