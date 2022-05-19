package org.garros.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.garros.Match;
import org.garros.MatchService;
import org.garros.MatchServiceImpl;
import org.garros.Player;
import org.garros.PlayerService;
import org.garros.PlayerServiceImpl;
import org.garros.Score;
import org.garros.ScoreService;
import org.garros.ScoreServiceImpl;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/MatchList")
public class MatchServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private MatchService matchService = new MatchServiceImpl();
	private PlayerService playerService2 = new PlayerServiceImpl();
	private ScoreService scoreService = new ScoreServiceImpl();

	private void doProcess(HttpServletRequest request, HttpServletResponse response) {

		List<Match> matchList = new ArrayList<Match>();
		matchList = matchService.getAllMatch();
		request.setAttribute("listMatch", matchList);
		

		List<Player> player1 = new ArrayList<Player>();
		List<Player> player2 = new ArrayList<Player>();
		List<Player> winner = new ArrayList<Player>();
		List<Player> looser = new ArrayList<Player>();
		
		List<Score> scoreSet1 = new ArrayList<Score>();
		List<Score> scoreSet2 = new ArrayList<Score>();
		List<Score> scoreSet3 = new ArrayList<Score>();
		
		String searchText = request.getParameter("searchText");

		HttpSession session = request.getSession();
		@SuppressWarnings("unchecked")
		List<String> searchHistory = (List<String>) session.getAttribute("SearchHistory");
		if (searchHistory == null) {
			searchHistory = new ArrayList<>();
			session.setAttribute("SearchHistory", searchHistory);
		}
		searchHistory.add(searchText);
		
		for(Match match : matchList) {
			int id_player1 = match.getPlayer1Id();
			int id_player2 = match.getPlayer2Id();
			int winner_id = match.getWinnerId();
			int looser_id = match.getLooserId();
			int match_num = match.getMatchNum();
			
			player1.add(playerService2.getPlayerById(id_player1).get(0));
			player2.add(playerService2.getPlayerById(id_player2).get(0));
			winner.add(playerService2.getPlayerById(winner_id).get(0));
			looser.add(playerService2.getPlayerById(looser_id).get(0));
			
			
			scoreSet1.add(scoreService.getScoreByMatchAndSet(match_num, 1).get(0));
			scoreSet2.add(scoreService.getScoreByMatchAndSet(match_num, 2).get(0));
			scoreSet3.add(scoreService.getScoreByMatchAndSet(match_num, 2).get(0));

			
		}
		request.setAttribute("listPlayer1", player1);
		request.setAttribute("listPlayer2", player2);
		
		request.setAttribute("listWinner", winner);
		request.setAttribute("listLooser", looser);
		
		request.setAttribute("listScoreSet1", scoreSet1);
		request.setAttribute("listScoreSet2", scoreSet2);
		request.setAttribute("listScoreSet3", scoreSet3);
		
		
		

		String pageName = "/match.jsp";
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