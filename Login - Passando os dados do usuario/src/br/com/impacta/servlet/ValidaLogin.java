package br.com.impacta.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.impacta.javaweb.pojo.Usuario;

/**
 * Servlet implementation class ValidaLogin
 */
@WebServlet("/ValidaLogin")
public class ValidaLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String login = request.getParameter("login");
		String senha = request.getParameter("senha");

		if (login != null && senha != null && senha.equals("impacta123")) {

			Usuario usuario = new Usuario();

			usuario.setLogin(login);
			usuario.setSenha(senha);

			request.getSession().setAttribute("usuario", usuario);

			RequestDispatcher dispatcher = request.getRequestDispatcher("/sistemaServlet");
			dispatcher.forward(request, response);

		} else {
			response.sendRedirect("/Login_-_Passando_os_dados_do_usuario/erro.html");
		}
	}

}
