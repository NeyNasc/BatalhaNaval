package br.com.cln.dominio;

public class Jogador {
	private String nome;
	private int pontuacao;
	
	public Jogador(String nome) {
		super();
		this.nome = nome;
		this.pontuacao = 0;
	}
	
	
	public String getNome() {
		return nome;
	}

	public int getPontuacao() {
		return pontuacao;
	}

	public void setPontuacao(int pontuacao) {
		this.pontuacao = this.somaPontuaca(pontuacao);
	}
	
	private int somaPontuaca(int pontos){
		return pontos+=this.pontuacao;
	}

	@Override
	public String toString() {
		return this.nome+" : "+this.pontuacao;
	}
}
