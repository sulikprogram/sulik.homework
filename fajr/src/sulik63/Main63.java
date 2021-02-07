package sulik63;

public class Main63 {
    public static void main(String[] args) {
        int a,d,c,e;
        int masiv63[]= new int[5];
        a=4;
        d=2;
        e=1;
        for(int i =0;i<5;i++){
            c=a+d*e;
            e++;
            masiv63[i]=c;
            System.out.println(""+c);
        }
    }
}