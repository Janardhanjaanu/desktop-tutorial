import java.util.*;

public class Nfactorial {
    public static int sumOf(int n) {
        if (n == 1) {
            return 1;
        }
        return n * sumOf(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = sumOf(n);
        System.out.println(result);
    }

}
