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

@WebServlet("/matchs")
public class MatchListServlet extends HttpServlet {

        private static final long serialVersionUID = 1L;
        private MatchService matchService = new MatchServiceImpl();
        private PlayerService playerService2 = new PlayerServiceImpl();
        private ScoreService scoreService = new ScoreServiceImpl();

        private void doProcess(HttpServletRequest request, HttpServletResponse response) {

                List<Match> matchList = new ArrayList<Match>();
                matchList = matchService.getAllMatch();
                request.setAttribute("listMatch", matchList);
               

                List<Player> playerList = new ArrayList<Player>();
                List<Player> player1 = new ArrayList<Player>();
                List<Player> player2 = new ArrayList<Player>();
                List<Player> winner = new ArrayList<Player>();
                List<Player> looser = new ArrayList<Player>();
               
                playerList = playerService2.getAllPlayers();
               
               
               
                request.setAttribute("listMatch", matchList);
               
                List<Score> scoreList = new ArrayList<Score>();
                List<Score> scoreSet1 = new ArrayList<Score>();
                List<Score> scoreSet2 = new ArrayList<Score>();
                List<Score> scoreSet3 = new ArrayList<Score>();
               
                scoreList = scoreService.getAllScore();
               
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
                       

                        for(Player player : playerList) {
                                if(player.getId() == id_player1) {
                                        player1.add(player);
                                }
                                if(player.getId() == id_player2) {
                                        player2.add(player);
                                }
                                if(player.getId() == winner_id) {
                                        winner.add(player);
                                }
                                if(player.getId() == looser_id) {
                                        looser.add(player);
                                }
                        }
                       
                        for(Score score : scoreList) {
                                if(score.getMatchId() == match_num) {
                                        if(score.getSetNumber()==1) {
                                                scoreSet1.add(score);
                                        }
                                        if(score.getSetNumber()==2) {
                                                scoreSet2.add(score);
                                        }
                                        if(score.getSetNumber()==3) {
                                                scoreSet3.add(score);
                                        }
                                }
                        }

                       
                }
                request.setAttribute("listPlayer1", player1);
                request.setAttribute("listPlayer2", player2);
               
                request.setAttribute("listWinner", winner);
                request.setAttribute("listLooser", looser);
               
                request.setAttribute("listScoreSet1", scoreSet1);
                request.setAttribute("listScoreSet2", scoreSet2);
                request.setAttribute("listScoreSet3", scoreSet3);
               
               
               

                String pageName = "/matchlist.jsp";
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