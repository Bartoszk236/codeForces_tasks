package src.problem1374a;
//https://codeforces.com/problemset/problem/1374/A
//1:11:47 - time of solution

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int k = scanner.nextInt();
            int yTemp = k % x;
            if (!(yTemp == y)) {
                if (y == 0 && x > k) {
                    k = 0;
                } else if (y > yTemp) {
                    k -= yTemp + Math.abs(x - y);
                } else {
                    k -= Math.abs(yTemp - y);
                }
            }
            System.out.println(k);
        }
    }
}