package projetofinal;

public class Gafanhoto extends Pessoa {

	public Gafanhoto(String nome, int idade, String sexo, String login) {
		super(nome, idade, sexo);
		this.Login = login;
		this.totAssistido = 0;
		// TODO Auto-generated constructor stub
	}

	private String Login;
	private int totAssistido;

	// Especial methods

	public String getLogin() {
		return Login;
	}

	public void setLogin(String login) {
		Login = login;
	}

	public int getTotAssistido() {
		return totAssistido;
	}

	public void setTotAssistido(int totAssistido) {
		this.totAssistido = totAssistido;
	}

	// Methods

	public void viuMaisUm() {
		this.setTotAssistido(getTotAssistido() + 1);
	}

	@Override
	public String toString() {
		return "Gafanhoto [Login=" + Login + ", totAssistido=" + totAssistido + ", nome=" + nome + ", idade=" + idade
				+ ", sexo=" + sexo + ", experiencia=" + experiencia + "]";
	}
	
	

}
