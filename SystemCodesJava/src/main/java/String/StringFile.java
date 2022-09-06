package String;

import javax.swing.JOptionPane;

public class StringFile {

	public static void main(String[] args) {
		
		//Exemplo de como retirar a informação de um arquivo JSON em java.
				String fromFile = "1;Antonio;40";
				String[] toDatabase = fromFile.split(";");
				Person objPerson = new Person(
						Integer.parseInt(toDatabase[0]),
						toDatabase[1],
						Integer.parseInt(toDatabase[2])
				);
				
				JOptionPane.showMessageDialog(null, "ID: " + objPerson.getId() + "\nName: " + objPerson.getName() + "\nAge: " + objPerson.getAge());

	}

}

class Person{
	
	private int id;
	private String name;
	private int age;
	
	public Person(){
		
	}
	
	public Person(int id, String name, int age) {
		
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	public void setId(int id) {
		this.id = id;
	}	
	
	public void setName(String name) {
		this.name = name;
	}	
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getId() {
		return this.id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
}