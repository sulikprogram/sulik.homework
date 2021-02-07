package sulik49;

import java.util.Scanner;

public class Main49 {
    public static void main(String[] args) {
        Scanner nazar = new Scanner(System.in);
        int n= nazar.nextInt();
        while (n>=3){
            n/=3;
        }
         if(n==1){
             System.out.println("false");
         }
         else {
             System.out.println("true");
         }
    }
}
