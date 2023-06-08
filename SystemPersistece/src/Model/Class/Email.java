package Model.Class;

public class Email {

	private int id;
	private String email;
	private boolean status;
	
	public Email() {
		super();
	}

	public Email(int id, String email, boolean status) {
		super();
		this.id = id;
		this.email = email;
		this.status = status;
	}

	public Email(String email, boolean status) {
		super();
		this.email = email;
		this.status = status;
	}
	
	public Email(String email) {
		super();
		this.email = email;
	}
	
	public Email(boolean status) {
		super();
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}	
}
