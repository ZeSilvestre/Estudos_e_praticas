package main;

//Processamento de dados entende-se através do comando de atribuição que possue a seguinte sintaxe: <variável> = <expressão>

public class processamentoDeDados {
    public static void main(String[] args) {

        int x;
        int y;
        int area;
        double z;

        x= 15;
        y= x/5; // Aqui temos um exemplo de atribuição.
        area= x*y;
        z = (int) area; // Neste caso, como a variável z está em double e a variável area que ele recebe o valor está em int, é necessário
        // fazer um casting atribuindo entre parenteses a nova variável (nova variável)


        System.out.println("Exemplo 1");
        System.out.println("Os valores de x e y são, respectivamente: "+ x + " e " + y+ ".");
        System.out.println("Exemplo 2");
        System.out.println("imagine agora um retângulo com a base e a altura respectivamente os valores de x e y, que são: "+ x + " e " + y + ".");
        System.out.println("Utilizando-se de ``Área = bxh``, teriamos :"+ area + " metros².");
        System.out.print("Logo: "+ z + " metros².");
    }
}
