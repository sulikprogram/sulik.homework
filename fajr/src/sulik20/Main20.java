package sulik20;

import java.util.Scanner;

public class Main20 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первую переменную ");
        double a=sc.nextDouble();
        System.out.println("Введите вторую переменную ");
        double b=sc.nextDouble();
        System.out.println("Введите третию переменную ");
        double c=sc.nextDouble();
        if (a>=0&&b>=0&&c>=0)
            System.out.println("количество положительных чисел равно трем");
        else if(a>=0&&b>=0||b>=0&&c>=0||a>=0&&c>=0)
            System.out.println("количество положительных чисел равно двум");
        else if (a>=0||b>=0||c>=0)
            System.out.println("количество положительных чисел равно однному ");
        if (a<=0&&b<=0&&c<=0)
            System.out.println("количество отрицательных чисел равно трем");
        else if(a<=0&&b<=0||b<=0&&c<=0||a<=0&&c<=0)
            System.out.println("количество отрицательных чисел равно");
        else if (a<=0||b<=0||c<=0)
            System.out.println("количество отрицательных чисел равно однному ");





    }

}
