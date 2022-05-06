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
				backgroundImage: {
			        'bgimage': "url('/public/bg.png')",
			      },
				colors : {
					rolandorange : '#d35320',
					rolandgreen : '#05482f',
				}
			}
		}
	}
</script>
<title>Roland-Garros</title>
</head>
<body>
	<div
		class="flex flex-col h-screen justify-between font-sans antialiased bg-grey-lightest">
		<!-- Top Nav -->
		<jsp:include page='header.jsp' />
		<!-- Content -->
		<div class="flex justify-center bg-grey-lightest">
			<h1 class="text-6xl font-extrabold">
				<span
					class="bg-clip-text text-transparent bg-gradient-to-r from-orange-400 via-rolandorange to-rolandgreen">Welcome
					to the Roland-Garros website.</span>
			</h1>
		</div>
		<!-- Footer -->
		<jsp:include page='footer.jsp' />
	</div>
</body>
</html>