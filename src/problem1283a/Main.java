package src.problem1283a;
//https://codeforces.com/problemset/problem/1283/A
//2:49 - time of solution

import java.util.Scanner;

public class Main {
    public static final int HOURS_PER_DAY = 24;
    public static final int MINUTES_PER_HOUR = 60;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int h = scanner.nextInt();
            int m = scanner.nextInt();
            System.out.println(((HOURS_PER_DAY - h) * MINUTES_PER_HOUR) - m);
        }
    }
}
