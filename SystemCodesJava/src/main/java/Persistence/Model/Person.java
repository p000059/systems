package Persistence.Model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class Person implements Serializable {
	private static final long serialVersionUID = 1L;

	@EqualsAndHashCode.Include
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "name")
	private String name;
	
	@OneToMany(mappedBy = "person")
	@JoinTable(name = "person_fone",
			joinColumns =  @JoinColumn(name = "person_id"),
			inverseJoinColumns = @JoinColumn(name = "phone_id")
			)
	@Column(name = "fone_id")
	private List<Fone> fone;

	@OneToMany(mappedBy = "person")
	@Column(name = "email_id")
	private List<Email> email;	
}
