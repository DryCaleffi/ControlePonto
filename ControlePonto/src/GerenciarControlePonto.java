//Adryelle Caroline de Souza Calefi
//Tabata Etiele Roberto da Silva

public class GerenciarControlePonto {
	// Classe responsável por popular as demais classes e mostrar os dados.
	public static void main(String[] args) throws InterruptedException {

		// Iniciar a classe gerente e popular com dados.
		Gerente gerente = new Gerente();
		gerente.setIdFunc(1);
		gerente.setNome("Tabata Etiele");
		gerente.setEmail("Tabata.Etiele@fatec.com");
		gerente.setDocumento("123.456.789-00");
		gerente.setLogin("TabataE");
		gerente.setSenha("senha123");

		// Exibir dados do gerente
		System.out.println("---- Gerente ----");
		System.out.println("ID: " + gerente.getIdFunc());
		System.out.println("Nome: " + gerente.getNome());
		System.out.println("Email: " + gerente.getEmail());
		System.out.println("Documento: " + gerente.getDocumento());
		System.out.println("Login: " + gerente.getLogin());
		System.out.println("Senha: " + gerente.getSenha());

		// Iniciar a classe secretária e adicionar dados
		Secretaria secretaria = new Secretaria();
		secretaria.setIdFunc(2);
		secretaria.setNome("Adryelle Calefi");
		secretaria.setEmail("Adryelle.Calefi@fatec.com");
		secretaria.setDocumento("987.654.321-00");
		secretaria.setTelefone("(11) 99999-8888");
		secretaria.setRamal("1234");

		// Exibir dados da secretaria
		System.out.println("\n---- Secretaria ----");
		System.out.println("ID: " + secretaria.getIdFunc());
		System.out.println("Nome: " + secretaria.getNome());
		System.out.println("Email: " + secretaria.getEmail());
		System.out.println("Documento: " + secretaria.getDocumento());
		System.out.println("Telefone: " + secretaria.getTelefone());
		System.out.println("Ramal: " + secretaria.getRamal());

		Operador operador = new Operador();
		operador.setIdFunc(3);
		operador.setNome("Jamal");
		operador.setEmail("jamal.mm@fatec.com");
		operador.setDocumento("555.666.777-88");
		operador.setValorHora(25.50);

		System.out.println("\n---- Operador ----");
		System.out.println("ID: " + operador.getIdFunc());
		System.out.println("Nome: " + operador.getNome());
		System.out.println("Email: " + operador.getEmail());
		System.out.println("Documento: " + operador.getDocumento());
		System.out.println("Valor Hora: R$ " + operador.getValorHora());

		try {
			// Registro de entradas
			RegistroPonto reg1 = new RegistroPonto(1, gerente);
			reg1.registrarEntrada();
			Thread.sleep(1000);

			RegistroPonto reg2 = new RegistroPonto(2, operador);
			reg2.registrarEntrada();
			Thread.sleep(1000);

			RegistroPonto reg3 = new RegistroPonto(3, secretaria);
			reg3.registrarEntrada();
			Thread.sleep(1000);

			// Registro de saídas
			RegistroPonto reg4 = new RegistroPonto(4, gerente);
			reg4.registrarSaida();
			Thread.sleep(1000);

			RegistroPonto reg5 = new RegistroPonto(5, operador);
			reg5.registrarSaida();
			Thread.sleep(1000);

			RegistroPonto reg6 = new RegistroPonto(6, secretaria);
			reg6.registrarSaida();

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}