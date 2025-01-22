package java;

public class exerciciosECalculos {
    public static void main(String[] args) {
        {
            java.util.Scanner scanner = new java.util.Scanner(System.in);

            System.out.println("Bem-vindo à Calculadora!");
            System.out.println("Digite o primeiro número:");
            double num1 = scanner.nextDouble();

            System.out.println("Digite o operador (+, -, *, /):");
            char operador = scanner.next().charAt(0);

            System.out.println("Digite o segundo número:");
            double num2 = scanner.nextDouble();

            double resultado;

            switch (operador) {
                case '+':
                    resultado = num1 + num2;
                    break;
                case '-':
                    resultado = num1 - num2;
                    break;
                case '*':
                    resultado = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0) {
                        resultado = num1 / num2;
                    } else {
                        System.out.println("Erro! Divisão por zero.");
                        return;
                    }
                    break;
                default:
                    System.out.println("Operador inválido!");
                    return;
            }

            System.out.println("O resultado é: " + resultado);
            scanner.close();
        }  // Certifique-se de fechar esta chave
    }
}