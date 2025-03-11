package src.problem1791c;
//https://codeforces.com/problemset/problem/1791/C

import java.util.LinkedList;
import java.util.Scanner;

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

    public static int solve(String s) {
        char[] chars = s.toCharArray();
        LinkedList<Character> linkedList = new LinkedList<>();
        for (int i = 0; i < chars.length; i++) {
            linkedList.add(chars[i]);
        }
        if (linkedList.size() == 1) return 1;
        while (!linkedList.isEmpty()) {
            if (!(linkedList.getFirst().equals(linkedList.getLast()))) {
                linkedList.removeFirst();
                linkedList.removeLast();
            } else break;
        }
        return linkedList.size();
    }
}
