package org.garros.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.garros.User;
import org.garros.DBManager;

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

	private void doProcess(HttpServletRequest request, HttpServletResponse response, String pageName) {
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
		doProcess(req, resp, "/login.jsp");
	}

	// POST /login -> tentative de connexion
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// Accept user login info from the login page
		String username = req.getParameter("username");
		String password = req.getParameter("password");

		// Connexion a la db
		Connection connection = DBManager.getInstance().getConnection();
		Statement statement;
		ResultSet rs;
		User user = new User();
		user.setUsername(username);
		boolean connected = false;

		try {
			statement = connection.createStatement();
			String query = "SELECT * FROM users WHERE username='" + username + "' AND pwd='" + password + "';";
			rs = statement.executeQuery(query);

			if (rs.next()) {
				connected = true;
				int uid = rs.getInt("uid");
				user.setUid(uid);
				String account_type = rs.getString("account_type");
				user.setAccountType(account_type);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// connection
		if (connected) {
			/* Récupération de la session depuis la requete */
			HttpSession session = req.getSession();

			/* Sauvegarde de la connexion */
			session.setAttribute("connecte", true);
			session.setAttribute("connected_user", user);
			doProcess(req, resp, "/index.jsp");
		} else {
			// Si la connexion a échoué on remet la page de connexion
			doProcess(req, resp, "/login.jsp");
		}
	}
}
