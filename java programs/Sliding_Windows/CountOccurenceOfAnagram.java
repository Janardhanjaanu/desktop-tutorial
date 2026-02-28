import java.util.Scanner;

public class CountOccurenceOfAnagram {
    public static int CheckAnagram(String s, String p) {
        int fre[] = new int[26];
        for (char ch : p.toCharArray()) {
            fre[ch - 'a']++;
        }
        int l = 0, r = 0;
        int count = p.length();
        int ans = 0;
        while (r < s.length()) {
            if (fre[s.charAt(r) - 'a'] > 0) {
                count--;
            }
            fre[s.charAt(r) - 'a']--;
            r++;
            if (count == 0) {
                ans++;
            }
            if (r - l == p.length()) {
                if (fre[s.charAt(l) - 'a'] >= 0) {
                    count++;
                }
                fre[s.charAt(l) - 'a']++;
                l++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String p = sc.next();
        int result = CheckAnagram(s, p);
        System.out.println(result);
    }

}
