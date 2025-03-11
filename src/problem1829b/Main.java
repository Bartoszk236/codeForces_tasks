package src.problem1829b;
//https://codeforces.com/problemset/problem/1829/B

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            LinkedList<Integer> linkedList = new LinkedList<>();
            for (int j = 0; j < n; j++) {
                linkedList.add(scanner.nextInt());
            }
            System.out.println(solve(linkedList));
        }
    }

    public static int solve(LinkedList<Integer> linkedList) {
        List<Integer> list = new ArrayList<>(List.of(0));
        int result = 0;
        for (int i = 0; i < linkedList.size(); i++) {
            if (linkedList.get(i) == 1) {
                result = 0;
            } else {
                result++;
                list.add(result);
            }
        }
        return list.stream().max(Integer::compareTo).get();
    }
}
