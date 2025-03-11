package src.problem1878a;
//https://codeforces.com/problemset/problem/1878/A

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                list.add(scanner.nextInt());
            }
            boolean kExists = list.stream().anyMatch(integer -> integer == k);
            System.out.println(kExists ? "YES" : "NO");
        }
    }
}
