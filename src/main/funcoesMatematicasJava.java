package main;

import java.util.Scanner;

public class funcoesMatematicasJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x;
        double y;


        System.out.println("Digite dois números: ");
        x = sc.nextDouble();
        y = sc.nextDouble();

        double sqrtx = Math.sqrt(x); //Utilizado para calcular Raiz quadrada.
        double sqrty = Math.sqrt(y);
        double powxy = Math.pow(x, y); //Utilizado para Potenciação.
        double powyx = Math.pow(y, x);
        double absx = Math.abs(x); // Utilizado para encontrar o valor absoluto, tirando o sinal negativo, caso exista.
        double absy = Math.abs(y);

        System.out.printf("A raiz quadrada do primeiro e segundo números são, respectivamente: %.2f e %.2f ;%n",sqrtx,sqrty);
        System.out.printf("O primeiro número elevado ao segundo vale: %.2f ;%n", powxy);
        System.out.printf("O segundo número elevado ao primeiro vale: %.2f ;%n", powyx);
        System.out.printf("O valor absoluto dos dois números digitados é: %.2f e %.2f .%n", absx,absy);
        System.out.println(" ");

        sc.close();


    }
}
