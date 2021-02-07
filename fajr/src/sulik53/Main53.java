package sulik53;

import java.util.Scanner;

public class Main53 {
    public static void main(String[] args) {
        System.out.println("дано целое число");
        Scanner lion = new Scanner(System.in);
        int n = lion.nextInt();
        int k = 1;
        while (n/k<=n){
            k++;
        }
        System.out.println(""+k);

       }
    }

