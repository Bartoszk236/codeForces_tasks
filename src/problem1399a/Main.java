package src.problem1399a;
//https://codeforces.com/problemset/problem/1399/A
//1:05:50 - time of solution

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            List<Integer> list = new ArrayList<>();
            int n = scanner.nextInt();
            for (int j = 0; j < n; j++) {
                list.add(scanner.nextInt());
            }
            Set<Integer> set = new HashSet<>(list);
            List<Integer> result = new ArrayList<>(set);
            result.sort(Comparator.reverseOrder());
            if (result.size() == 1) {
                System.out.println("YES");
                continue;
            }
            int count = 0;
            for (int j = 0; j < result.size() - 1; j++) {
                if (Math.abs(result.get(j) - result.get(j + 1)) > 1) {
                    count++;
                    break;
                }
            }
            if (count > 0) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}