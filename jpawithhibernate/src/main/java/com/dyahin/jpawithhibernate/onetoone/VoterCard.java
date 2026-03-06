package com.dyahin.jpawithhibernate.onetoone;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="VOTERCARD")
public class VoterCard {

	@Id
	@Column(name="VID")
	private int vId;
	
	@Column(name="VNAME")
	private String vName;
	
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "voter")
	private UserInfo user;
	
}
