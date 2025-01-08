package src.problem996a;
//https://codeforces.com/problemset/problem/996/A
//4:49 - time of solution

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int money = scanner.nextInt();
        int count = 0;
        count = money / 100;
        money = money % 100;
        count += money / 20;
        money = money % 20;
        count += money / 10;
        money = money % 10;
        count += money / 5;
        money = money % 5;
        count += money;
        System.out.println(count);
    }
}