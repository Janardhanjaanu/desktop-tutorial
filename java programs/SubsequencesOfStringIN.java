import java.util.*;

public class SubsequencesOfStringIN {
    public static void SubSequence(String s, String ans, int i) {
        if (i == s.length()) {
            System.out.print(ans + " ");
            return;
        }
        SubSequence(s, ans + 1, i + 1);
        SubSequence(s, ans, i + 1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        SubSequence(s, "", 0);
    }

}
