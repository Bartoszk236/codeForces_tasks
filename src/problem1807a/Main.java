package src.problem1807a;
//https://codeforces.com/problemset/problem/1807/A
//4:48 - time of solution

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            List<Integer> list = new ArrayList<>(List.of(
                    scanner.nextInt(), scanner.nextInt(), scanner.nextInt()));
            if (list.getFirst() + list.get(1) == list.get(2)) System.out.println('+');
            else System.out.println('-');
        }
    }
}