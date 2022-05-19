package org.garros.servlet;

import jakarta.servlet.http.HttpServlet;
import java.io.IOException;

import org.garros.PlayerService;
import org.garros.PlayerServiceImpl;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PlayerDeleteServlet
 */
@WebServlet("/PlayerDeleteServlet")
public class PlayerDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private PlayerService playerService = new PlayerServiceImpl();

	public PlayerDeleteServlet() {
		super();
	}

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String pageName = "/players";
		int id = Integer.parseInt(req.getParameter("id"));
		playerService.deletePlayer(id);
		RequestDispatcher rd = getServletContext().getRequestDispatcher(pageName);
		try {
			rd.forward(req, res);
		} catch (ServletException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String pageName = "/players";
		int id = Integer.parseInt(req.getParameter("id"));
		playerService.deletePlayer(id);
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
