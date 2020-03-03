package br.com.alura.gerenciador.acao;

import java.io.IOException;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.modelo.Banco;
import br.com.alura.gerenciador.modelo.Empresa;

public class ListaEmpresas implements Acao{
	
	public String executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		HttpSession sessao = request.getSession();
//		if(sessao.getAttribute("usuarioLogado") == null) {
//			return "redirect:entrada?acao=LoginForm";
//		}
		
		long antes = System.currentTimeMillis();
		
		System.out.println("listando empresas");
		
		Banco banco = new Banco();
		Set<Empresa> lista = banco.getEmpresas();
		
		request.setAttribute("empresas", lista);
		
		long depois = System.currentTimeMillis();
		
		System.out.println("Tempo de Excecução " + (depois - antes) + " ms" );
		
		System.out.println(antes);
		System.out.println(depois);
		
		return "forward:listaEmpresas.jsp";
	}

}
