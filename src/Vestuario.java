public class Vestuario extends Loja {
    private boolean produtosImportados;
    
    // Construtor sem salário base
    public Vestuario(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao, boolean produtosImportados) {
        super(nome, quantidadeFuncionarios, endereco, dataFundacao);
        this.produtosImportados = produtosImportados;
    }
    
    // Construtor com salário base
    public Vestuario(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, boolean produtosImportados) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao);
        this.produtosImportados = produtosImportados;
    }
    
    // Construtor com estoque (para Etapa 4)
    public Vestuario(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao, boolean produtosImportados, int tamanhoEstoque) {
        super(nome, quantidadeFuncionarios, endereco, dataFundacao, tamanhoEstoque);
        this.produtosImportados = produtosImportados;
    }
    
    // Construtor com salário base e estoque (para Etapa 4)
    public Vestuario(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, boolean produtosImportados, int tamanhoEstoque) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, tamanhoEstoque);
        this.produtosImportados = produtosImportados;
    }
    
    public boolean getProdutosImportados() {
        return produtosImportados;
    }
    
    public void setProdutosImportados(boolean produtosImportados) {
        this.produtosImportados = produtosImportados;
    }
    
    @Override
    public String toString() {
        String importado = produtosImportados ? "Sim" : "Não";
        return super.toString() + " - Produtos Importados: " + importado;
    }
}