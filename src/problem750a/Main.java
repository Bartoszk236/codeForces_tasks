package src.problem750a;
//https://codeforces.com/problemset/problem/750/A
//12:58 - time of solution

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tasksNumber = scanner.nextInt();
        int wayTime = scanner.nextInt();
        int timeForTasks = 240 - wayTime;
        int taskCount = 1;
        int readyTasks = 0;
        while (tasksNumber != readyTasks) {
            if (timeForTasks >= taskCount * 5) {
                timeForTasks -= 5 * taskCount;
                readyTasks++;
                taskCount++;
            } else {
                break;
            }
        }
        System.out.println(readyTasks);
    }
}