package src.problem1542a;
//https://codeforces.com/problemset/problem/1542/A
//3:52 - time of solution

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < n * 2; j++) {
                list.add(scanner.nextInt());
            }
            System.out.println(solve(list) ? "YES" : "NO");
        }
    }

    public static boolean solve(List<Integer> list) {
        long evenCount = list.stream().filter(x -> x % 2 == 0).count();
        long oddCount = list.stream().filter(x -> x % 2 == 1).count();
        return evenCount == oddCount;
    }
}
