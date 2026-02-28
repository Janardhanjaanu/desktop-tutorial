import java.util.HashSet;

public class Longest_substring_without_repeating {
    public static int FindLongest_subString(String s) {
        HashSet<Character> set = new HashSet<>();
        int l = 0;
        int maxlen = 0;
        for (int i = 0; i < s.length(); i++) {
            while (set.contains(s.charAt(i))) {
                set.remove(s.charAt(l));
                ;
                l++;
            }
            set.add(s.charAt(i));
            maxlen = Math.max(maxlen, i - l + 1);
            // System.out.println(set);
        }
        return maxlen;
    }

    public static void main(String[] args) {
        String s = "pwwkew";
        int result = FindLongest_subString(s);
        System.out.println(result);// result---> kew
    }

}
