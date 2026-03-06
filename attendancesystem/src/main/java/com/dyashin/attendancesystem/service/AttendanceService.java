package com.dyashin.attendancesystem.service;

import java.time.LocalDate;

import com.dyashin.attendancesystem.entity.Attendance;

public interface AttendanceService {

	void markAttendance(int studentId, LocalDate date, boolean present);

	double getAttendancePercentage(int studentId);
	
	Attendance getAttendanceByDate(int studentId, LocalDate date);
}
