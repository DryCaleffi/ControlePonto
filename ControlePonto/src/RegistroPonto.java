import java.time.LocalDate;
import java.time.LocalDateTime;
//importação para formatação na hora de mostrar os registros
import java.time.format.DateTimeFormatter;

public class RegistroPonto {

	private long IdRegPonto;
	private Funcionario func;
	private LocalDate dataRegistro;
	private LocalDateTime horaEntrada;
	private LocalDateTime horaSaida;

	public long getIdRegPonto() {
		return IdRegPonto;
	}

	public void setIdRegPonto(long idRegPonto) {
		IdRegPonto = idRegPonto;
	}

	public Funcionario getFunc() {
		return func;
	}

	public void setFunc(Funcionario func) {
		this.func = func;
	}

	public LocalDate getDataRegistro() {
		return dataRegistro;
	}

	public void setDataRegistro(LocalDate dataRegistro) {
		this.dataRegistro = dataRegistro;
	}

	public LocalDateTime getHoraEntrada() {
		return horaEntrada;
	}

	public void setHoraEntrada(LocalDateTime horaEntrada) {
		this.horaEntrada = horaEntrada;
	}

	public LocalDateTime getHoraSaida() {
		return horaSaida;
	}

	public void setHoraSaida(LocalDateTime horaSaida) {
		this.horaSaida = horaSaida;
	}

	// tornando publico a classe
	public RegistroPonto(int idRegistro, Funcionario funcionario) {
	this.IdRegPonto = idRegistro;
	this.func = funcionario;
	this.dataRegistro = LocalDate.now();
}

	public void registrarEntrada() {
		this.dataRegistro = LocalDate.now();
		this.horaEntrada = LocalDateTime.now();
		exibirEntrada();
	}

	public void registrarSaida() {
		this.horaSaida = LocalDateTime.now();
		exibirSaida();
	}


	private void exibirEntrada() {
		DateTimeFormatter formatterData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter formatterHora = DateTimeFormatter.ofPattern("HH:mm:ss");

		System.out.println("\nFuncionário: " + func.getNome());
		System.out.println("Data de Registro: " + dataRegistro.format(formatterData));
		System.out.println("Hora de Entrada: " + horaEntrada.format(formatterHora));
	}

	public void exibirSaida() {
		// importando a formatação
		DateTimeFormatter formatterData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter formatterHora = DateTimeFormatter.ofPattern("HH:mm:ss");

		System.out.println("==================================");
		System.out.println("Funcionário: " + func.getNome());
// estava dando erro , por conta de valores nulos, acrescentamos a variavel para testar antes de imprimir, assim evitamos a falha
		if (dataRegistro != null) {
			System.out.println("Data de Registro: " + dataRegistro.format(formatterData));
		}

		if (horaEntrada != null) {
			System.out.println("Hora de Entrada: " + horaEntrada.format(formatterHora));
		}

		if (horaSaida != null) {
			System.out.println("Hora de Saída: " + horaSaida.format(formatterHora));
		}
	}
}




