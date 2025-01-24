package exerciciosPraticos;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class numeroPositivoOuNegativo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;
        String resposta;

        do {
            System.out.println("Digite um número inteiro negativo ou positivo: ");
            numero = sc.nextInt();
            if (numero < 0) {
                System.out.println("O número é negativo!");
            } else {
                System.out.println("O número é postivo!");
            }
            System.out.print("Deseja parar? (s/n): ");
            resposta = sc.next(); // corrigido para leitura da resposta do usuário
        } while (!resposta.equalsIgnoreCase("s")); // corrigido para comparação correta

        sc.close();
    }
}
