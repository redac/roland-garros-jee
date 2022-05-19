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

@WebServlet("/matche")
public class MatchServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	private MatchService matchService = new MatchServiceImpl();

	private void doProcess(HttpServletRequest request, HttpServletResponse response) {
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
				

		int match_num = Integer.parseInt(req.getParameter("match_num"));

		Match match = new Match();
		match = (Match) matchService.getMatchByNum(match_num).get(0);
		
		

		req.setAttribute("matche", match);
		doProcess(req, resp);
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}
}