package src.problem671a;
//https://codeforces.com/problemset/problem/617/A

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int distance = in.nextInt();
        int steps = (distance / 5);
        if (distance % 5 != 0) steps++;
        System.out.println(steps);
    }
}