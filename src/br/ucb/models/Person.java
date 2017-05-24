package br.ucb.models;

import java.io.Serializable;

public class Person implements Serializable{
	
	private static final long serialVersionUID = 1224562394177054868L;
	private String name;

	public Person(String name){
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
