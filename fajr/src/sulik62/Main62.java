package sulik62;

public class Main62 {
    public static void main(String[] args) {
        int masiv2[] = new int[8];
        int a=0;
        int b=3;
        int c = 4;
        for(int i=0;i<=8;i++){
            masiv2[a]=b;
            b*=c;
            if(a<6)
                a++;
            System.out.println(""+b);
        }
    }
}