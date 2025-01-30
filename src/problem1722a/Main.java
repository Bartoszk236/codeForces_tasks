package src.problem1722a;
//https://codeforces.com/problemset/problem/1722/A
//14:05 - time of solution

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            in.nextLine();
            String s = in.nextLine();
            if (n != 5) System.out.println("NO");
            else {
                System.out.println(solve(s, n));
            }
        }
    }

    public static String solve(String s, int n) {
        Set<Character> list = new HashSet<>();
        list.add('T');
        list.add('i');
        list.add('m');
        list.add('u');
        list.add('r');
        char[] chars = s.toCharArray();
        Set<Character> list2 = new HashSet<>();
        for (char c : chars) {
            list2.add(c);
        }
        if (list2.size() != n) return "NO";
        list2.removeAll(list);
        if (list2.isEmpty()) return "YES";
        return "NO";
    }
}
