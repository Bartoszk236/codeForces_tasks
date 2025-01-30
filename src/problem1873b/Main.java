package src.problem1873b;
//https://codeforces.com/problemset/problem/1873/B
//14:06 - time of solution

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
        int min = list.stream().min(Integer::compareTo).get();
        int minTemp = min + 1;
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            if (next == min) {
                iterator.remove();
                break;
            }
        }
        list.add(minTemp);
        int result = 1;
        Iterator<Integer> iterator2 = list.iterator();
        while (iterator2.hasNext()) {
            Integer next = iterator2.next();
            result *= next;
        }
        return result;
    }
}
