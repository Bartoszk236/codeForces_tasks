package src.problem281a;
//https://codeforces.com/problemset/problem/281/A

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        String firstChar = input.substring(0, 1).toUpperCase();
        String restString = input.substring(1);
        System.out.println(firstChar + restString);
    }
}