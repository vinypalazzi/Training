package exercicios.java.estruturas;

import java.util.Scanner;

public class JogoSoma {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nJogo da soma!\nRegras\n- Digite números inteiros que eles irão se somar\n- Para parar digite algum número negativo\n");

        double num = 0;

        double numTemp = 0;

        int cont = 0;

        while (numTemp >= 0) {

            System.out.print("Digite um número: \n- ");
            numTemp = scanner.nextDouble();

            if (numTemp > 0) {
                num += numTemp;
                cont += 1;
            }


            if (numTemp < 0 && cont > 1) {
                System.out.println(
                        "\n------------------------------------------------\n" +
                        "O total entre os " + cont + " número(s) digitados foi " + num +
                        "\n------------------------------------------------");
                break;
            } else if (cont >= 2) {
                System.out.println("\nA soma entre os " + cont + " número(s) digitados é igual á " + num + "\n");
            }
        }
        scanner.close();
    }
}
