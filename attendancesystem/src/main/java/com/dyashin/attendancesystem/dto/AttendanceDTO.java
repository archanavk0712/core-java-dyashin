package com.dyashin.attendancesystem.dto;

import java.time.LocalDate;

import lombok.Data;

@Data
public class AttendanceDTO {

	private int attendanceId;

	private boolean present;

	private LocalDate date;

	private int studentId;
}
