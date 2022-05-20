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
		String ageString = req.getParameter("age");
		String firstname = req.getParameter("firstname");
		String lastname = req.getParameter("lastname");
		String hand = req.getParameter("hand");
		String rankingString = req.getParameter("rank");
		String category = req.getParameter("category");
		String country = req.getParameter("country");
		
		

		playerService.createPlayer(Integer.parseInt(ageString), category, country, firstname, hand, lastname, 0, 0, Integer.parseInt(rankingString));

		doProcess(req, resp);

	}

}