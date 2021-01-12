package sulik25;

import java.util.Scanner;

public class Main25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первую переменную");
        double a = sc.nextDouble();
        System.out.println("Введите вторую переменную");
        double b = sc.nextDouble();
        double c = (a + b);
        if (a > b || a < b)
            if (a > b)
                System.out.println("a>b" + c);
        if (a == b)
            System.out.println("a==b" + 0);
    }
}