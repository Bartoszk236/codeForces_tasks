package src.problem151a;
//https://codeforces.com/problemset/problem/151/A
//25:48 - time of solution

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int l = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int p = scanner.nextInt();
        int nl = scanner.nextInt();
        int np = scanner.nextInt();

        int drink = (k * l) / nl;
        int pieceOfFruit = c * d;
        int salt = p / np;

        System.out.println(Math.min(drink, Math.min(pieceOfFruit, salt))/ n);
    }
}