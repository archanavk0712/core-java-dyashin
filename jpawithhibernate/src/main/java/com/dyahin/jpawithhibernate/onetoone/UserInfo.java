package com.dyahin.jpawithhibernate.onetoone;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="USERINFO")
public class UserInfo {

	@Id
	@Column(name="UID")
	private int uId;
	
	@Column(name="UNAME")
	private String uName;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="vId")
	private VoterCard voter;
	
}
