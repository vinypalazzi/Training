package exercicios.java.estruturas;

import java.util.Scanner;

public class JogoSoma {
    public static void main(String[] args) {

        // Criando o objeto Scanner para capturar a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Exibindo as regras do jogo
        System.out.println("\nJogo da soma!\nRegras\n- Digite números inteiros que eles irão se somar\n- Para parar digite algum número negativo\n");

        double num = 0;       // Variável que acumula a soma dos números
        double numTemp = 0;   // Variável temporária para armazenar o número atual digitado pelo usuário
        int cont = 0;         // Contador para registrar quantos números positivos foram digitados

        // Loop para capturar números enquanto o usuário não digitar um número negativo
        while (numTemp >= 0) {

            // Solicita ao usuário que digite um número
            System.out.print("Digite um número: \n- ");
            numTemp = scanner.nextDouble();

            // Se o número for positivo, adiciona à soma e incrementa o contador
            if (numTemp > 0) {
                num += numTemp;
                cont += 1;
            }

            // Verifica se o usuário digitou um número negativo e já inseriu pelo menos dois números positivos
            if (numTemp < 0 && cont > 1) {
                // Exibe o total final da soma e o número de entradas válidas
                System.out.println(
                        "\n------------------------------------------------\n" +
                                "O total entre os " + cont + " número(s) digitados foi " + num +
                                "\n------------------------------------------------");
                break; // Encerra o loop
            }
            // Exibe a soma parcial se pelo menos dois números positivos já foram inseridos
            else if (cont >= 2) {
                System.out.println("\nA soma entre os " + cont + " número(s) digitados é igual á " + num + "\n");
            }
        }

        // Fecha o Scanner para liberar recursos
        scanner.close();
    }
}
