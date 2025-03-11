package src.problem1669b;
//https://codeforces.com/problemset/problem/1669/B
//29:45 - time of solution

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
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            int value = list.get(i);
            if (map.containsKey(value)) {
                map.put(value, map.get(value) + 1);
                if (map.get(value) > 2) return value;
            } else {
                map.put(value, 1);
            }
        }
        return -1;
    }
}
