package main;

import java.util.Scanner;

//Encadeamento de estruturas condicionais.
public class estruturaCondicional3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x;

        System.out.println("Digite a hora do dia: ");
        x = sc.nextInt();
        if (x<12) {
            System.out.println("Bom dia!");
        }
        else {
            if (x>=12 && x<18) {
                System.out.println("Boa tarde!");
            }
            else {
                System.out.println("Boa noite!");
            }
        }
        sc.close();
    }
}
