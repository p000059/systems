package String;

public class FromJSONtoObject {

	public static void main(String[] args) {
		
		String fromFile = "1;Antonio;40";
		String[] toDatabase = fromFile.split(";");
		
		Person2 objPerson = new Person2();
		
		objPerson.setId(Integer.parseInt(toDatabase[0]));
		objPerson.setName(toDatabase[1]);
		objPerson.setAge(Integer.parseInt(toDatabase[2]));
		
	}

}

class Person2{
	
	private int id;
	private String name;
	private int age;
	
	public Person2(){
		
	}
	
	public Person2(int id, String name, int age) {
		
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


