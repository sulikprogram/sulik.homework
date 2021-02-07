package sulik50;

import java.util.Scanner;

public class Main50 {
    public static void main(String[] args) {
        Scanner yusuf = new Scanner(System.in);
        int n= yusuf.nextInt();
        int d;
        d=1;
        while (n>2){
            d++;
            n/=2;
        }
        System.out.println("целое число"+d);
    }
}
