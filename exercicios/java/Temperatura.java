package java;

import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int cont = 0;

        int select = 0;

        System.out.println("\n------------------------\nConversor de temperatura\n------------------------\n");

        while (cont == 0) {

            System.out.print("Select: \n1 - ºC -> ºF\n2 - ºF -> ºC\n- ");
            select = scanner.nextInt();

            if (select == 1 || select == 2) {
                cont += 1;
            }else {
                System.out.println("\nResposta invalida!\n");
            }
        }

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
