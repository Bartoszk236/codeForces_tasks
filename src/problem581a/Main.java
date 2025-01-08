package src.problem581a;
//https://codeforces.com/problemset/problem/581/A
//5:45 - time of solution

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int min = Math.min(a, b);
        int solve1 = 0;
        for (int i = 0; i < min; i++) {
            if (a > 0 && b > 0) {
                solve1++;
                a--;
                b--;
            }
        }
        int solve2 = (Math.max(a, b)) / 2;
        System.out.println(solve1 + " " + solve2);
    }
}