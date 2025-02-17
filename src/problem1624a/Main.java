package src.problem1624a;
//https://codeforces.com/problemset/problem/1624/A
//4:11 - time of solution

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                list.add(scanner.nextInt());
            }
            int min = list.stream().min(Integer::compareTo).get();
            int max = list.stream().max(Integer::compareTo).get();
            System.out.println(max - min);
        }
    }
}
