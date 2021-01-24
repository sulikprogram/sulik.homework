package sulik39;

public class Main39 {
    public static void main(String[] args) {
        double a=2;
        double b=4;
        double art=Math.pow(a,2)+Math.pow(b,2);
     while (a<=b){
         art=art*a*b;
         a++;
     }
        System.out.println("сумма квадратных чисел"+art);
    }
}
