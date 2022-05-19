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
<!-- Footer -->
<footer
	class="sticky p-4 bg-white shadow md:flex md:items-center md:justify-between md:p-6">
	<span class="text-sm text-gray-500 sm:text-center">© 2022 <a
		href="home" class="hover:underline">Roland-Garros™</a>. All
		Rights Reserved.
	</span>
	<ul
		class="flex flex-wrap items-center mt-3 text-sm text-gray-500 sm:mt-0">
		<li><a href="cgu.jsp" class="mr-4 hover:underline md:mr-6">Privacy
				Policy</a></li>
		<li><a href="mailto:store.rg@fft.fr" class="hover:underline">Contact</a></li>
	</ul>
</footer>
</html>