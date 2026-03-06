package com.dyashin.attendancesystem.repository;

import java.time.LocalDate;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.dyashin.attendancesystem.entity.Attendance;

public interface AttendanceRepo extends JpaRepository<Attendance, Integer> {

	@Query("SELECT "
			+ " (COUNT(a) * 100.0/(SELECT COUNT(a2) FROM Attendance a2 WHERE a2.student.studentId=:studentId)) "
			+ " FROM Attendance a WHERE a.student.studentId=:studentId and a.present=true")
	Double calculateAttendancePercentage(@Param("studentId") int studentId);
	
	@Query("SELECT a FROM Attendance a WHERE a.student.studentId = :studentId AND a.date = :date")
	Attendance findAttendanceByStudentAndDate(@Param("studentId") int studentId, @Param("date") LocalDate date);
}

