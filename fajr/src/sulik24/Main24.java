package sulik24;

import java.util.Scanner;

public class Main24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первую переменную");
        double a = sc.nextDouble();
        System.out.println("Введите вторую переменную");
        double b = sc.nextDouble();
        if (a>b) {
            b=a-b;
            a=a-b;
        }
        System.out.println("A="+a);
        System.out.println("B="+b);
    }
}