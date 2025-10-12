import java.util.Scanner;

public class Principal {
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        Loja loja = null;
        Produto produto = null;
        int opcao;
        
        System.out.println("=== Sistema de Gerenciamento de Loja ===\n");
        
        do {
            exibirMenu();
            opcao = lerOpcao();
            
            switch (opcao) {
                case 1:
                    loja = criarLoja();
                    break;
                case 2:
                    produto = criarProduto();
                    break;
                case 3:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        } while (opcao != 3);
        
        // Após criar os objetos, executar as verificações solicitadas
        if (loja != null && produto != null) {
            System.out.println("\n=== Verificações Finais ===");
            
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
        }
        
        scanner.close();
    }
    
    private static void exibirMenu() {
        System.out.println("\n(1) criar uma loja");
        System.out.println("(2) criar um produto");
        System.out.println("(3) sair");
        System.out.print("Digite sua opção: ");
    }
    
    private static int lerOpcao() {
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            return -1; // Opção inválida
        }
    }
    
    private static Loja criarLoja() {
        System.out.println("\n=== Criando uma Loja ===");
        
        System.out.print("Nome da loja: ");
        String nome = scanner.nextLine();
        
        System.out.print("Quantidade de funcionários: ");
        int quantidadeFuncionarios = Integer.parseInt(scanner.nextLine());
        
        System.out.print("Salário base dos funcionários (digite -1 se não quiser informar): ");
        double salarioBase = Double.parseDouble(scanner.nextLine());
        
        // Criar endereço
        System.out.println("\n--- Endereço da Loja ---");
        System.out.print("Nome da rua: ");
        String nomeDaRua = scanner.nextLine();
        
        System.out.print("Cidade: ");
        String cidade = scanner.nextLine();
        
        System.out.print("Estado: ");
        String estado = scanner.nextLine();
        
        System.out.print("País: ");
        String pais = scanner.nextLine();
        
        System.out.print("CEP: ");
        String cep = scanner.nextLine();
        
        System.out.print("Número: ");
        String numero = scanner.nextLine();
        
        System.out.print("Complemento (pressione ENTER se não houver): ");
        String complemento = scanner.nextLine();
        if (complemento.trim().isEmpty()) {
            complemento = null;
        }
        
        Endereco endereco = new Endereco(nomeDaRua, cidade, estado, pais, cep, numero, complemento);
        
        // Criar data de fundação
        System.out.println("\n--- Data de Fundação ---");
        System.out.print("Dia: ");
        int dia = Integer.parseInt(scanner.nextLine());
        
        System.out.print("Mês: ");
        int mes = Integer.parseInt(scanner.nextLine());
        
        System.out.print("Ano: ");
        int ano = Integer.parseInt(scanner.nextLine());
        
        Data dataFundacao = new Data(dia, mes, ano);
        
        // Criar a loja com base no salário informado
        Loja loja;
        if (salarioBase == -1) {
            loja = new Loja(nome, quantidadeFuncionarios, endereco, dataFundacao);
        } else {
            loja = new Loja(nome, quantidadeFuncionarios, salarioBase, endereco, dataFundacao);
        }
        
        System.out.println("\nLoja criada com sucesso!");
        return loja;
    }
    
    private static Produto criarProduto() {
        System.out.println("\n=== Criando um Produto ===");
        
        System.out.print("Nome do produto: ");
        String nome = scanner.nextLine();
        
        System.out.print("Preço do produto: ");
        double preco = Double.parseDouble(scanner.nextLine());
        
        // Criar data de validade
        System.out.println("\n--- Data de Validade ---");
        System.out.print("Dia: ");
        int dia = Integer.parseInt(scanner.nextLine());
        
        System.out.print("Mês: ");
        int mes = Integer.parseInt(scanner.nextLine());
        
        System.out.print("Ano: ");
        int ano = Integer.parseInt(scanner.nextLine());
        
        Data dataValidade = new Data(dia, mes, ano);
        
        Produto produto = new Produto(nome, preco, dataValidade);
        
        System.out.println("\nProduto criado com sucesso!");
        return produto;
    }
}