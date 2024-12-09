package src.problem271a;
//https://codeforces.com/problemset/problem/271/A

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        while (true) {
            year++;
            String yearString = Integer.toString(year);
            char[] chars = yearString.toCharArray();
            List<Character> charList = new ArrayList<>();
            Set<Character> charSet = new HashSet<>();
            for (int i = 0; i < chars.length; i++) {
                charList.add(chars[i]);
                charSet.add(chars[i]);
            }
            if (charSet.size() == charList.size()) {
                System.out.print(year);
                break;
            }
        }
    }
}