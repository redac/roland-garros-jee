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
 * C'est ici qu'on fera les differentes requettes relatives aux joueurs :
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
		String[] li = req.getParameterValues("id");
		int n = li.length;
		for(int i=0; i<n; i++) {
			System.out.println(li[i]);
		}
		
		System.out.println(req.getParameter("id"));
		
		int id = Integer. parseInt(req.getParameter("id"));
		
		System.out.print("et mtn int id : ");
		System.out.println(id);
		
		// Puis on fait la requette pour récupérer tout ce dont on a besoin
		Player player = new Player();
		player = (Player) playerService.getPlayerById(id).get(0);
		
		System.out.println("on a reussi la requette");
		
		// Enfin on affiche le résultat en fonction du Player
		req.setAttribute("player", player);
		doProcess(req, resp);
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
	}
}