import java.util.*;

public class A_PowerOf_B {
    public static int pow(int n, int m) {
        if (m == 0) {
            return 1;
        }
        int p = pow(n, m / 2);
        if (m % 2 == 0) {
            return p * p;
        } else {
            return p * p * n;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int result = pow(n, m);
        System.out.println(result);
    }

}
