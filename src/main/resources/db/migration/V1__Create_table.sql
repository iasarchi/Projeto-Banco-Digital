-- Tabela de Clientes
CREATE TABLE clientes
(
    cliente_id      VARCHAR PRIMARY KEY,
    nome            VARCHAR(100),
    cpf             VARCHAR(11) UNIQUE,
    data_nascimento DATE,
    endereco        VARCHAR(255),
    tipo_cliente    VARCHAR(20) CHECK (tipo_cliente IN ('Comum', 'Super', 'Premium'))
);

-- Tabela de Contas
CREATE TABLE contas
(
    conta_id        VARCHAR PRIMARY KEY,
    cliente_id      VARCHAR,
    tipo_conta      VARCHAR(20) CHECK (tipo_conta IN ('Corrente', 'Poupanca')),
    saldo           DECIMAL(10, 2),
    taxa_manutencao DECIMAL(5, 2), -- Para conta corrente
    taxa_rendimento DECIMAL(5, 2), -- Para conta poupança
    FOREIGN KEY (cliente_id) REFERENCES clientes (cliente_id)
);

-- Tabela de Cartões
CREATE TABLE cartoes
(
    cartao_id      VARCHAR PRIMARY KEY,
    conta_id       VARCHAR,
    tipo_cartao    VARCHAR(20) CHECK (tipo_cartao IN ('Credito', 'Debito')),
    limite_credito DECIMAL(10, 2), -- Para cartões de crédito
    limite_diario  DECIMAL(10, 2), -- Para cartões de débito
    status         VARCHAR(10) CHECK (status IN ('Ativo', 'Inativo')),
    FOREIGN KEY (conta_id) REFERENCES contas (conta_id)
);

-- Tabela de Transações
CREATE TABLE transacoes
(
    transacao_id   VARCHAR PRIMARY KEY,
    cartao_id      VARCHAR,
    valor          DECIMAL(10, 2),
    data_transacao TIMESTAMP,
    FOREIGN KEY (cartao_id) REFERENCES cartoes (cartao_id)
);

-- Tabela de Seguros
CREATE TABLE seguros
(
    seguro_id        VARCHAR PRIMARY KEY,
    cartao_id        VARCHAR,
    numero_apolice   VARCHAR(20),
    data_contratacao DATE,
    valor_apolice    DECIMAL(10, 2),
    condicoes        TEXT,
    FOREIGN KEY (cartao_id) REFERENCES cartoes (cartao_id)
);
