package src.problem734a;
//https://codeforces.com/problemset/problem/734/A

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfGames = in.nextInt();
        in.nextLine();
        String str = in.nextLine();
        char[] chars = str.toCharArray();
        int antonWin = 0, danikWin = 0;
        for (int i = 0; i < numberOfGames; i++) {
            if (chars[i] == 'A') antonWin++;
            else if (chars[i] == 'D') danikWin++;
        }
        if (antonWin == danikWin) System.out.print("Friendship");
        if (antonWin > danikWin) System.out.print("Anton");
        if (antonWin < danikWin) System.out.print("Danik");
    }
}