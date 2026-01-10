import java.util.Scanner;
import java.io.*;

public class maxSubArray {
    public static void FindMax(int a[], int n) {
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += a[j];
                ans = Math.max(ans, sum);
            }
        }
        System.out.println("Maximum subArray is: " + ans);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of an array: ");
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        FindMax(a, n);
    }

}
