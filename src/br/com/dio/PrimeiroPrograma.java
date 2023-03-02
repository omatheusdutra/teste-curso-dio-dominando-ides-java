package br.com.dio;

import br.com.dio.model.Cachorro;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		
		Cachorro Cachorro = new Cachorro();
		Livros Livros = new Livros();
		
	    System.out.println(Cachorro);
	    System.out.println(Livros);
		
	}

}

class Livros {
	 private String nome;
	 private String npag;
 }