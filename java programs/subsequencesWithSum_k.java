import java.util.*;

public class subsequencesWithSum_k {
    public static void CheckBit(int n, int k, int a[]) {
        for (int i = 0; i < (1 << n); i++) {
            int sum = 0;
            ArrayList<Integer> list = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                if (((i >> j) & 1) == 1) {
                    sum += a[j];
                    list.add(a[j]);

                }

            }
            if (sum == k) {
                System.out.println(list);
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
        CheckBit(n, k, a);
    }

}
