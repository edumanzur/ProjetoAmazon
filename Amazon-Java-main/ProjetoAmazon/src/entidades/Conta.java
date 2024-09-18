 package entidades;

// import java.util.ArrayList;
// import java.util.List;

// public class Conta {
     
//      //atributos
//      private String email;
//      private String senha;
//      private String username;
//      List<List<String>> matriz = new ArrayList<>();

//      //construtor
//      public Conta(String email, String senha, String username) {
//           this.email = email;
//           this.senha = senha;
//           this.username = username;
//      }

//      //metodos get e set
//      public String getEmail() {
//           return email;
//      }

//      public void setEmail(String email) {
//           this.email = email;
//      }

//      public String getSenha() {
//           return senha;
//      }

//      public void setSenha(String senha) {
//           this.senha = senha;
//      }

//      public String getUsername() {
//           return username;
//      }

//      public void setUsername(String username) {
//           this.username = username;
//      }
     
//      //métodos
//      //Criar conta
//      public void adicionar(int contador) { 
//           if(matriz.size() <= 3) {
//                for (int i = 0; i < 3; i++) {
//                     if (matriz.size() <= i) {
//                          matriz.add(new ArrayList<>());  // Cria uma nova linha se ela não existir
//                     }
//                }    
//           }
//           for (int i = 0; i < 3; i++) {
//                List<String> linha = matriz.get(i);  // Obter a linha atual
       
//                // Garante que a linha tem espaço suficiente para a coluna desejada
//                while (linha.size() <= contador) {
//                    linha.add("");  // Preenche com strings vazias se a linha for curta
//                }
       
//                if (i == 0) {
//                    linha.set(contador, username);   // Adiciona o nome na coluna especificada da linha 0
//                } else if (i == 1) {
//                    linha.set(contador, senha);  // Adiciona a senha na coluna especificada da linha 1
//                } else if (i == 2) {
//                    linha.set(contador, email);  // Adiciona o email na coluna especificada da linha 2
//                }
//           }
//           System.out.println("Conta adicionada!\n");
//      }

//      //Excluir Conta
//      public void excluir(String usuario) {
//           for (int i = 0; i < matriz.size(); i++) {
//                List<String> row = matriz.get(i);
//                for (int j = 0; j < row.size(); j++) {
//                    if (row.get(j).equals(usuario)) {
//                        row.remove(j);
//                        j--;
//                    }
//                }
//           }
//           System.out.println("Usuário excluído!");
//      }

     //Alterar email e senha
     // public void alterar(String usuario, String email, String senha) {
     //      for (int i = 0; i < matriz.size(); i++) {
     //           List<String> row = matriz.get(i);
     //           for (int j = 0; j < row.size(); j++) {
     //               if (row.get(j).equals(usuario)) {
     //                   if (j + 1 < row.size()) { 
     //                       row.set(j + 1, email);
     //                   }
     //                   if (j + 2 < row.size()) { 
     //                       row.set(j + 2, senha);
     //                   }
     //                   System.out.println("Senha e Email alterados!");
     //                   return; 
     //               }
     //           }
     //       }
     //       System.out.println("Usuário não encontrado!");
     // }
     // public void alterar(String usuario, String email, String senha) {
     //      for (int i = 0; i < matriz.size(); i++) {
     //          List<String> row2 = matriz.get(i);
     //          System.out.println("Verificando linha: " + row2);  // Para ver o que está na linha
      
     //          for (int j = 0; j < row2.size(); j++) {
     //              System.out.println("Verificando usuário: " + row2.get(j));  // Ver o valor da célula
     //              if (row2.get(j).equals(usuario)) {
     //                  System.out.println("Usuário encontrado: " + usuario);
                      
     //                  if (j + 1 < row2.size()) { 
     //                      row2.set(j + 1, email);
     //                  }
     //                  if (j + 2 < row2.size()) { 
     //                      row2.set(j + 2, senha);
     //                  }
     //                  System.out.println("Senha e Email alterados!");
     //                  return; 
     //              }
     //          }
     //      }
     //      System.out.println("Usuário não encontrado!");
     //  }
     // Método para alterar email e senha do usuário
