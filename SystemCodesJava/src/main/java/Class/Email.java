package Class;

public class Email extends Common {

	private String address;
	
	public Email() {
		
	}

	public Email(String address) {
		
		this.address = address;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}	
}
