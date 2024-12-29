package src.problem520a;
//https://codeforces.com/problemset/problem/520/A
//5:08 - time of solution

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static final int NUMBER_OF_ALPHABETS = 26;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String sentence = scanner.nextLine().toLowerCase();
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < sentence.length(); i++) {
            set.add(sentence.charAt(i));
        }
        if (set.size() == NUMBER_OF_ALPHABETS) System.out.println("YES");
        else System.out.println("NO");
    }
}