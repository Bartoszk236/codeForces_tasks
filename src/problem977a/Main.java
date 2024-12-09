package src.problem977a;
//https://codeforces.com/problemset/problem/977/A

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int numberOfSubtraction = in.nextInt();
        for (int i = 0; i < numberOfSubtraction; i++) {
            if (number % 10 == 0) {
                number = number / 10;
            } else {
                number--;
            }
        }
        System.out.println(number);
    }
}