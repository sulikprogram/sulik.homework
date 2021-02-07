package sulik45;

import java.util.Scanner;

public class Main45 {
    public static void main(String[] args) {
        Scanner kampus = new Scanner(System.in);
        int a = kampus.nextInt();
        int n = kampus.nextInt();
        int ibjjf = a;
        for (int i = 0;i<=n;i++){
            ibjjf=ibjjf*a;
        }
        System.out.println(""+ibjjf);
    }
}

