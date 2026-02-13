import java.util.*;

public class fibonacci {
    public static int Fib(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return Fib(n - 1) + Fib(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print(Fib(i) + " ");
        }
    }

}
