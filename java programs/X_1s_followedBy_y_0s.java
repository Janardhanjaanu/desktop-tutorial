import java.util.*;

public class X_1s_followedBy_y_0s {
    public static int OnesFollowZeros(int x, int y) {
        int ones = (1 << x) - 1;
        return ones << y;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int result = OnesFollowZeros(x, y);
        System.out.println(Integer.toBinaryString(result));
    }

}
