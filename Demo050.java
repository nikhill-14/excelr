public class Demo050 {
    public static void main(String[] args) {
        int number = 5; 
        printMultiplicationTable(number);
    }

    public static void printMultiplicationTable(int number) {
        for (int i = 1; i <= 10; i++) {
            int result = number * i;
            System.out.println(number + " x " + i + " = " + result);
        }
    }
}
