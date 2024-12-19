package exercicios.java.ClassesEMetodos;

public class Pessoa {

    String name;
    double pesoKg;

    Pessoa(String name, double pesoKg) {
        this.name = name;
        this.pesoKg = pesoKg;
    }

    void comer(PessoaComida comida) {
        pesoKg += comida.pesoComidaKg;
    }
}
