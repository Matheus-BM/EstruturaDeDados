package br.ucsal.listaDuplamenteEncadeada;

import java.util.Scanner;

public class DesafioNavLista {

	public static void main(String[] args) {
		
		int input;
		int index = 0;
		
		ListaDuplamenteEncadeadaCustomizada lista = new ListaDuplamenteEncadeadaCustomizada();
		lista.inserirInicio("HAMILTON BATISTA");
		lista.inserirNoFinal("LUIZ ALBERTO");
		lista.inserirNoFinal("MARCO ANTONIO");
		lista.inserirNoFinal("HENRIQUE ARAUJO");
		lista.inserirNoFinal("HARRISON BORGES");
		lista.inserirNoFinal("MARCOS CARVALHO");
		
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
		
		System.out.println("Menu\n");
		try {
			System.out.println(lista.get(index));
			
		} catch (Exception e) {
			System.out.println("Fim da Lista");
		}
		
		System.out.println("1 para Proximo");
		System.out.println("2 para Voltar");
		
		input = scan.nextInt();
		
		if(input == 1) {
			
			index ++;
			
		}else {
			
			index --;
		}
		}
		
		
		
		
	}


}
