package fr.solinum.form;

import javax.servlet.http.HttpServletRequest;

public class FormConnexion {

	private String result;
	private UserOne userOne;
	private UserTwo userTwo;

	public String testConnexion(HttpServletRequest request) {
		String login = request.getParameter("login");
		String pass = request.getParameter("pass");
		UserOne userOne = new UserOne();
		UserTwo userTwo = new UserTwo();
		String userOneLogin = userOne.getLogin();
		String userOnePassword = userOne.getPassword();
		String userTwoLogin = userTwo.getLogin();
		String userTwoPassword = userTwo.getPassword();

		if (login.equals(userOneLogin) && pass.equals(userOnePassword)) {
			result = "bonjour , vous etes bien Bel Hadj Rabii";
		} else if (login.equals(userTwoLogin) && pass.equals(userTwoPassword)) {
			result = "bonjour , vous etes bien Bel Hadj Abdessalem";
		} else {
			result = "bonjour , Vous ne pouvez pas vous connecter";
		}
		return result;
		
	}
}
