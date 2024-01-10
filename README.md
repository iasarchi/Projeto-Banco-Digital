# Projeto Banco Digital

Você montou uma startup que desenvolve softwares para clientes. Seu primeiro cliente é de uma instituição financeira e quer um software na web que seja capaz de cadastrar dados de seus clientes como CPF, Nome, Data de nascimento e Endereço. Os clientes podem ser subdivididos em três categorias: Comum, Super e Premium e podem abrir contas de dois tipos: corrente e poupança, devendo estas realizar ações básicas, como exibir saldo e fazer transferências via Pix. A conta corrente possui uma taxa mensal de manutenção que deve ser descontada a cada mês e a conta poupança deve fazer o acréscimo conforma a taxa de rendimento no momento.

A partir da conta, podem ser emitidos cartões de crédito e/ou débito.  Em ambos os casos o programa deve ser capaz de aplicar taxas pela sua utilização e ser capaz de realizar pagamentos, além de mudar o status para ativo/desativado e de permitir a troca de senha. O cartão de crédito deve ter um limite de crédito aprovado e a cada pagamento, um valor é descontado até atingir o limite, se a soma de pagamentos de um mês atingir o valor do limite, novos pagamentos devem ser bloqueados. O cartão de débito deve ter um limite diário de transação, devendo impedir novos pagamentos após atingir o valor limítrofe. O programa deve permitir a alteração deste limite diário por um usuário.

Os cartões de crédito terão produtos de seguro específicos que serão ofertados mediante determinadas regras. O programa também deve gerar uma apólice eletrônica desse seguro, contendo o número da apólice, a data de contratação, os detalhes do cartão que terá cobertura, o valor da apólice e a descrição das condições para acionamento. O programa também deve gerar automaticamente um número de apólice a cada novo contrato.

# Passo a passo/data de finalizacao

**Passo 1: Definir a Estrutura de Dados**

- Crie um banco de dados para armazenar as informações dos clientes, contas, cartões e seguros. Certifique-se de incluir tabelas para armazenar detalhes como nome, CPF, data de nascimento, endereço, tipo de cliente, tipo de conta, saldo, limite de crédito, limite diário de transação, etc.

<aside>
💡 **Data de Finalizacao - 15/01/2024**

</aside>

**Passo 2: Desenvolver o Cadastro de Clientes**

- Crie uma interface para cadastrar novos clientes, capturando informações como nome, CPF, data de nascimento e endereço. Permita também a escolha do tipo de cliente (Comum, Super, Premium).

<aside>
💡 **Data de Finalizacao - 17/01/2024**

</aside>

**Passo 3: Implementar o Cadastro de Contas**

- Desenvolva uma funcionalidade para cadastrar contas associadas aos clientes. Capture informações como tipo de conta (corrente ou poupança), saldo inicial, taxa de manutenção (para conta corrente) e taxa de rendimento (para conta poupança).

<aside>
💡 **Data de Finalizacao - 22/01/2024**

</aside>

**Passo 4: Adicionar Funcionalidades Básicas de Conta**

- Implemente funções básicas como exibir saldo, fazer transferências via Pix, descontar a taxa de manutenção mensal para contas correntes e acréscimo conforme a taxa de rendimento para contas poupança.

**Passo 5: Desenvolver o Sistema de Cartões**

- Implemente a funcionalidade de emitir cartões de crédito e/ou débito a partir das contas dos clientes.
- Para cartões de crédito, adicione um limite de crédito, controle de utilização, aplicação de taxas e bloqueio de novos pagamentos após atingir o limite.
- Para cartões de débito, adicione um limite diário de transação e impeça novos pagamentos após atingir o valor limítrofe.

**Passo 6: Gerar Apólices de Seguro**

- Implemente a lógica para ofertar produtos de seguro específicos para os cartões de crédito.
- Desenvolva a geração automática de apólices eletrônicas para cada novo contrato de seguro, incluindo informações como número da apólice, data de contratação, detalhes do cartão segurado, valor da apólice e condições para acionamento.

**Passo 7: Adicionar Recursos Adicionais**

- Implemente funcionalidades adicionais, como a capacidade de realizar pagamentos, alterar senha, ativar/desativar cartões e alterar o limite diário de transação.

**Passo 8: Testar e Refinar**

- Realize testes rigorosos em todas as funcionalidades do sistema, identificando e corrigindo quaisquer problemas ou bugs.
- Refine a interface do usuário para garantir uma experiência intuitiva e eficiente.

**Passo 9: Documentar o Sistema**

- Crie documentação abrangente para o sistema, incluindo detalhes sobre a estrutura de dados, funcionalidades, API (se aplicável) e qualquer outro aspecto relevante.

**Passo 10: Implementar Medidas de Segurança**

- Adicione medidas de segurança para proteger os dados sensíveis dos clientes, como criptografia, autenticação segura e auditorias regulares.