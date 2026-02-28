import java.util.Scanner;
import java.util.*;

public class slidingwindowCountEven {
    public static void maximumSum(int a[], int n, int k) {
        int count = 0;
        for (int i = 0; i < k; i++) {
            if (a[i] % 2 == 0) {
                count++;
            }

        }
        System.out.println(count + " ");
        for (int i = k; i < n; i++) {
            if (a[i - k] % 2 == 0) {
                count--;
            }
            if (a[i] % 2 == 0) {
                count++;
            }
            System.out.println(count + " ");

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
