package sulik36;

import java.util.Scanner;

public class Main36 {
    public static void main(String[] args) {
        Scanner sulik = new Scanner(System.in);
        System.out.println("Введите цену: ");
        double price = sulik.nextInt();
        for (double weight = 1.2; weight <=2; weight++)
            System.out.println(weight + " килограмм конфет стоит " + (price * weight));
    }
}
