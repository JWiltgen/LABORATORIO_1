# 🏬 Gerenciador de Lojas de Shopping Center

[![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](https://www.java.com)
[![Status](https://img.shields.io/badge/Status-Em%20Desenvolvimento-yellow?style=for-the-badge)](https://github.com/JWiltgen/LABORATORIO_1)
[![License](https://img.shields.io/badge/License-MIT-blue?style=for-the-badge)](LICENSE)
[![UNISINOS](https://img.shields.io/badge/UNISINOS-ADS-orange?style=for-the-badge)](https://www.unisinos.br)

> Sistema desenvolvido para o Desafio de Laboratório I - UNISINOS (Análise e Desenvolvimento de Sistemas).

## 📋 Índice

- [Sobre o Projeto](#sobre-o-projeto)
- [Classes Implementadas](#classes-implementadas)
- [Estrutura do Projeto](#estrutura-do-projeto)
- [Como Executar](#como-executar)
- [Funcionalidades](#funcionalidades)
- [Tecnologias Utilizadas](#tecnologias-utilizadas)
- [Autor](#autor)

## 📖 Sobre o Projeto

Sistema de gerenciamento de lojas em um Shopping Center, permitindo o controle de lojas, produtos, endereços e datas. O projeto simula a estrutura de um shopping com múltiplos espaços de locação, onde cada loja pode gerenciar seus funcionários, produtos e informações cadastrais.

### 🎯 Objetivo

Desenvolver um sistema completo de gerenciamento que permita:
- Cadastro e controle de lojas
- Gestão de funcionários e cálculo de folha de pagamento
- Registro de produtos
- Validação e armazenamento de datas
- Gerenciamento de endereços

## 📁 Estrutura do Projeto

```
Desafio_Laboratorio/
│
├── src/                          # Código fonte
│   ├── Principal.java            # Classe principal (executa validações)
│   ├── ExecutarValidacoes.java   # Scripts de validação integrados
│   ├── Loja.java                 # Classe Loja (com Endereco e Data)
│   ├── Produto.java              # Classe Produto (com Data de validade)
│   ├── Endereco.java             # Classe Endereco
│   ├── Data.java                 # Classe Data
│   ├── App.java                  # Classe App (original)
│   │
│   └── validation_Scripts/       # Scripts de validação originais
│       ├── ValidadorEtapa1.java
│       ├── ValidadorEtapa2.java
│       ├── ValidadorEtapa3.java
│       └── ValidadorEtapa4.java
│
├── lib/                          # Dependências externas
│
├── bin/                          # Arquivos compilados (.class)
│
└── README.md                     # Documentação do projeto
```

## 🔧 Classes Implementadas

### 📦 Etapa 1 - Criação de Classes

#### 1. 🏪 **Loja** (`Loja.java`)
Representa uma loja no shopping.

**Atributos:**
- `nome` (String)
- `quantidadeFuncionarios` (int)
- `salarioBaseFuncionario` (double)
- `endereco` (Endereco) - **Novo na Etapa 2**
- `dataFundacao` (Data) - **Novo na Etapa 2**

**Métodos:**
- 2 construtores (recebem também endereco e dataFundacao)
- Getters e setters para todos os atributos
- `toString()`: retorna representação completa da loja
- `gastosComSalario()`: calcula o gasto total com salários
- `tamanhoDaLoja()`: retorna 'P' (pequena), 'M' (média) ou 'G' (grande)

#### 2. 🛍️ **Produto** (`Produto.java`)
Representa um produto vendido nas lojas.

**Atributos:**
- `nome` (String)
- `preco` (double)
- `dataValidade` (Data) - **Novo na Etapa 2**

**Métodos:**
- Construtor com todos os parâmetros (incluindo data de validade)
- Getters e setters
- `toString()`: retorna representação em String do produto
- `estaVencido(Data data)`: verifica se o produto está vencido - **Novo na Etapa 2**

#### 3. 📍 **Endereco** (`Endereco.java`)
Representa um endereço.

**Atributos:**
- `nomeDaRua` (String)
- `cidade` (String)
- `estado` (String)
- `pais` (String)
- `cep` (String)
- `numero` (String)
- `complemento` (String)

**Métodos:**
- Construtor com todos os parâmetros
- Getters e setters
- `toString()`: retorna endereço formatado

#### 4. 📅 **Data** (`Data.java`)
Representa uma data com validação.

**Atributos:**
- `dia` (int)
- `mes` (int)
- `ano` (int)

**Métodos:**
- Construtor com validação de data (considera anos bissextos)
- Getters e setters
- `toString()`: retorna data no formato dia/mês/ano
- `verificaAnoBissexto()`: verifica se o ano é bissexto

**Validação:** Datas inválidas são automaticamente ajustadas para 1/1/2000 com mensagem de erro.

#### 5. 🎮 **Principal** (`Principal.java`) - **Novo na Etapa 2**
Classe principal com menu interativo para o usuário.

**Funcionalidades:**
- Menu interativo com 3 opções:
  - (1) Criar uma loja
  - (2) Criar um produto
  - (3) Sair
- Solicita todas as informações ao usuário via teclado
- Valida opções inválidas
- Verifica se produto está vencido na data 20/10/2023
- Exibe informações da loja criada

---

### 📦 Etapa 2 - Associação entre Classes

Nesta etapa, foram implementadas as seguintes associações:

✅ **Loja** agora possui:
- Atributo `endereco` (tipo Endereco)
- Atributo `dataFundacao` (tipo Data)
- Construtores atualizados para receber esses novos atributos

✅ **Produto** agora possui:
- Atributo `dataValidade` (tipo Data)
- Construtor atualizado para receber data de validade
- Método `estaVencido(Data data)` para verificar validade

✅ **Classe Principal e ExecutarValidacoes** criadas:
- Principal redireciona para ExecutarValidacoes
- ExecutarValidacoes executa scripts de validação automaticamente
- Valida todas as funcionalidades implementadas nas Etapas 1 e 2
- Exibe resultados formatados com indicadores [OK]/[NOK]

---

## 🚀 Como Executar

### Pré-requisitos

- ☕ Java Development Kit (JDK) 8 ou superior
- 💻 IDE de sua preferência (VS Code, Eclipse, IntelliJ, etc.)
- 📦 Git (para clonar o repositório)

### Passos para Execução

1. **Clone o repositório**
   ```bash
   git clone https://github.com/JWiltgen/LABORATORIO_1.git
   cd LABORATORIO_1
   ```

2. **Compile os arquivos**
   ```bash
   javac src/*.java
   ```

3. **Execute a classe principal (executa validações automaticamente)**
   ```bash
   java -cp bin Principal
   ```
   
   _Ou execute diretamente o validador:_
   ```bash
   java -cp bin ExecutarValidacoes
   ```
   
   _Ou execute a classe App original:_
   ```bash
   java -cp bin App
   ```

### Executando no VS Code

1. Abra a pasta do projeto no VS Code
2. Instale a extensão "Extension Pack for Java"
3. Abra o arquivo `Principal.java`
4. Clique no botão "Run" ou pressione `F5`

### 📝 Saída da Execução (Scripts de Validação)

Ao executar `Principal.java`, o sistema executa automaticamente os scripts de validação das Etapas 1 e 2:

```
╔══════════════════════════════════════════════════════════╗
║   DESAFIO LABORATÓRIO I - UNISINOS                       ║
║   Gerenciador de Lojas de Shopping Center               ║
║   Executando Scripts de Validação                       ║
╚══════════════════════════════════════════════════════════╝

═══════════════════════════════════════════════════════════
  VALIDAÇÃO ETAPA 1
═══════════════════════════════════════════════════════════

[OK] Classe Loja identificada (construtor com dois parâmetros)
[OK] Classe Loja identificada (construtor com três parâmetros)
[OK] Método Loja.getNome()
[OK] Método Loja.setNome()
[OK] Método Loja.getQuantidadeFuncionarios()
[OK] Método Loja.setQuantidadeFuncionarios()
[OK] Método Loja.getSalarioBaseFuncionario()
[OK] Método Loja.setSalarioBaseFuncionario()
[OK] Método Loja.toString()
[OK] Método Loja.gastosComSalario()
[OK] Método Loja.tamanhoDaLoja()

[OK] Classe Produto identificada
[OK] Método Produto.setNome()
[OK] Método Produto.getNome()
... (continua validando todas as classes)

═══════════════════════════════════════════════════════════
  VALIDAÇÃO ETAPA 2
═══════════════════════════════════════════════════════════

[OK] Classe Endereco identificada
[OK] Classe Data identificada
[OK] Classe Loja identificada (construtor com dois parâmetros + endereco + data)
[OK] Método Loja.getEndereco()
[OK] Método Loja.setEndereco()
[OK] Método Loja.getDataFundacao()
[OK] Método Loja.setDataFundacao()
[OK] Método Produto.setDataValidade()
[OK] Método Produto.getDataValidade()
[OK] Método Produto.estaVencido()

╔══════════════════════════════════════════════════════════╗
║   VALIDAÇÃO CONCLUÍDA COM SUCESSO!                       ║
╚══════════════════════════════════════════════════════════╝
```

---

## ✨ Funcionalidades

### ✅ Implementadas (Etapa 1)

- [x] Classe Loja com cálculo de gastos e classificação de tamanho
- [x] Classe Produto para gerenciamento de itens
- [x] Classe Endereco para armazenamento de localização
- [x] Classe Data com validação completa (incluindo anos bissextos)
- [x] Construtores com validação de dados
- [x] Métodos getters e setters para todas as classes
- [x] Métodos toString() customizados

### ✅ Implementadas (Etapa 2)

- [x] Associação entre classes Loja ↔ Endereco
- [x] Associação entre classes Loja ↔ Data (fundação)
- [x] Associação entre classes Produto ↔ Data (validade)
- [x] Método estaVencido() para verificar validade de produtos
- [x] Classe ExecutarValidacoes com scripts de validação automática
- [x] Classe Principal que executa as validações
- [x] Sistema de validação completo para Etapas 1 e 2
- [x] Exibição formatada de resultados [OK]/[NOK]

### 🔜 Próximas Etapas

- [ ] Etapa 3 - Herança e Polimorfismo
- [ ] Etapa 4 - Arrays

---

## 🛠️ Tecnologias Utilizadas

<div align="center">

| Tecnologia | Descrição |
|------------|-----------|
| ![Java](https://img.shields.io/badge/Java-ED8B00?style=flat&logo=openjdk&logoColor=white) | Linguagem de programação principal |
| ![VS Code](https://img.shields.io/badge/VS%20Code-007ACC?style=flat&logo=visual-studio-code&logoColor=white) | IDE utilizada para desenvolvimento |
| ![Git](https://img.shields.io/badge/Git-F05032?style=flat&logo=git&logoColor=white) | Controle de versão |
| ![GitHub](https://img.shields.io/badge/GitHub-181717?style=flat&logo=github&logoColor=white) | Hospedagem do repositório |

</div>

---

## 📊 Diagrama de Classes (Atualizado - Etapa 2)

```
        ┌─────────────────────┐
        │     Principal       │
        ├─────────────────────┤
        │ + main()            │
        └─────────────────────┘
                 │ cria
        ┌────────┴────────┐
        │                 │
        ▼                 ▼
┌─────────────────┐  ┌──────────────────┐
│      Loja       │  │     Produto      │
├─────────────────┤  ├──────────────────┤
│ - nome          │  │ - nome           │
│ - qtdFunc       │  │ - preco          │
│ - salarioBase   │  │ - dataValidade ◄─┼───┐
│ - endereco    ◄─┼─┐├──────────────────┤   │
│ - dataFundacao◄─┼─┤│ + estaVencido()  │   │
├─────────────────┤ ││└──────────────────┘   │
│ + gastosComSal()│ ││                       │
│ + tamanhoDaLoja()│ ││                       │
└─────────────────┘ ││                       │
                    ││                       │
        ┌───────────┘│                       │
        │            │                       │
        ▼            ▼                       ▼
┌─────────────────┐ ┌────────────────────────┐
│    Endereco     │ │         Data           │
├─────────────────┤ ├────────────────────────┤
│ - nomeDaRua     │ │ - dia                  │
│ - cidade        │ │ - mes                  │
│ - estado        │ │ - ano                  │
│ - pais          │ ├────────────────────────┤
│ - cep           │ │ + verificaAnoBissexto()│
│ - numero        │ └────────────────────────┘
│ - complemento   │
└─────────────────┘
```

---

## 📝 Convenções de Código

Este projeto segue as convenções padrão de código Java:

- ✓ CamelCase para nomes de classes (`Loja`, `Produto`)
- ✓ camelCase para métodos e variáveis (`gastosComSalario`, `quantidadeFuncionarios`)
- ✓ Constantes em UPPER_CASE
- ✓ Indentação de 4 espaços
- ✓ Comentários descritivos quando necessário

---

## 👨‍💻 Autor

**João Wiltgen**

[![GitHub](https://img.shields.io/badge/GitHub-JWiltgen-181717?style=flat&logo=github)](https://github.com/JWiltgen)
[![LinkedIn](https://img.shields.io/badge/LinkedIn-Connect-0077B5?style=flat&logo=linkedin)](https://linkedin.com)

---

## 🎓 Instituição

<div align="center">

**UNISINOS - Universidade do Vale do Rio dos Sinos**

Curso: Análise e Desenvolvimento de Sistemas

Disciplina: Laboratório de Programação I

Semestre: 2023/2


