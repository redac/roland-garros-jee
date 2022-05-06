<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="icon" type="image/png" href="https://www.example.com/image.png">
<script src="https://cdn.tailwindcss.com"></script>
<script>
    tailwind.config = {
      theme: {
        extend: {
          colors: {
            rolandorange: '#d35320',
            rolandgreen: '#05482f',
          }
        }
      }
    }
  </script>
<title>Login — Roland-Garros</title>
</head>
<body>
	<div class="font-sans antialiased bg-grey-lightest">
		<!-- Top Nav -->
		<div class="w-full bg-green fixed shadow z-1">
			<form class="container mx-auto">
				<div class="w-full flex justify-between items-center py-4 px-8">
					<!-- Brand -->
					<div class="text-center text-rolandgreen underline decoration-rolandorange font-bold">Roland-Garros</div>
					<!-- Navigation -->
					<div class="items-center hidden sm:flex">
						<a href="#"
							class="hover:text-green-lightest no-underline mx-2 px-2 py-2">Link
							1</a> <a href="#"
							class="hover:text-green-lightest no-underline mx-2 px-2 py-2">Link
							2</a> <a href="#"
							class="hover:bg-green-darker rounded-full no-underline mx-2 px-4 py-2">Link
							3</a>
					</div>
				</div>
			</form>
		</div>
		<!-- Content -->
		<div class="w-full bg-grey-lightest" style="padding-top: 4rem;">
			<div class="container mx-auto py-8">
				<div class="w-5/6 lg:w-1/2 mx-auto bg-white rounded shadow">
					<div
						class="py-4 px-8 text-black text-xl border-b border-grey-lighter">Login
						with an existing account</div>
					<div class="py-4 px-8">
						<div class="mb-4">
							<label class="block text-grey-darker text-sm font-bold mb-2"
								for="first_name">Username</label> <input
								class="appearance-none outline-rolandgreen border rounded w-full py-2 px-3 text-grey-darker"
								id="first_name" type="text" placeholder="Your username">
						</div>
						<div class="mb-4">
							<label class="block text-grey-darker text-sm font-bold mb-2"
								for="email">Email Address</label> <input
								class="appearance-none outline-rolandgreen border rounded w-full py-2 px-3 text-grey-darker"
								id="email" type="email" placeholder="Your email address">
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
					<a href="#"
						class="text-rolandorange text-sm no-underline hover:text-grey-darker">Don't have an account? register instead</a>
				</p>
			</div>
		</div>
	</div>
</body>
</html>