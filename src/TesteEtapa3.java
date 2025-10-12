public class TesteEtapa3 {
    public static void main(String[] args) {
        System.out.println("=== Teste da Etapa 3: Herança e Polimorfismo ===\n");
        
        // Criar objetos de apoio
        Endereco endereco = new Endereco("Rua Shopping", "São Paulo", "SP", "Brasil", "01000-000", "100", "Loja 15");
        Data dataFundacao = new Data(15, 6, 2020);
        Data dataAlvara = new Data(20, 6, 2020);
        Data dataValidade = new Data(30, 12, 2023);
        
        // Criar produtos para testar toString atualizado
        System.out.println("=== Teste do Produto com toString atualizado ===");
        Produto produto1 = new Produto("Notebook", 2500.0, dataValidade);
        System.out.println(produto1.toString());
        
        Produto produto2 = new Produto("Mouse", 25.0); // Sem data de validade
        System.out.println(produto2.toString());
        
        System.out.println("\n=== Teste das Classes Filhas de Loja ===");
        
        // Criar uma loja de cosméticos
        Cosmetico lojaCosmetico = new Cosmetico("Beleza Total", 8, 2200.0, endereco, dataFundacao, 15.5);
        System.out.println("1. " + lojaCosmetico.toString());
        
        // Criar uma loja de vestuário
        Vestuario lojaVestuario = new Vestuario("Moda Chic", 12, 1800.0, endereco, dataFundacao, true);
        System.out.println("2. " + lojaVestuario.toString());
        
        // Criar uma loja de bijuteria
        Bijuteria lojaBijuteria = new Bijuteria("Jóias & Cia", 6, 2000.0, endereco, dataFundacao, 8000.0);
        System.out.println("3. " + lojaBijuteria.toString());
        
        // Criar uma loja de alimentação
        Alimentacao lojaAlimentacao = new Alimentacao("Sabor do Brasil", 20, 1600.0, endereco, dataFundacao, dataAlvara);
        System.out.println("4. " + lojaAlimentacao.toString());
        
        // Criar uma loja de informática
        Informatica lojaInformatica = new Informatica("TechStore", 15, 2800.0, endereco, dataFundacao, 450.0);
        System.out.println("5. " + lojaInformatica.toString());
        
        System.out.println("\n=== Teste de Polimorfismo ===");
        
        // Array de lojas demonstrando polimorfismo
        Loja[] lojas = {
            lojaCosmetico,
            lojaVestuario, 
            lojaBijuteria,
            lojaAlimentacao,
            lojaInformatica
        };
        
        System.out.println("Usando polimorfismo para chamar toString() de cada loja:");
        for (int i = 0; i < lojas.length; i++) {
            System.out.println((i+1) + ". " + lojas[i].toString());
        }
        
        System.out.println("\n=== Teste dos Métodos Específicos ===");
        
        // Testando métodos getters e setters específicos
        System.out.println("Taxa original do cosmético: " + lojaCosmetico.getTaxaComercializacao() + "%");
        lojaCosmetico.setTaxaComercializacao(20.0);
        System.out.println("Nova taxa do cosmético: " + lojaCosmetico.getTaxaComercializacao() + "%");
        
        System.out.println("Produtos importados (vestuário): " + lojaVestuario.getProdutosImportados());
        lojaVestuario.setProdutosImportados(false);
        System.out.println("Após alterar - Produtos importados: " + lojaVestuario.getProdutosImportados());
        
        System.out.println("Meta de vendas (bijuteria): R$ " + String.format("%.2f", lojaBijuteria.getMetaVendas()));
        lojaBijuteria.setMetaVendas(10000.0);
        System.out.println("Nova meta de vendas: R$ " + String.format("%.2f", lojaBijuteria.getMetaVendas()));
        
        System.out.println("Data do alvará (alimentação): " + lojaAlimentacao.getDataAlvara().toString());
        lojaAlimentacao.setDataAlvara(new Data(25, 6, 2020));
        System.out.println("Nova data do alvará: " + lojaAlimentacao.getDataAlvara().toString());
        
        System.out.println("Seguro eletrônicos (informática): R$ " + String.format("%.2f", lojaInformatica.getSeguroEletronicos()));
        lojaInformatica.setSeguroEletronicos(500.0);
        System.out.println("Novo seguro eletrônicos: R$ " + String.format("%.2f", lojaInformatica.getSeguroEletronicos()));
    }
}