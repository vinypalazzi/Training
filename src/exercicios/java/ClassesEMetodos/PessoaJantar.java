package exercicios.java.ClassesEMetodos;

public class PessoaJantar {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Vinícius", 70);

        PessoaComida c1 = new PessoaComida("Chocolate", 0.2);
        PessoaComida c2 = new PessoaComida("Feijão", 0.5);

        System.out.printf("O peso atual de %s é de %.2fKg\n", p1.name, p1.pesoKg);

        p1.comer(c1);

        System.out.printf("O peso atual de %s é de %.2fKg\n", p1.name, p1.pesoKg);

        p1.comer(c2);

        System.out.printf("O peso atual de %s é de %.2fKg\n", p1.name, p1.pesoKg);
    }
}
