import java.util.*;

public class ApSum {
    public static int Sumof(int a, int d, int n) {
        if (n == 0 || n == 1) {
            return a;
        }
        return a + Sumof(a + d, d, n - 1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = sc.nextInt();
        int d = sc.nextInt();
        int result = Sumof(a, d, n);
        System.out.println(result);
    }

}
