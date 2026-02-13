import java.util.Scanner;
import java.util.*;

public class NonrepeatingandNonNegative {
    public static void FindingAns(int a[], int n) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int ele : a) {
            if (hm.containsKey(ele)) {
                hm.put(ele, hm.get(ele) + 1);
            } else {
                hm.put(ele, 1);
            }
        }
        boolean found = false;
        for (Map.Entry<Integer, Integer> e : hm.entrySet()) {
            // int key = e.getKey();
            if ((e.getKey() >= 0 && e.getValue() == 1)) {
                System.out.println(e.getKey());
                found = true;
            }

        }
        if (!found) {
            System.out.println("There are no such elements in the given array");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        FindingAns(a, n);
    }

}
