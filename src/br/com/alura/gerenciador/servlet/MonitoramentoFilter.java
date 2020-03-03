package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import br.com.alura.gerenciador.modelo.Banco;
import br.com.alura.gerenciador.modelo.Empresa;

@WebFilter("/entrada")
public class MonitoramentoFilter implements Filter{

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		

		System.out.println("Monitoramento");
		
		long antes = System.currentTimeMillis();
		
		System.out.println("listando empresas");
		
		chain.doFilter(request, response);
		
		String acao = request.getParameter("acao");
		
		
		long depois = System.currentTimeMillis();
		
		System.out.println("Tempo de Excecução " + (depois - antes) + " ms" );
		
		System.out.println(antes);
		System.out.println(depois);
		
		
		
	}
		
}
