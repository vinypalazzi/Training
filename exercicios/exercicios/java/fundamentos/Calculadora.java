package exercicios.java.fundamentos;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n-----------\nCalculadora\n-----------\n");

        int select = 0;

        double resultado;

        int cont = 0;

        while (select == 0) {
            System.out.print("Escolha a operação:\n1 - Adição\n2 - Subtração\n3 - Multiplicação\n4 - Divisão\n- ");
            select = scanner.nextInt();

            if (select > 4 || select == 0) {
                System.out.println("\n------------------\nResposta invalida!\n------------------\n");
                select = 0;
            }
        }

        while (cont == 0) {
            System.out.print("\nMe diga o primeiro número:\n- ");
            double num1 = scanner.nextDouble();

            System.out.print("Me diga o segundo número:\n- ");
            double num2 = scanner.nextDouble();

            if (select == 1) {
                resultado = num1 + num2;

                System.out.printf("\nO resultado é igual a: %.2f", resultado);
                cont = 1;
            }
            if (select == 2) {
                resultado = num1 - num2;

                System.out.printf("\nO resultado é igual a: %.2f", resultado);
                cont = 1;
            }
            if (select == 3) {
                resultado = num1 * num2;

                System.out.printf("\nO resultado é igual a: %.2f", resultado);
                cont = 1;
            }
            if (select == 4) {
                resultado = num1 / num2;
                if (num2 == 0) {
                    System.out.println("\n----------------------------\nNão é possivel dividir por 0\n----------------------------");
                } else {
                    System.out.printf("\n O resultado é igual a: %.2f", resultado);

                    cont = 1;
                }
            }
        }
        scanner.close();
    }
}
