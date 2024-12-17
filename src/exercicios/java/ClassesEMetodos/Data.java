package exercicios.java.ClassesEMetodos;

// Classe para representar uma data com dia, mês e ano
public class Data {
    int dia; // Atributo para armazenar o dia
    int mes; // Atributo para armazenar o mês
    int ano; // Atributo para armazenar o ano

    String obterData() {

        if (mes < 10) {
            String mesFormatado = String.format("0%d", mes);
            return String.format("%d/%s/%d", dia, mesFormatado, ano);
        } else {
            return String.format("%d/%d/%d", dia, mes, ano);
        }
    }
    Data(int diaTemp, int mesTemp, int anoTemp) {
        dia = diaTemp;
        mes = mesTemp;
        ano = anoTemp;
    }
    Data() {
        dia = 1;
        mes = 1;
        ano = 1970;
    }
}

