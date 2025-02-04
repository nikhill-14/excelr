public class Demo060 {
    public static void main(String[] args) {
        int n = 20;  // Number of Fibonacci numbers to print
        long first = 0, second = 1;

        System.out.println("Fibonacci series of " + n + " numbers:");

        // Print Fibonacci sequence for n terms
        for (int i = 0; i < n; i++) {
            System.out.print(first + " "); // Print the current number in the sequence
            long next = first + second;   // Calculate next number in the sequence
            first = second;               // Move second number to first
            second = next;                // Move next number to second
        }
    }
}
