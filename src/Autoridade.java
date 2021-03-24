
public class Autoridade implements FormatadorNome {
	private String nome;
	private String sobrenome;
	private FormatadorNome formatador;
	
	public Autoridade(String nome, String sobrenome, FormatadorNome formatador ) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.formatador=formatador;
	}


	@Override
	public String formatarNome(String nome, String sobrenome) {
		return formatador.formatarNome(nome, sobrenome);
	}
	
	public String getTratamento()
	{
		return this.formatarNome(nome,sobrenome);
	}

}
