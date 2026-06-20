package main;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class tratamentoDeExcecao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== TRATAMENTO DE EXCEÇÕES ===");
        System.out.println("1 - RuntimeException (divisão por zero)");
        System.out.println("2 - Exception checked (FileNotFoundException)");
        System.out.println("3 - OutOfMemoryError (Error, não Exception)");
        System.out.println("4 - Throwable (captura qualquer erro/exceção)");
        System.out.println("Escolha uma opção: ");
        int opcao = sc.nextInt();
        sc.nextLine(); // consome o Enter após o número
        switch (opcao) {
            case 1 -> testarRuntimeException(sc);
            case 2 -> testarFileNotFoundException(sc);
            case 3 -> testarOutOfMemoryError(sc);
            case 4 -> testarThrowable(sc);
            default -> System.out.println("Opção inválida.");
        }
        sc.close();
    }
    // -------------------------------------------------------------------------
    // 1) RuntimeException — exceção UNCHECKED (erro de programação / entrada inválida)
    // Herda de Exception, mas NÃO precisa declarar throws nem try/catch obrigatoriamente.
    // Exemplos: ArithmeticException, NumberFormatException, NullPointerException
    // -------------------------------------------------------------------------
    private static void testarRuntimeException(Scanner sc) {
        System.out.println("Digite o numerador (inteiro): ");
        int a = sc.nextInt();
        System.out.println("Digite o denominador (inteiro): ");
        int b = sc.nextInt();
        try {
            int resultado = a / b; // se b == 0 → ArithmeticException (RuntimeException)
            System.out.println("Resultado: " + resultado);
        } catch (RuntimeException e) {
            // RuntimeException é filha de Exception, mas representa erros em tempo de execução
            System.out.println("RuntimeException capturada: " + e.getMessage());
            System.out.println("Tipo: " + e.getClass().getSimpleName());
        }
    }
    // -------------------------------------------------------------------------
    // 2) Exception checked — FileNotFoundException
    // Herda de IOException → Exception → Throwable
    // É CHECKED: o compilador OBRIGA try/catch ou throws na assinatura do método.
    // -------------------------------------------------------------------------
    private static void testarFileNotFoundException(Scanner sc) {
        System.out.println("Digite o caminho de um arquivo (ex: C:\\temp\\teste.txt): ");
        String caminho = sc.nextLine();
        try {
            // File.exists() não lança exceção; usamos Scanner no arquivo para forçar FileNotFoundException
            Scanner leitorArquivo = new Scanner(new File(caminho));
            System.out.println("Arquivo encontrado! Conteúdo:");
            while (leitorArquivo.hasNextLine()) {
                System.out.println(leitorArquivo.nextLine());
            }
            leitorArquivo.close();
        } catch (FileNotFoundException e) {
            // FileNotFoundException é Exception (checked), NÃO é RuntimeException
            System.out.println("FileNotFoundException capturada!");
            System.out.println("Mensagem: " + e.getMessage());
            System.out.println("Tipo: " + e.getClass().getSimpleName());
        }
    }
    // -------------------------------------------------------------------------
    // 3) OutOfMemoryError — pertence a ERROR, não a Exception
    // Error indica problemas graves da JVM (memória, stack overflow, etc.)
    // Em produção quase nunca se captura Error; aqui é só para estudo.
    // -------------------------------------------------------------------------
    private static void testarOutOfMemoryError(Scanner sc) {
        System.out.println("Digite um tamanho GRANDE para alocar array (ex: 999999999): ");
        int tamanho = sc.nextInt();
        try {
            int[] arrayGigante = new int[tamanho]; // pode lançar OutOfMemoryError ou NegativeArraySizeException
            System.out.println("Array alocado com " + arrayGigante.length + " posições.");
        } catch (OutOfMemoryError e) {
            // OutOfMemoryError extends Error → Throwable (NÃO extends Exception!)
            System.out.println("OutOfMemoryError capturado!");
            System.out.println("Mensagem: " + e.getMessage());
            System.out.println("Tipo: " + e.getClass().getSimpleName());
            System.out.println("Obs: isso é um ERROR, não uma Exception.");
        } catch (RuntimeException e) {
            // NegativeArraySizeException também pode ocorrer se o tamanho for negativo
            System.out.println("RuntimeException: " + e.getMessage());
        }
    }
    // -------------------------------------------------------------------------
    // 4) Throwable — classe RAIZ de tudo (Error + Exception)
    // Capturar Throwable pega qualquer coisa, mas é muito genérico para uso comum.
    // -------------------------------------------------------------------------
    private static void testarThrowable(Scanner sc) {
        System.out.println("Digite um número ou texto inválido para gerar erro: ");
        String entrada = sc.nextLine();
        try {
            int numero = Integer.parseInt(entrada); // texto → NumberFormatException (RuntimeException)
            int resultado = 10 / numero;            // zero → ArithmeticException (RuntimeException)
            System.out.println("10 / " + numero + " = " + resultado);
        } catch (Throwable t) {
            // Throwable captura Exception E Error (e qualquer subclasse)
            System.out.println("Throwable capturado!");
            System.out.println("Tipo: " + t.getClass().getSimpleName());
            System.out.println("Mensagem: " + t.getMessage());
            System.out.println("É Exception? " + (t instanceof Exception));
            System.out.println("É Error? " + (t instanceof Error));
            System.out.println("É RuntimeException? " + (t instanceof RuntimeException));
        }
    }
}