package exercicios.estruturas;

import java.util.Scanner;

public class NumerosPrimos {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\n-----------------------------\nVerificador de números primos\n-----------------------------\n");

        System.out.print("Digite um número:\n- ");
        int num = scanner.nextInt();

        int cont = 0;

        for (int i = 2; i < num; i++) {

            int verificar = num % i;

            if (verificar == 0) {
                cont = 1;
                break;
            } else {
                cont = 2;
            }
        }
        if (cont == 1) {
            System.out.println("Esse número não é primo");
        } else {
            System.out.println("Esse número é primo");
        }
    }
}
