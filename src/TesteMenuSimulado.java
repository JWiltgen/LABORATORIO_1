public class TesteMenuSimulado {
    public static void main(String[] args) {
        System.out.println("=== Simulação do Menu Principal ===");
        System.out.println("Este teste simula a criação de objetos sem entrada do usuário\n");
        
        // Simular criação de uma loja
        System.out.println("1. Criando uma loja:");
        Endereco endereco = new Endereco("Av. Principal", "São Paulo", "SP", "Brasil", "01000-000", "500", null);
        Data dataFundacao = new Data(10, 3, 2015);
        Loja loja = new Loja("Mega Loja", 25, 3000.0, endereco, dataFundacao);
        System.out.println("Loja criada: " + loja.getNome());
        
        // Simular criação de um produto
        System.out.println("\n2. Criando um produto:");
        Data dataValidade = new Data(15, 9, 2023); // Vencido em relação a 20/10/2023
        Produto produto = new Produto("Chocolate Premium", 12.50, dataValidade);
        System.out.println("Produto criado: " + produto.getNome());
        
        // Verificações finais (conforme solicitado na Etapa 2)
        System.out.println("\n=== Verificações Finais ===");
        
        Data dataVerificacao = new Data(20, 10, 2023);
        if (produto.estaVencido(dataVerificacao)) {
            System.out.println("PRODUTO VENCIDO");
        } else {
            System.out.println("PRODUTO NÃO VENCIDO");
        }
        
        System.out.println("\nInformações da loja criada:");
        System.out.println(loja.toString());
        
        System.out.println("\n=== Teste adicional com produto válido ===");
        
        // Teste com produto não vencido
        Data dataValidadeValida = new Data(30, 12, 2023);
        Produto produtoValido = new Produto("Biscoito", 5.99, dataValidadeValida);
        
        if (produtoValido.estaVencido(dataVerificacao)) {
            System.out.println("PRODUTO VENCIDO");
        } else {
            System.out.println("PRODUTO NÃO VENCIDO");
        }
    }
}