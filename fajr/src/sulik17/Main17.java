package sulik17;

import java.util.Scanner;

public class Main17 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое число ");
        double a=sc.nextDouble();
        if (a>=0){
            a++;
        }
        else {
            a=a-2;
        }
        System.out.println("Вы ввели число " + a);

    }

}
