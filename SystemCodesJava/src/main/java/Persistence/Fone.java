package Persistence;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
@Table(name="fone")
public class Fone implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long idFone;

	@Column(name = "type")
	private String tpFone;

	@Column(name = "number")
	private String nrFone;

	@ManyToOne(cascade = CascadeType.ALL, optional = false, fetch = FetchType.EAGER)
	private Person person;
}
