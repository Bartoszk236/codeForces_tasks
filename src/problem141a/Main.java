package src.problem141a;
//https://codeforces.com/problemset/problem/141/A
//34:43 - time of solution

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String owner = scanner.nextLine();
        String guest = scanner.nextLine();
        String result = scanner.nextLine();
        List<Character> map = new ArrayList<>();
        char[] ownerChars = owner.toCharArray();
        char[] guestChars = guest.toCharArray();
        char[] resultChars = result.toCharArray();
        for (int i = 0; i < ownerChars.length; i++) {
            map.add(ownerChars[i]);
        }
        for (int i = 0; i < guestChars.length; i++) {
            map.add(guestChars[i]);
        }
        int count = 0, checkCount = 0;
        for (int i = 0; i < resultChars.length; i++) {
            checkCount++;
            int finalI = i;
            if (map.stream().anyMatch(c -> c.equals(resultChars[finalI]))) {
                count++;
                int index = map.indexOf(resultChars[finalI]);
                map.remove(index);
            }

        }
        if (count == guestChars.length + ownerChars.length && map.isEmpty() && count == checkCount) System.out.println("YES");
        else System.out.println("NO");
    }
}