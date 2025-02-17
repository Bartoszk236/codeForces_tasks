package src.problem80a;
//https://codeforces.com/problemset/problem/80/A
//9:15 - time of solution

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        if (checkPrime(m) && solve(n, m)) System.out.println("YES");
        else System.out.println("NO");
    }

    public static boolean checkPrime(int m) {
        for (int i = 2; i < m; i++) {
            if (m % i == 0) return false;
        }
        return true;
    }

    public static boolean solve(int n, int m) {
        int count = 0;
        for (int i = n + 1; i < m; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    count++;
                    break;
                }
            }
        }
        if (count == (m - n - 1)) return true;
        return false;
    }
}