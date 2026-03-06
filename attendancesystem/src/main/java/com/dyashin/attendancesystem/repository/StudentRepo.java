package com.dyashin.attendancesystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dyashin.attendancesystem.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {

}
