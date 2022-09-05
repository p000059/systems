package Class;
import java.time.LocalDateTime;

public class Document extends Common {

	private String acronym;
	private String number;
	private LocalDateTime dt_emission;
	private LocalDateTime dt_validity;
	
	public Document() {
		super();
	}

	public Document(String acronym, String number, LocalDateTime dt_emission, LocalDateTime dt_validity) {
		super();
		this.acronym = acronym;
		this.number = number;
		this.dt_emission = dt_emission;
		this.dt_validity = dt_validity;
	}

	public String getAcronym() {
		return acronym;
	}

	public void setAcronym(String acronym) {
		this.acronym = acronym;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public LocalDateTime getDt_emission() {
		return dt_emission;
	}

	public void setDt_emission(LocalDateTime dt_emission) {
		this.dt_emission = dt_emission;
	}

	public LocalDateTime getDt_validity() {
		return dt_validity;
	}

	public void setDt_validity(LocalDateTime dt_validity) {
		this.dt_validity = dt_validity;
	}
}
