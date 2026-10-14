public class PrintOdd {
    static void PrintOdd(int n) {
        if (n == 0) {
            return;
        }
        PrintOdd(n - 1);
        if (n % 2 != 0) {
            System.out.println(n);
        }
    }
    public static void main(String[] args) {
        PrintOdd(10);
    }
}


