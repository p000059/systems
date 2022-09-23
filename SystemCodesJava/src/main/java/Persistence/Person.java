package Persistence;

import java.io.Serializable;
import java.util.List;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.OneToMany;

//@Entity
public class Person implements Serializable {
	private static final long serialVersionUID = 1L;

//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@Column(name = "id")
	private Integer id;

//	@Column(name = "name")
	private String name;
	
//	@OneToMany(mappedBy = "person")
//	@Column(name = "id_fone")
	private List<Fone> fone;

//	@OneToMany(mappedBy = "person")
//	@Column(name = "id_email")
	private List<Email> email;


	public Person() {

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Email> getEmail() {
		return email;
	}

	public void setEmail(List<Email> email) {
		this.email = email;
	}

	public List<Fone> getFone() {
		return fone;
	}

	public void setFone(List<Fone> fone) {
		this.fone = fone;
	}

	@Override
	public String toString() {
		return this.id + " - " + this.name;
	}
}
