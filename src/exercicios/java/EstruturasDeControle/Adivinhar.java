package exercicios.java.EstruturasDeControle;

import java.util.Scanner;

public class Adivinhar {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num;

        //Cria um número aleatório de 0 a 1, é multiplicado por 100 e transformado em inteiro
        int random = (int) (Math.random() * 100);

        int tentativas = 10;

        int totalTentativas = 0;

        System.out.println("\nJogo da adivinhação\nRegras\n- Será escolhido um número de 1 a 100\n- Você terá 10 chances para descobrir\n- Cada nova jogada você irá saber se é mais ou menos que seu valor escolhido\n");

        /*
        Loop que mostra as tentativas
        pega um input do usuário
        acrescenta o total de tentativas
        verifica se está correto o input informado pelo usuário
        caso seja correto, ele mostra o número de tentativas feitas e o número sorteado
        diminui uma tentativa do usuário
        e caso nenhum número estiver correto ele mostra qual era o número
        */

        for (int i = 0; i <= 10; i++) {
            System.out.println("\nVocê ainda tem " + tentativas + " tentativas!");

            System.out.print("Escolha um número: \n- ");
            num = scanner.nextInt();

            totalTentativas++;

            if (num == random) {
                System.out.println("\n----------------------------\nVocê acertou!\nO número sorteado foi " + random + "\nVocê acertou em " + totalTentativas + " tentativas\n----------------------------\n");
                break;
            } else if (num > random) {
                System.out.println("\nO número sorteado é menor que " + num);
            } else {
                System.out.println("\nO número sorteado é maior que " + num);
            }

            tentativas--;


            if (tentativas == 0) {
                System.out.println("O número sorteado foi " + random);
                break;
            }
        }
        scanner.close();
    }


}
