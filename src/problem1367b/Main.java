package src.problem1367b;
//https://codeforces.com/problemset/problem/1367/B
//10:29 - time of solution

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static final int NO_SOLUTIONS = -1;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            LinkedList<Integer> list = new LinkedList<>();
            for (int j = 0; j < n; j++) {
                list.add(scanner.nextInt());
            }
            System.out.println(solve(list));
        }
    }

    public static int solve(LinkedList<Integer> list) {
        int badEven = 0, badOdd = 0;
        for (int i = 0; i < list.size(); i++) {
            int rest = i % 2;
            if (rest == 0 && list.get(i) % 2 == 1) badEven++;
            else if (list.get(i) % 2 == 0) badOdd++;
        }
        if (badEven == badOdd) return badEven;
        return NO_SOLUTIONS;
    }
}