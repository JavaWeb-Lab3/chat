package br.ucb.validators;

public abstract class NameValidator {
	
	public static boolean validateName(String name){
		boolean isNameValid = false;
		System.out.println(name);
		if(!name.equals("admin")){
			isNameValid = true;
		} else {
			isNameValid = false;
			System.out.println("O nome informado é inválido.");
		}
		return isNameValid;
	}
}
