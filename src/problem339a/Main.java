package src.problem339a;
//https://codeforces.com/problemset/problem/339/A

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        char[] chars = input.trim().toCharArray();
        List<Character> numbers = new ArrayList<>();
        for (int i = 0; i < chars.length; i++) {
            if (i % 2 == 0) numbers.add(chars[i]);
        }
        List<Character> sortedNumbers = numbers.stream().sorted().toList();
        for (int i = 0; i < sortedNumbers.size(); i++) {
            System.out.print(sortedNumbers.get(i));
            if (i != sortedNumbers.size() - 1) System.out.print("+");
        }
    }
}