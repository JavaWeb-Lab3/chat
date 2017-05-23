package br.ucb.validators;

public abstract class NameValidator {
	
	public static boolean validateName(String name){
		boolean isNameValid = false;

		if(!name.equals("admin")){
			isNameValid = true; 
		} else {
			isNameValid = false;
		}
		return isNameValid;
	}
}
