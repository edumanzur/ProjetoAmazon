package aplicação;

import java.util.Scanner;

import entidades.Conta;
import entidades.Produtos;

public class ProgramaAmazon {
     public static void main(String[] args) {
    	 
          Conta MinhaConta = new Conta(null, null, null);
          Produtos MeusProdutos = new Produtos(null, null, null, null);
          Scanner sc = new Scanner (System.in);
          int indexMenu = 0;
		  int contadorConta = 0;
		  int contadorProduto = 0;

          while(indexMenu != 8) {

			//Menu
		      System.out.println("Menu");
	          System.out.println();
	          System.out.println("1. Criar conta");
	          System.out.println("2. Excluir conta");
	          System.out.println("3. Alterar Email e Senha");
	          System.out.println("4. Mostrar clientes");
	          System.out.println("5. Mostrar produtos");
	          System.out.println("6. Adicionar produto");
	          System.out.println("7. Excluir produto");
	          System.out.println("8. Finalizar Atendimento");
	          System.out.println();
	          System.out.println("Digite um número para o menu: ");
	          indexMenu = sc.nextInt();
			  if (sc.hasNextLine()) {
				sc.nextLine();  // Consumir o '\n' que ficou no buffer
			  }
	          
	          //Casos
	          switch (indexMenu) {
	               case 1:
	                    System.out.println("Nome de usuário: ");
	                    MinhaConta.setUsername(sc.nextLine());
	                    //System.out.println();
	                    System.out.println("Email: ");
	                    MinhaConta.setEmail(sc.nextLine());
	                    //System.out.println();
	                    System.out.println("Senha: "); 
	                    MinhaConta.setSenha(sc.nextLine());
						MinhaConta.adicionar();
						contadorConta++;
	                    break;
	               
	               case 2:
				   		if (contadorConta == 0) {
							System.out.println("Contas insuficientes.");
							break;
						}
	                    System.out.println("Digite o nome de usuário para excluir a conta: ");
	                    String usuario = sc.nextLine();
	                    System.out.println();
	                    MinhaConta.excluir(usuario);
						contadorConta--;
						
	                    break;

	               case 3:
	                    System.out.println("Digite o nome de usuário para alterar as informações: ");
	                    String usuario_alterar = sc.nextLine();
	                    System.out.println();
	                    System.out.println("Digite o novo email: ");
	                    String novo_email = sc.nextLine();
	                    System.out.println();
	                    System.out.println("Digite a nova senha: ");
	                    String nova_senha = sc.nextLine();
	                    System.out.println();
						MinhaConta.alterar(usuario_alterar, novo_email, nova_senha);
	                    break;

	               case 4:
						if (contadorConta == 0) {
							System.out.println("Contas insuficientes. \n");
							break;
						}
						MinhaConta.mostrar();
	                    break;

	               case 5:
						if (contadorProduto == 0) {
							System.out.println("Produtos insuficientes. \n");
							break;
						}
						MeusProdutos.mostrar();
	                    break;
	               
	               case 6: 
						System.out.println("Nome do produto: ");
	                    MeusProdutos.setProduto(sc.nextLine());
	                    //System.out.println();
	                    System.out.println("Descrição: ");
	                    MeusProdutos.setDescricaoproduto(sc.nextLine());
	                    //System.out.println();
	                    System.out.println("Preço: "); 
	                    MeusProdutos.setPreco(sc.nextLine());
						//System.out.println();
						System.out.println("Quantidade: "); 
	                    MeusProdutos.setQuantidade(sc.nextLine());
						MeusProdutos.adicionar();
						contadorProduto++;
	                    break;

	               case 7:
						if (contadorProduto == 0) {
							System.out.println("Produtos insuficientes.");
							break;
						}
	                    System.out.println("Digite o nome do produto para excluir: ");
	                    String produto = sc.nextLine();
	                    System.out.println();
	                    MeusProdutos.excluir(produto);
						contadorProduto--;
	                    break;
	               
	               case 8: 
	                    System.out.println("Atendimento Finalizado! ");
	                    break;

	               default:
	                    System.out.println("Opção inválida.");
	                    break;
	          }
          }

          sc.close();
     }

}
