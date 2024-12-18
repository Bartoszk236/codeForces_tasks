package src.problem344a;
//https://codeforces.com/problemset/problem/344/A

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String in = scanner.nextLine();
            list.add(in);
        }
        int count = 0;
        for (int i = 0; i < list.size() - 1; i++) {
            if (!(list.get(i).equals(list.get(i + 1)))) count++;
        }
        System.out.println(count + 1);
    }
}