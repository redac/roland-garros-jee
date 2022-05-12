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
<body class="flex flex-col min-h-screen">
	<div>
		<!-- Top Nav -->
		<jsp:include page='components/header.jsp' />
	</div>
	<!-- Content -->
	<div class="w-full flex-grow bg-grey-lightest" style="padding-top: 4rem;">
		<div class="container mx-auto py-8">
			<div class="w-5/6 lg:w-1/2 mx-auto bg-white rounded shadow">
				<div
					class="py-4 px-8 text-black text-xl border-b border-grey-lighter">Register
					for a new administrator account</div>
				<div class="py-4 px-8">
					<div class="mb-4">
						<label class="block text-grey-darker text-sm font-bold mb-2"
							for="first_name">Username</label> <input
							class="appearance-none outline-rolandgreen border rounded w-full py-2 px-3 text-grey-darker"
							id="username" type="text" placeholder="Your username">
					</div>
					<div class="mb-4">
						<button id="dropdownDefault" data-dropdown-toggle="dropdown"
							class="block text-grey-darker text-sm font-bold mb-2">Account
							type</button>
						<!-- Dropdown menu -->
						<div class="mb-4">
							<div class="mb-2 w-full">
								<select
									class="form-select appearance-none outline-rolandgreen border rounded w-full py-2 px-3 text-grey-darker"
									aria-label="Default select example">
									<option selected>Administrator</option>
									<option value="1">Player Editor</option>
									<option value="2">Match Editor</option>
								</select>
							</div>
						</div>
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
							class="bg-transparent text-gray-900 text-l font-bold transition duration-150 border-b-8 border-transparent hover:border-rolandorange"
							type="submit">Sign Up</button>
					</div>
				</div>
			</div>
			<p class="text-center my-4">
				<a href="login.jsp"
					class="text-rolandorange text-sm no-underline hover:text-grey-darker transition duration-150 border-b-2 border-transparent hover:border-rolandgreen">Already
					have an account? Login</a>
			</p>
		</div>
	</div>
	<!-- Footer -->
	<jsp:include page='components/footer.jsp' />
</body>
</html>