package main;

//Para realizar a auto-edentação do código no IntelliJ IDEA, você pode usar um atalho de teclado. Aqui está como fazer: CTRL+ALT+L

import domain.string;

import java.util.Locale;
import java.util.Scanner; // Este import é necessário para o código "Scanner sc" funcionar

public class entradaDeDadosEmJava {
    public static void main(String[] args) {
        // Locale.setDefault(Locale.US); // UTILIZAR ESTE PARA ALTERAR O LOCAL PARA ESTADOS UNIDOS E PASSAR A LER COM PONTO EM VEZ DA VÍRGULA.
        Scanner sc = new Scanner(System.in); // Este comando é necessário para introduzir variáveis, que irão receber dados, aos projetos em Java.
        // O "sc" é o nome da variável.

        String x, s1, s2, s3;
        int y;
        double z;
        char a;

        //Exemplo 01: Variável simples para texto.
        System.out.println("EXEMPLO 01");
        System.out.println("Digite um nome: ");
        x = sc.next();
        System.out.println("Você digitou: " + x);
        System.out.println(" ");

        //Exemplo 02: Variável de número inteiro.
        System.out.println("EXEMPLO 02");
        System.out.println("Digite um número: ");
        y = sc.nextInt();// Observe que o código para leitura do dado inserido agora muda para nextInt(), pois trata-se de um número inteiro.
        System.out.println("Você digitou: " + y);
        System.out.println(" ");

        //Exemplo 03: Variável do tipo double.
        System.out.println("EXEMPLO 03");
        System.out.println("Digite um número com vírgula: ");
        z = sc.nextDouble();// Observe que o código para leitura do dado inserido agora muda para nextInt(), pois trata-se de um número inteiro.
        System.out.println("Você digitou: " + z);
        System.out.println(" ");

        //Exemplo 04: Variável do tipo caractere (Char).
        System.out.println("EXEMPLO 04");
        System.out.println("Digite uma palavra: ");
        a = sc.next().charAt(0);// Observe que o código para leitura do dado inserido agora muda para next().charAt(x), onde o x é o caractere que queremos que o programa leia.
        System.out.println("A primeira letra da palavra digitada é: " + a);
        System.out.println(" ");

        //Exemplo 05: Várias palavras ou vários valores.
        System.out.println("EXEMPLO 05");
        System.out.println("Escreva três frases completas: ");
        sc.nextLine(); // Necessário para consumir o resto do input e ler corretamente a sequência.
        s1 = sc.nextLine();// Observe que o código para leitura do dado inserido agora muda para nextLine(), pois este realiza a leitura da linha inteira.
        s2 = sc.nextLine();
        s3 = sc.nextLine();
        System.out.println("Você digitou: ");
        System.out.println(" ");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        System.out.println(" ");

        sc.close();// Utilizado quando não for mais utilizar o SCANNER.
    }
}
