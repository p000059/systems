package Persistence.Model;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Fone implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_fone")
	private Long idFone;

	@Column(name = "tp_fone", nullable = false)
	private String tpFone;

	@Column(name = "nr_fone", nullable = false)
	private String nrFone;

	@ManyToOne(cascade = CascadeType.ALL, optional = false, fetch = FetchType.EAGER)
	private Person person;

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public Long getIdFone() {
		return idFone;
	}

	public void setIdFone(Long idFone) {
		this.idFone = idFone;
	}

	public String getTpFone() {
		return tpFone;
	}

	public void setTpFone(String tpFone) {
		this.tpFone = tpFone;
	}

	public String getNrFone() {
		return nrFone;
	}

	public void setNrFone(String nrFone) {
		this.nrFone = nrFone;
	}

}
