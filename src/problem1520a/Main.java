package src.problem1520a;
//https://codeforces.com/problemset/problem/1520/A
//41:00 - time of solution

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            scanner.nextLine();
            String s = scanner.nextLine();
            System.out.println(solve(s));
        }
    }

    public static String solve(String s) {
        LinkedList<Character> list = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            list.add(s.charAt(i));
        }
        Map<Character, LinkedList<Integer>> map = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            char c = list.get(i);
            if (!map.containsKey(c)) map.put(c, new LinkedList<>(List.of(i)));
            else map.get(c).add(i);
        }
        Iterator<Character> iterator = map.keySet().iterator();
        List<Integer> result = new ArrayList<>();
        while (iterator.hasNext()) {
            Character character = iterator.next();
            result.add(map.get(character).stream().reduce(((integer, integer2) -> {
                if (integer + 1 != integer2) return -1;
                else return integer2;
            })).get());
        }
        return result.stream().anyMatch(value -> value == -1) ? "NO" : "YES";
    }
}
