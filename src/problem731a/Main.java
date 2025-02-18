package src.problem731a;
//https://codeforces.com/problemset/problem/731/A

import java.util.LinkedHashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        map.put('a', 0);
        map.put('b', 1);
        map.put('c', 2);
        map.put('d', 3);
        map.put('e', 4);
        map.put('f', 5);
        map.put('g', 6);
        map.put('h', 7);
        map.put('i', 8);
        map.put('j', 9);
        map.put('k', 10);
        map.put('l', 11);
        map.put('m', 12);
        map.put('n', 13);
        map.put('o', 14);
        map.put('p', 15);
        map.put('q', 16);
        map.put('r', 17);
        map.put('s', 18);
        map.put('t', 19);
        map.put('u', 20);
        map.put('v', 21);
        map.put('w', 22);
        map.put('x', 23);
        map.put('y', 24);
        map.put('z', 25);
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(solve(input, map));
    }

    public static int solve(String input, LinkedHashMap<Character, Integer> map) {
        char[] chars = input.toCharArray();
        int sum = 0;
        char actual = 'a';
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            int actualIndex = map.get(actual);
            int nextIndex = map.get(c);
            int distance = Math.abs(actualIndex - nextIndex);
            if (distance > 13) {
                if (actualIndex < 13) {
                    distance = actualIndex + (26 - nextIndex);
                } else {
                    distance = (26 - actualIndex) + nextIndex;
                }
            }
            actual = c;
            sum += distance;

        }
        return sum;
    }
}
