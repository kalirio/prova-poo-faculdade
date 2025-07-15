package segundaprova;

public class Livro extends Midia {

	private String editora;
	private int numeroPaginas;
	
	@Override
	public void exibirInformacoes() {
		System.out.println("\n");
		System.out.println("Título: " + this.titulo);
		System.out.println("Autor: " + this.autor);
		System.out.println("Ano de publicação: " + this.anoPublicacao);
		System.out.println("Editora: " + this.editora);
		System.out.println("Número de páginas: " + this.numeroPaginas);
	}

	public Livro(String titulo, String autor, int anoPublicacao, String editora, int numeroPaginas) {
		super(titulo, autor, anoPublicacao);
		this.editora = editora;
		this.numeroPaginas = numeroPaginas;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public int getNumeroPaginas() {
		return numeroPaginas;
	}

	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}
	
	
}
