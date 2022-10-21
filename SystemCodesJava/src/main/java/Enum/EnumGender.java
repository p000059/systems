package Enum;

public enum EnumGender {

	MALE('M'),
	FEMALE('F'),
	EMPTY('E');
	
	private char gender;
	
	EnumGender(char gender){
		
		this.gender = gender;
	}
	
	public char getGender() {
		return gender;
	}
}
