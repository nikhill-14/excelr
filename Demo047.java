public class Demo047 {
    public static void main(String[] args) {
        int number = 123456; 
        int digitCount = countDigits(number);
        System.out.println("Number of digits in " + number + " is: " + digitCount);
    }

    public static int countDigits(int number) {
        int count = 0;
        while (number != 0) {
            number /= 10; 
            count++; 
        }
        return count;
    }
}