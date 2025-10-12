public class TesteEtapa4 {
    public static void main(String[] args) {
        System.out.println("=== Teste da Etapa 4: Arrays ===\n");
        
        // Criar objetos de apoio
        Endereco endereco1 = new Endereco("Av. Shopping Center", "São Paulo", "SP", "Brasil", "01000-000", "500", null);
        Endereco endereco2 = new Endereco("Rua das Lojas", "Rio de Janeiro", "RJ", "Brasil", "20000-000", "200", "Térreo");
        Data dataFundacao = new Data(10, 5, 2020);
        Data dataAlvara = new Data(15, 5, 2020);
        Data dataValidade1 = new Data(30, 12, 2024);
        Data dataValidade2 = new Data(15, 6, 2024);
        Data dataValidade3 = new Data(20, 8, 2024);
        
        // Criar produtos
        Produto produto1 = new Produto("Notebook Dell", 2500.0, dataValidade1);
        Produto produto2 = new Produto("Mouse Gamer", 150.0, dataValidade2);
        Produto produto3 = new Produto("Teclado Mecânico", 300.0, dataValidade3);
        Produto produto4 = new Produto("Monitor 24''", 800.0, dataValidade1);
        
        System.out.println("=== Teste das Lojas com Estoque ===");
        
        // Criar loja de informática com estoque
        Informatica lojaInformatica = new Informatica("TechWorld", 10, 3000.0, endereco1, dataFundacao, 400.0, 3);
        System.out.println("1. Loja criada: " + lojaInformatica.getNome());
        System.out.println("   Capacidade do estoque: " + lojaInformatica.getEstoqueProdutos().length);
        
        // Testar inserção de produtos
        System.out.println("\n=== Teste de Inserção de Produtos ===");
        boolean inseriu1 = lojaInformatica.insereProduto(produto1);
        System.out.println("Inseriu produto 1: " + inseriu1);
        
        boolean inseriu2 = lojaInformatica.insereProduto(produto2);
        System.out.println("Inseriu produto 2: " + inseriu2);
        
        boolean inseriu3 = lojaInformatica.insereProduto(produto3);
        System.out.println("Inseriu produto 3: " + inseriu3);
        
        // Tentar inserir além da capacidade
        boolean inseriu4 = lojaInformatica.insereProduto(produto4);
        System.out.println("Inseriu produto 4 (deve falhar): " + inseriu4);
        
        // Imprimir produtos
        System.out.println("\n=== Produtos no Estoque ===");
        lojaInformatica.imprimeProdutos();
        
        // Testar remoção de produtos
        System.out.println("\n=== Teste de Remoção de Produtos ===");
        boolean removeu1 = lojaInformatica.removeProduto("Mouse Gamer");
        System.out.println("Removeu 'Mouse Gamer': " + removeu1);
        
        boolean removeu2 = lojaInformatica.removeProduto("Produto Inexistente");
        System.out.println("Removeu produto inexistente: " + removeu2);
        
        // Agora pode inserir o produto 4
        boolean inseriu4Agora = lojaInformatica.insereProduto(produto4);
        System.out.println("Inseriu produto 4 após remoção: " + inseriu4Agora);
        
        System.out.println("\nProdutos após remoção e nova inserção:");
        lojaInformatica.imprimeProdutos();
        
        System.out.println("\n=== Teste da Classe Shopping ===");
        
        // Criar shopping
        Shopping shopping = new Shopping("MegaCenter", endereco1, 4);
        System.out.println("Shopping criado: " + shopping.toString());
        
        // Criar diferentes tipos de lojas
        Cosmetico lojaCosmetico = new Cosmetico("Beauty Store", 8, 2200.0, endereco2, dataFundacao, 15.0, 5);
        Vestuario lojaVestuario = new Vestuario("Fashion Boutique", 12, 1800.0, endereco2, dataFundacao, true, 10);
        Bijuteria lojaBijuteria = new Bijuteria("Jóias Preciosas", 6, 2500.0, endereco2, dataFundacao, 12000.0, 8);
        Alimentacao lojaAlimentacao = new Alimentacao("Delícias do Chef", 15, 1600.0, endereco2, dataFundacao, dataAlvara, 20);
        
        // Criar segunda loja de informática para testar método lojaSeguroMaisCaro
        Informatica lojaInformatica2 = new Informatica("Cyber Tech", 8, 2800.0, endereco2, dataFundacao, 600.0, 5);
        
        System.out.println("\n=== Teste de Inserção de Lojas no Shopping ===");
        
        boolean inseriuLoja1 = shopping.insereLoja(lojaCosmetico);
        System.out.println("Inseriu loja cosmético: " + inseriuLoja1);
        
        boolean inseriuLoja2 = shopping.insereLoja(lojaVestuario);
        System.out.println("Inseriu loja vestuário: " + inseriuLoja2);
        
        boolean inseriuLoja3 = shopping.insereLoja(lojaBijuteria);
        System.out.println("Inseriu loja bijuteria: " + inseriuLoja3);
        
        boolean inseriuLoja4 = shopping.insereLoja(lojaInformatica);
        System.out.println("Inseriu loja informática 1: " + inseriuLoja4);
        
        // Tentar inserir além da capacidade
        boolean inseriuLoja5 = shopping.insereLoja(lojaAlimentacao);
        System.out.println("Inseriu loja alimentação (deve falhar): " + inseriuLoja5);
        
        System.out.println("\nShopping após inserções: " + shopping.toString());
        
        System.out.println("\n=== Teste de Contagem por Tipo ===");
        
        System.out.println("Lojas de Cosmético: " + shopping.quantidadeLojasPorTipo("Cosmetico"));
        System.out.println("Lojas de Vestuário: " + shopping.quantidadeLojasPorTipo("Vestuario"));
        System.out.println("Lojas de Bijuteria: " + shopping.quantidadeLojasPorTipo("Bijuteria"));
        System.out.println("Lojas de Informática: " + shopping.quantidadeLojasPorTipo("Informatica"));
        System.out.println("Lojas de Alimentação: " + shopping.quantidadeLojasPorTipo("Alimentacao"));
        System.out.println("Tipo inválido: " + shopping.quantidadeLojasPorTipo("TipoInexistente"));
        
        System.out.println("\n=== Teste de Remoção de Loja ===");
        
        boolean removeuLoja1 = shopping.removeLoja("Fashion Boutique");
        System.out.println("Removeu 'Fashion Boutique': " + removeuLoja1);
        
        boolean removeuLoja2 = shopping.removeLoja("Loja Inexistente");
        System.out.println("Removeu loja inexistente: " + removeuLoja2);
        
        // Agora pode inserir a loja de alimentação
        boolean inseriuLojaAlimentacaoAgora = shopping.insereLoja(lojaAlimentacao);
        System.out.println("Inseriu loja alimentação após remoção: " + inseriuLojaAlimentacaoAgora);
        
        // Inserir segunda loja de informática
        boolean inseriuInformatica2 = shopping.insereLoja(lojaInformatica2);
        System.out.println("Inseriu segunda loja informática: " + inseriuInformatica2);
        
        System.out.println("\nShopping final: " + shopping.toString());
        
        System.out.println("\n=== Teste lojaSeguroMaisCaro ===");
        
        Informatica lojaMaisCara = shopping.lojaSeguroMaisCaro();
        if (lojaMaisCara != null) {
            System.out.println("Loja com maior seguro: " + lojaMaisCara.getNome());
            System.out.println("Valor do seguro: R$ " + String.format("%.2f", lojaMaisCara.getSeguroEletronicos()));
        } else {
            System.out.println("Nenhuma loja de informática encontrada");
        }
        
        System.out.println("\n=== Contagem final por tipo ===");
        System.out.println("Lojas de Cosmético: " + shopping.quantidadeLojasPorTipo("Cosmetico"));
        System.out.println("Lojas de Vestuário: " + shopping.quantidadeLojasPorTipo("Vestuario"));
        System.out.println("Lojas de Bijuteria: " + shopping.quantidadeLojasPorTipo("Bijuteria"));
        System.out.println("Lojas de Informática: " + shopping.quantidadeLojasPorTipo("Informatica"));
        System.out.println("Lojas de Alimentação: " + shopping.quantidadeLojasPorTipo("Alimentacao"));
    }
}