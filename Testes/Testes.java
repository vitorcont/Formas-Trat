import static org.junit.Assert.*;

import org.junit.Test;

public class Testes {

	@Test
	public void test() {
		FormatadorNome formatador = new ComTitulo("Conde");
		Autoridade n1= new Autoridade("Vitor","Conti",formatador);
		assertEquals("Conde Vitor Conti",n1.getTratamento());
	}
	@Test
	public void test2() {
		FormatadorNome formatador = new Respeitoso(false);
		Autoridade n1= new Autoridade("Vitor","Conti",formatador);
		assertEquals("Sr. Vitor Conti",n1.getTratamento());
	}
	@Test
	public void test3() {
		FormatadorNome formatador = new Respeitoso(true);
		Autoridade n1= new Autoridade("Vitoria","Conti",formatador);
		assertEquals("Sra. Vitoria Conti",n1.getTratamento());
	}
	@Test
	public void test4() {
		FormatadorNome formatador = new Informal();
		Autoridade n1= new Autoridade("Vitor","Conti",formatador);
		assertEquals("Vitor",n1.getTratamento());
	}

}
