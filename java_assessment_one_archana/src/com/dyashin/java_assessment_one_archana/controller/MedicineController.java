package com.dyashin.java_assessment_one_archana.controller;

import java.util.List;
import java.util.Scanner;

import com.dyashin.java_assessment_one_archana.dao.MedicineDAO;
import com.dyashin.java_assessment_one_archana.dao.MedicineDAOImpl;
import com.dyashin.java_assessment_one_archana.dto.MedicineDTO;
import com.dyashin.java_assessment_one_archana.exception.MedicineNotFoundException;
import com.dyashin.java_assessment_one_archana.validation.MedicineValidator;

public class MedicineController {
	Scanner sc = new Scanner(System.in);
	MedicineDAO medicineDAO = new MedicineDAOImpl();

	public static void main(String[] args) {
		MedicineController app = new MedicineController();
		app.start();
	}

	public void start() {
		System.out.println("=== Medical Store Inventory System ===");
		boolean running = true;

		while (running) {
			System.out.println("\nMenu:");
			System.out.println("1. Add Medicine");
			System.out.println("2. View All Medicines");
			System.out.println("3. View Medicine by ID");
			System.out.println("4. Update Medicine");
			System.out.println("5. Delete Medicine");
			System.out.println("6. Exit");
			System.out.print("Enter your choice: ");

			int choice = sc.nextInt();
			switch (choice) {
			case 1 : addMedicine();
					 break;
			case 2 : displayAllMedicine();
			 		 break;
			case 3 : viewById();
			 		 break;
			case 4 : updateMedicine();
			         break;
			case 5 : deleteMedicine();
			 		 break;
			case 6 : {
				System.out.println("Exiting...Thank you!!");
				running = false;
				break;
			}
			default : System.out.println("Invalid choice. Try again.");
			}
		}
	}

	private void addMedicine() {
		System.out.print("Enter Medicine ID: ");
		int med_id = sc.nextInt();

		if (medicineDAO.exists(med_id)) {
			System.out.println("Medicine already exists with this ID!");
			return;
		}

		sc.nextLine();
		System.out.print("Enter Medicine Name: ");
		String med_name = sc.nextLine();

		System.out.print("Enter Medicine Category: ");
		String category = sc.nextLine();

		System.out.print("Enter Medicine price: ");
		int price = sc.nextInt();

		System.out.print("Enter Medicine quantity: ");
		int quantity = sc.nextInt();

		if (!MedicineValidator.isValidName(med_name) || !MedicineValidator.isValidCategory(category)) {
			System.out.println("Invalid Medicine details. Try again.");
			return;
		}

		medicineDAO.addMedicine(new MedicineDTO(med_id, med_name, category, price, quantity));
		System.out.println("Medicine added successfully!");
	}

	private void displayAllMedicine() {
		List<MedicineDTO> medicine = medicineDAO.getAllMedicine();
		if (medicine.isEmpty()) {
			System.out.println("No medicines available.");
		} else {
			System.out.println("\nAll Medicines:");
			medicine.forEach(System.out::println);
		}
	}

	private void viewById() {
		System.out.print("Enter Medicine ID to View: ");
		int med_id = sc.nextInt();

		MedicineDTO medicine = medicineDAO.getMedicineById(med_id);
		if (medicine == null) {
			System.out.println("No medicine found with ID: " + med_id);
			return;
		}

		System.out.println("Present showing medicine: " + medicine.getMed_name());
		System.out.println("Press 0 to go back.");

		while (true) {
			int stop = sc.nextInt();
			if (stop == 0) {
				System.out.println("No medicine showing");
				break;
			} else {
				System.out.println("Invalid input. Press 0 to stop.");
			}
		}
	}

	private void updateMedicine() {
		System.out.print("Enter Medicine ID to Update: ");
		int med_id = sc.nextInt();

		MedicineDTO medicine = medicineDAO.getMedicineById(med_id);
		if (medicine == null) {
			System.out.println("No medicine found with ID: " + med_id);
			return;
		}

		System.out.println("Current medicine: " + medicine);
		sc.nextLine();

		System.out.print("Enter new medicine Name (leave blank to keep same): ");
		String newName = sc.nextLine();

		System.out.print("Enter new medicine Category (leave blank to keep same): ");
		String newCategory = sc.nextLine();

		if (!newName.isBlank())
			medicine.setMed_name(newName.trim());
		if (!newCategory.isBlank())
			medicine.setCategory(newCategory.trim());

		medicineDAO.updateMedicine(medicine);
		System.out.println("Medicine updated successfully!");
	}

	private void deleteMedicine() {
		System.out.print("Enter Medicine ID to Delete: ");
		int med_id = sc.nextInt();

		try {
			medicineDAO.deleteMedicine(med_id);
			System.out.println("Medicine deleted successfully!");
		} catch (MedicineNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}

}