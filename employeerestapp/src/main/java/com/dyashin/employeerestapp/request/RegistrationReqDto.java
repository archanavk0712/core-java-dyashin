package com.dyashin.employeerestapp.request;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegistrationReqDto {

	private int id;

	private String name;

	private String email;

	private long mobile_no;

	private String pass;
}