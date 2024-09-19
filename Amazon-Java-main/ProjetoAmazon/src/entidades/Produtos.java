package entidades;

import java.util.ArrayList;
import java.util.List;

public class Produtos {
    // Atributos
    public String produto;
    public String descricaoproduto;
    public String preco;
    public String quantidade;
    List<List<String>> matriz = new ArrayList<>();

    // Construtor
    public Produtos(String produto, String descricaoproduto, String preco, String quantidade) {
        this.produto = produto;
        this.descricaoproduto = descricaoproduto;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    // Métodos Get e Set
    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public String getDescricaoproduto() {
        return descricaoproduto;
    }

    public void setDescricaoproduto(String descricaoproduto) {
        this.descricaoproduto = descricaoproduto;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    // Método melhorado para mostrar os produtos
    public void mostrar() {
        if (matriz.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
            return;
        }

        // Cabeçalhos da tabela
        System.out.println("Produto\tDescrição\tPreço\tQuantidade");
        System.out.println("-------------------------------------------");

        // Percorre a matriz e exibe os produtos
        for (List<String> produto : matriz) {
            // Exibe as informações do produto formatadas com tabulação
            System.out.printf("%s\t%s\t%s\t%s\n", produto.get(0), produto.get(1), produto.get(2), produto.get(3));
        }
    }

    // Método para adicionar produtos
    public void adicionar() {
        List<String> novoProduto = new ArrayList<>();
        novoProduto.add(produto);
        novoProduto.add(descricaoproduto);
        novoProduto.add(preco);
        novoProduto.add(quantidade);

        matriz.add(novoProduto);  
        System.out.println("Produto adicionado!\n");
    }

    // Método para excluir produtos
    public void excluir(String produto) {
        boolean produtoEncontrado = false;

        for (int i = 0; i < matriz.size(); i++) {
            List<String> row = matriz.get(i);
            if (row.get(0).equals(produto)) {  
                matriz.remove(i); 
                System.out.println("Produto excluído: " + produto);
                produtoEncontrado = true;
                break;
            }
        }

        if (!produtoEncontrado) {
            System.out.println("Produto não encontrado: " + produto);
        }
    }
}
