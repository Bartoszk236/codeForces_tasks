package src.problem1343b;
//https://codeforces.com/problemset/problem/1343/B
//20:26 - time of solution

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            List<Integer> list = solve(n);
            if (list.isEmpty()) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
                list.forEach(number -> System.out.print(number + " "));
                System.out.print("\n");
            }
        }
    }

    public static List<Integer> solve(int n) {
        if ((n / 2) % 2 == 1) return List.of();
        List<Integer> result = new ArrayList<>();
        for (int i = 2; i <= n; i += 2) {
            result.add(i);
        }
        int size = result.size();
        for (int i = 0; i < size; i++) {
            if (i == size - 1) {
                result.add(result.get(i) + i);
            } else {
                result.add(result.get(i) - 1);
            }
        }
        return result;
    }
}