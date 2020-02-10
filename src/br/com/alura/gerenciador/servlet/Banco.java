package br.com.alura.gerenciador.servlet;

import java.util.*;

public class Banco {
	
	private static Set<Empresa> listaEmpresas = new LinkedHashSet<>();
	
	static {
		Empresa empresa = new Empresa();
		empresa.setNome("Google");
		Empresa empresa2 = new Empresa();
		empresa2.setNome("Cognizant");
		listaEmpresas.add(empresa);
		listaEmpresas.add(empresa2);
	}

	public void adiciona(Empresa empresa) {
		listaEmpresas.add(empresa);
		System.out.println("Nova empresa adicionada ao banco!");
	}
	
	public Set<Empresa> getEmpresas(){
		return Banco.listaEmpresas;
	}

}
