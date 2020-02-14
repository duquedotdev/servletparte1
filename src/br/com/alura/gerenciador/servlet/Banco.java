package br.com.alura.gerenciador.servlet;

import java.util.*;

public class Banco {
	
	private static Set<Empresa> listaEmpresas = new LinkedHashSet<>();
	private static Integer chaveSequencial = 1;
	
	static {
		 Empresa empresa = new Empresa();
	        empresa.setId(chaveSequencial++);
	        empresa.setNome("Alura");
	        Empresa empresa2 = new Empresa();
	        empresa2.setId(chaveSequencial++);
	        empresa2.setNome("Caelum");
	        listaEmpresas.add(empresa);
	        listaEmpresas.add(empresa2);
	}

	public void adiciona(Empresa empresa) {
		empresa.setId(Banco.chaveSequencial++);
		Banco.listaEmpresas.add(empresa);
		System.out.println("Nova empresa adicionada ao banco!");
	}
	
	public Set<Empresa> getEmpresas(){
		return Banco.listaEmpresas;
	}

	public void removeEmpresa(Integer id) {
		
		Iterator<Empresa> it = listaEmpresas.iterator();
		
		while(it.hasNext()) {
			
			Empresa emp = it.next();
			
			for (Empresa empresa : listaEmpresas) {
				if(empresa.getId() == id) {
					it.remove();
				}
		}
		
		
			
		}
		
	}

}
