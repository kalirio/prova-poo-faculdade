package segundaprova;

public abstract class Midia {

	protected String titulo;
	protected String autor;
	protected int anoPublicacao;
	protected static int numeroMidias = 0;
	
	public abstract void exibirInformacoes();
	
	public Midia(String titulo, String autor, int anoPublicacao) {
		this.titulo = titulo;
		this.autor = autor;
		this.anoPublicacao = anoPublicacao;
		numeroMidias++;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getAnoPublicacao() {
		return anoPublicacao;
	}

	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}

	public static int getNumeroMidias() {
		return numeroMidias;
	}

}
