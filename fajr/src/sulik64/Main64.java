package sulik64;

public class Main64 {
    public static void main(String[] args) {
        int a,d,e;
        int masiv4[]= new int[8];
        d=4;
        e=8;
        a=2;
        for(int i =0;i<8;i++){
            e=a*d;
            d*=3;
            masiv4[i]=e;
            System.out.println(""+e);
        }
    }
}