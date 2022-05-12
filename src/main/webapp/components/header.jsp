<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="icon" type="image/png"
	href="https://raw.githubusercontent.com/redac/roland-garros-jee/main/src/public/roland-garros.png">
<script src="https://cdn.tailwindcss.com"></script>
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
				<a href="#" class="hover:roland-orange no-underline mx-2 px-2 py-2">Matches</a>
				<a href="login"
					class="hover:roland-orange rounded-full no-underline mx-2 px-4 py-2">Admin
					Login</a>
			</div>
		</div>
	</form>
</div>
</html>