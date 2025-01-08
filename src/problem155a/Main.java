package src.problem155a;
//https://codeforces.com/problemset/problem/155/A
//9:18 - time of solution

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int score = scanner.nextInt();
            list.add(score);
        }
        int min = list.getFirst();
        int max = list.getFirst();
        int result = 0;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < min) {
                result++;
                min = list.get(i);
            }
            else if (list.get(i) > max) {
                result++;
                max = list.get(i);
            }
        }
        System.out.println(result);
    }
}