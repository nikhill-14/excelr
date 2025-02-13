public class Demo049 {
    public static void main(String[] args) {
        int number = 12345; 
        int reversedNumber = reverseNumber(number);
        System.out.println("Original number: " + number);
        System.out.println("Reversed number: " + reversedNumber);
    }
    public static int reverseNumber(int number) {
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10; 
            reversed = reversed * 10 + digit; 
            number /= 10; 
        }
        return reversed;
    }
}