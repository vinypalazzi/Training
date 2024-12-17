package exercicios.java.EstruturasDeControle;

import java.util.Scanner;

public class DiaUtil {
    public static void main(String[] args) {
        // Criando o objeto Scanner para capturar a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Exibindo um cabeçalho para organizar a saída do programa
        System.out.println("\n----------\nDias Úteis\n----------\n");

        int diaSemana; // Variável para armazenar o número do dia da semana

        // Loop infinito para garantir que o usuário insira um valor válido
        while (true) {
            // Exibindo o menu de dias da semana e solicitando a entrada do usuário
            System.out.print(
                    "Me diga um dia da semana\n1 - Domingo\n2 - Segunda-feira\n3 - Terça-feira\n4 - Quarta-feira\n5 - Quinta-feira\n6 - Sexta-feira\n7 - Sábado\n- "
            );

            // Lendo o número inserido pelo usuário
            diaSemana = scanner.nextInt();

            // Verificando se o número está no intervalo válido (1 a 7)
            if (diaSemana <= 7 && diaSemana > 0) {
                break; // Se válido, sai do loop
            } else {
                // Exibe uma mensagem de erro e repete o loop
                System.out.println("\nDigite um número válido!");
            }
        }

        // Estrutura switch para identificar o dia da semana e seu tipo (útil ou final de semana)
        switch (diaSemana) {
            case (1): // Domingo
                System.out.println("\n\nDomingo\nÉ um final de semana.");
                break;
            case (2): // Segunda-feira
                System.out.println("\n\nSegunda-feira\nÉ um dia útil.");
                break;
            case (3): // Terça-feira
                System.out.println("\n\nTerça-feira\nÉ um dia útil.");
                break;
            case (4): // Quarta-feira
                System.out.println("\n\nQuarta-feira\nÉ um dia útil.");
                break;
            case (5): // Quinta-feira
                System.out.println("\n\nQuinta-feira\nÉ um dia útil.");
                break;
            case (6): // Sexta-feira
                System.out.println("\n\nSexta-feira\nÉ um dia útil.");
                break;
            case (7): // Sábado
                System.out.println("\n\nSábado\nÉ um final de semana.");
                break;
        }

        // Fechando o objeto Scanner para liberar os recursos
        scanner.close();
    }
}
