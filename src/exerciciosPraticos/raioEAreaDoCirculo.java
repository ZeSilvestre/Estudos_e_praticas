package exerciciosPraticos;

import java.util.Scanner;

public class raioEAreaDoCirculo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double raio, area;

        System.out.println("Digite o raio do círculo: ");
        raio = sc.nextDouble();
        area = Math.PI * Math.pow(raio, 2);
        System.out.printf("O círculo de raio %.2f metros, tem área %.4f metros² %n", raio, area);

        sc.close();


    }
}
