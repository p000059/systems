package Persistence;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import jakarta.persistence.Table;
import lombok.Data;
import lombok.NonNull;

@Entity
@Data
@NonNull
@Table(name="email")
public class Email implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long idEmail;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "type")
	private String type;

	@ManyToOne(cascade = CascadeType.ALL, optional = false)
	private Person person;
	
}
