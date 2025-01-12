package src.problem1560a;
//https://codeforces.com/problemset/problem/1560/A
//11:12 - time of solution

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static final int MAX_VALUE_FOR_INPUT = 1667;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            System.out.println(solve(n - 1));
        }
    }

    public static List<Integer> generateList() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < MAX_VALUE_FOR_INPUT; i++) {
            String str = String.valueOf(i);
            if (!(i % 3 == 0 || str.charAt(str.length() - 1) == '3')) list.add(i);
        }
        return list;
    }

    public static int solve(int n) {
        List<Integer> list = generateList();
        return list.get(n);
    }
}