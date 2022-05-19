package org.garros.servlet;

import jakarta.servlet.http.HttpServlet;
import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import org.garros.PlayerService;
import org.garros.PlayerServiceImpl;

/**
 * Servlet implementation class PlayerModifyServlet
 */
@WebServlet("/PlayerModifyServlet")
public class PlayerModifyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private PlayerService playerService = new PlayerServiceImpl();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public PlayerModifyServlet() {
		super();
	}

	protected void doProcess(HttpServletRequest req, HttpServletResponse res, String pagename)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String pageName = "/players";
		int id = Integer.parseInt(req.getParameter("id"));
		int age = Integer.parseInt(req.getParameter("age"));
		String country = req.getParameter("country");
		String firstname = req.getParameter("firstname");
		String lastname = req.getParameter("lastname");
		String hand = req.getParameter("hand");
		String category = req.getParameter("category");
		playerService.putPlayer(id, age, category, country, firstname, hand, lastname);
		RequestDispatcher rd = getServletContext().getRequestDispatcher(pageName);
		try {
			rd.forward(req, res);
		} catch (ServletException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
