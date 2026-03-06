package com.dyashin.attendancesystem.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dyashin.attendancesystem.entity.Attendance;
import com.dyashin.attendancesystem.entity.Student;
import com.dyashin.attendancesystem.repository.AttendanceRepo;
import com.dyashin.attendancesystem.repository.StudentRepo;

@Service
public class AttendanceServiceImpl implements AttendanceService {

	@Autowired
	StudentRepo studentRepo;

	@Autowired
	AttendanceRepo attendanceRepo;

	@Override
	public void markAttendance(int studentId, LocalDate date, boolean present) {

		Attendance existing = attendanceRepo.findAttendanceByStudentAndDate(studentId, date);

		if (existing != null) {
			throw new RuntimeException("Attendance already marked for this date");
		}

		Student student = studentRepo.findById(studentId).orElseThrow(() -> new RuntimeException("Student not found"));

		Attendance attendance = new Attendance();

		attendance.setDate(date);
		attendance.setPresent(present);
		attendance.setStudent(student);

		attendanceRepo.save(attendance);
	}

	@Override
	public double getAttendancePercentage(int studentId) {
		Double percentage = attendanceRepo.calculateAttendancePercentage(studentId);
		if (percentage != null) {
			return percentage;
		} else {
			return 0.0;
		}
	}

	@Override
	public Attendance getAttendanceByDate(int studentId, LocalDate date) {
		return attendanceRepo.findAttendanceByStudentAndDate(studentId, date);
	}
}
