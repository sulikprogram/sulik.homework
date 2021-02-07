package sulik52;

import java.util.Scanner;

public class Main52 {
    public static void main(String[] args) {
        System.out.println("");
        Scanner ilon = new Scanner(System.in);
        int n = ilon.nextInt();
        int k = 1;
        while (Math.pow(k,2)> (n/ (Math.pow(k,2)) )){
            k++;
        }
        System.out.println(""+k);
    }
}
