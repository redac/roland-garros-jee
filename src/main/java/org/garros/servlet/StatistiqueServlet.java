package org.garros.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.garros.Player;
import org.garros.PlayerService;
import org.garros.PlayerServiceImpl;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/Statistique")
public class StatistiqueServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private PlayerService playerService2 = new PlayerServiceImpl();

	private void doProcess(HttpServletRequest request, HttpServletResponse response) {

		String searchText = request.getParameter("searchText");

		HttpSession session = request.getSession();
		@SuppressWarnings("unchecked")
		List<String> searchHistory = (List<String>) session.getAttribute("SearchHistory");
		if (searchHistory == null) {
			searchHistory = new ArrayList<>();
			session.setAttribute("SearchHistory", searchHistory);
		}
		searchHistory.add(searchText);

		List<Player> players2 = new ArrayList<Player>();
		if (searchText == null) {
			players2 = playerService2.getAllPlayers();
		} else {
			players2 = playerService2.getPlayerByName(searchText);
		}
		request.setAttribute("listPlayers2", players2);
		
		List<Player> playersWin = new ArrayList<Player>();
		playersWin = playerService2.getPlayerByWin();
		request.setAttribute("listPlayersWin", playersWin);
		
		List<Player> playersTime = new ArrayList<Player>();
		playersTime = playerService2.getPlayerByTime();
		request.setAttribute("listPlayersTime", playersTime);

		String pageName = "/statistique.jsp";
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
		doProcess(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
	}
}