package com.sys.domain.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class Recipient {

	@Column(name = "recipient_name")
	private String name;
	
	@Column(name = "recipient_public_place")
	private String publicPlace;
	@Column(name = "recipient_number")
	
	private String number;
	
	@Column(name = "recipient_complement")
	private String complement;
	
	@Column(name = "recipient_district")
	private String district;
}
