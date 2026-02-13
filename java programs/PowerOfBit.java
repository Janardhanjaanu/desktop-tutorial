import java.util.*;

public class PowerOfBit {
    static int m = 1000000007;

    public static int PowBit(int a, int n) {
        int ans = 1;
        int x = a;
        for (int i = 0; i < 32; i++) {
            if (((n >> i) & 1) == 1) {
                ans = (int) ((long) ans * x) % m;
            }
            x = (int) ((long) x * x) % m;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = sc.nextInt();
        int result = PowBit(a, n);
        System.out.println(result);
    }

}
