package com.curso.filtro;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.curso.modelo.Usuario;

@WebFilter("/faces/seguro/*")
public class FiltroSeguridad implements Filter {

    public FiltroSeguridad() {
    }

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		HttpServletRequest rq = (HttpServletRequest) request;
		HttpSession session = rq.getSession(true);
		
		Usuario usr = (Usuario) session.getAttribute("usuario");
		if(usr!=null && usr.getIdUsuario()!=0){
			chain.doFilter(request, response);
		} else {
			System.out.println("FUERA!");
			HttpServletResponse rp = (HttpServletResponse) response;
			rp.sendRedirect("../faces/login.xhtml");			
		}
		
	}

	public void init(FilterConfig fConfig) throws ServletException {
	}

}
