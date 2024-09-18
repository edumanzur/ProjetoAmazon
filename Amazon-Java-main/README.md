# Amazon-Java

Este repositório contém o código de um protótipo de aplicação de e-commerce em Java. O projeto simula algumas funcionalidades básicas de um sistema de e-commerce, como criação de conta, gerenciamento de produtos e finalização de pedidos.

## Funcionalidades

O sistema oferece as seguintes funcionalidades:

1. **Criar conta**: Permite ao usuário criar uma nova conta com `username`, `email` e `senha`.
2. **Excluir conta**: Opção para remover uma conta existente.
3. **Alterar informações da conta**: Modificação de detalhes como `email` e `senha`.
4. **Mostrar clientes**: Exibe uma lista de todos os clientes cadastrados no sistema.
5. **Mostrar produtos**: Exibe os produtos disponíveis na loja.
6. **Adicionar produto ao carrinho**: Permite ao usuário selecionar um produto e adicioná-lo ao carrinho.
7. **Excluir produto do carrinho**: Remove um produto previamente adicionado ao carrinho.
8. **Finalizar atendimento**: Processa a finalização de uma compra.

## Estrutura do Projeto

O projeto está estruturado em classes Java que representam os diferentes módulos do sistema:

- **Conta.java**: Gerencia informações de usuário, como `username`, `email` e `senha`.
- **Produto.java**: Representa os produtos disponíveis no sistema.
- **Sistema.java**: Gerencia o fluxo principal da aplicação, lidando com as interações do usuário, como criação de conta e seleção de produtos.
- **Carrinho.java**: Classe responsável pelo gerenciamento do carrinho de compras, onde o usuário pode adicionar ou remover produtos.

## Requisitos

- **Java 8 ou superior**: Certifique-se de ter o JDK instalado no seu sistema.
- **IDE compatível com Java** (Eclipse, IntelliJ, NetBeans) ou editor de texto (como VS Code) com suporte para Java.
