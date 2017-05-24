package br.ucb.models;

import java.io.Serializable;
import java.util.ArrayList;

public class Room implements Serializable{
	
	private static final long serialVersionUID = 6339196700575883922L;
	private String name;
	private ArrayList<Person> members;
	private ArrayList<Message> messages = new ArrayList<>();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Person> getMembers() {
		return members;
	}
	public void setMembers(ArrayList<Person> members) {
		this.members = members;
	}
	public ArrayList<Message> getMessages() {
		return messages;
	}
	public void setMessages(ArrayList<Message> messages) {
		this.messages = messages;
	}
	
	public void addMessage(Message message){
		this.messages.add(message);
	}
}
