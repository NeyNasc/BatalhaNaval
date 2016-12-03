package br.com.cln.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.cln.dominio.Jogador;
import br.com.cln.servico.Ranking;

public class RankingTest {
	
	@Test
	public void testaAdcionaVariosJogadores(){
		Ranking ranking = new Ranking();
		Jogador j1 = new Jogador("Claudiney");
		Jogador j2 = new Jogador("Escarlate");
		Jogador j3 = new Jogador("Satã");
		
		ranking.adcionaJogador(j1);
		ranking.adcionaJogador(j2);
		ranking.adcionaJogador(j3);
		
		assertEquals(3, ranking.tamanho());
	}
	
	public void testaAdcionaUmJogador(){
		Ranking ranking = new Ranking();
		Jogador j1 = new Jogador("Claudiney");
		ranking.adcionaJogador(j1);
		
		assertEquals(1, ranking.tamanho());
	}
	
	@Test	
	public void testaListaRankingComUmJogador(){
		Ranking ranking = new Ranking();
		
		String str1 = "Claudiney : 0\n";
		Jogador j1 = new Jogador("Claudiney");
		
		ranking.adcionaJogador(j1);
		
		assertEquals(str1, ranking.listaRanking());

	}
	
	public void testaListaRankingComVariosJogadores(){
		Ranking ranking = new Ranking();
		
		String str1 = "Claudiney : 0\n";
		String str2 = "Gary, 0\n";
		String str3 = "Solange, 0\n";
		String todosOsJogadores = str1+str2+str3;
		
		Jogador j1 = new Jogador("Claudiney");
		Jogador j2 = new Jogador("Gary");
		Jogador j3 = new Jogador("Solange");
		
		ranking.adcionaJogador(j1);
		ranking.adcionaJogador(j2);
		ranking.adcionaJogador(j3);
		
		assertEquals(todosOsJogadores, ranking.listaRanking());	
	}
	
	public void testaListaRankingSemJogadores(){
		Ranking ranking = new Ranking();
		String strVazio = "";
		
		assertEquals(strVazio, ranking.listaRanking());
	}

}
