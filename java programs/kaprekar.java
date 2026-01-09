import java.util.*;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import java.io.*;
import java.nio.channels.Pipe.SourceChannel;

public class kaprekar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = n * n;
        String s = String.valueOf(a);
        String l = s.substring(0, s.length() / 2);
        String r = s.substring(s.length() / 2);
        int left = l.isEmpty() ? 0 : Integer.parseInt(l);
        int right = r.isEmpty() ? 0 : Integer.parseInt(r);
        int res = (left + right);
        if (res == n) {
            System.out.print(n + " is a kaprekar number");
        } else {
            System.out.print(n + " is not a kaprekar number");
        }

    }

}
