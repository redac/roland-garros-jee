<%@ page import="org.garros.*"%>
<%@ page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="icon" type="image/png"
	href="https://raw.githubusercontent.com/redac/roland-garros-jee/main/src/public/roland-garros.png">
<script src="https://cdn.tailwindcss.com"></script>
<link rel="stylesheet"
	href="https://unpkg.com/flowbite@1.4.5/dist/flowbite.min.css" />
<style>
@import
	url('https://fonts.googleapis.com/css2?family=Inter:wght@300;400;500;900&family=Newsreader:ital,opsz,wght@1,6..72,300&display=swap')
	;
</style>
<script>
	tailwind.config = {
		theme : {
			extend : {
				colors : {
					rolandorange : '#d35320',
					rolandgreen : '#05482f',
				},
				fontFamily: {
			        sans: [
			          '"Inter"',
			          'system-ui',
			          '-apple-system',
			          'BlinkMacSystemFont',
			          '"Segoe UI"',
			          'Roboto',
			          '"Helvetica Neue"',
			          'Arial',
			          '"Noto Sans"',
			          'sans-serif',
			          '"Apple Color Emoji"',
			          '"Segoe UI Emoji"',
			          '"Segoe UI Symbol"',
			          '"Noto Color Emoji"',
			        ],
			}
		}
	}
</script>
</head>
<!-- Top Nav -->
<div class="font-sans w-full bg-white sticky top-0 shadow z-1">
	<form class="container mx-auto">
		<div class="w-full flex justify-between items-center py-4 px-8">
			<!-- Brand -->
			<a href="home"
				class="text-center text-rolandgreen underline
						decoration-rolandorange font-bold">Roland-Garros</a>
			<!-- Navigation -->
			<div class="items-center hidden sm:flex">
				<a href="PlayerList"
					class="hover:roland-orange no-underline mx-2 px-2 py-2">Players</a>
				<a href="MatchList" class="hover:roland-orange no-underline mx-2 px-2 py-2">Matches</a>

				<!-- Vérification connection -->
				<%
				Object connecte = session.getAttribute("connecte");
				
				if (connecte != null){
					User user = (User)session.getAttribute("connected_user");
					user.aff();
					%>
					<!-- Connecte -->
					<button id="dropdownDefault" data-dropdown-toggle="dropdown"
					class="text-white bg-green-700 hover:bg-green-900 focus:outline-none font-medium rounded-lg text-sm px-4 py-2.5 text-center inline-flex items-center"
					type="button">
					<%=user.getUsername()%>
					<svg class="w-4 h-4 ml-2" fill="none" stroke="currentColor"
						viewBox="0 0 24 24" xmlns="http://www.w3.org/2000/svg">
						<path stroke-linecap="round" stroke-linejoin="round"
							stroke-width="2" d="M19 9l-7 7-7-7"></path></svg>
					</button>
					<!-- Dropdown menu -->
					<div id="dropdown"
						class="hidden bg-white divide-y divide-gray-100 rounded shadow w-44 dark:bg-gray-700">
						<ul class="py-1 text-sm text-gray-700 dark:text-gray-200"
							aria-labelledby="dropdownDefault">
							<li><a href="#"
								class="block px-4 py-2 hover:bg-gray-100 dark:hover:bg-gray-600 dark:hover:text-white">Settings</a>
							</li>
							<li><a href="#"
								class="block px-4 py-2 hover:bg-gray-100 dark:hover:bg-gray-600 dark:hover:text-white">Page 2</a>
							</li>
							<li><a href="#"
								class="block px-4 py-2 hover:bg-gray-100 dark:hover:bg-gray-600 dark:hover:text-white">Page 3</a>
							</li>
							<li><a href="deco"
								class="block px-4 py-2 hover:bg-gray-100 dark:hover:bg-gray-600 dark:hover:text-white">Sign
									out</a></li>
						</ul>
					</div>
					<%				
				} else {
					%>
					<!-- Pas connecte -->
					<a href="login"
						class="hover:roland-orange rounded-full no-underline mx-2 px-4 py-2">
						Admin Login</a>
					<%
				}
				%>
			</div>
		</div>
	</form>
</div>
<script src="https://unpkg.com/flowbite@1.4.5/dist/flowbite.js"></script>
</html>