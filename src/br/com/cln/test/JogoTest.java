package br.com.cln.test;

import static org.junit.Assert.assertEquals;


import org.junit.Test;

import br.com.cln.dominio.Jogador;
import br.com.cln.servico.Jogo;
import br.com.cln.servico.Ranking;

public class JogoTest {

	
	
	private int defineTamanhoPorNivel(int nivel){
		int tam=0;
		if(nivel==1) tam = 5;
		if(nivel==2) tam = 10;
		if(nivel==3) tam = 15;
		return tam;
	}
	
	@Test
	public void constroiAreaUm(){
		Ranking ranking = new Ranking();
		Jogador jogador = new Jogador("Claudiney");
		int nivel = 1;
		Jogo jogo = new Jogo(jogador, ranking, nivel);
		int tamanhoDaMatriz = defineTamanhoPorNivel(nivel);
		
		int[][] testaArea = new int[tamanhoDaMatriz][tamanhoDaMatriz];
		
		assertEquals(testaArea, jogo.getArea());
	}
	
	@Test
	public void constroiAreaDois(){
		Ranking ranking = new Ranking();
		Jogador jogador = new Jogador("Claudiney");
		int nivel = 2;
		Jogo jogo = new Jogo(jogador, ranking, nivel);
		int tamanhoDaMatriz = defineTamanhoPorNivel(nivel);
		
		int[][] testaArea = new int[tamanhoDaMatriz][tamanhoDaMatriz];
		
		assertEquals(testaArea, jogo.getArea());
	}
	
	@Test
	public void testaConstroiAreaTres(){
		Ranking ranking = new Ranking();
		Jogador jogador = new Jogador("Claudiney");
		int nivel = 3;
		Jogo jogo = new Jogo(jogador, ranking, nivel);
		int tamanhoDaMatriz = defineTamanhoPorNivel(nivel);
		
		int[][] testaArea = new int[tamanhoDaMatriz][tamanhoDaMatriz];
		
		assertEquals(testaArea, jogo.getArea());
	}
	
	@Test	
	public void testaInsereEmbarcacoesNivelUm(){
		Ranking ranking = new Ranking();
		Jogador jogador = new Jogador("Claudiney");
		int nivel = 1;
		Jogo jogo = new Jogo(jogador, ranking, nivel);
		int contaBarco = 0;
		jogo.adicionaEmbarcacao();
		int tamanhoDoCaminho = defineTamanhoPorNivel(nivel);
		
		int[][] testaArea = jogo.getArea();
		
		for(int i=0; i<tamanhoDoCaminho;i++){
			for(int j=0;j<tamanhoDoCaminho;j++){
				if(testaArea[i][j]==5) contaBarco++;
			}
		}
		
		assertEquals(1, contaBarco);		
	}
	
	@Test	
	public void testaInsereEmbarcacoesNivelDois(){
		Ranking ranking = new Ranking();
		Jogador jogador = new Jogador("Claudiney");
		Jogo jogo = new Jogo(jogador, ranking, 2);
		int contaBarco = 0;
		jogo.adicionaEmbarcacao();
				
		
		int[][] testaArea = jogo.getArea();
		
		for(int i=0; i<testaArea.length;i++){
			for(int j=0;j<testaArea.length;j++){
				if(testaArea[i][j]==5) contaBarco++;
			}
		}
		
		assertEquals(1, contaBarco);		
	}
	
	@Test	
	public void testaInsereEmbarcacoesNivelTres(){
		Ranking ranking = new Ranking();
		Jogador jogador = new Jogador("Claudiney");
		Jogo jogo = new Jogo(jogador, ranking, 3);
		int contaBarco = 0;
		jogo.adicionaEmbarcacao();
		
		int[][] testaArea = jogo.getArea();
		
		for(int i=0; i<15;i++){
			for(int j=0;j<15;j++){
				if(testaArea[i][j]==5) contaBarco++;
			}
		}
		
		assertEquals(1, contaBarco);		
	}
	
}
