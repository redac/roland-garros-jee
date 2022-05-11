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
<title>Login — Roland-Garros</title>
</head>
<body>
	<div>
	<!-- Top Nav -->
	<jsp:include page='header.jsp' />
	</div>
	
	<!-- Content -->
	<div class="w-full bg-grey-lightest" style="padding-top: 4rem;">
		<div class="container mx-auto py-8">
			<div class="w-5/6 lg:w-1/2 mx-auto bg-white rounded shadow">
				<div
					class="py-4 px-8 text-black text-xl border-b border-grey-lighter">Login
					with an existing administrator account</div>
				<div class="py-4 px-8">
					<div class="mb-4">
						<label class="block text-grey-darker text-sm font-bold mb-2"
							for="first_name">Username</label> <input
							class="appearance-none outline-rolandgreen border rounded w-full py-2 px-3 text-grey-darker"
							id="username" type="text" placeholder="Your username">
					</div>
					<div class="mb-4">
						<label class="block text-grey-darker text-sm font-bold mb-2"
							for="password">Password</label> <input
							class="appearance-none outline-rolandgreen border rounded w-full py-2 px-3 text-grey-darker"
							id="password" type="password" placeholder="Your secure password">
						<p class="text-grey text-xs mt-1">At least 6 characters</p>
					</div>
					<div class="flex items-center justify-between mt-8">
						<button
							class="bg-blue hover:bg-blue-dark text-white font-bold py-2 px-4 rounded-full"
							type="submit">Sign Up</button>
					</div>
				</div>
			</div>
			<p class="text-center my-4">
				<a href="register.jsp"
					class="text-rolandorange text-sm no-underline hover:text-grey-darker">Don't
					have a login? Sign Up</a>
			</p>
		</div>
	</div>
</body>
</html>