public class ExecutarValidacoes {
    public static void main(String[] args) {
        System.out.println("╔══════════════════════════════════════════════════════════╗");
        System.out.println("║   DESAFIO LABORATÓRIO I - UNISINOS                       ║");
        System.out.println("║   Gerenciador de Lojas de Shopping Center                ║");
        System.out.println("║   Executando Scripts de Validação                        ║");
        System.out.println("╚══════════════════════════════════════════════════════════╝");
        System.out.println();
        
        // Validação Etapa 1
        System.out.println("═══════════════════════════════════════════════════════════");
        System.out.println("  VALIDAÇÃO ETAPA 1");
        System.out.println("═══════════════════════════════════════════════════════════\n");
        validarEtapa1();
        
        System.out.println("\n\n═══════════════════════════════════════════════════════════");
        System.out.println("  VALIDAÇÃO ETAPA 2");
        System.out.println("═══════════════════════════════════════════════════════════\n");
        validarEtapa2();
        
        System.out.println("\n\n╔══════════════════════════════════════════════════════════╗");
        System.out.println("║   VALIDAÇÃO CONCLUÍDA COM SUCESSO!                       ║");
        System.out.println("╚══════════════════════════════════════════════════════════╝");
    }
    
    private static void validarEtapa1() {
        //// Verificação da classe Loja
        Loja loja1 = new Loja("E3", 5, new Endereco("Rua", "Cidade", "Estado", "Pais", "00000", "0", ""), new Data(1, 1, 2020));
        System.out.println("[OK] Classe Loja identificada (construtor com dois parâmetros)");
        
        Loja loja2 = new Loja("E7", 20, 2000, new Endereco("Rua", "Cidade", "Estado", "Pais", "00000", "0", ""), new Data(1, 1, 2020));
        System.out.println("[OK] Classe Loja identificada (construtor com três parâmetros)");
        
        System.out.println(loja1.getNome().equals("E3") ? "[OK] Método Loja.getNome()" : "[NOK] Método Loja.getNome()");
        
        loja1.setNome("E10");
        System.out.println("[OK] Método Loja.setNome()");
        
        System.out.println(loja1.getQuantidadeFuncionarios() == 5 ? "[OK] Método Loja.getQuantidadeFuncionarios()" : "[NOK] Método Loja.getQuantidadeFuncionarios()");
        
        loja1.setQuantidadeFuncionarios(3);
        System.out.println("[OK] Método Loja.setQuantidadeFuncionarios()");
        
        System.out.println(loja1.getSalarioBaseFuncionario() == -1 ? "[OK] Método Loja.getSalarioBaseFuncionario()" : "[NOK] Método Loja.getSalarioBaseFuncionario()");
        
        loja1.setSalarioBaseFuncionario(3000);
        System.out.println("[OK] Método Loja.setSalarioBaseFuncionario()");
        
        loja1.toString();
        System.out.println("[OK] Método Loja.toString()");
        
        System.out.println(loja1.gastosComSalario() == 9000 ? "[OK] Método Loja.gastosComSalario()" : "[NOK] Método Loja.gastosComSalario()");
        
        System.out.println(loja1.tamanhoDaLoja() == 'P' ? "[OK] Método Loja.tamanhoDaLoja()" : "[NOK] Método Loja.tamanhoDaLoja()");
        
        //// Verificação da classe Produto
        Produto p1 = new Produto("Cubo mágico", 10, new Data(1, 1, 2025));
        System.out.println("\n[OK] Classe Produto identificada");
        
        p1.setNome("Cubo maravilha");
        System.out.println("[OK] Método Produto.setNome()");
        
        System.out.println(p1.getNome().equals("Cubo maravilha") ? "[OK] Método Produto.getNome()" : "[NOK] Método Produto.getNome()");
        
        p1.setPreco(20);
        System.out.println("[OK] Método Produto.setPreco()");
        
        System.out.println(p1.getPreco() == 20 ? "[OK] Método Produto.getPreco()" : "[NOK] Método Produto.getPreco()");
        
        p1.toString();
        System.out.println("[OK] Método Produto.toString()");
        
        //// Verificação da classe Endereco
        Endereco e1 = new Endereco("Rua dos Bobos", "Piraporinha", "SC", "Uruguai", "99000-100", "0", "Fundos");
        System.out.println("\n[OK] Classe Endereco identificada");
        
        e1.setNomeDaRua("Bla");
        System.out.println("[OK] Método Endereco.setNomeDaRua()");
        
        System.out.println(e1.getNomeDaRua().equals("Bla") ? "[OK] Método Endereco.getNomeDaRua()" : "[NOK] Método Endereco.getNomeDaRua()");
        
        e1.setCidade("São Leopoldo");
        System.out.println("[OK] Método Endereco.setCidade()");
        
        System.out.println(e1.getCidade().equals("São Leopoldo") ? "[OK] Método Endereco.getCidade()" : "[NOK] Método Endereco.getCidade()");
        
        e1.setEstado("RS");
        System.out.println("[OK] Método Endereco.setEstado()");
        
        System.out.println(e1.getEstado().equals("RS") ? "[OK] Método Endereco.getEstado()" : "[NOK] Método Endereco.getEstado()");
        
        e1.setPais("Brasil");
        System.out.println("[OK] Método Endereco.setPais()");
        
        System.out.println(e1.getPais().equals("Brasil") ? "[OK] Método Endereco.getPais()" : "[NOK] Método Endereco.getPais()");
        
        e1.setCep("99999-000");
        System.out.println("[OK] Método Endereco.setCep()");
        
        System.out.println(e1.getCep().equals("99999-000") ? "[OK] Método Endereco.getCep()" : "[NOK] Método Endereco.getCep()");
        
        e1.setNumero("50");
        System.out.println("[OK] Método Endereco.setNumero()");
        
        System.out.println(e1.getNumero().equals("50") ? "[OK] Método Endereco.getNumero()" : "[NOK] Método Endereco.getNumero()");
        
        e1.setComplemento("apto 502");
        System.out.println("[OK] Método Endereco.setComplemento()");
        
        System.out.println(e1.getComplemento().equals("apto 502") ? "[OK] Método Endereco.getComplemento()" : "[NOK] Método Endereco.getComplemento()");
        
        e1.toString();
        System.out.println("[OK] Método Endereco.toString()");
        
        //// Verificação da classe Data
        Data d1 = new Data(10, 3, 2023);
        System.out.println("\n[OK] Classe Data identificada");
        
        d1.setDia(15);
        System.out.println("[OK] Método Dia.setDia()");
        
        System.out.println(d1.getDia() == 15 ? "[OK] Método Dia.getDia()" : "[NOK] Método Dia.getDia()");
        
        d1.setMes(12);
        System.out.println("[OK] Método Dia.setMes()");
        
        System.out.println(d1.getMes() == 12 ? "[OK] Método Dia.getMes()" : "[NOK] Método Dia.getMes()");
        
        d1.setAno(2024);
        System.out.println("[OK] Método Dia.setAno()");
        
        System.out.println(d1.getAno() == 2024 ? "[OK] Método Dia.getAno()" : "[NOK] Método Dia.getAno()");
        
        d1.toString();
        System.out.println("[OK] Método Data.toString()");
        
        System.out.println(d1.verificaAnoBissexto() ? "[OK] Método Dia.verificaAnoBissexto()" : "[NOK] Método Dia.verificaAnoBissexto()");
    }
    
