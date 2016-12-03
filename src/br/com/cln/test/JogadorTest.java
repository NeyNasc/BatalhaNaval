package br.com.cln.test;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import br.com.cln.dominio.Jogador;


public class JogadorTest {
	@Test
	public void testaSomaPontuacao(){
		Jogador jogador = new Jogador("Claudiney");
		jogador.setPontuacao(15);
		jogador.setPontuacao(20);
		jogador.setPontuacao(15);
		
		assertEquals(50, jogador.getPontuacao());
	}
	
	
}
