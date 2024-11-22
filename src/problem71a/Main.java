package src.problem71a;
//https://codeforces.com/problemset/problem/71/A

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!(scanner.hasNextInt())) throw new RuntimeException("You must enter an integer");
        int wordsNumber = scanner.nextInt();
        List<String> wordsList = new ArrayList<>();
        for (int i = 0; i < wordsNumber; i++) {
            String word = scanner.next();
            wordsList.add(word);
        }
        for (String word : wordsList) {
            if (word.length() > 10) {
                System.out.println(convertWord(word.toCharArray()));
            } else {
                System.out.println(word);
            }
        }
    }
    public static String convertWord(char[] word) {
        return String.valueOf(word[0]) + String.valueOf(word.length - 2) +
                String.valueOf(word[word.length - 1]);
    }
}