package src.problem1850c;
//https://codeforces.com/problemset/problem/1850/C
//8:26 - time of solution

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < t; i++) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int j = 0; j < 8; j++) {
                stringBuilder.append(scanner.nextLine());
            }
            System.out.println(solve(stringBuilder.toString()));
        }
    }

    public static String solve(String input) {
        LinkedList<Character> linkedList = new LinkedList<>();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            linkedList.add(input.charAt(i));
        }
        linkedList.stream().filter(character -> character != '.').forEach(stringBuilder::append);
        return stringBuilder.toString();
    }
}
