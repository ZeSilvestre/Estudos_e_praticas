package exerciciosPraticos;

import java.util.Scanner;

public class numeroParOuImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double numero;
        String resposta;

        do {
            System.out.println("Digite um número: ");
            numero = sc.nextDouble();
            if (numero % 2 == 0) {
                System.out.println("O número é par");
            }else {
                System.out.println("O número é impar");
            }
            System.out.println("Deseja continuar? (s/n)");
            resposta = sc.next();
        }while (!resposta.equalsIgnoreCase("n"));
        sc.close();
    }
}
