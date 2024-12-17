package exercicios.java.ClassesEMetodos;

public class ProdutosTeste {
    public static void main(String[] args) {
        // Criação de dois produtos com nomes e preços diferentes
        Produtos p1 = new Produtos("Notebook", 4000); // Produto 1
        Produtos p2 = new Produtos("Caderno", 20); // Produto 2

        // Alterando o desconto para 30% (0.3) para todos os produtos
        Produtos.alterarDesconto(0.3);

        // Exibindo o preço com desconto para cada produto
        System.out.println(p1.aplicarDesconto()); // Preço com desconto do Notebook
        System.out.println(p2.aplicarDesconto()); // Preço com desconto do Caderno

        // Alterando o desconto para 50% (0.5) para todos os produtos
        Produtos.alterarDesconto(0.5);

        // Exibindo novamente o preço com o novo desconto
        System.out.println(p1.aplicarDesconto()); // Preço atualizado com desconto do Notebook
        System.out.println(p2.aplicarDesconto()); // Preço atualizado com desconto do Caderno

        // Exibindo os detalhes completos de cada produto
        System.out.println(p1.mostrarDetalhes()); // Detalhes do Notebook
        System.out.println(p2.mostrarDetalhes()); // Detalhes do Caderno
    }
}
