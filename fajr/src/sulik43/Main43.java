package sulik43;

import java.util.Scanner;

public class Main43 {
    public static void main(String[] args) {
        System.out.println("");
        System.out.println("=");
        Scanner adcc = new Scanner(System.in);
        int n = adcc.nextInt();
        double boy = 0;
        for (double i =1;i<=n;i++){
            boy+= Math.pow(-1,i+1)*(1+i/10);
            System.out.println("слагаемые с чередующим знаком"+boy);
        }
    }
}

