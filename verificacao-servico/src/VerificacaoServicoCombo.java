import java.util.Scanner;

public class VerificacaoServicoCombo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Solicitando ao usuário a lista de serviços contratados
		System.out.print("Digite os serviços contratados separados por vírgula: ");
		String input = scanner.nextLine();

		// Convertendo a entrada em uma lista de strings
		// recebe os valores da variável input
		String[] servicosContratados = input.split(",");

		// Verificando se o cliente contratou um combo completo
		String resultado = verificarComboCompleto(servicosContratados);

		// Exibindo o resultado
		System.out.println(resultado);

		// Fechando o scanner
		scanner.close();
	}
	
	// método que verifica os serviços contratados
	public static String verificarComboCompleto(String[] servicosContratados) {
		// Variáveis booleanas para verificar a contratação de cada serviço
		boolean movelContratado = false;
		boolean bandaLargaContratada = false;
		boolean tvContratada = false;

		// Iterando sobre os serviços contratados
		//variavel temporária : Array
		for (String servico : servicosContratados) {
			switch (servico.trim().toLowerCase()) {
			case "movel":
				movelContratado = true;
				break;
			case "banda larga":
				bandaLargaContratada = true;
				break;
			case "tv":
				tvContratada = true;
				break;
			}
		}

		// Verificando se todos os serviços foram contratados
		// se todos forem (true)
		if (movelContratado && bandaLargaContratada && tvContratada) {
			return "Combo Completo";
		} else {
			return "Combo Incompleto";
		}
	}
}
