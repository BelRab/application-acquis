<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Application d'acquis Java EE</title>
</head>
<body>



	<p><c:out value="${ returnForm }"></c:out></p>

	<c:if test="${!empty login }">
		<p><c:out value="Bonjour votre login est ${ login }"></c:out> </p>
	</c:if>
		
	<form method="post" action="formulaire">
		<label for="login"></label> <input type="text" name="login" id="login" />

		<label for="pass"></label> <input type="password" name="pass"
			id="pass" /> <input type="Submit" value="envoyer" />

	</form>
</body>
</html>