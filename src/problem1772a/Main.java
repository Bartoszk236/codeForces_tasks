package src.problem1772a;
//https://codeforces.com/problemset/problem/1772/A

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < t; i++) {
            String s = scanner.nextLine();
            System.out.println(solve(s));
        }
    }

    public static int solve(String s) {
        String a = s.substring(0, 1);
        String b = s.substring(2, 3);
        int intA = a.charAt(0) - '0';
        int intB = b.charAt(0) - '0';
        return intA + intB;
    }
}
