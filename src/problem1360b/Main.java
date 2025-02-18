package src.problem1360b;
//https://codeforces.com/problemset/problem/1360/B

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

    public static int solve(List<Integer> list) {
        list.sort(Comparator.reverseOrder());
        HashSet<Integer> hashSet = new HashSet<>(list);
        if (!(hashSet.size() == list.size())) return 0;
        if (list.size() == 2) return Math.abs(list.getFirst() - list.getLast());
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                int actualDiff = Math.abs(list.get(i) - list.get(j));
                if (actualDiff < min) min = actualDiff;
            }
        }
        return min;
    }
}
