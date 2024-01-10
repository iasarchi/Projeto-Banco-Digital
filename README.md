# **Projeto Banco Digital**

## **Descrição**

Este é um projeto de estudos no qual vou criar um Banco Digital desenvolvido utilizando as seguintes tecnologias: **Spring Boot**, **PostgreSQL**, **Docker**, **FlywayDB**, **JPA**, **Maven** e **Spring Security**.

## **Funcionalidades Principais**

### **Cadastro de Clientes**

O sistema permite o cadastro de clientes com as seguintes informações:

- CPF
- Nome
- Data de Nascimento
- Endereço

Os clientes são classificados em três categorias:

1. Comum
2. Super
3. Premium

### **Contas Bancárias**

Os clientes podem abrir contas de dois tipos:

1. **Conta Corrente**
    - Taxa mensal de manutenção
    - Ações básicas, como exibir saldo e fazer transferências via Pix
2. **Conta Poupança**
    - Acréscimo conforme a taxa de rendimento no momento
    - Ações básicas, como exibir saldo e fazer transferências via Pix

### **Cartões de Crédito e Débito**

A partir das contas bancárias, é possível emitir cartões de crédito e débito. As principais funcionalidades incluem:

- Aplicação de taxas pela utilização
- Realização de pagamentos
- Mudança de status para ativo/desativado
- Troca de senha

### Cartão de Crédito

- Limite de crédito aprovado
- Desconto de valores a cada pagamento até atingir o limite
- Bloqueio de novos pagamentos se a soma atingir o limite

### Cartão de Débito

- Limite diário de transação
- Bloqueio de novos pagamentos após atingir o valor limítrofe
- Possibilidade de alteração do limite diário por um usuário

### **Seguros**

Os cartões de crédito terão produtos de seguro específicos, ofertados mediante determinadas regras. O sistema gera automaticamente uma apólice eletrônica de seguro contendo:

- Número da apólice
- Data de contratação
- Detalhes do cartão que terá cobertura
- Valor da apólice
- Descrição das condições para acionamento

Cada novo contrato gera automaticamente um número de apólice.

## **Tecnologias Utilizadas**

- **Spring Boot**
- **PostgreSQL**
- **Docker**
- **FlywayDB**
- **JPA**
- **Maven**
- **Spring Security**

## **Como Rodar**

*Instruções para execução do sistema serão fornecidas posteriormente conforme estiver sendo desenvolvido.*

Este projeto visa atender as necessidades de uma instituição financeira, oferecendo uma solução completa para o gerenciamento de clientes, contas bancárias e cartões, integrando funcionalidades de seguro de forma eficiente e segura.