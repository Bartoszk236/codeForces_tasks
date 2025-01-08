package src.problem1676a;
//https://codeforces.com/problemset/problem/1676/A
//4:03 - time of solution

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < t; i++) {
            String ticketNumber = scanner.nextLine();
            System.out.println(checkTicketNumber(ticketNumber));
        }
    }

    public static String checkTicketNumber(String ticketNumber) {
        char[] chars = ticketNumber.toCharArray();
        int sumStart = chars[0] + chars[1] + chars[2];
        int sumEnd = chars[3] + chars[4] + chars[5];
        if (sumStart == sumEnd) return "YES";
        else return "NO";
    }
}