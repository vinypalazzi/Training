package exercicios.java.classes;

public class Produtos {
    // Atributos da classe
    String produto; // Nome do produto
    double preco; // Preço do produto
    static double desconto = 0.25; // Desconto padrão (25%), compartilhado entre todas as instâncias

    // Construtor que inicializa os atributos de instância
    Produtos(String NomeProduto, double PrecoProduto) {
        produto = NomeProduto; // Define o nome do produto
        preco = PrecoProduto; // Define o preço do produto
    }

    // Metodo estático para alterar o valor do desconto (válido para todos os produtos)
    static void alterarDesconto(double novoDesconto) {
        desconto = novoDesconto; // Atualiza o desconto para todos os produtos
    }

    // Metodo para mostrar os detalhes do produto, incluindo o preço com desconto
    String mostrarDetalhes() {
        return String.format(
                "Produto: %s\nPreço: $%.2f\nDesconto Atual: %.2f%%\nPreço com Desconto: $%.2f",
                produto, // Nome do produto
                preco, // Preço original
                desconto * 100, // Desconto convertido para porcentagem
                preco * (1 - desconto) // Preço com desconto aplicado
        );
    }

    // Metodo para calcular e retornar o preço do produto com o desconto aplicado
    double aplicarDesconto() {
        return preco * (1 - desconto); // Preço original reduzido pelo desconto
    }
}
