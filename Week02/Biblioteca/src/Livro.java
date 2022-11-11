/**
 * Representa os Livros pertencentes ao acervo da Biblioteca
 * Sabe o título
 * Sabe o autor
 * Sabe nr. unico do livro
 * Sabe a disponibilidade para emprestimos
 * Sabe usuario, se emprestado
 */

/**
 * @author davijaf
 *
 */
public class Livro {
	
	public String titulo;
	public String autor;
	public String numeroLivro;
	public Boolean livroDisponivel;
	public String emprestimoUsuario;
	
	public void vinculaUsuario() {
		if (livroDisponivel) {
			
		}
	}
	
	public void desvinculaUsuario() {
		if (livroDisponivel == false) {
			
		}
		
	}
}
