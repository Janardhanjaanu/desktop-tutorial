import java.util.*;

public class slidingwindow1 {
    public static void checkingCondition(int a[], int n, int k) {
        int start = 0;
        int current = 1;
        int count = 0;
        while (start < n) {
            if (a[current] - a[start] < k) {
                current++;
            } else {
                count++;
                start = current;
                current = current + 1;
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        checkingCondition(a, n, k);

    }

}
