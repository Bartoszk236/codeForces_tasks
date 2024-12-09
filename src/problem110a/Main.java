package src.problem110a;
//https://codeforces.com/problemset/problem/110/A

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        char[] chars = s.toCharArray();
        int luckyCount = 0;
        for (int i = 0; i < chars.length; i++) {
            int n = Character.getNumericValue(chars[i]);
            if (n == 4 || n == 7) luckyCount++;
        }
        String luckyCountStr = String.valueOf(luckyCount);
        char[] luckyCountChars = luckyCountStr.toCharArray();
        int luckyCount2 = 0;
        for (int i = 0; i < luckyCountChars.length; i++) {
            int n = Character.getNumericValue(luckyCountChars[i]);
            if (n == 4 || n == 7) luckyCount2++;
        }
        if (luckyCount2 == luckyCountChars.length) System.out.print("YES");
        else System.out.print("NO");
    }
}