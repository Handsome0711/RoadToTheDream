<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>
		<form action="/logout" method="post">
			<input type="submit" value="Sign out">
			<input type="hidden" name="_csrf" value="${_csrf.token}"/>
			
		</form>
	</div>

</body>
</html>