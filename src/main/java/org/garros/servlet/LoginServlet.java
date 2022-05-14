package org.garros.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import org.garros.Player;
import org.garros.User;
import org.garros.UserService;
import org.garros.UserServiceImpl;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private UserService userService = new UserServiceImpl();

	private void doProcess(HttpServletRequest request, HttpServletResponse response) {

		String pageName = "/login.jsp";
		RequestDispatcher rd = getServletContext().getRequestDispatcher(pageName);
		try {
			rd.forward(request, response);
		} catch (ServletException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// GET /login -> affichage de login.jsp pour se connecter
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
	}

	// POST /login -> tentative de connexion
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

		// Accept user login info from the login page
		String username = req.getParameter("username");
		String password = req.getParameter("password");

		// DB related
		List<User> users = new ArrayList<User>();
		User user = null;
		Boolean UserExists = false;
		users = userService.getUserByQuery("SELECT EXISTS ( SELECT * FROM users WHERE username = '" + username
				+ "' AND pwd	 = '" + password + "' )");
		if (!users.isEmpty()) {
			UserExists = true;
			user = (User) userService.getUserByQuery(
					"SELECT * FROM users WHERE username = '" + username + "'AND pwd = '" + password + "';");
			System.out.println(user);
		}
	}
}