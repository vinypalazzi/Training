package exercicios.java.fundamentos;

import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {

        //Cria o scanner:
        Scanner scanner = new Scanner(System.in);

        //Adiciona as variaveis usada apenas para desvio de fluxo:
        int cont = 0;

        int select = 0;

        System.out.println("\n------------------------\nConversor de temperatura\n------------------------\n");

        //Loop até o usuario escolher uma das opções:
        while (cont == 0) {

            System.out.print("Select: \n1 - ºC -> ºF\n2 - ºF -> ºC\n- ");
            select = scanner.nextInt();

            //Desvia o fluxo aumentando 1 no contador para poder quebrar o loop:
            if (select == 1 || select == 2) {
                cont += 1;
            }else {
                System.out.println("\nResposta invalida!\n");
            }
        }

        //Calcula e exibe o resultado dependendo da opção escolhida:
        if (select == 1) {
            System.out.print("\nQual a temperatura em ºC:\n- ");
            float graus = scanner.nextInt();

            float temperatura = (graus * 9 / 5) + 32;

            System.out.printf("\n %.0f ºC = %.2f ºF\n", graus, temperatura);

        } else {
            System.out.print("\nQual a temperatura em ºF:\n- ");
            float fahrenheit = scanner.nextInt();

            float temperatura = (fahrenheit - 32) * 5 / 9;

            System.out.printf("\n %.0f ºF = %.2f ºC\n", fahrenheit, temperatura);

        }
        scanner.close();
    }

    }
