import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ExecutarTodosValidadores {
    public static void main(String[] args) {
        System.out.println("============================================");
        System.out.println("     EXECUTANDO TODOS OS VALIDADORES");
        System.out.println("============================================");
        System.out.println();
        
        String[] validadores = {
            "ValidadorEtapa1",
            "ValidadorEtapa2", 
            "ValidadorEtapa3",
            "ValidadorEtapa4"
        };
        
        for (int i = 0; i < validadores.length; i++) {
            System.out.println("[" + (i + 1) + "/4] Executando " + validadores[i] + "...");
            System.out.println("----------------------------------------");
            
            try {
                ProcessBuilder pb = new ProcessBuilder("java", "-cp", "bin", validadores[i]);
                Process process = pb.start();
                
                // Ler a saída do processo
                BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
                
                // Aguardar o processo terminar
                int exitCode = process.waitFor();
                if (exitCode != 0) {
                    System.err.println("Erro ao executar " + validadores[i] + " (código: " + exitCode + ")");
                }
                
            } catch (Exception e) {
                System.err.println("Erro ao executar " + validadores[i] + ": " + e.getMessage());
            }
            
            System.out.println();
        }
        
        System.out.println("============================================");
        System.out.println("     TODOS OS VALIDADORES EXECUTADOS!");
        System.out.println("============================================");
    }
}