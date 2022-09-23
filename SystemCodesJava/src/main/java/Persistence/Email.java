package Persistence;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Email implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_email")
	private Integer idEmail;

	@Column(name = "ed_email", nullable = false)
	private String nameEmail;

	@ManyToOne(cascade = CascadeType.ALL, optional = false)
	private Person person;

	public Email() {
	}

	public Email(Integer idEmail) {
		this.idEmail = idEmail;
	}

	public Email(String endEmail) {
		this.nameEmail = endEmail;
	}

	public Email(Integer idEmail, String endEmail) {
		this.idEmail = idEmail;
		this.nameEmail = endEmail;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public int getIdEmail() {
		return idEmail;
	}

	public void setIdEmail(Integer idEmail) {
		this.idEmail = idEmail;
	}

	public String getNameEmail() {
		return nameEmail;
	}

	public void setNameEmail(String nameEmail) {
		this.nameEmail = nameEmail;
	}

	@Override
	public String toString() {
		return nameEmail;
	}

}
