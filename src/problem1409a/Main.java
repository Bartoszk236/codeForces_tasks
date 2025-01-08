package src.problem1409a;
//https://codeforces.com/problemset/problem/1409/A
//14:31 - time of solution

import java.util.Scanner;

public class Main {
    public static final int COUNT_OF_NUMBERS = 2;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int first = 0, second = 0;
            for (int j = 1; j < COUNT_OF_NUMBERS; j++) {
                first = scanner.nextInt();
                second = scanner.nextInt();
            }
            System.out.println(solve(first, second));
        }
    }

    public static int solve(int first, int second) {
        if (first == second) return 0;
        int subtraction = (Math.abs(first - second));
        int rest = subtraction % 10;
        int moves = (subtraction - rest) / 10;
        if (rest == 0) return moves;
        else return moves + 1;
    }
}