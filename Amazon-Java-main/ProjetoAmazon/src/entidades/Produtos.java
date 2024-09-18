// package entidades;

// import java.util.ArrayList;
// import java.util.List;

// public class Produtos {
//      //atributos
//      public String produto;
//      public String descricaoproduto;
//      public String preco;
//      public String quantidade;
//      List<List<String>> matriz = new ArrayList<>();

//      //construtor
//      public Produtos(String produto, String descricaoproduto, String preco, String quantidade) {
//           this.produto = produto;
//           this.descricaoproduto = descricaoproduto;
//           this.preco = preco;
//           this.quantidade = quantidade;
//      }


//      //metodos get e set
//      public String getProduto() {
//           return produto;
//      }


//      public void setProduto(String produto) {
//           this.produto = produto;
//      }


//      public String getDescricaoproduto() {
//           return descricaoproduto;
//      }


//      public void setDescricaoproduto(String descricaoproduto) {
//           this.descricaoproduto = descricaoproduto;
//      }


//      public String getPreco() {
//           return preco;
//      }


//      public void setPreco(String preco) {
//           this.preco = preco;
//      }


//      public String getQuantidade() {
//           return quantidade;
//      }


//      public void setQuantidade(String quantidade) {
//           this.quantidade = quantidade;
//      }

//      //métodos
//      //Mostrar produtos
//      public void mostrar() {
//           for(int i = 0; i < matriz.size(); i++) {
//                List<String> row = matriz.get(i);
//                for(int j = 0; j < row.size(); j++) {
//                     System.out.print(row.get(j) + "\t");
//                }
//                System.out.println();
//           }
//      }

//      //adicionar produtos
//      public void adicionar(int contador) { 
//           if(matriz.size() <= 4) {
//                for (int i = 0; i < 4; i++) {
//                     if (matriz.size() <= i) {
//                          matriz.add(new ArrayList<>());  // Cria uma nova linha se ela não existir
//                     }
//                }    
//           }
//           for (int i = 0; i < 4; i++) {
//                List<String> linha = matriz.get(i);  // Obter a linha atual
       
//                // Garante que a linha tem espaço suficiente para a coluna desejada
//                while (linha.size() <= contador) {
//                    linha.add("");  // Preenche com strings vazias se a linha for curta
//                }
       
//                if (i == 0) {
//                     linha.set(contador, produto);   // Adiciona o produto na coluna especificada da linha 0
//                } else if (i == 1) {
//                     linha.set(contador, descricaoproduto);  // Adiciona a descrição na coluna especificada da linha 1
//                } else if (i == 2) {
//                     linha.set(contador, preco);  // Adiciona o preço na coluna especificada da linha 2
//                } else if (i == 3) {
//                     linha.set(contador, quantidade);  // Adiciona a quantidade na coluna especificada da linha 3
//                }
//           }
//           System.out.println("Produto adicionado!\n");
//      }

//      //Excluir Conta
//      public void excluir(String produto) {
//           for (int i = 0; i < 4; i++) {
//                List<String> row = matriz.get(i);
//                for (int j = 0; j < row.size(); j++) {
//                    if (row.get(j).equals(produto)) {
//                        row.remove(j);
//                        j--;
//                    }
//                }
//           }
//           System.out.println("Produto excluído!");
//      }

// }

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

        matriz.add(novoProduto);  // Adiciona a linha inteira na matriz
        System.out.println("Produto adicionado!\n");
    }

    // Método para excluir produtos
    public void excluir(String produto) {
        boolean produtoEncontrado = false;

        for (int i = 0; i < matriz.size(); i++) {
            List<String> row = matriz.get(i);
            if (row.get(0).equals(produto)) {  // Verifica o nome do produto na primeira coluna
                matriz.remove(i);  // Remove o produto da matriz
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
