package sulik16;

import java.util.Scanner;

public class Main16 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое число ");
        int a=sc.nextInt();
        if (a>=0){
        a++;
        }
        System.out.println("полученное число"+a);

    }

}
