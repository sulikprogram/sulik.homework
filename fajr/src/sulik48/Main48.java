package sulik48;

import java.util.Scanner;

public class Main48 {
    public static void main(String[] args) {
        Scanner fajr = new Scanner(System.in);
        int n= fajr.nextInt();
        int k= fajr.nextInt();
        int h=0;
        while (n>=k){
            h++;
            n-=k;
        }
        System.out.println("частное"+n);
        System.out.println("остаток"+n);
    }
}
