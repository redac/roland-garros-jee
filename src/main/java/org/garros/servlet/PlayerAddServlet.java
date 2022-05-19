package org.garros.servlet;

import java.io.IOException;

import org.garros.Player;
import org.garros.PlayerService;
import org.garros.PlayerServiceImpl;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/*
 * C'est ici qu'on fera la requete Post relative aux joueurs :
 * POST -> Rajouter un joueur
 */

@WebServlet("/addplayer")
public class PlayerAddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private PlayerService playerService = new PlayerServiceImpl();

	private void doProcess(HttpServletRequest request, HttpServletResponse response) {
		String pageName = "/players";
		RequestDispatcher rd = getServletContext().getRequestDispatcher(pageName);
		try {
			rd.forward(request, response);
		} catch (ServletException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// D'abord on recupere les paramètres
		String firstname = req.getParameter("firstname");
		String lastname = req.getParameter("lastname");
		String hand = req.getParameter("hand");
		String categorie = req.getParameter("categorie");
		String country = req.getParameter("country");

		playerService.createPlayer2(firstname, lastname, hand, categorie, country);
		doProcess(req, resp);

	}

}