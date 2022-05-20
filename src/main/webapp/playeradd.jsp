<%@ page import="org.garros.*"%>
<%@ page import="java.util.*	"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
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
<title>Add Player — Roland-Garros</title>
</head>
<body>
	<!-- Top Nav -->
	<jsp:include page='components/header.jsp' />
	<!-- Content -->
	<div
		class="flex flex-col h-screen bg-grey-lightest justify-center items-center">
		<form
			class="w-full max-w-xs bg-white flex flex-col py-5 px-8 rounded-lg shadow-lg"
			action="addplayer" method="post">

			<label class="text-gray-700 font-bold py-2">Firstname</label> <input
				name="firstname"
				class="text-gray-700 shadow border rounded border-gray-300 focus:outline-none focus:shadow-outline focus:border-rolandgreen py-1 px-3 mb-3"
				type="text" required> <label
				class="text-gray-700 font-bold py-2">Lastname</label> <input
				name="lastname"
				class="text-gray-700 shadow border rounded border-gray-300 focus:outline-none focus:shadow-outline focus:border-rolandgreen py-1 px-3 mb-3"
				type="text" required> <label
				class="text-gray-700 font-bold py-2">Age</label> <input name="age"
				class="text-gray-700 shadow border rounded border-gray-300 mb-3 py-1 px-3 focus:outline-none focus:border-rolandgreen focus:shadow-outline"
				type="number" min="18" max="40" required> <label
				class="text-gray-700 font-bold py-2">Hand</label> <select
				class="text-gray-700 shadow border rounded border-gray-300 focus:outline-none focus:shadow-outline focus:border-rolandgreen py-1 px-3 mb-3"
				name="hand" required>
				<option value="Right">Right</option>
				<option value="Left">Left</option>
			</select> <label class="text-gray-700 font-bold py-2">Category</label> <select
				class="text-gray-700 shadow border rounded border-gray-300 focus:outline-none focus:shadow-outline focus:border-rolandgreen py-1 px-3 mb-3"
				name="category" required>
				<option value="Men">Men</option>
				<option value="Women">Women</option>
			</select> <label class="text-gray-700 font-bold py-2">Ranking</label> <input
				name="rank"
				class="text-gray-700 shadow border rounded border-gray-300 mb-3 py-1 px-3 focus:outline-none focus:border-rolandgreen focus:shadow-outline"
				type="number" min="1" required> <label
				class="text-gray-700 font-bold py-2">Country</label> <input
				name="country"
				class="text-gray-700 shadow border rounded border-gray-300 mb-3 py-1 px-3 focus:outline-none focus:border-rolandgreen focus:shadow-outline"
				type="text" required>
			<div class="flex justify-between items-center my-4">
				<button
					class="bg-rolandgreen hover:bg-green-900 text-white font-bold rounded py-2 px-4">
					Add player</button>
			</div>

		</form>
	</div>
	<!-- Footer -->
	<jsp:include page='components/footer.jsp' />
	</div>
</body>
</html>