import java.util.ArrayList;

/**
 * Representa o Sistema de Automacao da Biblioteca
 * Saber o nome;
 * Saber o catálogo;
 * Saber a lista de usuário;
 * 
 * Registra novo usuário
 * Adicionar novo livro ao catálogo
 * Empresta livro
 * Devolve Livro
 * Exibe livros disponiveis
 * Exibe livros indisponiveis
 */

/**
 * @author davijaf
 * */
public class Biblioteca {
	
	public String nomeBiblioteca;
	public String catalogoLivros;
	public static ArrayList<String> listaUsuarios = new ArrayList<String>();
	
	public void registraUsuário() {		
	}
	
	public void registraLivroAoCatalogo() {		
	}
	
	public void emprestarLivro(Livro L) {
		L.livroDisponivel = false;
	}
	
	public void devolverLivro(Livro L) {	
		L.livroDisponivel = true;
	}

	public void livrosDisponiveis() {		
	}
	
	public void livrosIndisponiveis() {		
	}

}
