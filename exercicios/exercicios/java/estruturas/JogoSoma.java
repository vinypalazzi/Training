package exercicios.java.estruturas;

import java.util.Scanner;

public class JogoSoma {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nJogo da soma!\nRegras\n- Digite números inteiros que eles irão se somar\n- Para parar digite algum número negativo\n");

        double num = 0;

        double numTemp;

        int cont = 0;

        while (num >= 0) {

            System.out.print("Digite um número: \n- ");
            numTemp = scanner.nextDouble();

            num += numTemp;

            cont += 1;

            if (numTemp < 0) {
                System.out.println("\nO total entre os " + cont + " número(s) digitados foi " + num + "\n");
                break;
            } else if (cont > 1) {
                System.out.println("\nA soma entre os " + cont + " número(s) digitados é igual á " + num + "\n");
            }
        }
        scanner.close();
    }
}
