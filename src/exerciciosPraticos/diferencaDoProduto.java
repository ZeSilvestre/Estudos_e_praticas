package exerciciosPraticos;

import java.util.Scanner;

public class diferencaDoProduto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a,b,c,d,produto;

        System.out.println("Digite quatro números para ser realizado o cálculo: ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        d = sc.nextDouble();

        produto = (a*b)-(c*d);

        System.out.printf("O produto de %.2f por %.2f menos o produto de %.2f por %.2f é : %.2f",a,b,c,d,produto);
    }
}
