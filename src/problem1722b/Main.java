package src.problem1722b;
//https://codeforces.com/problemset/problem/1722/B

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            scanner.nextLine();
            String a = scanner.nextLine();
            String b = scanner.nextLine();
            System.out.println(solve(a, b));
        }
    }

    public static String solve(String a, String b) {
        int score = 0;
        int lenght = a.length();
        String subStringA = a.replace('G', 'B');
        String subStringB = b.replace('G', 'B');
        for (int i = 0; i < lenght; i++) {
            if (subStringA.charAt(i) == subStringB.charAt(i)) score++;
        }
        return score == lenght ? "YES" : "NO";
    }
}
