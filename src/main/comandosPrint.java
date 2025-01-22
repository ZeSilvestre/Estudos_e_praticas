package main;

public class comandosPrint {
    public static void main(String[] args) {

        // Declaração de variáveis:
        double x = 100.99999;
        int tempo = 4;
        double renda = 15000.0000;
        String nome = "Ciências da Computação";

        // Corpo do projeto, código geral:
                System.out.println("Olá mundo,");
        System.out.println("Estamos começando a vida de DEV!");
        System.out.println("bora com mais de " + x + "%");
        System.out.printf("Ou como se diz, quando se quer um pra cima: %.2f%n", x);
        System.out.printf("Ou como se diz, quando se quatro casas decimais: %.4f%n", x);
        // Atenção, para determinar quantas casas decimais sera apresentado, utilizando uma variável do tipo double, utilizasse o comando: "%.xf%n%", onde o x é o número de casas que quer que apareça.
        System.out.printf("O curso %s, tem duração de %d anos e o salário inicial de R$ %.2f reais%n",nome,tempo,renda);
        // Para escrever diversas varáveis de uma vez só, utilizando o comando printf, basta ir adicionar os %x de acordo com o tipo de variável, depois adicionar as varáveis relacionadas de acordo com a ordem que irão aparecer:
        // Tabela de Variáveis: %f -> ponte flutuante ;  %d -> Inteiro ; %s -> texto ; %n -> quebra de linha.

    }
}