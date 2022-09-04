package Class;

public class Fone extends Common{

	private String number;
	private String ddi;
	private String ddd;
	
	public Fone() {
		
	}

	public Fone(String number, String ddi, String ddd) {
		super();
		this.number = number;
		this.ddi = ddi;
		this.ddd = ddd;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getDdi() {
		return ddi;
	}

	public void setDdi(String ddi) {
		this.ddi = ddi;
	}

	public String getDdd() {
		return ddd;
	}

	public void setDdd(String ddd) {
		this.ddd = ddd;
	}
}
