package exercicios.java.classes;

// Classe para representar uma data com dia, mês e ano
public class Data {
    int dia; // Atributo para armazenar o dia
    int mes; // Atributo para armazenar o mês
    int ano; // Atributo para armazenar o ano

    String obterData () {

        if (mes < 10) {
            String mesFormatado = String.format("0%d", mes);
            return String.format("%d/%s/%d", dia, mesFormatado, ano);
        } else {
            return String.format("%d/%d/%d", dia, mes, ano);
        }


    }
}