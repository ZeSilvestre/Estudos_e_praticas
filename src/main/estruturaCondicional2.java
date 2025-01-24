package main;

import java.util.Scanner;

public class estruturaCondicional2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x;

        System.out.println("Digite a hora do dia: ");
        x = sc.nextInt();
        if (x > 12) {
            System.out.println("Boa tarde!");
        } else {
            System.out.println("Bom dia!");
        }

        sc.close();
    }
}
