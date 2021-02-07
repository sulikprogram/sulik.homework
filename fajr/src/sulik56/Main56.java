package sulik56;

import java.util.Scanner;

public class Main56 {
    public static void main(String[] args) {
        System.out.println("дано целое число");
        Scanner parta = new Scanner(System.in);
        int n = parta.nextInt();
        int k = 0;
        int s = 0;
        while(s+k>=n){
            ++k;
            s+=k;
        }
        System.out.println("s+k "+k);
    }
}
