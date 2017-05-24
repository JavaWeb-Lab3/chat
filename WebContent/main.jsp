<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<!-- Latest compiled and minified CSS -->
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">		
		<!-- Latest compiled and minified JavaScript -->
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
		<link rel="stylesheet" href="./css/main.css"/>
		<title>Chat Logado</title>
	</head>
	<body>
	<div class="chat_window">
    <div class="top_menu">
        <div class="buttons">
            <div class="button close"></div>
            <div class="button minimize"></div>
            <div class="button maximize"></div>
        </div>
        <div class="title">Big Chat</div>
    </div>
    <ul class="messages"></ul>
    
    <div class="bottom_wrapper clearfix">
    	<form method="post" action="MessageServlet">
        <div class="message_input_wrapper">
        	
	        	<input type="text" name="message_text" class="message_input" placeholder="Escreva sua mensagem..." />
				<input type="submit" value="Enviar"/>
            
        </div>
        <div class="send_message">
            <div class="icon"></div>
            <div class="text">Send</div>
        </div>
        </form>
    </div>
</div>
<div class="message_template">
    <li class="message">
        <div class="avatar"></div>
        <div class="text_wrapper">
            <div class="text"></div>
        </div>
    </li>
</div>
	
		<c:forEach var="message" items="${all_messages}" varStatus="id">
			<b>${message.author.name }:</b> ${message.content}
		</c:forEach>
	</body>
</html>