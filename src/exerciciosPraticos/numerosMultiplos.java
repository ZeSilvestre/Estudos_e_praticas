package exerciciosPraticos;

import java.util.Scanner;

public class numerosMultiplos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b;
        String resultado;

        do {
            System.out.println("Digite um número: ");
            a = sc.nextInt();
            System.out.println("Digite outro número: ");
            b = sc.nextInt();
            if (a % b == 0 || b % a == 0) {
                System.out.println("São Múltiplos!");
            } else {
                System.out.println("Não são Múltiplos!");
            }
            System.out.println("Deseja continuar? (S/N)");
            resultado = sc.next();
        }while (!resultado.equalsIgnoreCase("N"));
        sc.close();
    }
}
