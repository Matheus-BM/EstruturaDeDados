package br.ucsal.dados;

public class SacolaFloatSequencial implements SacolaFloat {
	private float [] vetor;
	private int n;
	
	

	public SacolaFloatSequencial() {
		vetor = new float[10];
		n=0;
	}

	@Override
	public void insere(float item) {
		vetor[n++] = item;
	}

	@Override
	public float get(int i) {
		
		return vetor[i];
	}

	@Override
	public int tamanho() {
		
		return n;
	}
}
