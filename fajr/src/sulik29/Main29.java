package sulik29;

import java.util.Scanner;

public class Main29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первую переменную ");
        double a = sc.nextDouble();
        System.out.println("Введите вторую переменную ");
        double b = sc.nextDouble();
        System.out.println("Введите третию переменную ");
        double h = sc.nextDouble();
        if(a<b)
            if(a<h)
            System.out.println("наименьшее"+a);
            if(b>a)
                if(b>h)
                    System.out.println("наибольшее"+b);

    }
}