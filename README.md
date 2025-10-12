# 🏪 Sistema de Gerenciamento de Shopping - Laboratório I

Este projeto implementa um sistema completo de gerenciamento de shopping com diferentes tipos de lojas, seguindo os conceitos de Programação Orientada a Objetos.

## 📋 Estrutura do Projeto

```
LABORATORIO_I/
├── src/                          # Código fonte
│   ├── Data.java                 # Classe para datas
│   ├── Endereco.java            # Classe para endereços
│   ├── Produto.java             # Classe para produtos
│   ├── Loja.java                # Classe base para lojas
│   ├── Cosmetico.java           # Loja de cosméticos
│   ├── Vestuario.java           # Loja de vestuário
│   ├── Bijuteria.java           # Loja de bijuteria
│   ├── Alimentacao.java         # Loja de alimentação
│   ├── Informatica.java         # Loja de informática
│   ├── Shopping.java            # Classe para shopping centers
│   ├── Principal.java           # Menu interativo
│   ├── ExecutarTodosValidadores.java # Executa todos os validadores
│   └── validation_Scripts/      # Scripts de validação
├── bin/                         # Classes compiladas
├── lib/                         # Dependências (vazio)
├── executar_validadores.bat     # Script Windows para validadores
├── executar_validadores.sh      # Script Linux/Mac para validadores
└── README.md                    # Este arquivo
```

## 🚀 Como Compilar e Executar

### Compilação
```bash
javac -d bin src/*.java src/validation_Scripts/*.java
```

### Execução dos Validadores

#### Opção 1: Script Batch (Windows)
```cmd
.\executar_validadores.bat
```

#### Opção 2: Script Shell (Linux/Mac)
```bash
chmod +x executar_validadores.sh
./executar_validadores.sh
```

#### Opção 3: Classe Java
```bash
java -cp bin ExecutarTodosValidadores
```

#### Opção 4: Validadores Individuais
```bash
java -cp bin ValidadorEtapa1
java -cp bin ValidadorEtapa2
java -cp bin ValidadorEtapa3
java -cp bin ValidadorEtapa4
```

### Programa Principal Interativo
```bash
java -cp bin Principal
```

### Testes Demonstrativos
```bash
java -cp bin TesteEtapa3     # Teste de herança e polimorfismo
java -cp bin TesteEtapa4     # Teste de arrays e shopping
```

## 📚 Etapas Implementadas

### ✅ Etapa 1: Criação de Classes
- **Classe `Loja`**: Gerenciamento básico de lojas
- **Classe `Produto`**: Produtos com nome e preço
- **Classe `Endereco`**: Endereços completos
- **Classe `Data`**: Datas com validação e anos bissextos

### ✅ Etapa 2: Associação entre Classes
- **Relacionamentos**: Loja ↔ Endereco, Loja ↔ Data, Produto ↔ Data
- **Classe `Principal`**: Menu interativo completo
- **Método `estaVencido()`**: Verificação de validade de produtos

### ✅ Etapa 3: Herança e Polimorfismo
- **Classes Filhas**:
  - `Cosmetico`: Taxa de comercialização
  - `Vestuario`: Produtos importados
  - `Bijuteria`: Meta de vendas
  - `Alimentacao`: Data do alvará
  - `Informatica`: Seguro eletrônicos
- **Polimorfismo**: Método `toString()` sobrescrito em todas as classes

### ✅ Etapa 4: Arrays
- **Gestão de Estoque**: Arrays de produtos nas lojas
- **Classe `Shopping`**: Gerenciamento de lojas
- **Funcionalidades Avançadas**:
  - Inserção/remoção de produtos e lojas
  - Contagem por tipo de loja
  - Busca da loja com maior seguro

## 🎯 Funcionalidades Principais

### 🏪 Gestão de Lojas
- Criação de diferentes tipos de lojas
- Controle de funcionários e salários
- Cálculo do tamanho da loja (P/M/G)
- Gestão de estoque de produtos

### 📦 Gestão de Produtos
- Produtos com data de validade
- Verificação de vencimento
- Inserção/remoção em estoque

### 🏢 Gestão de Shopping
- Adição/remoção de lojas
- Contagem por categoria
- Análises específicas (maior seguro)

### 🎮 Interface Interativa
- Menu completo para criação de objetos
- Validações automáticas
- Testes de funcionalidades

## 🧪 Scripts de Validação

O projeto inclui scripts automatizados que executam todos os validadores:

- **`executar_validadores.bat`**: Para Windows
- **`executar_validadores.sh`**: Para Linux/Mac  
- **`ExecutarTodosValidadores.java`**: Versão Java multiplataforma

### Exemplo de Saída dos Validadores:
```
============================================
     EXECUTANDO TODOS OS VALIDADORES
============================================

[1/4] Executando Validador Etapa 1...
----------------------------------------
[Laboratório I]
 Desafio: Validador - Etapa 01

[OK] Classe Loja identificada (construtor com dois parâmetros)
[OK] Classe Loja identificada (construtor com três parâmetros)
[OK] Método Loja.getNome()
...
[OK] Método Data.verificaAnoBissexto()

[2/4] Executando Validador Etapa 2...
...
```

## 🎓 Conceitos Demonstrados

- **Encapsulamento**: Atributos privados com getters/setters
- **Herança**: Hierarquia de classes de lojas
- **Polimorfismo**: Sobrescrita de métodos
- **Abstração**: Interfaces bem definidas
- **Arrays**: Gestão dinâmica de coleções
- **Validação**: Controle de dados de entrada
- **Composition**: Relacionamentos entre objetos

## 🔧 Requisitos

- **Java 8+**
- **Windows**: Para executar `.bat`
- **Linux/Mac**: Para executar `.sh`

## 🏆 Status do Projeto

**✅ TODAS AS ETAPAS COMPLETADAS E TESTADAS**

- ✅ Etapa 1: 100% dos testes passando
- ✅ Etapa 2: 100% dos testes passando  
- ✅ Etapa 3: 100% dos testes passando
- ✅ Etapa 4: 100% dos testes passando

**Total de validações: 100+ testes automatizados** 🎉

---

**Desenvolvido para a disciplina de Laboratório I - UNISINOS**
