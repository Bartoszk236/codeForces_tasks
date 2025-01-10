package src.problem32b;
//https://codeforces.com/problemset/problem/32/B
//19:57 - time of solution

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, Integer> map = Map.of(".", 0,"-.", 1,"--", 2);
        List<Integer> result = new ArrayList<>();
        int length = input.length();
        for (int i = 0; i < length; i++) {
            if (length >= i + 2) {
                String sub = input.substring(i, i + 2);
                if (map.containsKey(sub)) {
                    result.add(map.get(sub));
                    i++;
                } else {
                    sub = input.substring(i, i + 1);
                    if (map.containsKey(sub)) {
                        result.add(map.get(sub));
                    }
                }
            } else {
                String sub = input.substring(i, i + 1);
                if (map.containsKey(sub)) {
                    result.add(map.get(sub));
                }
            }
        }
        result.forEach(System.out::print);
    }
}