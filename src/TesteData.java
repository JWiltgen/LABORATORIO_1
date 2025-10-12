public class TesteData {
    public static void main(String[] args) {
        System.out.println("=== Teste de Validação de Data ===");
        
        // Data válida
        System.out.println("Criando data válida: 15/03/2023");
        Data data1 = new Data(15, 3, 2023);
        System.out.println("Resultado: " + data1.toString());
        
        // Data inválida - dia 31 em abril
        System.out.println("\nCriando data inválida: 31/04/2023");
        Data data2 = new Data(31, 4, 2023);
        System.out.println("Resultado: " + data2.toString());
        
        // Data válida - 29 de fevereiro em ano bissexto
        System.out.println("\nCriando data válida: 29/02/2024 (ano bissexto)");
        Data data3 = new Data(29, 2, 2024);
        System.out.println("Resultado: " + data3.toString());
        
        // Data inválida - 29 de fevereiro em ano não bissexto
        System.out.println("\nCriando data inválida: 29/02/2023 (ano não bissexto)");
        Data data4 = new Data(29, 2, 2023);
        System.out.println("Resultado: " + data4.toString());
        
        System.out.println("\n=== Teste de Tamanho de Loja ===");
        
        Loja loja1 = new Loja("Loja P", 5);
        System.out.println("Loja com 5 funcionários: " + loja1.tamanhoDaLoja());
        
        Loja loja2 = new Loja("Loja M", 15);
        System.out.println("Loja com 15 funcionários: " + loja2.tamanhoDaLoja());
        
        Loja loja3 = new Loja("Loja G", 35);
        System.out.println("Loja com 35 funcionários: " + loja3.tamanhoDaLoja());
    }
}