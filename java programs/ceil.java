import java.util.*;

public class ceil {
    public static int CeilOf(int a[], int n, int k) {
        int l = 0, h = n - 1;
        int res = Integer.MAX_VALUE;
        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (a[mid] == k) {
                return k;
            } else if (a[mid] < k) {
                l = mid + 1;
            } else {
                res = a[mid];
                h = mid - 1;
            }

        }
        return res;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int result = CeilOf(a, n, k);
        System.out.println(result);

    }

}
