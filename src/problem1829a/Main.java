package src.problem1829a;
//https://codeforces.com/problemset/problem/1829/A
//16:06 - time of solution

import java.util.*;

public class Main {
    public static final int COUNT_OF_CHARACTERS_IN_STRING = 10;
    public static void main(String[] args) {
        HashMap<Integer, Character> hashmap = new HashMap<>();
        hashmap.put(0, 'c');
        hashmap.put(1, 'o');
        hashmap.put(2, 'd');
        hashmap.put(3, 'e');
        hashmap.put(4, 'f');
        hashmap.put(5, 'o');
        hashmap.put(6, 'r');
        hashmap.put(7, 'c');
        hashmap.put(8, 'e');
        hashmap.put(9, 's');
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < t; i++) {
            String word = scanner.nextLine();
            System.out.println(solve(word, hashmap));
        }
    }

    public static int solve(String word, HashMap<Integer, Character> hashmap) {
        char[] chars = word.toCharArray();
        int count = COUNT_OF_CHARACTERS_IN_STRING;
        for (int i = 0; i < COUNT_OF_CHARACTERS_IN_STRING; i++) {
            if (hashmap.containsKey(i)) {
                if (hashmap.get(i) == chars[i]) count--;
            }
        }
        return count;
    }
}