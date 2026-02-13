import java.util.*;

public class xth_yth_BitSet {
    public static int SetBit(int x, int y) {
        return ((1 << x) | (1 << y));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(SetBit(x, y));

    }

}
