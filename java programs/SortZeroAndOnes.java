import java.util.*;

public class SortZeroAndOnes {
    public static void SortZO(int a[], int n) {
        int p1 = 0;
        int p2 = n - 1;
        while (p1 < p2) {
            while (a[p1] == 0) {
                p1++;
            }
            while (a[p2] == 1) {
                p2--;
            }
            if (p1 < p2) {
                a[p1] = 0;
                a[p2] = 1;
            }

        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        SortZO(a, n);
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }

}
