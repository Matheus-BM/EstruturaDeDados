package br.ucsal.linkedList;



public class Main {

	public static void main(String[] args) {
		
		ListaEncadeadaCustomizada lista = new ListaEncadeadaCustomizada();
		lista.inserirInicio("HAMILTON BATISTA");
		lista.inserirNoFinal("LUIZ ALBERTO");
		lista.inserirNoFinal("MARCO ANTONIO");
		lista.inserirNoFinal("HENRIQUE ARAUJO");
		lista.inserirNoFinal("HARRISON BORGES");
		lista.inserirNoFinal("MARCOS CARVALHO");
		lista.inserirNoFinal("GUILHERME DA SILVA");
		lista.inserirNoFinal("NEILLANE DE CARVALHO");
		lista.inserirNoFinal("GUILHERME DE JESUS");
		lista.inserirNoFinal("LUCAS FARIAS");
		lista.inserirNoFinal("LUCAS GOMES");
		lista.inserirNoFinal("OSEIAS LOPES");
		lista.inserirNoFinal("PEDRO LUIZ");
		lista.inserirNoFinal("MATHEUS BARRETO");
		lista.inserirNoFinal("JOAO MARCOS ");
		lista.inserirNoFinal("LUCAS MORENO");
		lista.inserirNoFinal("IAGO ROQUE");
		lista.inserirNoFinal("GABRIELA SANTOS");
		lista.inserirNoFinal("GUILHERME SANTOS");
		lista.inserirNoFinal("KEVIN VASQUES");
		
		System.out.println(lista.tamanho);
		
		System.out.println(lista);
		
		lista.removerDoMeio(5);
		
		System.out.println("Meu nome est� na lista? " + lista.estaNaLista("MATHEUS BARRETO"));
		
		
		System.out.println(lista);

	}

}
