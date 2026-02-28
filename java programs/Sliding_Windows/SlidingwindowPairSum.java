import java.util.*;

public class SlidingwindowPairSum {
    public static void Sumpair(int a[], int n, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int ele : a) {
            if (hm.containsKey(ele)) {
                hm.put(ele, hm.get(ele) + 1);
            } else {
                hm.put(ele, 1);
            }
        }
        boolean ans = false;
        for (int ele : a) {
            int b = k - ele;
            if (ele == b) {
                if (hm.containsKey(b) && hm.get(b) > 1) {
                    ans = true;
                    break;
                } else {
                    if (hm.containsKey(b) && hm.get(b) >= 1) {
                        ans = true;
                        break;
                    }
                }

            }

        }
        if (ans) {
            System.out.println("Yes");
        } else {
            System.out.println("NO");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Sumpair(a, n, k);

    }

}
