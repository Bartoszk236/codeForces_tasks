package src.problem9a;
//https://codeforces.com/problemset/problem/9/A
//6:56 - time of solution

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int y = scanner.nextInt();
        int w = scanner.nextInt();
        int max = Math.max(y, w);
        switch (max) {
            case 1:
                System.out.println("1/1");
                break;
            case 2:
                System.out.println("5/6");
                break;
            case 3:
                System.out.println("2/3");
                break;
            case 4:
                System.out.println("1/2");
                break;
            case 5:
                System.out.println("1/3");
                break;
            case 6:
                System.out.println("1/6");
        }
    }
}
