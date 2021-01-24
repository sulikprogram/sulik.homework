package sulik34;

import java.util.Scanner;

public class Main34 {
    public static void main(String[] args) {
        Scanner sulik = new Scanner(System.in);
        System.out.println("Введите цену: ");
        double price = sulik.nextInt();
        for (int weight = 1; weight <= 10; weight++)
            System.out.println(weight + " килограмм конфет стоит " + (price * weight));
    }
}
