import java.util.*;

public class Floor {
    public static int FloorOf(int a[], int n, int k) {
        int l = 0, h = n - 1;
        int res = Integer.MIN_VALUE;
        while (l <= h) {
            int mid = l + h / 2;
            if (a[mid] == k) {
                return k;
            } else if (a[mid] < k) {
                res = a[mid];
                l = mid + 1;
            } else {
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
        int result = FloorOf(a, n, k);
        System.out.println(result);

    }

}
