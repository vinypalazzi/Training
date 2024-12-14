package exercicios.java.fundamentos;

import java.util.Scanner;

public class NumerosIguais {
    public static void main(String[] args) {

        //Adicionando o scanner:
        Scanner scanner = new Scanner(System.in);

        //Entrada de números:
        System.out.print("\nMe diga o primeiro número: \n- ");
        int num1 = scanner.nextInt();

        System.out.print("\nMe diga o segundo número: \n- ");
        int num2 = scanner.nextInt();

        System.out.print("\nMe diga o terceiro número: \n- ");
        int num3 = scanner.nextInt();

        //Verificando igualdade:
        if (num1 == num2 || num2 == num3 || num3 == num1) {
            if (num1 == num2 && num2 == num3) {
                System.out.println("\nTodos os números são iguais");
            } else {
                System.out.println("\nDois números são iguais");
            }
        } else {
            System.out.println("\nTodos os números são diferentes");
        }

        //Verificando soma:
        if (num1 + num2 + num3 > 100) {
            System.out.println("A soma dos três números é maior que 100");
        }

        scanner.close();

    }
}
