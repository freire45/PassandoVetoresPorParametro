package br.com.erickfreire.vetores;

/**
 * Programa em Java que passa um vetor por parametro
 * @author Erick Freire
 * @version 1 - Criado em 28-05-2021 as 14:10
 */

public class PassandoVetoresPorParametro {	
	public static void main(String[] args) {
		int[] vetor = {1, 2, 3, 4, 5};
		
		System.out.printf("Os Efeitos de passar o vetor por referencia \n"
				        + "Os valores do Vetor original são: \n");
		
		for(int valor : vetor)
			System.out.printf("		%d", valor);
		
		modificaVetor(vetor);
		
		System.out.printf("%n%nO valor do vetor modificado é de: %n");
		
		for(int valor : vetor)
			System.out.printf("		%d", valor);
		
		System.out.printf("%nOs Efeitos de passar o elemento do vetor \n"
		        + "vetor[3] antes de modificado: %d%n", vetor[3]);
		
		modificaElemento(vetor[3]);
		
		System.out.printf("Vetor modificado: %d%n", vetor[3]);

	}
	
	public static void modificaVetor(int[] vetor2) {
		for(int contador = 0; contador < vetor2.length; contador++)
			vetor2[contador] *= 2;
	}
	
	public static void modificaElemento(int elemento) {
		elemento *=2;
		System.out.printf("%nValor do elemento modificado: %d%n", elemento);
	}

}
