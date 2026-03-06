package com.dyashin.musicplayerproject.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Getter
@Entity
@Table(name="songs")
public class SongDTO {
	
	@Id
	private int id;
	
	private String name;
	private int year;

	public SongDTO() {
	}
}
