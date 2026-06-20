package exerciciosPraticos;

import java.util.Scanner;

public class somaAteNegativo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int soma = 0;

     while (true) {
        System.out.println("Digite um número: ");
        int numero = sc.nextInt();
        if (numero < 0) {
            break;
        }
        soma += numero;
     }
     System.out.println("A soma dos números é: " + soma);
     sc.close();
    }
}
