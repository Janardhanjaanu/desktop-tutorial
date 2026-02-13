import java.util.*;

public class slidingwindowmaximumsubarrayAum {
    public static void maximumSum(int a[], int n, int k) {
        int windowsum = 0;
        int AvgSum = 0;
        for (int i = 0; i < n; i++) {
            windowsum += a[i];
            if (i >= k - 1) {
                AvgSum = windowsum / k;
                windowsum -= a[i - (k - 1)];
                System.out.println(AvgSum);
            }

        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        maximumSum(a, n, k);
    }

}
