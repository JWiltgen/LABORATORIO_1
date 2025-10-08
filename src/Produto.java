public class Produto {
    private String nome;
    private double preco;
    private Data dataValidade;

    // Construtor
    public Produto(String nome, double preco, Data dataValidade) {
        this.nome = nome;
        this.preco = preco;
        this.dataValidade = dataValidade;
    }

    // Métodos de acesso (getters e setters)
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

    // Método toString
    @Override
    public String toString() {
        return "Produto: " + nome + ", Preço: R$ " + preco + ", Validade: " + dataValidade;
    }

    // Método estaVencido
    public boolean estaVencido(Data data) {
        // Compara ano
        if (dataValidade.getAno() < data.getAno()) {
            return true;
        } else if (dataValidade.getAno() > data.getAno()) {
            return false;
        }

        // Ano é igual, compara mês
        if (dataValidade.getMes() < data.getMes()) {
            return true;
        } else if (dataValidade.getMes() > data.getMes()) {
            return false;
        }

        // Ano e mês são iguais, compara dia
        if (dataValidade.getDia() < data.getDia()) {
            return true;
        } else {
            return false;
        }
    }
}