//     public void alterar(String usuario, String email, String senha) {
//      boolean usuarioEncontrado = false;  // Flag para verificar se o usuário foi encontrado
     
//      // Itera sobre cada linha da matriz
//      for (int i = 0; i < matriz.size(); i++) {
//          List<String> row = matriz.get(i);  // Obtém a linha atual
//          System.out.println("Verificando linha: " + row);  // Para ver o que está na linha
         
//          // Verifica se a linha contém o usuário na primeira coluna
//          if (row.get(0).equals(usuario)) {
//              usuarioEncontrado = true;  // Define a flag para indicar que o usuário foi encontrado
             
//              // Atualiza o email e a senha se os índices forem válidos
//              if (row.size() > 1) {
//                  row.set(1, email);  // Atualiza o email
//              }
//              if (row.size() > 2) {
//                  row.set(2, senha);  // Atualiza a senha
//              }
//              System.out.println("Senha e Email alterados para o usuário: " + usuario);
//              break;  // Sai do loop após encontrar e atualizar
//          }
//      }
     
//      if (!usuarioEncontrado) {
//          System.out.println("Usuário não encontrado!");
//      }
//      }


//      //Mostrar clientes
//      public void mostrar() {
//           for(int i = 0; i < matriz.size(); i++) {
//                List<String> row1 = matriz.get(i);
//                for(int j = 0; j < row1.size(); j++) {
//                     System.out.print(row1.get(j) + "\t");
//                }
//                System.out.println();
//           }
//      }

// }

import java.util.ArrayList;
import java.util.List;

public class Conta {
     
    // Atributos
    private String email;
    private String senha;
    private String username;
    List<List<String>> matriz = new ArrayList<>();  // Matriz de clientes

    // Construtor
    public Conta(String email, String senha, String username) {
        this.email = email;
        this.senha = senha;
        this.username = username;
    }

    // Métodos Get e Set
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    // Método para adicionar um cliente à matriz
    public void adicionar() {
        List<String> cliente = new ArrayList<>();
        cliente.add(username);  // Nome de usuário
        cliente.add(senha);     // Senha
        cliente.add(email);     // Email

        matriz.add(cliente);  // Adiciona o cliente como uma linha na matriz
        System.out.println("Conta adicionada!\n");
    }

    // Método para excluir um cliente
    public void excluir(String usuario) {
        boolean usuarioEncontrado = false;
        for (int i = 0; i < matriz.size(); i++) {
            List<String> row = matriz.get(i);
            if (row.get(0).equals(usuario)) {  // Verifica se o nome de usuário corresponde
                matriz.remove(i);  // Remove a linha do cliente
                usuarioEncontrado = true;
                System.out.println("Usuário excluído!");
                break;
            }
        }
        if (!usuarioEncontrado) {
            System.out.println("Usuário não encontrado!");
        }
    }

    // Método para alterar email e senha do usuário
    public void alterar(String usuario, String novoEmail, String novaSenha) {
        boolean usuarioEncontrado = false;
        for (int i = 0; i < matriz.size(); i++) {
            List<String> row = matriz.get(i);
            if (row.get(0).equals(usuario)) {  // Verifica se o nome de usuário corresponde
                row.set(1, novaSenha);  // Atualiza a senha
                row.set(2, novoEmail);  // Atualiza o email
                usuarioEncontrado = true;
                System.out.println("Senha e Email alterados para o usuário: " + usuario);
                break;
            }
        }
        if (!usuarioEncontrado) {
            System.out.println("Usuário não encontrado!");
        }
    }

    // Método para exibir todos os clientes
    public void mostrar() {
        if (matriz.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado.");
        } else {
            System.out.println("Lista de clientes:");
            for (int i = 0; i < matriz.size(); i++) {
                List<String> row = matriz.get(i);
                System.out.println("Usuário: " + row.get(0) + "\tSenha: " + row.get(1) + "\tEmail: " + row.get(2));
            }
        }
    }
}