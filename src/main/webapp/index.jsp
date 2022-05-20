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
<title>Roland-Garros</title>
</head>
<body>
	<div
		class="flex flex-col bg-[url('https://images.unsplash.com/photo-1465125672495-63cdc2fa22ed?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=2940&q=80')] h-screen justify-between font-sans antialiased bg-grey-lightest">
		<!-- Top Nav -->
		<jsp:include page='components/header.jsp' />
		<!-- Content -->
		<div
			class="flex flex-col justify-center items-center bg-grey-lightest">
			<h1 class="text-6xl font-extrabold">
				<span
					class="bg-clip-text m-4 drop-shadow-md text-slate-200 hover:text-rolandgreen">ROLAND-GARROS</span>
			</h1>
			<h1 class="text-6xl font-extrabold">
				<span
					class="bg-clip-text m-4 drop-shadow-md text-slate-200">The French Open</span>
			</h1>
		</div>
		<!-- Footer -->
		<jsp:include page='components/footer.jsp' />
	</div>
</body>
</html>