package sulik41;

import java.util.Scanner;

public class Main41 {
    public static void main(String[] args) {
        Scanner xx = new Scanner(System.in);
        System.out.print("N=");
        int n = xx.nextInt();
        int abc = 0;
        for(int a = 0;a<=n;a++){
            abc+=Math.pow(n+a,2);
        }
        System.out.println("Сумма квадратов чисел от N до 2*N = "+abc);

    }
}
