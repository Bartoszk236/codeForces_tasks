package src.problem443a;
//https://codeforces.com/problemset/problem/443/A
//7:31 - time of solution

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringBuilder result = new StringBuilder();
        result.append(input);
        result.delete(0, 1).delete(result.length() - 1, result.length());
        result.trimToSize();
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < result.length(); i += 3) {
            set.add(result.charAt(i));
        }
        System.out.println(set.size());
    }
}