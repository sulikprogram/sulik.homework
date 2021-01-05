package sulik21;

import java.util.Scanner;

public class Main21 {
    public static void main(String[] args) {
        System.out.println("Введите 2 числа");
        Scanner sulik = new Scanner(System.in);
        int a = sulik.nextInt();
        Scanner sulik1 = new Scanner(System.in);
        int a2 = sulik.nextInt();
        if(a2>a)
            System.out.println("Большее число -  " +a2);
        if(a>a2)
            System.out.println("Большее число - " +a);

    }
}
