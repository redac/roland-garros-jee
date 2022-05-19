<%@ page import="org.garros.*"%>
<%@ page import="java.util.*	"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
Player wantedPlayer = (Player) request.getAttribute("player");
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
<title>Player Page — Roland-Garros</title>
</head>
<body>
	<div
		class="flex flex-col h-screen font-sans antialiased bg-grey-lightest">
		<!-- Top Nav -->
		<jsp:include page='components/header.jsp' />
		<!-- Content -->
		<div class="flex justify-center items-center bg-grey-lightest">
			<div class="container mx-auto px-4 sm:px-8">
				<%
				int id = wantedPlayer.getId();
				String firstname = wantedPlayer.getFirstname();
				String lastname = wantedPlayer.getLastname();
				int age = wantedPlayer.getAge();
				String category = wantedPlayer.getCategory();
				String country = wantedPlayer.getCountry();
				int ranking = wantedPlayer.getRanking();
				String hand = wantedPlayer.getHand();
				%>
				<h2 class="text-2xl font-semibold leading-tight">
					Player Page :
					<%=firstname%>
					<%=lastname%></h2>
				<form>
					<div class="mb-6">
						<label for="email"
							class="block mb-2 text-sm font-medium text-gray-900 dark:text-gray-300">Your
							email</label> <input type="email" id="email"
							class="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-blue-500 focus:border-blue-500 block w-full p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-blue-500 dark:focus:border-blue-500"
							placeholder="name@flowbite.com" required>
					</div>
					<div class="mb-6">
						<label for="password"
							class="block mb-2 text-sm font-medium text-gray-900 dark:text-gray-300">Your
							password</label> <input type="password" id="password"
							class="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-blue-500 focus:border-blue-500 block w-full p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-blue-500 dark:focus:border-blue-500"
							required>
					</div>
					<div class="flex items-start mb-6">
						<div class="flex items-center h-5">
							<input id="remember" type="checkbox" value=""
								class="w-4 h-4 border border-gray-300 rounded bg-gray-50 focus:ring-3 focus:ring-blue-300 dark:bg-gray-700 dark:border-gray-600 dark:focus:ring-blue-600 dark:ring-offset-gray-800"
								required>
						</div>
						<label for="remember"
							class="ml-2 text-sm font-medium text-gray-900 dark:text-gray-300">Remember
							me</label>
					</div>
					<button type="submit"
						class="text-white bg-blue-700 hover:bg-blue-800 focus:ring-4 focus:outline-none focus:ring-blue-300 font-medium rounded-lg text-sm w-full sm:w-auto px-5 py-2.5 text-center dark:bg-blue-600 dark:hover:bg-blue-700 dark:focus:ring-blue-800">Submit</button>
				</form>
			</div>
		</div>
		<!-- Footer -->
		<jsp:include page='components/footer.jsp' />
	</div>
</body>
</html>