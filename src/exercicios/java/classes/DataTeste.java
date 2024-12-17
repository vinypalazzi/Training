package exercicios.java.classes;

// Classe para testar a classe Data
public class DataTeste {
    public static void main(String[] args) {
        // Cria um objeto da classe Data e inicializa seus atributos
        Data data1;
        data1 = new Data();
        data1.ano = 2024; // Define o ano de data1
        data1.mes = 12;   // Define o mês de data1
        data1.dia = 16;   // Define o dia de data1

        // Cria outro objeto da classe Data e inicializa seus atributos
        Data data2;
        data2 = new Data();
        data2.ano = 2008; // Define o ano de data2
        data2.mes = 2;    // Define o mês de data2
        data2.dia = 27;   // Define o dia de data2

        // Exibe os anos dos dois objetos data no console
        System.out.println(data1.ano); // Exibe o ano de data1
        System.out.println(data2.ano); // Exibe o ano de data2
        System.out.println(data1.obterData()); // Exibe a data1 formatada
        System.out.println(data2.obterData()); // Exibe a data2 formatada
    }
}