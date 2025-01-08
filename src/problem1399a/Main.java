package src.problem1399a;
//https://codeforces.com/problemset/problem/1399/A
//1:05:50 - time of solution

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            List<Integer> list = new ArrayList<>();
            int n = scanner.nextInt();
            for (int j = 0; j < n; j++) {
                list.add(scanner.nextInt());
            }
            List<Integer> result = removeDuplicatesAndSort(list);
            if (weCanRemoveAllNumbers(result) || listHaveOneNumber(result)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    public static List<Integer> removeDuplicatesAndSort(List<Integer> list) {
        Set<Integer> set = new HashSet<>(list);
        List<Integer> result = new ArrayList<>(set);
        result.sort(Comparator.reverseOrder());
        return result;
    }

    public static boolean weCanRemoveAllNumbers(List<Integer> list) {
        int impossibleToRemove = 0;
        for (int j = 0; j < list.size() - 1; j++) {
            if (Math.abs(list.get(j) - list.get(j + 1)) > 1) {
                impossibleToRemove++;
                break;
            }
        }
        return impossibleToRemove <= 0;
    }

    public static boolean listHaveOneNumber(List<Integer> list) {
        return list.size() == 1;
    }
}