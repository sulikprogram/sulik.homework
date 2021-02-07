package sulik55;

import java.util.Scanner;

public class Main55 {
    public static void main(String[] args) {
        System.out.println("дано целое число");
        Scanner clone = new Scanner(System.in);
        int n = clone.nextInt();
        int k = 1;
        while (3*k>n){
            k++;
        }
        System.out.println(""+k);
    }
}
