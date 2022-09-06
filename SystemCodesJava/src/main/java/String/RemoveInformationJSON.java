package String;

import javax.swing.JOptionPane;

public class RemoveInformationJSON {

	public static void main(String[] args) {
		
		//Exemplo de como retirar a informação de um arquivo JSON em java.
		String fromFile = "1;Antonio;40";
		String[] toDatabase = fromFile.split(";");
		
		Person1 objPerson = new Person1();
		
		objPerson.setId(Integer.parseInt(toDatabase[0]));
		objPerson.setName(toDatabase[1]);
		objPerson.setAge(Integer.parseInt(toDatabase[2]));
		
		JOptionPane.showMessageDialog(null, objPerson.toString());
	}
}

class Person1{
	
	private int id;
	private String name;
	private int age;
	
	public Person1(){
		
	}
	
	public Person1(int id, String name, int age) {
		
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

	@Override
	public String toString() {
		return "id = " + id + "\nname = " + name + "\nage = " + age;
	}	
	
}
