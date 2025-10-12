public class Shopping {
    private String nome;
    private Endereco endereco;
    private Loja[] lojas;
    
    public Shopping(String nome, Endereco endereco, int quantidadeMaximaLojas) {
        this.nome = nome;
        this.endereco = endereco;
        this.lojas = new Loja[quantidadeMaximaLojas];
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public Endereco getEndereco() {
        return endereco;
    }
    
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    public Loja[] getLojas() {
        return lojas;
    }
    
    public boolean insereLoja(Loja loja) {
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] == null) {
                lojas[i] = loja;
                return true;
            }
        }
        return false; // Array cheio
    }
    
    public boolean removeLoja(String nomeLoja) {
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] != null && lojas[i].getNome().equals(nomeLoja)) {
                lojas[i] = null;
                return true;
            }
        }
        return false; // Loja não encontrada
    }
    
    public int quantidadeLojasPorTipo(String tipoLoja) {
        int contador = 0;
        
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] != null) {
                String className = lojas[i].getClass().getSimpleName();
                
                // Mapear os nomes das classes para os tipos solicitados
                switch (tipoLoja) {
                    case "Cosmético":
                    case "Cosmetico":
                        if (className.equals("Cosmetico")) {
                            contador++;
                        }
                        break;
                    case "Vestuário":
                    case "Vestuario":
                        if (className.equals("Vestuario")) {
                            contador++;
                        }
                        break;
                    case "Bijuteria":
                        if (className.equals("Bijuteria")) {
                            contador++;
                        }
                        break;
                    case "Alimentação":
                    case "Alimentacao":
                        if (className.equals("Alimentacao")) {
                            contador++;
                        }
                        break;
                    case "Informática":
                    case "Informatica":
                        if (className.equals("Informatica")) {
                            contador++;
                        }
                        break;
                    default:
                        return -1; // Tipo não reconhecido
                }
            }
        }
        
        return contador;
    }
    
    public Informatica lojaSeguroMaisCaro() {
        Informatica lojaMaisCara = null;
        double maiorSeguro = -1;
        
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] != null && lojas[i] instanceof Informatica) {
                Informatica lojaInformatica = (Informatica) lojas[i];
                if (lojaInformatica.getSeguroEletronicos() > maiorSeguro) {
                    maiorSeguro = lojaInformatica.getSeguroEletronicos();
                    lojaMaisCara = lojaInformatica;
                }
            }
        }
        
        return lojaMaisCara;
    }
    
    @Override
    public String toString() {
        String resultado = "Shopping: " + nome;
        
        if (endereco != null) {
            resultado += " - Endereço: " + endereco.toString();
        }
        
        // Contar quantas lojas existem
        int totalLojas = 0;
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] != null) {
                totalLojas++;
            }
        }
        
        resultado += " - Total de Lojas: " + totalLojas + "/" + lojas.length;
        
        return resultado;
    }
}