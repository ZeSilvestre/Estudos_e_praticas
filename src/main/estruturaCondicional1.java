package main;

import java.util.Scanner;

public class estruturaCondicional1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x;

        System.out.println("Digite a hora do dia: ");
        x = sc.nextInt();
        if (x >= 00 && x < 12) {
            System.out.println("Bom dia!");
        }
        if (x >= 12 && x < 18) {
            System.out.println("Boa tarde!");
        }
        if (x >= 18 && x < 00) {
            System.out.println("Boa noite!");
        }
        sc.close();
    }
}
