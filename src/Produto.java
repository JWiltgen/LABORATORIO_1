public class Produto {
    private String nome;
    private double preco;
    private Data dataValidade;
    
    // Construtor com 2 parâmetros (Etapa 1)
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
        this.dataValidade = null;
    }
    
    // Construtor com 3 parâmetros (Etapa 2) - Construtor principal
    public Produto(String nome, double preco, Data dataValidade) {
        this.nome = nome;
        this.preco = preco;
        this.dataValidade = dataValidade;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public double getPreco() {
        return preco;
    }
    
    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    public Data getDataValidade() {
        return dataValidade;
    }
    
    public void setDataValidade(Data dataValidade) {
        this.dataValidade = dataValidade;
    }
    
    public boolean estaVencido(Data data) {
        if (dataValidade == null) {
            return false;
        }
        
        // Compara ano primeiro
        if (data.getAno() > dataValidade.getAno()) {
            return true;
        } else if (data.getAno() < dataValidade.getAno()) {
            return false;
        }
        
        // Anos iguais, compara mês
        if (data.getMes() > dataValidade.getMes()) {
            return true;
        } else if (data.getMes() < dataValidade.getMes()) {
            return false;
        }
        
        // Meses iguais, compara dia
        return data.getDia() > dataValidade.getDia();
    }
    
    @Override
    public String toString() {
        String resultado = "Produto: " + nome + " - Preço: R$ " + String.format("%.2f", preco);
        if (dataValidade != null) {
            resultado += " - Validade: " + dataValidade.toString();
        }
        return resultado;
    }
}