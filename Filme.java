package segundaprova;

public class Filme extends Midia {

	private String diretor;
	private int duracaoMinutos;
	
	@Override
	public void exibirInformacoes() {
		System.out.println("\n");
		System.out.println("Título: " + this.titulo);
		System.out.println("Autor: " + this.autor);
		System.out.println("Ano de publicação: " + this.anoPublicacao);
		System.out.println("Diretor: " + this.diretor);
		System.out.println("Duração em minutos: " + this.duracaoMinutos);
	}

	public Filme(String titulo, String autor, int anoPublicacao, String diretor, int duracaoMinutos) {
		super(titulo, autor, anoPublicacao);
		this.diretor = diretor;
		this.duracaoMinutos = duracaoMinutos;
	}

	public String getDiretor() {
		return diretor;
	}

	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}

	public int getDuracaoMinutos() {
		return duracaoMinutos;
	}

	public void setDuracaoMinutos(int duracaoMinutos) {
		this.duracaoMinutos = duracaoMinutos;
	}
	
	
}
