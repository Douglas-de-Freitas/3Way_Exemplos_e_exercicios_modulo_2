package threeway.projeto.service.testadao;

import threeway.projeto.service.Dao.LivroDao;
import threeway.projeto.service.modelo.Livro;

public class Pesquisa {
	
	private static LivroDao dao = new LivroDao();

	public static void main(String[] args) {
		
		String titulo = "q";
		int id = 1;
		
		//consultarTitulo(titulo);
		//consultarId(id);
		//dao.removeById(id);
		//updateTituloWithId("testando update", 2);
		//updateTituloPorId("Titulo do livro update titulo e autor", "douglas", 2);
		salvarNovoLivro("O senhor das trevas", "michel pane", 30.5, "imagens/senhorDosAneis.png");
	}
	
	public static void consultarTitulo(String titulo) {
		
		for(Livro livro : dao.consultarTitulo(titulo)) {
			System.out.println("Cod: " + livro.getCodigo() + " \tDesc: \t" + livro.getTitulo() + "\tAutor: \t" + livro.getAutor() + "\tPreço: \t" + livro.getPreco() + "\tImg: \t" + livro.getImagem() + "\tDesc: \t" + livro.getDescricao());;
		}
		
		/*
		LivroDao dao = new LivroDao();
		dao.consultar(titulo).forEach(p -> System.out.println("Desc: " + p.getTitulo() + " Preço:" + p.getPreco()));
		*/
		
	}
	
	public static void consultarId(int id) {
		Livro livro = dao.consultarId(id);
		System.out.println("Cod: " + livro.getCodigo() + " \tDesc: \t" + livro.getTitulo() + "\tAutor: \t" + livro.getAutor() + "\tPreço: \t" + livro.getPreco() + "\tImg: \t" + livro.getImagem() + "\tDesc: \t" + livro.getDescricao());;
	}
	
	public static void removerId(int id) {
		dao.removeById(id);
	}
	
	public static void updateTituloPorId(String titulo, int id) {
		Livro livro = new Livro();
		livro.setTitulo(titulo);
		livro.setCodigo(id);
		
		dao.updateTitulo(livro);
	}
	
	public static void updateTituloPorId(String titulo, String autor, int id) {
		Livro livro = new Livro();
		livro.setTitulo(titulo);
		livro.setAutor(autor);
		livro.setCodigo(id);
		dao.updateTituloAutor(livro);
	}
	
	//INSERT INTO LIVRO( TITULO, AUTOR, PRECO, IMAGEM)
	public static void salvarNovoLivro(String titulo, String autor, double preco, String imagem) {
		Livro livro = new Livro();
		livro.setTitulo(titulo);
		livro.setAutor(autor);
		livro.setPreco(preco);
		livro.setImagem(imagem);
		dao.salvarLivro(livro);
	}
	
	
}
