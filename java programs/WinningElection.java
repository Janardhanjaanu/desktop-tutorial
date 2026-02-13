import java.util.*;

public class WinningElection {
    public static void Counting(int a[], int n) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int ele : a) {
            if (hm.containsKey(ele)) {
                hm.put(ele, hm.get(ele) + 1);
            } else {
                hm.put(ele, 0);
            }
        }
        int win = 0;
        int key = 0;
        for (Map.Entry<Integer, Integer> e : hm.entrySet()) {
            int vote = e.getValue();
            if (vote > win) {
                win = vote;
                key = e.getKey();
            }

        }
        System.out.print(key);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Counting(a, n);

    }

}
