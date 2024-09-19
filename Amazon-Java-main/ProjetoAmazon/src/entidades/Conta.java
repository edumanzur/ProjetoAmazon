 package entidades;

import java.util.ArrayList;
import java.util.List;

public class Conta {
     
    // Atributos
    private String email;
    private String senha;
    private String username;
    List<List<String>> matriz = new ArrayList<>();  

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
        cliente.add(username); 
        cliente.add(senha);    
        cliente.add(email);    

        matriz.add(cliente);  
        System.out.println("Conta adicionada!\n");
    }

    // Método para excluir um cliente
    public void excluir(String usuario) {
        boolean usuarioEncontrado = false;
        for (int i = 0; i < matriz.size(); i++) {
            List<String> row = matriz.get(i);
            if (row.get(0).equals(usuario)) {
                matriz.remove(i);  
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
            if (row.get(0).equals(usuario)) {  
                row.set(1, novaSenha); 
                row.set(2, novoEmail);  
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
