package Persistence;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

@Entity
@Data
@Table(name="person")
public class Person implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long idPerson;

	@Column(name = "name", nullable = true)
	private String namePerson;
	
	@OneToMany(mappedBy = "person")
	@Column(name = "id_fone", nullable = true)
	private List<Fone> id_fone;

	@OneToMany(mappedBy = "email")
	@Column(name = "id_email", nullable = true)
	private List<Email> id_email;

	@Column(name = "date_birth", nullable = true)
	@Temporal(TemporalType.DATE)
	private LocalDate date_birth;
}
