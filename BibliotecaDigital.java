package segundaprova;

public class BibliotecaDigital {

	public static void main(String[] args) {
		
		Midia midia[] = new Midia[10];
		int opcao = 0;
		
		while (opcao != 6) {
			System.out.println("---------------SISTEMA DE MÍDIAS------------");
			System.out.println("1 - Cadastrar mídia");
			System.out.println("2 - Alterar mídia");
			System.out.println("3 - Excluir mídia");
			System.out.println("4 - Consultas mídias");
			System.out.println("5 - Exibir total de mídias");
			System.out.println("6 - Sair");
			
			opcao = Teclado.lerInteiro("\nDigite uma opção: ");
			switch(opcao) {
			
			case 1: // CADASTRAR
				Midia novaMidia = null;
				int tipoMidia = Teclado.lerInteiro("[1] Livro || [2] Filme: ");
				String titulo = Teclado.lerString("Digite o título da mídia: ");
				String autor = Teclado.lerString("Digite o autor: ");
				int anoPublicacao = Teclado.lerInteiro("Digite o ano de publicação: ");
				if (tipoMidia == 1) {
					String editora = Teclado.lerString("Digite a editora: ");
					int numPaginas = Teclado.lerInteiro("Digite o número de páginas: ");
					novaMidia = new Livro(titulo, autor, anoPublicacao, editora, numPaginas);
				} else if (tipoMidia == 2) {
					String diretor = Teclado.lerString("Digite o diretor: ");
					int duracaoMinutos = Teclado.lerInteiro("Digite a duração em minutos: ");
					novaMidia = new Filme(titulo, autor, anoPublicacao, diretor, duracaoMinutos);
				}
				for (int i = 0; i < midia.length; i++) {
					if (midia[i] == null) {
						midia[i] = novaMidia;
						System.out.println("Mídia cadastrada com sucesso!");
						break;
					}
				}
				break;
			case 2: // ALTERAR
				titulo = Teclado.lerString("Digite o título: ");
				for (int i = 0; i < midia.length; i++) {
					if (midia[i] != null && midia[i].getTitulo().equals(titulo)) {
						midia[i].setAutor(Teclado.lerString("Digite o novo autor: "));
						midia[i].setAnoPublicacao(Teclado.lerInteiro("Digite o novo ano de publicação: "));
						System.out.println("Mídia alterada com sucesso!");
					}
				}
				break;
			case 3: // EXCLUIR
				titulo = Teclado.lerString("Digite o titulo: ");
				for (int i = 0; i < midia.length; i++) {
					if (midia[i] != null && midia[i].titulo.equals(titulo)) {
						midia[i] = null;
						System.out.println("Mídia excluída com sucesso!");
						break;
					}
				}
				break;
			case 4: // CONSULTAR
				System.out.println("---------------MÍDIAS----------------");
				for (int i = 0; i < midia.length; i++) {
					if (midia[i] != null) {
						midia[i].exibirInformacoes();
					}
				}
				break;
			case 5: // EXIBIR TOTAL
				System.out.println("---------------TOTAL DE MÍDIAS------------");
				System.out.println("Há um total de " + Midia.numeroMidias + " mídias.");
				break;
			case 6: // SAIR
				System.out.println("Saindo...");
				break;
			}
		}

	}

}
