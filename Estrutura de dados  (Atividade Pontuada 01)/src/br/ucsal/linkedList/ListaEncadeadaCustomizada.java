package br.ucsal.linkedList;

public class ListaEncadeadaCustomizada {
	
	No inicio = null;
	
	int tamanho = 0;
	
	public void inserirInicio(String info) {
		No no = new No();
		no.info = info;
		no.proximo = inicio;
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
			novoNo.proximo = inicio;
			inicio = novoNo;
		}
		
		
		while(noAuxiliar != null) {
			count ++;
			
			if(index == count ) {
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
		
		noAuxiliar.proximo = novoNo;
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
		
		No noAuxiliar = inicio;
		int count = 0;
		
		if(index ==0) {
			removerDoInicio();
		}
		
		
		while(noAuxiliar.proximo != null) {
			count ++;
			
			if(index == count ) {
				noAuxiliar.proximo = noAuxiliar.proximo.proximo;
				tamanho --;
			}else {
				noAuxiliar = noAuxiliar.proximo;
				
			}

	
						
		}
	}
	
	public void removerDoFinal() {
		No noAuxiliar = inicio;
		
		while(noAuxiliar.proximo != null) {
			
			if(noAuxiliar.proximo.proximo == null) {
				noAuxiliar.proximo = null;
				tamanho --;
			}else {
			
			noAuxiliar = noAuxiliar.proximo;
			}
		}
		
		
		
	}
	
	public String buscaPorIndex(int index) {
		
		if(index >= tamanho) {
			throw new IndexOutOfBoundsException("Index: " + index + ", Tamanho: " + tamanho);
		}
		
		No noAuxiliar = inicio;
		int count = 0;
		
		while(noAuxiliar != null) {
			count ++;
			
			if(index+1 == count ) {
				return noAuxiliar.info;
			}else {
				noAuxiliar = noAuxiliar.proximo;
				
			}

	
						
		}
		
		return null;
		
	}

	public Boolean estaNaLista(String str) {
		
	
		
		No noAuxiliar = inicio;
		
		
		while(noAuxiliar != null) {
			
			if(noAuxiliar.info.equals(str) ) {
				return true;
			}else {
				noAuxiliar = noAuxiliar.proximo;
				
			}

	
						
		}
		
		return false;
		
	}
	
public int buscarIndexPorNome(String str) {
		
	
		
		No noAuxiliar = inicio;
		int count =0;
		
		while(noAuxiliar != null) {
			count++;
			
			if(noAuxiliar.info.equals(str) ) {
				return count-1;
			}
			
				noAuxiliar = noAuxiliar.proximo;
				
	
						
		}
		
		return -1;
		
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


