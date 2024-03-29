package Model.Class;

public class Person {

	private int id;
	private String name;
	private boolean status;

	public Person() {

	}

	public Person(int id) {
		super();
		this.id = id;
	}

	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public Person(String name, boolean status) {
		super();
		this.name = name;
		this.status = status;
	}

	public Person(int id, String name, boolean status) {
		super();
		this.id = id;
		this.name = name;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
}
