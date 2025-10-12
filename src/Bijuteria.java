public class Bijuteria extends Loja {
    private double metaVendas;
    
    // Construtor sem salário base
    public Bijuteria(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao, double metaVendas) {
        super(nome, quantidadeFuncionarios, endereco, dataFundacao);
        this.metaVendas = metaVendas;
    }
    
    // Construtor com salário base
    public Bijuteria(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, double metaVendas) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao);
        this.metaVendas = metaVendas;
    }
    
    // Construtor com estoque (para Etapa 4)
    public Bijuteria(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao, double metaVendas, int tamanhoEstoque) {
        super(nome, quantidadeFuncionarios, endereco, dataFundacao, tamanhoEstoque);
        this.metaVendas = metaVendas;
    }
    
    // Construtor com salário base e estoque (para Etapa 4)
    public Bijuteria(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, double metaVendas, int tamanhoEstoque) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, tamanhoEstoque);
        this.metaVendas = metaVendas;
    }
    
    public double getMetaVendas() {
        return metaVendas;
    }
    
    public void setMetaVendas(double metaVendas) {
        this.metaVendas = metaVendas;
    }
    
    @Override
    public String toString() {
        return super.toString() + " - Meta de Vendas: R$ " + String.format("%.2f", metaVendas);
    }
}