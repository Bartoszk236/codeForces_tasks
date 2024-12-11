package src.problem41a;
//https://codeforces.com/problemset/problem/41/A

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String firstWord = in.nextLine();
        String secondWord = in.nextLine();
        StringBuilder result = new StringBuilder();
        String resultString = result.append(secondWord).reverse().toString();

        if (firstWord.equals(resultString)) System.out.print("YES");
        else System.out.print("NO");
    }
}