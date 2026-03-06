package com.dyashin.attendancesystem.dto;

import java.util.List;

import com.dyashin.attendancesystem.entity.Attendance;

import lombok.Data;

@Data
public class StudentDTO {

	private int studentId;

	private String studentName;

	private List<Attendance> attendance;
}
