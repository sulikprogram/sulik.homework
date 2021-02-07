package sulik54;

import java.util.Scanner;

public class Main54 {
    public static void main(String[] args) {
        System.out.println("дано целое число");
        Scanner fil = new Scanner(System.in);
        int n = fil.nextInt();
        int k = 1;
        int sum=0;
       while (sum<=n){
           k++;
       }
        System.out.println(""+k);
    }
}