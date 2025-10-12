public class TestePrincipal {
    public static void main(String[] args) {
        System.out.println("=== Teste Automático da Etapa 2 ===");
        
        // Criar um endereço de teste
        Endereco endereco = new Endereco("Rua das Flores", "Porto Alegre", "RS", "Brasil", "90000-000", "123", "Sala 45");
        
        // Criar uma data de fundação
        Data dataFundacao = new Data(15, 5, 2020);
        
        // Criar uma loja
        Loja loja = new Loja("Loja Teste", 15, 2500.0, endereco, dataFundacao);
        
        // Criar um produto com data de validade
        Data dataValidade = new Data(10, 10, 2023); // Data anterior a 20/10/2023
        Produto produto = new Produto("Produto Teste", 25.90, dataValidade);
        
        // Verificar se produto está vencido em 20/10/2023
        Data dataVerificacao = new Data(20, 10, 2023);
        if (produto.estaVencido(dataVerificacao)) {
            System.out.println("PRODUTO VENCIDO");
        } else {
            System.out.println("PRODUTO NÃO VENCIDO");
        }
        
        // Imprimir informações da loja
        System.out.println("\nInformações da loja criada:");
        System.out.println(loja.toString());
        
        System.out.println("\n=== Teste com produto não vencido ===");
        
        // Teste com produto não vencido
        Data dataValidadeFutura = new Data(25, 12, 2023); // Data posterior a 20/10/2023
        Produto produto2 = new Produto("Produto Futuro", 15.50, dataValidadeFutura);
        
        if (produto2.estaVencido(dataVerificacao)) {
            System.out.println("PRODUTO VENCIDO");
        } else {
            System.out.println("PRODUTO NÃO VENCIDO");
        }
    }
}