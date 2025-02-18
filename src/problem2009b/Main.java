package src.problem2009b;
//https://codeforces.com/problemset/problem/2009/B
//7:43 - time of solution

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            LinkedList<String> linkedList = new LinkedList<>();
            scanner.nextLine();
            for (int j = 0; j < n; j++) {
                linkedList.add(scanner.nextLine());
            }
            solve(linkedList).forEach(integer -> System.out.print(integer + " "));
            System.out.print("\n");
        }
    }

    public static LinkedList<Integer> solve(LinkedList<String> linkedList) {
        LinkedList<Integer> results = new LinkedList<>();
        for (String s : linkedList) {
            char[] chars = s.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                if (chars[i] == '#') results.addFirst(i + 1);
            }
        }
        return results;
    }
}
