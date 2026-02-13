import java.util.*;

public class slidingwindowStartingNeg {
    public static void maximumSum(int a[], int n, int k) {
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (a[i] < 0) {
                q.add(a[i]);
            }
            if (i >= k - 1) {
                if (!q.isEmpty()) {
                    System.out.println(q.peek() + " ");

                } else {
                    System.out.println("0");
                }
                if (a[i - (k - 1)] < 0) {
                    q.remove();
                }
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
