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
 * C'est ici qu'on fera les differentes requetes relatives aux joueurs :
 * GET -> obtenir une fiche joueur
 * POST -> Rajouter un joueur
 * ...
 */

@WebServlet("/player")
public class PlayerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private PlayerService playerService = new PlayerServiceImpl();

	private void doProcess(HttpServletRequest request, HttpServletResponse response) {
		String pageName = "/player.jsp";
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
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// D'abord on recupere l'id du joueur dont on veut la fiche
		int id = Integer.parseInt(req.getParameter("id"));

		// Puis on fait la requete pour recuperer tout ce dont on a besoin
		Player player = new Player();
		player = (Player) playerService.getPlayerById(id).get(0);

		// Enfin on affiche le resultat en fonction du Player
		req.setAttribute("player", player);
		doProcess(req, resp);

	}

}