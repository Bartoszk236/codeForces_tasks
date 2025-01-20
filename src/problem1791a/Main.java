package src.problem1791a;
//https://codeforces.com/problemset/problem/1791/A
//5:16 - time of solution

import java.util.Map;
import java.util.Scanner;

public class Main {
    public static final Map<Character, String> map = Map.of(
            'c', "YES",
            'o', "YES",
            'd', "YES",
            'e', "YES",
            'f', "YES",
            'r', "YES",
            's', "YES"
    );
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            Character c = scanner.next().charAt(0);
            System.out.println(solve(c));
        }
    }

    public static String solve(Character c) {
        return map.getOrDefault(c, "NO");
    }
}