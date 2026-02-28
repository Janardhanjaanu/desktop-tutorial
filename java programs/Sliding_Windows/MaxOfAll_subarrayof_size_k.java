import java.util.*;

public class MaxOfAll_subarrayof_size_k {
    public static void FindingSubmax(int n, int k, int a[]) {
        Deque<Integer> dq = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (!dq.isEmpty() && dq.peekFirst() == i - k) {
                dq.pollFirst();
            }
            while (!dq.isEmpty() && a[dq.peekLast()] < a[i]) {
                dq.pollLast();
            }
            dq.offerLast(i);
            if (i >= k - 1) {
                System.out.print(a[dq.peekFirst()] + " ");
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
        FindingSubmax(n, k, a);
    }

}
