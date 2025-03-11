package src.problem1742b;
//https://codeforces.com/problemset/problem/1742/B

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
            Set<Integer> set = new HashSet<>(list);
            if (set.size() == list.size()) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
