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
</head>
<!-- Top Nav -->
<div class="w-full bg-white sticky top-0 shadow z-1">
	<form class="container mx-auto">
		<div class="w-full flex justify-between items-center py-4 px-8">
			<!-- Brand -->
			<a href="index.jsp"
				class="text-center text-rolandgreen underline
						decoration-rolandorange font-bold">Roland-Garros</a>
			<!-- Navigation -->
			<div class="items-center hidden sm:flex">
				<a href="#" class="hover:roland-orange no-underline mx-2 px-2 py-2">Link
					1</a> <a href="#"
					class="hover:roland-orange no-underline mx-2 px-2 py-2">Link 2</a>
				<a href="login.jsp"
					class="hover:roland-orange rounded-full no-underline mx-2 px-4 py-2">Admin
					Login</a>
			</div>
		</div>
	</form>
</div>
</html>