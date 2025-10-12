public class Loja {
    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;
    private Endereco endereco;
    private Data dataFundacao;
    private Produto[] estoqueProdutos;
    
    // Construtor com 2 parâmetros (Etapa 1) - mantido para compatibilidade
    public Loja(String nome, int quantidadeFuncionarios) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = -1;
        this.endereco = null;
        this.dataFundacao = null;
        this.estoqueProdutos = null;
    }
    
    // Construtor com 3 parâmetros (Etapa 1) - mantido para compatibilidade
    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.endereco = null;
        this.dataFundacao = null;
        this.estoqueProdutos = null;
    }
    
    // Construtor com 4 parâmetros (Etapa 2) - mantido para compatibilidade
    public Loja(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = -1;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        this.estoqueProdutos = null;
    }
    
    // Construtor com 5 parâmetros (Etapa 2) - mantido para compatibilidade
    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        this.estoqueProdutos = null;
    }
    

    
    // Construtor com 5 parâmetros incluindo tamanho do estoque (Etapa 4)
    public Loja(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao, int tamanhoEstoque) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = -1;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        this.estoqueProdutos = new Produto[tamanhoEstoque];
    }
    
    // Construtor com 6 parâmetros incluindo tamanho do estoque (Etapa 4)
    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, int tamanhoEstoque) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        this.estoqueProdutos = new Produto[tamanhoEstoque];
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getQuantidadeFuncionarios() {
        return quantidadeFuncionarios;
    }
    
    public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }
    
    public double getSalarioBaseFuncionario() {
        return salarioBaseFuncionario;
    }
    
    public void setSalarioBaseFuncionario(double salarioBaseFuncionario) {
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }
    
    public Endereco getEndereco() {
        return endereco;
    }
    
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    public Data getDataFundacao() {
        return dataFundacao;
    }
    
    public void setDataFundacao(Data dataFundacao) {
        this.dataFundacao = dataFundacao;
    }
    
    public Produto[] getEstoqueProdutos() {
        return estoqueProdutos;
    }
    
    public double gastosComSalario() {
        if (salarioBaseFuncionario == -1) {
            return -1;
        }
        return quantidadeFuncionarios * salarioBaseFuncionario;
    }
    
    public char tamanhoDaLoja() {
        if (quantidadeFuncionarios < 10) {
            return 'P';
        } else if (quantidadeFuncionarios >= 10 && quantidadeFuncionarios <= 30) {
            return 'M';
        } else {
            return 'G';
        }
    }
    
    public void imprimeProdutos() {
        if (estoqueProdutos == null) {
            System.out.println("Estoque não inicializado");
            return;
        }
        
        System.out.println("Produtos no estoque:");
        for (int i = 0; i < estoqueProdutos.length; i++) {
            if (estoqueProdutos[i] != null) {
                System.out.println("- " + estoqueProdutos[i].toString());
            }
        }
    }
    
    public boolean insereProduto(Produto produto) {
        if (estoqueProdutos == null) {
            return false;
        }
        
        for (int i = 0; i < estoqueProdutos.length; i++) {
            if (estoqueProdutos[i] == null) {
                estoqueProdutos[i] = produto;
                return true;
            }
        }
        return false; // Estoque cheio
    }
    
    public boolean removeProduto(String nomeProduto) {
        if (estoqueProdutos == null) {
            return false;
        }
        
        for (int i = 0; i < estoqueProdutos.length; i++) {
            if (estoqueProdutos[i] != null && estoqueProdutos[i].getNome().equals(nomeProduto)) {
                estoqueProdutos[i] = null;
                return true;
            }
        }
        return false; // Produto não encontrado
    }
    
    @Override
    public String toString() {
        String resultado = "Loja: " + nome + 
                          " - Funcionários: " + quantidadeFuncionarios;
        
        if (salarioBaseFuncionario > 0) {
            resultado += " - Salário Base: R$ " + String.format("%.2f", salarioBaseFuncionario);
        }
        
        if (endereco != null) {
            resultado += " - Endereço: " + endereco.toString();
        }
        
        if (dataFundacao != null) {
            resultado += " - Fundação: " + dataFundacao.toString();
        }
        
        return resultado;
    }
}