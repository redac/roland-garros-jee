package org.garros.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.garros.Player;
import org.garros.User;
import org.garros.UserService;
import org.garros.UserServiceImpl;
import org.garros.ConnectionUser;
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

		// Accept user login info from the login page
		String username = req.getParameter("username");
		String password = req.getParameter("password");

		System.out.println(username);
		System.out.println(password);

		Connection connection = DBManager.getInstance().getConnection();
		Statement statement;
		ResultSet rs;
		User user = new User();
		user.setUsername(username);
		try {
			statement = connection.createStatement();
			String query = "SELECT * FROM users WHERE username='"+username+"';"; 	//todo : verifier mdp
			rs = statement.executeQuery(query);
			while (rs.next()) {
				int uid = rs.getInt("uid");
				user.setUid(uid);
				String account_type = rs.getString("account_type");
				user.setAccountType(account_type);
				/**
				 * Cree la connexion
				 */
				ConnectionUser cu = new ConnectionUser(user);
				System.out.println("Connected !");

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
