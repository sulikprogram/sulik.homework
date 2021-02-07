package sulik61;

public class Main61 {
    public static void main(String[] args) {
        int masiv[] = new int[7];
        int a=1;
        for(int i=0;i<7;i++){
            masiv[i]=a;
            a+=2;
        }
        for(int i=0;i<9;i++){
            System.out.println(" "+ masiv[i]);
        }
    }
}