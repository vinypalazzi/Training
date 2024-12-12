package java;

import java.util.Scanner;

public class Salarios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n-----------------\nMedia de Salários\n-----------------\n");

        System.out.print("Digite o Seu primeiro salário: \nR$ ");
        String salarioTemp1 = scanner.nextLine().replace(",", ".");

        System.out.print("\nDigite o Seu segundo salário: \nR$ ");
        String salarioTemp2 = scanner.nextLine().replace(",", ".");

        System.out.print("\nDigite o Seu terceiro salário: \nR$ ");
        String salarioTemp3 = scanner.nextLine().replace(",", ".");

        double salario1 = Double.parseDouble(salarioTemp1);
        double salario2 = Double.parseDouble(salarioTemp2);
        double salario3 = Double.parseDouble(salarioTemp3);

        double mediaSalario = (salario1 + salario2 + salario3) / 3;

        System.out.printf("\nA Media entre seus salarios é igual á: R$%.2f\n", mediaSalario);

        scanner.close();

    }
}
