package sulik35;

import java.util.Scanner;

public class Main35 {
    public static void main(String[] args) {
        Scanner sulik = new Scanner(System.in);
        System.out.println("Введите цену: ");
        double price = sulik.nextInt();
        for (double weight = 0.1; weight <= 1; weight++)
        System.out.println(" килограмм конфет стоит " + (price * weight));
    }
}

