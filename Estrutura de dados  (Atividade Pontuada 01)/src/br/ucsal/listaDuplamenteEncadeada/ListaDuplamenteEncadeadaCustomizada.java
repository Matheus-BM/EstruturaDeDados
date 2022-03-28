package br.ucsal.listaDuplamenteEncadeada;

public class ListaDuplamenteEncadeadaCustomizada {
	
	No inicio = null;
	No noFinal = null;
	
	int tamanho = 0;
	
	public void inserirInicio(String info) {
		No no = new No();
		no.info = info;
		no.proximo = inicio;
		noFinal = no;
		inicio = no;
		tamanho++;
		
	}
	

	public void inserirNoMeio(int index, String info) {
		
		if(index > tamanho) {
			throw new IndexOutOfBoundsException("Index: " + index + ", Tamanho: " + tamanho);
		}
		
		No novoNo = new No();
		novoNo.info = info;
		No noAuxiliar = inicio;
		int count = 0;
		
		if(index ==0) {
			inserirInicio(info);
		}
		
		if(index == tamanho-1) {
			inserirNoFinal(info);
		}
		
		
		
		while(noAuxiliar != null) {
			count ++;
			
			if(index == count ) {
				novoNo.anterior = noAuxiliar;
				novoNo.proximo = noAuxiliar.proximo;
				noAuxiliar.proximo = novoNo;
				tamanho ++;
			}

	
		   noAuxiliar = noAuxiliar.proximo;
						
		}

	
		
	}
	
	
	public void inserirNoFinal(String info) {
		
		No novoNo = new No();
		novoNo.info = info;
		No noAuxiliar = inicio;

		
		while(noAuxiliar.proximo != null) {
		    noAuxiliar = noAuxiliar.proximo;						
		}
		
		novoNo.anterior = noAuxiliar; 
		noAuxiliar.proximo = novoNo;
		
		noFinal = novoNo;
		
		tamanho ++;
		
		
	}
	
	
	
	public void removerDoInicio() {
		inicio = inicio.proximo;
		tamanho--;
	}
	
	public void removerDoMeio(int index) {
		if(index >= tamanho) {
			throw new IndexOutOfBoundsException("Index: " + index + ", Tamanho: " + tamanho);
		}
		
		No noAuxiliar;
		int count = 0;
		
		if(index ==0) {
			removerDoInicio();
		}
		
		if(index == tamanho-1) {
			removerDoFinal();
		}
		
		
		if(index < tamanho/2) {
			noAuxiliar = inicio;
			
			while(noAuxiliar.proximo != null) {
				count ++;
				
				if(index == count ) {
					noAuxiliar.proximo.proximo.anterior = noAuxiliar; 
					noAuxiliar.proximo = noAuxiliar.proximo.proximo;
					tamanho --;
				}else {
					noAuxiliar = noAuxiliar.proximo;
					
				}

		
							
			}
			
		}else {
			noAuxiliar = noFinal;
			
			while(noAuxiliar.anterior != null) {
				count ++;
				
				if(index == (tamanho)-count ) {
					noAuxiliar.anterior.anterior.proximo = noAuxiliar; 
					noAuxiliar.anterior = noAuxiliar.anterior.anterior;
					tamanho --;
				}else {
					noAuxiliar = noAuxiliar.anterior;
					
				}

		
							
			}
			
			
		}
		
	
	}
	
	public void removerDoFinal() {
		No noAuxiliar = noFinal;
		
		if(tamanho > 1) {
			
			noAuxiliar.anterior.proximo = null;
			
			noFinal = noAuxiliar.anterior;
			tamanho --;
		}
	
		
	}
	


	public String get(int index) {
		
		if(index >= tamanho) {
			throw new IndexOutOfBoundsException("Index: " + index + ", Tamanho: " + tamanho);
		}
		
		No noAuxiliar;
		int count = 0;
		
		if(index ==0) {
			return inicio.info;
		}
		
		if(index == tamanho-1) {
			return noFinal.info;
		}
		
		
		if(index < tamanho/2) {
			noAuxiliar = inicio;
			
			while(noAuxiliar.proximo != null) {
				count ++;
				
				if(index == count ) {
					return noAuxiliar.proximo.info;
				}else {
					noAuxiliar = noAuxiliar.proximo;
				}

		
							
			}
			
		}else {
			noAuxiliar = noFinal;
			
			while(noAuxiliar.anterior != null) {
				count ++;
				
				if(index == (tamanho)-count ) {
					return noAuxiliar.proximo.info;
				}else {
					noAuxiliar = noAuxiliar.anterior;
					
				}

		
							
			}
			
			
		}
		
	
		
		return null;
		
		
	}
	

	
	public String toString() {
		
		String str = "(Tamanho da lista: "  + tamanho + ") \n" ;
		No noAuxiliar = inicio;
		while(noAuxiliar != null) {

			str += noAuxiliar.info + ", ";
			noAuxiliar = noAuxiliar.proximo;
			
		}
		
		return str;
		
	}
}


