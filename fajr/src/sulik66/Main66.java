package sulik66;

public class Main66 {
    public static void main(String[] args) {
        int masiv6[] = new int[10];
        int a=4;
        int b=6;
        masiv6[0]=a;
        masiv6[1]=b;
        int c = 2;
        for(int i = 1;i<10;i++){
            masiv6[c]+=masiv6[c+1];
            c++;
        }
    }
}
