package src.problem427a;
//https://codeforces.com/problemset/problem/427/A
//9:08 - time of solution

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int eventsNumber = scanner.nextInt();
        int sum = 0;
        int count = 0;
        for (int i = 0; i < eventsNumber; i++) {
            int event = scanner.nextInt();
            sum += event;
            if (sum < 0) {
                count++;
                sum = 0;
            }
        }
        System.out.println(count);
    }
}