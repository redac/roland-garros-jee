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

@WebServlet("/stats")
public class StatsServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private PlayerService playerService2 = new PlayerServiceImpl();

	private void doProcess(HttpServletRequest request, HttpServletResponse response) {

		String searchText = request.getParameter("searchText");
		String categoryMen = "Men";
		String categoryWomen = "Women";

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

		List<Player> playersWinMen = new ArrayList<Player>();
		playersWinMen = playerService2.getPlayerByWin(categoryMen);
		request.setAttribute("listPlayersWinMen", playersWinMen);

		List<Player> playersWinWomen = new ArrayList<Player>();
		playersWinWomen = playerService2.getPlayerByWin(categoryWomen);
		request.setAttribute("listPlayersWinWomen", playersWinWomen);

		List<Player> playersTimeMen = new ArrayList<Player>();
		playersTimeMen = playerService2.getPlayerByTime(categoryMen);
		request.setAttribute("listPlayersTimeMen", playersTimeMen);

		List<Player> playersTimeWomen = new ArrayList<Player>();
		playersTimeWomen = playerService2.getPlayerByTime(categoryWomen);
		request.setAttribute("listPlayersTimeWomen", playersTimeWomen);

		String pageName = "/stats.jsp";
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