package br.com.impacta.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.impacta.javaweb.pojo.Usuario;

@WebServlet("/sistemaServlet")
public class sistemaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Usuario usuario = (Usuario) request.getSession().getAttribute("usuario");
		response.setCharacterEncoding("ISO-8859-1");
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("<head>");
		out.println("<title></title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>");
		out.println("Cadastro de login");
		out.println("</h1>");
		out.println("<h4>Bem vindo : "  + usuario.getLogin() + "</h4>");
		out.println("<h1>Você está na pagina principal do sistema</h1>");
 		out.println("<a href=\"login.html\">logout</a>");
		out.println("</body>");
		out.println("</html>");
		
	}

}
