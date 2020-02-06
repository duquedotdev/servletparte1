package br.com.alura.gerenciador.servlet;

import java.util.*;

public class Banco {
	
	private static Set<Empresa> listaEmpresas = new LinkedHashSet<>();

	public void adiciona(Empresa empresa) {
		listaEmpresas.add(empresa);				
	}
	
	public Set<Empresa> getEmpresas(){
		return listaEmpresas;
	}

}
