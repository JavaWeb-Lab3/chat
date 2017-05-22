package br.ucb.models;

import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Message {

	private GregorianCalendar date;
	private String content;
	private Person author;
	private ArrayList<Person> recipients;
	
	
	public GregorianCalendar getDate() {
		return date;
	}
	public void setDate(GregorianCalendar date) {
		this.date = date;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Person getAuthor() {
		return author;
	}
	public void setAuthor(Person author) {
		this.author = author;
	}
	public ArrayList<Person> getRecipients() {
		return recipients;
	}
	public void setRecipients(ArrayList<Person> recipients) {
		this.recipients = recipients;
	}
	

}
