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
		List<Player> playersWin = new ArrayList<Player>();
		List<Player> playersTime = new ArrayList<Player>();

		playersWin = playerService2.getPlayerByWin();
		playersTime = playerService2.getPlayerByTime();

		List<Player> playersWinMen = new ArrayList<Player>();
		List<Player> playersWinWomen = new ArrayList<Player>();
		List<Player> playersTimeMen = new ArrayList<Player>();
		List<Player> playersTimeWomen = new ArrayList<Player>();

		HttpSession session = request.getSession();
		@SuppressWarnings("unchecked")
		List<String> searchHistory = (List<String>) session.getAttribute("SearchHistory");
		if (searchHistory == null) {
			searchHistory = new ArrayList<>();
			session.setAttribute("SearchHistory", searchHistory);
		}
		searchHistory.add(searchText);

		for (Player playerwin : playersWin) {
			if (playerwin.getCategory().equals(categoryMen)) {
				playersWinMen.add(playerwin);
			}
			if (playerwin.getCategory().equals(categoryWomen)) {
				playersWinWomen.add(playerwin);
			}
		}
		for (Player playertime : playersTime) {
			if (playertime.getCategory().equals(categoryMen)) {
				playersTimeMen.add(playertime);
			}
			if (playertime.getCategory().equals(categoryWomen)) {
				playersTimeWomen.add(playertime);
			}
		}

		request.setAttribute("listPlayersWinMen", playersWinMen);
		request.setAttribute("listPlayersWinWomen", playersWinWomen);
		request.setAttribute("listPlayersTimeMen", playersTimeMen);
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