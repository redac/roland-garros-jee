<%@ page import="org.garros.*"%>
<%@ page import="java.util.*	"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
List<Match> listMatch = (List<Match>) request.getAttribute("listMatch");
List<Player> listPlayer1 = (List<Player>) request.getAttribute("listPlayer1");
List<Player> listPlayer2 = (List<Player>) request.getAttribute("listPlayer2");
List<Player> listWinner = (List<Player>) request.getAttribute("listWinner");
List<Player> listLooser = (List<Player>) request.getAttribute("listLooser");
List<Score> listScoreSet1 = (List<Score>) request.getAttribute("listScoreSet1");
List<Score> listScoreSet2 = (List<Score>) request.getAttribute("listScoreSet2");
List<Score> listScoreSet3 = (List<Score>) request.getAttribute("listScoreSet3");
%>

<html>
<head>
<meta charset="UTF-8">
<link rel="icon" type="image/png"
	href="https://raw.githubusercontent.com/redac/roland-garros-jee/main/src/public/roland-garros.png">
<script src="https://cdn.tailwindcss.com"></script>
<script>
	tailwind.config = {
		theme : {
			extend : {
				colors : {
					rolandorange : '#d35320',
					rolandgreen : '#05482f',
				}
			}
		}
	}
</script>
<title>Matches — Roland-Garros</title>
</head>
<body>
	<div
		class="flex flex-col h-screen font-sans antialiased bg-grey-lightest">
		<!-- Top Nav -->
		<jsp:include page='components/header.jsp' />
		<!-- Content -->
		<div class="flex justify-center items-center bg-grey-lightest">
			<div class="container mx-auto px-4 sm:px-8">
				<div class="py-8">
					<div>
						<h2 class="text-2xl font-semibold leading-tight">All matches</h2>
					</div>
					<div class="-mx-4 sm:-mx-8 px-4 sm:px-8 py-4 overflow-x-auto">
						<div
							class="inline-block min-w-full shadow-md rounded-lg overflow-hidden">
							<table class="min-w-full leading-normal">
								<thead>
									<tr>
										<th
											class="px-5 py-3 border-b-2 border-gray-200 bg-gray-100 text-left text-xs font-semibold text-gray-700 uppercase tracking-wider">
											n° match</th>
										<th
											class="px-5 py-3 border-b-2 border-gray-200 bg-gray-100 text-left text-xs font-semibold text-gray-700 uppercase tracking-wider">
											Winner</th>
										<th
											class="px-5 py-3 border-b-2 border-gray-200 bg-gray-100 text-left text-xs font-semibold text-gray-700 uppercase tracking-wider">
											Date</th>
										<th
											class="px-5 py-3 border-b-2 border-gray-200 bg-gray-100 text-left text-xs font-semibold text-gray-700 uppercase tracking-wider">
											Set 1</th>
										<th
											class="px-5 py-3 border-b-2 border-gray-200 bg-gray-100 text-left text-xs font-semibold text-gray-700 uppercase tracking-wider">
											Set 2</th>
										<th
											class="px-5 py-3 border-b-2 border-gray-200 bg-gray-100 text-left text-xs font-semibold text-gray-700 uppercase tracking-wider">
											Set 3</th>
										<th class="px-5 py-3 border-b-2 border-gray-200 bg-gray-100"></th>
									</tr>
								</thead>
								<tbody>
									<%
									int numPlayer = 0;
									int numWinnerLooser = 0;
									int numMatch = 0;
									for (Match match : listMatch) {
										int match_num = match.getMatchNum();
										int winner_id = match.getWinnerId();
										int looser_id = match.getLooserId();
										Date date = match.getDate();

										Player player1 = listPlayer1.get(numPlayer);
										String firstname1 = player1.getFirstname();
										String lastname1 = player1.getLastname();
										String country1 = player1.getCountry();

										Player player2 = listPlayer2.get(numPlayer);
										String firstname2 = player2.getFirstname();
										String lastname2 = player2.getLastname();
										;
										String country2 = player2.getCountry();

										Player winner = listWinner.get(numWinnerLooser);
										String firstnameWinner = winner.getFirstname();
										String lastnameWinner = winner.getLastname();

										Player looser = listLooser.get(numWinnerLooser);
										String firstnameLooser = looser.getFirstname();
										String lastnameLooser = looser.getLastname();

										Score scoreSet1 = listScoreSet1.get(numMatch);
										int player1_score1 = scoreSet1.getPlayer1Score();
										int player2_score1 = scoreSet1.getPlayer2Score();

										Score scoreSet2 = listScoreSet2.get(numMatch);
										int player1_score2 = scoreSet2.getPlayer1Score();
										int player2_score2 = scoreSet2.getPlayer2Score();

										Score scoreSet3 = listScoreSet3.get(numMatch);
										int player1_score3 = scoreSet3.getPlayer1Score();
										int player2_score3 = scoreSet3.getPlayer2Score();

										numPlayer = numPlayer + 1;
										numWinnerLooser = numWinnerLooser + 1;
										numMatch = numMatch + 1;
									%>
									<tr>
										<td
											class="px-5 py-5 border-b border-gray-200 bg-white text-sm">
											<div class="flex">
												<div class="flex-shrink-0 w-10 h-10">
													<img class="w-full h-full rounded-full"
														src="https://images.unsplash.com/photo-1560012057-4372e14c5085?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1674&q=80"
														alt="" />
												</div>
												<div class="ml-3">
													<p class="text-gray-900 whitespace-no-wrap"><%=match_num%>
													<p class="text-gray-900 whitespace-no-wrap"><%=lastname1%>
													</p>
													<p class="font-semibold text-gray-900 whitespace-no-wrap">Vs.
													</p>
													<p class="text-gray-900 whitespace-no-wrap"><%=lastname2%></p>
												</div>
											</div>
										</td>
										<td
											class="px-5 py-5 border-b border-gray-200 bg-white text-sm">
											<p class="text-gray-900 whitespace-no-wrap"><%=firstnameWinner%> <%=lastnameWinner%></p>
										</td>
										<td
											class="px-5 py-5 border-b border-gray-200 bg-white text-sm">
											<p class="text-gray-900 whitespace-no-wrap"><%=date%></p>
										</td>
										<td
											class="px-5 py-5 border-b border-gray-200 bg-white text-sm">
											<p class="text-gray-900 whitespace-no-wrap"><%=player1_score1%></p>
											<p class="font-semibold text-gray-900 whitespace-no-wrap">Vs.</p>
											<p class="text-gray-900 whitespace-no-wrap"><%=player2_score1%></p>
										</td>
										<td
											class="px-5 py-5 border-b border-gray-200 bg-white text-sm">
											<p class="text-gray-900 whitespace-no-wrap"><%=player1_score2%></p>
											<p class="font-semibold text-gray-900 whitespace-no-wrap">Vs.</p>
											<p class="text-gray-900 whitespace-no-wrap"><%=player2_score2%></p>
										</td>
										</td>
										<td
											class="px-5 py-5 border-b border-gray-200 bg-white text-sm">
											<p class="text-gray-900 whitespace-no-wrap"><%=player1_score3%></p>
											<p class="font-semibold text-gray-900 whitespace-no-wrap">Vs.</p>
											<p class="text-gray-900 whitespace-no-wrap"><%=player2_score3%></p>
										</td>
										<td
											class="px-5 py-5 border-b border-gray-200 bg-white text-sm text-right">
											<%
											if (session.getAttribute("connecte") != null) {
											%> <!-- Bouton pour editer un match --> <a
											href="match?id=<%=match_num%>">
												<button type="submit"
													class="inline-block text-gray-500 hover:text-gray-700">
													<svg class="inline-block h-6 w-6 fill-current"
														viewBox="0 0 24 24">
		                    							<path
															d="M12 6a2 2 0 110-4 2 2 0 010 4zm0 8a2 2 0 110-4 2 2 0 010 4zm-2 6a2 2 0 104 0 2 2 0 00-4 0z" />
		                    							</svg>
												</button>
										</a> <%
 }
 %>
										</td>
									</tr>
									<%
									}
									%>

								</tbody>
							</table>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- Footer -->
	<div>
		<jsp:include page='components/footer.jsp' />
	</div>
</body>
</html>