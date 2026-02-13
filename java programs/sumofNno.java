import java.util.*;

public class sumofNno {
    public static int SumOf(int n) {
        if (n == 0) {
            return 0;
        }
        return n + SumOf(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = SumOf(n);
        System.out.println(result);

    }

}
