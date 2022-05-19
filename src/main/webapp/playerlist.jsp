<%@ page import="org.garros.*"%>
<%@ page import="java.util.*	"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
List<Player> listPlayers = (List<Player>) request.getAttribute("listPlayers");
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
					rolandgreen : '#05482f'
				}
			}
		}
	}
</script>
<title>Players — Roland-Garros</title>
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
						<h2 class="text-2xl font-semibold leading-tight">Players</h2>
					</div>
					<div class="-mx-4 sm:-mx-8 px-4 sm:px-8 py-4 overflow-x-auto">
						<div
							class="inline-block min-w-full shadow-md rounded-lg overflow-hidden">
							<table class="min-w-full leading-normal">
								<thead>
									<tr>
										<th
											class="px-5 py-3 border-b-2 border-gray-200 bg-gray-100 text-left text-xs font-semibold text-gray-700 uppercase tracking-wider">
											Player / Ranking</th>
										<th
											class="px-5 py-3 border-b-2 border-gray-200 bg-gray-100 text-left text-xs font-semibold text-gray-700 uppercase tracking-wider">
											Hand</th>
										<th
											class="px-5 py-3 border-b-2 border-gray-200 bg-gray-100 text-left text-xs font-semibold text-gray-700 uppercase tracking-wider">
											Age</th>
										<th
											class="px-5 py-3 border-b-2 border-gray-200 bg-gray-100 text-left text-xs font-semibold text-gray-700 uppercase tracking-wider">
											Category</th>
										<th
											class="px-5 py-3 border-b-2 border-gray-200 bg-gray-100 text-left text-xs font-semibold text-gray-700 uppercase tracking-wider">
											Country</th>
										<th class="px-5 py-3 border-b-2 border-gray-200 bg-gray-100"></th>
									</tr>
								</thead>
								<tbody>
									<%
									for (Player player : listPlayers) {
										int id = player.getId();
										String firstname = player.getFirstname();
										String lastname = player.getLastname();
										int age = player.getAge();
										String category = player.getCategory();
										String country = player.getCountry();
										int ranking = player.getRanking();
										String hand = player.getHand();
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
													<p class="text-gray-900 whitespace-no-wrap"><%=firstname%>
														<%=lastname%></p>
													<p class="text-gray-600 whitespace-no-wrap"><%=ranking%></p>
												</div>
											</div>
										</td>
										<td
											class="px-5 py-5 border-b border-gray-200 bg-white text-sm">
											<p class="text-gray-900 whitespace-no-wrap"><%=hand%></p>
										</td>
										<td
											class="px-5 py-5 border-b border-gray-200 bg-white text-sm">
											<p class="text-gray-900 whitespace-no-wrap"><%=age%></p>
										</td>
										<td
											class="px-5 py-5 border-b border-gray-200 bg-white text-sm">
											<span
											class="relative inline-block px-3 py-1 font-semibold text-green-900 leading-tight">
												<span aria-hidden
												class="absolute inset-0 bg-green-200 opacity-50 rounded-full"></span>
												<span class="relative"><%=category%></span>
										</span>
										</td>
										<td
											class="px-5 py-5 border-b border-gray-200 bg-white text-sm">
											<p class="text-gray-900 whitespace-no-wrap"><%=country%></p>
										</td>
										<td
											class="px-5 py-5 border-b border-gray-200 bg-white text-sm text-right">

											<%
											if (session.getAttribute("connecte") != null) {
											%> <!-- Bouton pour détailler un joueur --> <a
											href="player?id=<%=id%>">
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
					<div class="flex justify-between items-center my-4">
						<form action="playeradd.jsp">
							<button
								class="bg-rolandgreen hover:bg-green-900 text-white font-bold rounded py-2 px-4">
								Add player</button>
						</form>
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