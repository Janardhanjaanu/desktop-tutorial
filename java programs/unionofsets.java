import java.net.SocketTimeoutException;
import java.util.*;

public class unionofsets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a1[] = new int[n];
        int a2[] = new int[m];
        for (int i = 0; i < n; i++) {
            a1[i] = sc.nextInt();

        }
        for (int i = 0; i < m; i++) {
            a2[i] = sc.nextInt();
        }
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < n; i++) {
            hs.add(a1[i]);
        }
        for (int i = 0; i < m; i++) {
            hs.add(a2[i]);
        }
        System.out.println(hs);
        sc.close();
    }

}
