import java.util.*;

public class TowerOfHanoi {
    public static void THO(int n, String A, String C, String B) {
        if (n == 0) {
            return;
        }
        THO(n - 1, A, B, C);
        System.out.println(n + " from " + A + " to destination" + C);
        THO(n - 1, B, C, A);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String source = sc.next();
        String auxiliary = sc.next();
        String destination = sc.next();
        THO(n, source, destination, auxiliary);

    }

}
