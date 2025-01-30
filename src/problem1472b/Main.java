package src.problem1472b;
//https://codeforces.com/problemset/problem/1472/B
//1:54:56 - time of solution

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                list.add(scanner.nextInt());
            }
            System.out.println(solve(list));
        }
    }

    public static String solve(List<Integer> list) {
        long one = list.stream().filter(integer -> integer == 1).count();
        long two = list.stream().filter(integer -> integer == 2).count();
        if ((one % 2 == 0 && two % 2 == 0) || (one % 2 == 0 && one > 1)) return "YES";
        return "NO";
    }
}
