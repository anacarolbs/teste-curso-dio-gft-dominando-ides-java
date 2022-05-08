package primeiroProgramaDIO;

public class Gato {

	public static void main(String[] args) {
		Gato gato = new Gato();
		Livro livro = new Livro();

		System.out.println(gato);
		System.out.println(livro);

	}
}

class Livro {
	public String nome;
	public Integer numPaginas;
}
