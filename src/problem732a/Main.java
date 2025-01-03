package src.problem732a;
//https://codeforces.com/problemset/problem/732/A
//13:08 - time of solution

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();//cena
        int r = scanner.nextInt();//nomianł jednego drobnniaka
        int result = 0;
        int moneyWithoutPennies = 10;
        for (int i = r; i < Integer.MAX_VALUE; i += 10) {
            if (i % k == 0 ) {
                result = i;
                break;
            } else if (moneyWithoutPennies % k == 0) {
                result = moneyWithoutPennies;
                break;
            }
            moneyWithoutPennies += 10;
        }
        System.out.println(result / k);
    }
}