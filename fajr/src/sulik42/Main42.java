package sulik42;

import java.util.Scanner;

public class Main42 {
    public static void main(String[] args) {
        System.out.println("Количество сомножителей от 1,1 до ...");
        Scanner pp = new Scanner(System.in);
        System.out.println("=");
        int n = pp.nextInt();
        double bca = 1;
        for (double i =1;i<=n;i++){
            bca=bca*(1+i/10);
        }
        System.out.println("сомножитель = "+bca);
    }
}

