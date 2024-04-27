package biblio.livro;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TesteBiblioteca {
    @Test
    public void testAdicionarLivro() {
        Biblioteca biblioteca = new Biblioteca();
        Livro livro = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien");
        biblioteca.adicionarLivro(livro);
        assertEquals(1, biblioteca.getLivros().size());
        assertEquals("O Senhor dos Anéis", biblioteca.getLivros().get(0).getTitulo());
        assertEquals("J.R.R. Tolkien", biblioteca.getLivros().get(0).getAutor());
    }
}
