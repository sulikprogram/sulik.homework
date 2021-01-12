package sulik19;

import java.util.Scanner;

public class Main19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первую переменную ");
        double a = sc.nextDouble();
        System.out.println("Введите вторую переменную ");
        double b = sc.nextDouble();
        System.out.println("Введите третию переменную ");
        double c = sc.nextDouble();
        if (a >= 0 && b >= 0 && c >= 0)
            System.out.println("количество положительных чисел равно 3");
        else if (a >= 0 && b >= 0 || b >= 0 && c >= 0 || a >= 0 && c >= 0)
            System.out.println("количество положительных чисел равно 2");
        else if (a >= 0 || b >= 0 || c >= 0)
            System.out.println("количество положительных чисел равно 1");
    }
}