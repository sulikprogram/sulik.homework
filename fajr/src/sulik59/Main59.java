package sulik59;

import java.util.Scanner;

public class Main59 {
    public static void main(String[] args) {
        System.out.println("дано целое число");
        Scanner boys = new Scanner(System.in);
        int a = boys.nextInt();
        int k = 0;
        int sum=0;
        while(sum<a){
            ++k;
            a+=k;
        }
        System.out.println("a+k "+k);
    }
}
