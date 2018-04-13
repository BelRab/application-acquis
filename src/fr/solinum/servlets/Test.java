package fr.solinum.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.solinum.form.FormConnexion;

@WebServlet("/Test")
public class Test extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String VUE = "/WEB-INF/test.jsp";

	public Test() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.getServletContext().getRequestDispatcher(VUE).forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		FormConnexion form = new FormConnexion();

		String login = request.getParameter("login");
		String pass = request.getParameter("pass");

		String returnForm = form.testConnexion(request);
		HttpSession session = request.getSession();// initialiser une session
		session.setAttribute("login", login);
		request.setAttribute("returnForm", returnForm);

		request.getServletContext().getRequestDispatcher(VUE).forward(request, response);
	}

}
