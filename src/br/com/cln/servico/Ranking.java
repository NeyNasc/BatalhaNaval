package br.com.cln.servico;

import java.util.*;

import br.com.cln.dominio.Jogador;

public class Ranking {
	private List<Jogador> ranking;

	public Ranking() {
		this.ranking = new ArrayList();
	}
	
	
	
	public void adcionaJogador(Jogador jogador){
		this.ranking.add(jogador);
	}
	
	
	public int tamanho(){
		return this.ranking.size();
	}
	
	
	public String listaRanking(){//Implementar o Comparable para ordenar a lista do Ranking
		String str = "";
		
		for(Jogador jogador : this.ranking){
			str += jogador.toString()+"\n";
		}

		return str;
	}
	
	
}