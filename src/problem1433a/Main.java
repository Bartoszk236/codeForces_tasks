package src.problem1433a;
//https://codeforces.com/problemset/problem/1433/A
//15:54 - time of solution

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int sum = 0;
        for (int i = 1; i < 10; i++) {
            hashMap.put(i, sum += 1);
            hashMap.put(i * 11, sum += 2);
            hashMap.put(i * 111, sum += 3);
            hashMap.put(i * 1111, sum += 4);
        }
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int x = scanner.nextInt();
            System.out.println(hashMap.get(x));
        }
    }
}