package sulik57;

import java.util.Scanner;

public class Main57 {
    public static void main(String[] args) {
        System.out.println("дано целое число");
        Scanner stul = new Scanner(System.in);
        int n = stul.nextInt();
        int k = 0;
        int s = 0;
        while(s+k<=n){
            ++k;
            s+=k;
        }
        System.out.println("s+k "+k);
    }
}
