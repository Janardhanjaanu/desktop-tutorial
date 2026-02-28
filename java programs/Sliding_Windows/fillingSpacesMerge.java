import java.util.Scanner;

public class fillingSpacesMerge {
    public static void Concurred(int a1[], int a2[], int n, int m) {
        int merged[] = new int[n + m];
        int p1 = n - 1, p2 = m - 1, x = (n + m) - 1;
        while (p1 >= 0 && p2 >= 0) {
            if (a1[p1] > a2[p2]) {
                merged[x--] = a1[p1--];
            } else {
                merged[x--] = a2[p2--];
            }
        }
        while (p1 >= 0) {
            merged[x--] = a1[p1--];
        }
        while (p2 >= 0) {
            merged[x--] = a2[p2--];
        }
        for (int i = 0; i < merged.length; i++) {
            System.out.print(merged[i] + " ");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a1[] = new int[n];
        int a2[] = new int[m];
        for (int i = 0; i < n; i++) {
            a1[i] = sc.nextInt();

        }
        for (int j = 0; j < m; j++) {
            a2[j] = sc.nextInt();
        }
        Concurred(a1, a2, n, m);

    }

}
