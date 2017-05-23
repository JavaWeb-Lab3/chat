<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Chat Logado</title>
	</head>
	<body>
		<% 
			if(request.getAttribute("all_messages") == null){
				out.println("");
			} else {
				out.println(request.getAttribute("all_messages"));
			}
		%>
		<form method="post" action="MessageServlet">
			<input type="text" name="message_text" placeholder="Escreva a sua mensagem"/>
			<input type="submit" value="Enviar"/>
		</form>
	</body>
</html>