
public class Respeitoso implements FormatadorNome {
	private boolean feminino;
	
	public Respeitoso(boolean feminino) {
		super();
		this.feminino = feminino;
	}



	@Override
	public String formatarNome(String nome, String sobrenome) {
		if(feminino)
		{
			return "Sra. " + nome + " " + sobrenome;
		}
		else
			return "Sr. "+ nome +" "+sobrenome;
	}

}
