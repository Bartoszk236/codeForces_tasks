package src.problem469a;
//https://codeforces.com/problemset/problem/469/A
//8:58 - time of solution

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int n = scanner.nextInt();
        int p = scanner.nextInt();
        for (int i = 0; i < p; i++) {
            list.add(scanner.nextInt());
        }
        int q = scanner.nextInt();
        for (int i = 0; i < q; i++) {
            list.add(scanner.nextInt());
        }
        int count = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(j).equals(i)) {
                    count++;
                    break;
                }
            }
        }
        if (count == n) {
            System.out.println("I become the guy.");
        } else {
            System.out.println("Oh, my keyboard!");
        }

    }
}