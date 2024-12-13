package exercicios.estruturas;

import java.util.Scanner;

public class NumerosPrimos {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\n-----------------------------\nVerificador de números primos\n-----------------------------\n");

        //Pega um input do usuário
        System.out.print("Digite um número:\n- ");
        int num = scanner.nextInt();

        int cont = 0;

        /*
        Começa com 2 (Qualquer número é divisível por 1)
        verifico se o resto da divisão entre i e o número escolhido é igual a 0
        caso seja quer dizer que ele conseguiu dividir por outros números além de 1 e ele mesmo
        sendo assim não sendo um número primo
        caso isso aconteça ele já para o programa

        caso não aconteça ele mostra que o número escolhido é primo

        faço isso através de um contador fora do bloco 'for'
        que se transforma em 2 caso não consiga dividir por nenhum número
        e se transforma em 1 e encerra o programa caso consiga dividir
        */
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
