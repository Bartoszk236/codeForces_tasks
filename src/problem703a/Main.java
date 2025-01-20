package src.problem703a;
//https://codeforces.com/problemset/problem/703/A
//4:59 - time of solution

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int mishka = 0, chris = 0;
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            if (a > b) mishka++;
            else if (a < b) chris++;
        }
        if (mishka > chris) System.out.println("Mishka");
        else if (chris > mishka) System.out.println("Chris");
        else System.out.println("Friendship is magic!^^");
    }
}