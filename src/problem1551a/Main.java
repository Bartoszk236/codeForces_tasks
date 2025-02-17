package src.problem1551a;
//https://codeforces.com/problemset/problem/1551/A
//8:50 - time of solution

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int rest = n % 3;
            int c1 = n / 3;
            int c2 = c1;
            if (rest == 1) c1++;
            if (rest == 2) c2++;
            System.out.println(c1 + " " + c2);
        }
    }
}
