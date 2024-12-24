import java.util.Scanner;

public class VerificacaoServico {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Entrada do serviço a ser verificado
        System.out.print("Digite o serviço: ");
        String servico = scanner.nextLine().trim();
        
        // Entrada do nome do cliente e os serviços contratados
        System.out.print("Digite o cliente e serviços contratados: ");
        String entradaCliente = scanner.nextLine().trim();
        
        // Separando o nome do cliente e os serviços contratados
        String[] partes = entradaCliente.split(",");
        String nomeCliente = partes[0];
        boolean contratado = false;
        
        // Verificar se o serviço está na lista de serviços contratados
        for (int i = 1; i < partes.length; i++) {
        	//se partes de [i] for igual(maiúsculo/ minúsculo) a servico (entrada)
            if (partes[i].equalsIgnoreCase(servico)) {
                contratado = true;
                break;
            }
        }
        
        // Exibir o resultado
        // Se contratado for igual a true
        if (contratado) {
            System.out.println("\nCliente "+ nomeCliente + " já contratou este serviço");
        } else {
        	System.out.println("\nCliente "+ nomeCliente + " ainda não contratou este serviço");
        }
        
        scanner.close();
    }
}
