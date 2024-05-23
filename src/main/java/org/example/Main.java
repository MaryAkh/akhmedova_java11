package org.example;

import java.util.Scanner;

import static org.example.Utils.compareToNumbers;
import static org.example.Utils.diffToNumbers;
import static org.example.Utils.divToNumbers;
import static org.example.Utils.multToNumbers;
import static org.example.Utils.sumToNumbers;

public class Main {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        System.out.print("Введите первое целое число. x= ");
        String str = enter.nextLine();
        int x = Integer.parseInt(str);

        System.out.print("Введите второе целое число. y= ");
        String str2 = enter.nextLine();
        int y = Integer.parseInt(str2);
        enter.close();

        compareToNumbers(x, y);

        int sum = sumToNumbers(x, y);
        System.out.println("Сумма чисел равна: " + sum);

        int diff = diffToNumbers(x, y);
        System.out.println("Разность чисел равна: " + diff);

        int mult = multToNumbers(x, y);
        System.out.println("Произведение чисел равно: " + mult);

        int div = divToNumbers(x, y);
        System.out.println("Деление чисел равно: " + div);

    }
}