
public class ComTitulo implements FormatadorNome {
	private String titulo;
	
	
	
	public ComTitulo(String titulo) {
		super();
		this.titulo = titulo;
	}



	@Override
	public String formatarNome(String nome, String sobrenome) {
		// TODO Auto-generated method stub
		return titulo+ " " + nome + " " + sobrenome;
	}

}
