package br.ucb.servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.ucb.models.Message;
import br.ucb.models.Person;

/**
 * Servlet implementation class MessageServlet
 */
@WebServlet("/MessageServlet")
public class MessageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ArrayList<Message> messages = new ArrayList();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MessageServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		 
		 Message message = new Message();
		 HttpSession session = request.getSession(true);
		 
		 message.setAuthor(new Person(session.getAttribute("logged_in_username").toString()));
		 message.setContent(request.getParameter("message_text"));
		 messages.add(message);
		 
		 String allMessagesToShow = "";
		 for(Message singleMessage : messages){
			 allMessagesToShow = allMessagesToShow + "<b>"+singleMessage.getAuthor().getName() + "</b>" + 
					 ": " +singleMessage.getContent() + "<br/>";
		 }
		 
		 request.setAttribute("all_messages", allMessagesToShow);
		 RequestDispatcher dispatcher = request.getRequestDispatcher("main.jsp");
		 dispatcher.forward(request, response);
		 
	}

}
