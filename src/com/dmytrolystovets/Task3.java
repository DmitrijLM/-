package com.dmytrolystovets;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите А:");
        float a = scanner.nextFloat();
        System.out.println("Введите В:");
        float b = scanner.nextFloat();
        System.out.println("Введите С:");
        float c = scanner.nextFloat();
        float D = (b * b) - (4 * a * c);
        if (D > 0) {
            double x1, x2;
            x1 = (-b - Math.sqrt(D)) / (2 * a);
            x2 = (-b + Math.sqrt(D)) / (2 * a);
            System.out.println("Корни уравнения: x1 = " + x1 + ", x2 = " + x2);
        }
        else if (D == 0) {
            double x;
            x = -b / (2 * a);
            System.out.println("Уравнение имеет единственный корень: x = " + x);
        }
        else {
            System.out.println("Нет корней!");
        }
    }
}


