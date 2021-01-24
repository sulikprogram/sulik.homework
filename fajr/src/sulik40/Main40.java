package sulik40;

import java.util.Scanner;

public class Main40 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("n=");
        int n = in.nextInt();
        double sum = 0;
        for (int i = 1; i <= n; i++)
            sum=sum+ 1 / (double)i;
        System.out.print("Sum=" + sum);


    }
}

