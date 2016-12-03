package br.com.cln.servico;

import java.util.Random;

import br.com.cln.dominio.Jogador;

public class Jogo {
	private Jogador jogador;
	private Ranking ranking;
	private int[][] area;
	private int nivel;
	
	
	public Jogo(Jogador jogador, Ranking ranking, int nivel) {
		this.jogador = jogador;
		this.ranking = ranking;
		area = constroiArea(nivel);
	}
	
	
	private int[][] constroiArea(int nivel){
		int tamanho = tamanhoArea(nivel);
		return new int[tamanho][tamanho];		
	}
	
		
	private int tamanhoArea(int nivel) {
		int tam=0;
		if(nivel==1) tam = 5;
		if(nivel==2) tam = 10;
		if(nivel==3) tam = 15;
		return tam;
	}
	
	
	public void adicionaEmbarcacao(){
		int barco = 5;
		Random escolhePosicao = new Random();
		int linha = escolhePosicao.nextInt(this.area.length);
		int coluna = escolhePosicao.nextInt(this.area.length);
		
		area[linha][coluna] = barco;

	}


	public int[][] getArea() {
		return area;
	}

	public Jogador getJogador() {
		return jogador;
	}

	public Ranking getRanking() {
		return ranking;
	}
	
}
