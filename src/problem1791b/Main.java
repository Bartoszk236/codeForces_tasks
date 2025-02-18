package src.problem1791b;
//https://codeforces.com/problemset/problem/1791/B
//5:47 - time of solution

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            scanner.nextLine();
            String s = scanner.nextLine();
            System.out.println(solve(s) ? "YES" : "NO");
        }
    }

    public static boolean solve(String s) {
        int x = 0;
        int y = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            switch (c) {
                case 'U': y++; break;
                case 'D': y--; break;
                case 'L': x--; break;
                case 'R': x++; break;
            }
            if (x == 1 && y == 1) return true;
        }
        return false;
    }
}
