package org.example.task2;

import java.util.Scanner;
import static org.example.task2.Utils.compareTwoStrsAndShowResult;

public class Main {

    public static void main(String[] args) {
        System.out.println("Task 2");

        Scanner enter = new Scanner(System.in);
        System.out.print("Напишите что-нибудь в строку: ");
        String s1 = enter.nextLine();

        System.out.print("Напишите что-нибудь в строку: ");
        String s2 = enter.nextLine();
        enter.close();

        compareTwoStrsAndShowResult(s1, s2);
    }
}
