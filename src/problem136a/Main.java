package src.problem136a;
//https://codeforces.com/problemset/problem/136/A

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            int a = scanner.nextInt();
            map.put(a, i);
        }
        for (int i = 1; i <= n; i++) {
            System.out.print(map.get(i) + " ");
        }
    }
}