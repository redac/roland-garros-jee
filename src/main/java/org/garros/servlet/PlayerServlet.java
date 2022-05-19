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
public class PlayerServlet extends HttpServlet{
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
				
		// D'abord on récupère l'id du joueur dont on veut la fiche		
		int id = Integer.parseInt(req.getParameter("id"));
		
		// Puis on fait la requete pour récupérer tout ce dont on a besoin
		Player player = new Player();
		player = (Player) playerService.getPlayerById(id).get(0);
		
		
		// Enfin on affiche le résultat en fonction du Player
		req.setAttribute("player", player);
		doProcess(req, resp);
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
	}
	
	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));
		int age = Integer.parseInt(req.getParameter("age"));
		String country = req.getParameter(req.getParameter("country"));
		String firstname = req.getParameter(req.getParameter("firstname"));
		String name = req.getParameter(req.getParameter("name"));
		String hand = req.getParameter(req.getParameter("hand"));
		String category = req.getParameter(req.getParameter("category"));
		int timePlayed = Integer.parseInt(req.getParameter("timePlayed"));
		int nbWin = Integer.parseInt(req.getParameter("nbWin"));
		int ranking = Integer.parseInt(req.getParameter("ranking"));
		playerService.putPlayer(id, age, category, country, firstname, hand, firstname);
	}
	
}