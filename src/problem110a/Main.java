package src.problem110a;
//https://codeforces.com/problemset/problem/110/A

import java.util.Scanner;

public class Main {
    public static final int MAGIC_NUMBER_FOUR = 4;
    public static final int MAGIC_NUMBER_SEVEN = 7;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int luckyCount = countMagicNumbers(s);
        String luckyCountString = String.valueOf(luckyCount);
        int luckyCount2 = countMagicNumbers(luckyCountString);
        if (luckyCount2 == luckyCountString.length()) System.out.print("YES");
        else System.out.print("NO");
    }

    public static int countMagicNumbers(String number) {
        int luckyCount = 0;
        char[] chars = number.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            int n = Character.getNumericValue(chars[i]);
            if (n == MAGIC_NUMBER_FOUR || n == MAGIC_NUMBER_SEVEN) luckyCount++;
        }
        return luckyCount;
    }
}