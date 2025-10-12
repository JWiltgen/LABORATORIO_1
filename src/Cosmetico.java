public class Cosmetico extends Loja {
    private double taxaComercializacao;
    
    // Construtor sem salário base
    public Cosmetico(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao, double taxaComercializacao) {
        super(nome, quantidadeFuncionarios, endereco, dataFundacao);
        this.taxaComercializacao = taxaComercializacao;
    }
    
    // Construtor com salário base
    public Cosmetico(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, double taxaComercializacao) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao);
        this.taxaComercializacao = taxaComercializacao;
    }
    
    // Construtor com estoque (para Etapa 4)
    public Cosmetico(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao, double taxaComercializacao, int tamanhoEstoque) {
        super(nome, quantidadeFuncionarios, endereco, dataFundacao, tamanhoEstoque);
        this.taxaComercializacao = taxaComercializacao;
    }
    
    // Construtor com salário base e estoque (para Etapa 4)
    public Cosmetico(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, double taxaComercializacao, int tamanhoEstoque) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, tamanhoEstoque);
        this.taxaComercializacao = taxaComercializacao;
    }
    
    public double getTaxaComercializacao() {
        return taxaComercializacao;
    }
    
    public void setTaxaComercializacao(double taxaComercializacao) {
        this.taxaComercializacao = taxaComercializacao;
    }
    
    @Override
    public String toString() {
        return super.toString() + " - Taxa de Comercialização: " + String.format("%.2f", taxaComercializacao) + "%";
    }
}