    private static void validarEtapa2() {
        //// Verificação da classe Endereco
        Endereco e1 = new Endereco("Rua dos Bobos", "Piraporinha", "SC", "Uruguai", "99000-100", "0", "Fundos");
        System.out.println("[OK] Classe Endereco identificada");
        
        //// Verificação da classe Data
        Data d1 = new Data(10, 3, 2023);
        System.out.println("[OK] Classe Data identificada");
        
        //// Verificação da classe Loja com associações
        Loja loja1 = new Loja("E3", 5, e1, d1);
        System.out.println("[OK] Classe Loja identificada (construtor com dois parâmetros + endereco + data)");
        
        Loja loja2 = new Loja("E7", 20, 2000, e1, d1);
        System.out.println("[OK] Classe Loja identificada (construtor com três parâmetros + endereco + data)");
        
        System.out.println(loja1.getNome().equals("E3") ? "[OK] Método Loja.getNome()" : "[NOK] Método Loja.getNome()");
        
        loja1.setNome("E10");
        System.out.println("[OK] Método Loja.setNome()");
        
        System.out.println(loja1.getQuantidadeFuncionarios() == 5 ? "[OK] Método Loja.getQuantidadeFuncionarios()" : "[NOK] Método Loja.getQuantidadeFuncionarios()");
        
        loja1.setQuantidadeFuncionarios(3);
        System.out.println("[OK] Método Loja.setQuantidadeFuncionarios()");
        
        System.out.println(loja1.getSalarioBaseFuncionario() == -1 ? "[OK] Método Loja.getSalarioBaseFuncionario()" : "[NOK] Método Loja.getSalarioBaseFuncionario()");
        
        loja1.setSalarioBaseFuncionario(3000);
        System.out.println("[OK] Método Loja.setSalarioBaseFuncionario()");
        
        System.out.println(loja1.getEndereco() != null ? "[OK] Método Loja.getEndereco()" : "[NOK] Método Loja.getEndereco()");
        
        loja1.setEndereco(new Endereco("Rua Tainhas", "Porto Feliz", "SP", "Brasil", "88.000-100", "67", "Sala 91"));
        System.out.println("[OK] Método Loja.setEndereco()");
        
        System.out.println(loja1.getDataFundacao() != null ? "[OK] Método Loja.getDataFundacao()" : "[NOK] Método Loja.getDataFundacao()");
        
        loja1.setDataFundacao(new Data(10, 8, 2020));
        System.out.println("[OK] Método Loja.setDataFundacao()");
        
        loja1.toString();
        System.out.println("[OK] Método Loja.toString()");
        
        System.out.println(loja1.gastosComSalario() == 9000 ? "[OK] Método Loja.gastosComSalario()" : "[NOK] Método Loja.gastosComSalario()");
        
        System.out.println(loja1.tamanhoDaLoja() == 'P' ? "[OK] Método Loja.tamanhoDaLoja()" : "[NOK] Método Loja.tamanhoDaLoja()");
        
        //// Verificação da classe Produto com data de validade
        Produto p1 = new Produto("Cubo mágico", 10, d1);
        System.out.println("\n[OK] Classe Produto identificada");
        
        p1.setNome("Cubo maravilha");
        System.out.println("[OK] Método Produto.setNome()");
        
        System.out.println(p1.getNome().equals("Cubo maravilha") ? "[OK] Método Produto.getNome()" : "[NOK] Método Produto.getNome()");
        
        p1.setPreco(20);
        System.out.println("[OK] Método Produto.setPreco()");
        
        System.out.println(p1.getPreco() == 20 ? "[OK] Método Produto.getPreco()" : "[NOK] Método Produto.getPreco()");
        
        p1.toString();
        System.out.println("[OK] Método Produto.toString()");
        
        p1.setDataValidade(new Data(10, 4, 2023));
        System.out.println("[OK] Método Produto.setDataValidade()");
        
        System.out.println(p1.getDataValidade() != null ? "[OK] Método Produto.getDataValidade()" : "[NOK] Método Produto.getDataValidade()");
        
        System.out.println(p1.estaVencido(new Data(20, 4, 2023)) ? "[OK] Método Produto.estaVencido()" : "[NOK] Método Produto.estaVencido()");
    }
}
