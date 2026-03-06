package com.dyashin.attendancesystem;

import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.dyashin.attendancesystem.config.AppConfig;
import com.dyashin.attendancesystem.dto.StudentDTO;
import com.dyashin.attendancesystem.entity.Student;
import com.dyashin.attendancesystem.exception.AttendanceException;
import com.dyashin.attendancesystem.repository.StudentRepo;
import com.dyashin.attendancesystem.service.AttendanceService;
import com.dyashin.attendancesystem.validation.AttendanceValidation;

public class App {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		StudentRepo studentRepo = context.getBean(StudentRepo.class);
		AttendanceService attendanceService = context.getBean(AttendanceService.class);

		Scanner in = new Scanner(System.in);
		boolean exit = false;
		while (!exit) {
			System.out.println("Student Attendance Tracking System");
			System.out.println("Enter" + "\n 1. Add Student" + "\n 2. Mark Attendance"
					+ "\n 3. Get Attendance Percentage" + "\n 4. Exit");

			System.out.println("Enter choice: ");
			int choice = in.nextInt();

			switch (choice) {
			case 1:

				in.nextLine();
				System.out.print("Enter student name: ");
				String name = in.nextLine();
				App.validateName(name);

				StudentDTO dto = new StudentDTO();
				dto.setStudentName(name);

				Student student = new Student();
				student.setStudentName(dto.getStudentName());

				studentRepo.save(student);
				System.out.println("Student saved with ID: " + student.getStudentId());

				System.out.println("Back to menu y(yes) or n(exit):");
				String close = in.nextLine();
				if (!App.validateClose(close)) {
					break;
				}
				if (close.equalsIgnoreCase("n")) {
					exit = true;
				}
				break;

			case 2:
				System.out.println("Enter student id:");
				int studentId = in.nextInt();
				App.validateId(studentId);

				in.nextLine();
				System.out.println("Enter date in YYYY-MM-DD format:");
				LocalDate date = null;
				try {
					date = LocalDate.parse(in.nextLine());
				} catch (Exception e) {
					System.err.println("Error: Enter date in YYYY-MM-DD format only");
				}

				System.out.println("Present(true/false):");
				boolean present = in.nextBoolean();

				attendanceService.markAttendance(studentId, date, present);
				System.out.println("Attendance marked successfully");

				in.nextLine();
				System.out.println("Back to menu y(yes) or n(exit):");
				close = in.nextLine();
				if (!App.validateClose(close)) {
					break;
				}
				if (close.equalsIgnoreCase("n")) {
					exit = true;
				}
				break;

			case 3:
				System.out.println("Enter student id:");
				int studentID = in.nextInt();
				App.validateId(studentID);

				double percentage = attendanceService.getAttendancePercentage(studentID);
				System.out.println("Attendance percentage: " + percentage);

				in.nextLine();
				System.out.println("Back to menu y(yes) or n(exit):");
				close = in.nextLine();
				if (!App.validateClose(close)) {
					break;
				}
				if (close.equalsIgnoreCase("n")) {
					exit = true;
				}
				break;

			case 4:
				System.out.println("Exited");
				exit=true;
				break;

			default:
				System.out.println("Invalid choice");
				break;
			}
		}
	}

	public static boolean validateChoice(int choice) {
		try {
			AttendanceValidation.validateChoice(choice);
			return true;
		} catch (InputMismatchException e) {
			System.err.println("Error: Must contain only numbers!");
			return false;
		} catch (AttendanceException e) {
			System.err.println("Error: " + e.getMessage());
			return false;
		}
	}
	
	public static boolean validateId(int num) {
		try {
			AttendanceValidation.validateId(num);
			return true;
		} catch (InputMismatchException e) {
			System.err.println("Error: Must contain only numbers!");
			return false;
		} catch (AttendanceException e) {
			System.err.println("Error: " + e.getMessage());
			return false;
		}
	}

	public static boolean validateName(String name) {
		try {
			AttendanceValidation.validateName(name);
			return true;
		} catch (InputMismatchException e) {
			System.err.println("Error: Must contain only letters and spaces!");
			return false;
		} catch (AttendanceException e) {
			System.err.println("Error: " + e.getMessage());
			return false;
		}
	}

	public static boolean validateClose(String close) {
		try {
			AttendanceValidation.validateClose(close);
			return true;
		} catch (AttendanceException e) {
			System.err.println("Error: " + e.getMessage());
			return false;
		}
	}

}
