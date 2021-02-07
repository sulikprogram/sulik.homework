package sulik58;

import java.util.Scanner;

public class Main58 {
    public static void main(String[] args) {
        System.out.println("дано целое число");
        Scanner vint = new Scanner(System.in);
        int a = vint.nextInt();
        int k = 0;
        int sum=0;
        while(sum>a){
            ++k;
            a+=k;
        }
        System.out.println("a+k "+k);
    }
}
