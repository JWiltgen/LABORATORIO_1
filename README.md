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
├── src/                    # Código fonte
│   ├── App.java           # Classe principal
│   ├── Loja.java          # Classe Loja
│   ├── Produto.java       # Classe Produto
│   ├── Endereco.java      # Classe Endereco
│   └── Data.java          # Classe Data
│
├── lib/                    # Dependências externas
│
├── bin/                    # Arquivos compilados (.class)
│
└── README.md              # Documentação do projeto
```

## 🔧 Classes Implementadas

### 📦 Etapa 1 - Criação de Classes

#### 1. 🏪 **Loja** (`Loja.java`)
Representa uma loja no shopping.

**Atributos:**
- `nome` (String)
- `quantidadeFuncionarios` (int)
- `salarioBaseFuncionario` (double)

**Métodos:**
- 2 construtores (um completo e outro que define salário como -1)
- Getters e setters para todos os atributos
- `toString()`: retorna representação em String da loja
- `gastosComSalario()`: calcula o gasto total com salários
- `tamanhoDaLoja()`: retorna 'P' (pequena), 'M' (média) ou 'G' (grande)

#### 2. 🛍️ **Produto** (`Produto.java`)
Representa um produto vendido nas lojas.

**Atributos:**
- `nome` (String)
- `preco` (double)

**Métodos:**
- Construtor com todos os parâmetros
- Getters e setters
- `toString()`: retorna representação em String do produto

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

3. **Execute a classe principal**
   ```bash
   java -cp src App
   ```

### Executando no VS Code

1. Abra a pasta do projeto no VS Code
2. Instale a extensão "Extension Pack for Java"
3. Pressione `F5` para executar o projeto

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

### 🔜 Próximas Etapas

- [ ] Etapa 2 - Implementação de novas funcionalidades
- [ ] Etapa 3 - Sistema de relatórios
- [ ] Etapa 4 - Interface de usuário

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

## 📊 Diagrama de Classes

```
┌─────────────────┐     ┌─────────────────┐
│     Loja        │     │    Produto      │
├─────────────────┤     ├─────────────────┤
│ - nome          │     │ - nome          │
│ - qtdFunc       │     │ - preco         │
│ - salarioBase   │     └─────────────────┘
├─────────────────┤
│ + gastosComSal()│
│ + tamanhoDaLoja()│
└─────────────────┘

┌─────────────────┐     ┌─────────────────┐
│    Endereco     │     │      Data       │
├─────────────────┤     ├─────────────────┤
│ - nomeDaRua     │     │ - dia           │
│ - cidade        │     │ - mes           │
│ - estado        │     │ - ano           │
│ - pais          │     ├─────────────────┤
│ - cep           │     │ + verificaBis() │
│ - numero        │     └─────────────────┘
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

</div>

---

## 📄 Licença

Este projeto está sob a licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.

---

<div align="center">

**⭐ Se este projeto foi útil para você, considere dar uma estrela!**

Desenvolvido com ☕ e 💙 por [JWiltgen](https://github.com/JWiltgen)

</div>
