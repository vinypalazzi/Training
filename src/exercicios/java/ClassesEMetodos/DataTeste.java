package exercicios.java.ClassesEMetodos;

// Classe para testar a classe Data
public class DataTeste {
    public static void main(String[] args) {
        // Cria um objeto da classe Data e inicializa seus atributos
        Data data1;
        data1 = new Data();

        // Cria outro objeto da classe Data e inicializa seus atributos
        Data data2;
        data2 = new Data(27, 2, 2008);

        // Exibe os anos dos dois objetos data no console
        System.out.println(data1.ano); // Exibe o ano de data1
        System.out.println(data2.ano); // Exibe o ano de data2
        System.out.println(data1.obterData()); // Exibe a data1 formatada
        System.out.println(data2.obterData()); // Exibe a data2 formatada
    }
}