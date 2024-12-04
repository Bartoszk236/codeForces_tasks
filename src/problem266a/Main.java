package src.problem266a;
//https://codeforces.com/problemset/problem/266/A

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int stoneNumber = in.nextInt();
        in.nextLine();
        String color = in.nextLine();
        char[] colors = color.toCharArray();
        List<Character> colorList = new ArrayList<>();
        for (int i = 0; i < colors.length; i++) {
            colorList.add(colors[i]);
        }
        int count = 0, index = 0;
        while (colorList.size() > 1){
            if (colorList.get(index).equals(colorList.get(index + 1))) {
                colorList.remove(index + 1);
                count++;
            } else {
                index++;
            }
            if (index + 1 == colorList.size()) break;
        }
        System.out.println(count);
    }
}