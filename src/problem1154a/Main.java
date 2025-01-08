package src.problem1154a;
//https://codeforces.com/problemset/problem/1154/A
//22:12 - time of solution

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int x3 = scanner.nextInt();
        int x4 = scanner.nextInt();
        int sum = Math.max(Math.max(x1, x2), Math.max(x3, x4));
        List<Integer> list = checkSum(x1, x2, x3, x4);
        solve(list.getFirst(), list.get(1), list.get(2), sum).forEach(System.out::println);
    }

    public static List<Integer> solve(int x1, int x2, int x3, int sum) {
        List<Integer> list = new ArrayList<>();
        int a, b, c;
        a = sum - x1;
        b = sum - x2;
        c = sum - x3;
        if (a + b + c == sum) {
            list.addAll(Arrays.asList(a, b, c));
        }
        return list;
    }

    public static List<Integer> checkSum(int x1, int x2, int x3, int x4) {
        List<Integer> list = Arrays.asList(x1, x2, x3, x4);
        int sum = Math.max(Math.max(x1, x2), Math.max(x3, x4));
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == sum) list.remove(i);
        }
        return list;
    }
}