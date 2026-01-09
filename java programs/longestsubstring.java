import java.util.*;
import java.io.*;

public class longestsubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for (char ch : s.toCharArray()) {
            if (!set.contains(ch)) {
                set.add(ch);
            }
        }
        for (char ch : set) {
            System.out.print(ch);
        }

        System.out.println(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        sc.close();
    }

}
