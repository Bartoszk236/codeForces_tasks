package src.problem1335a;
//https://codeforces.com/problemset/problem/1335/A
//9:41 - time of solution

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testsNumber = scanner.nextInt();
        for (int i = 0; i < testsNumber; i++) {
            int candies = scanner.nextInt();
            if (candies < 3) System.out.println("0");
            else if (candies % 2 == 0) System.out.println((candies / 2) - 1);
            else System.out.println(candies / 2);
        }
    }
}