package com.dyashin.collegejpawithhibernate.controller;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Optional;

import java.util.Scanner;

import com.dyashin.collegejpawithhibernate.dto.CollegeDTO;
import com.dyashin.collegejpawithhibernate.exception.CollegeException;
import com.dyashin.collegejpawithhibernate.service.CollegeDAOService;
import com.dyashin.collegejpawithhibernate.serviceImpl.CollegeDAOServiceImpl;
import com.dyashin.collegejpawithhibernate.validation.CollegeValidator;

public class CollegeDisplay {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CollegeDAOService service = new CollegeDAOServiceImpl();
		boolean exit = false;

		while (!exit) {
			System.out.println("College system");
			System.out.println("1. Add College");
			System.out.println("2. Update College");
			System.out.println("3. Save or Update College");
			System.out.println("4. Delete College");
			System.out.println("5. Get College By ID");
			System.out.println("6. Get All Colleges");
			System.out.println("7. Get College By Name");
			System.out.println("8. Get College By Location");
			System.out.println("9. Get College By University");
			System.out.println("10. Count of Colleges");
			System.out.println("11. Minimum Fee");
			System.out.println("12. Maximum Fee");
			System.out.println("13. Average Fee");
			System.out.println("14. Exit");
			System.out.print("Choose option: ");
			while (!sc.hasNextInt()) {
				System.err.println("Error: choice must be a number");
				sc.next();
			}
			int choice = sc.nextInt();
			sc.nextLine();
			switch (choice) {
			case 1: // save
				CollegeDTO newCollege = new CollegeDTO();
				String name, dept, location, university, close;
				double fee;
				while (true) {
					try {
						System.out.print("Enter name: ");
						name = sc.nextLine();
						CollegeValidator.validateString(name, "Name");
						break;
					} catch (CollegeException e) {
						System.err.println("Error: " + e.getMessage());
					}
				}
				newCollege.setName(name);

				while (true) {
					try {
						System.out.print("Enter department: ");
						dept = sc.nextLine();
						CollegeValidator.validateString(dept, "Department");
						break;
					} catch (CollegeException e) {
						System.err.println("Error: " + e.getMessage());
					}
				}
				newCollege.setDept(dept);

				while (true) {
					try {
						System.out.print("Enter location: ");
						location = sc.nextLine();
						CollegeValidator.validateString(location, "Location");
						break;
					} catch (CollegeException e) {
						System.err.println("Error: " + e.getMessage());
					}
				}
				newCollege.setLocation(location);

				while (true) {
					try {
						System.out.print("Enter university: ");
						university = sc.nextLine();
						CollegeValidator.validateString(university, "University");
						break;
					} catch (CollegeException e) {
						System.err.println("Error: " + e.getMessage());
					}
				}
				newCollege.setUniversity(university);

				while (true) {
					try {
						System.out.print("Enter fee: ");
						fee = sc.nextDouble();
						sc.nextLine();
						CollegeValidator.validateFees(fee);
						break;
					} catch (InputMismatchException e) {
						System.err.println("Error: Fee must contain only numbers!");
						sc.nextLine();
					} catch (CollegeException e) {
						System.err.println("Error: " + e.getMessage());
					}
				}
				newCollege.setFee(fee);

				try {
					System.out.println("Insertion: " + service.save(newCollege));
				} catch (CollegeException e) {
					System.err.println("Error: " + e.getMessage());
				}

				while (true) {
					try {
						System.out.println("Back to menu (yes) or exit(no):");
						close = sc.nextLine();
						CollegeValidator.validateClose(close);
						break;
					} catch (CollegeException e) {
						System.err.println("Error: " + e.getMessage());
					}

				}
				if (close.equalsIgnoreCase("no")) {
					exit = true;
				}
				break;

			case 2: // modify
				int updateId;
				while (true) {
					try {
						System.out.print("Enter ID to update: ");
						while (!sc.hasNextInt()) {
							System.err.println("Error: Id must be a number");
							sc.next();
						}
						updateId = sc.nextInt();
						sc.nextLine();
						CollegeValidator.validateId(updateId);
						break;
					} catch (CollegeException e) {
						System.err.println("Error: " + e.getMessage());
					}
				}

				CollegeDTO updateCollege = new CollegeDTO();
				updateCollege.setId(updateId);

				while (true) {
					try {
						System.out.print("Enter name: ");
						name = sc.nextLine();
						CollegeValidator.validateString(name, "Name");
						break;
					} catch (CollegeException e) {
						System.err.println("Error: " + e.getMessage());
					}
				}
				updateCollege.setName(name);

				while (true) {
					try {
						System.out.print("Enter department: ");
						dept = sc.nextLine();
						CollegeValidator.validateString(dept, "Department");
						break;
					} catch (CollegeException e) {
						System.err.println("Error: " + e.getMessage());
					}
				}
				updateCollege.setDept(dept);

				while (true) {
					try {
						System.out.print("Enter location: ");
						location = sc.nextLine();
						CollegeValidator.validateString(location, "Location");
						break;
					} catch (CollegeException e) {
						System.err.println("Error: " + e.getMessage());
					}
				}
				updateCollege.setLocation(location);

				while (true) {
					try {
						System.out.print("Enter university: ");
						university = sc.nextLine();
						CollegeValidator.validateString(university, "University");
						break;
					} catch (CollegeException e) {
						System.err.println("Error: " + e.getMessage());
					}
				}
				updateCollege.setUniversity(university);

				while (true) {
					try {
						System.out.print("Enter fee: ");
						fee = sc.nextDouble();
						sc.nextLine();
						CollegeValidator.validateFees(fee);
						break;
					} catch (CollegeException e) {
						System.err.println("Error: " + e.getMessage());
					}
				}
				updateCollege.setFee(fee);

				try {
					System.out.println("Updation status: " + service.modify(updateCollege, updateId));
				} catch (CollegeException e) {
					System.err.println("Error: " + e.getMessage());
				}
				while (true) {
					try {
						System.out.println("Back to menu (yes) or exit(no):");
						close = sc.nextLine();
						CollegeValidator.validateClose(close);
						break;
					} catch (CollegeException e) {
						System.err.println("Error: " + e.getMessage());
					}

				}
				if (close.equalsIgnoreCase("no")) {
					exit = true;
				}
				break;

			case 3: // SaveUpdate
				int suId;
				while (true) {
					try {
						System.out.print("Enter ID (0 if new college): ");
						while (!sc.hasNextInt()) {
							System.err.println("Error: Id must be a number");
							sc.next();
						}
						suId = sc.nextInt();
						sc.nextLine();
						CollegeValidator.validateSaveId(suId);
						break;
					} catch (CollegeException e) {
						System.err.println("Error: " + e.getMessage());
					}
				}

				CollegeDTO suCollege = new CollegeDTO();
				suCollege.setId(suId);

				while (true) {
					try {
						System.out.print("Enter name: ");
						name = sc.nextLine();
						CollegeValidator.validateString(name, "Name");
						break;
					} catch (CollegeException e) {
						System.err.println("Error: " + e.getMessage());
					}
				}
				suCollege.setName(name);

				while (true) {
					try {
						System.out.print("Enter department: ");
						dept = sc.nextLine();
						CollegeValidator.validateString(dept, "Department");
						break;
					} catch (CollegeException e) {
						System.err.println("Error: " + e.getMessage());
					}
				}
				suCollege.setDept(dept);

				while (true) {
					try {
						System.out.print("Enter location: ");
						location = sc.nextLine();
						CollegeValidator.validateString(location, "Location");
						break;
					} catch (CollegeException e) {
						System.err.println("Error: " + e.getMessage());
					}
				}
				suCollege.setLocation(location);

				while (true) {
					try {
						System.out.print("Enter university: ");
						university = sc.nextLine();
						CollegeValidator.validateString(university, "University");
						break;
					} catch (CollegeException e) {
						System.err.println("Error: " + e.getMessage());
					}
				}
				suCollege.setUniversity(university);

				while (true) {
					try {
						System.out.print("Enter fee: ");
						String input = sc.nextLine();           
				        fee = Double.parseDouble(input);       
				        CollegeValidator.validateFees(fee);     
						break;
					} catch (NumberFormatException e) {
				        System.err.println("Error: Fee must be a valid number!");
				    }catch (CollegeException e) {
						System.err.println("Error: " + e.getMessage());
					}
				}
				suCollege.setFee(fee);

				try {
					System.out.println("Insertion: " + service.saveOrUpdate(suCollege, suId));
				} catch (CollegeException e) {
					System.err.println("Error: " + e.getMessage());
				}

				while (true) {
					try {
						System.out.println("Back to menu (yes) or exit(no):");
						close = sc.nextLine();
						CollegeValidator.validateClose(close);
						break;
					} catch (CollegeException e) {
						System.err.println("Error: " + e.getMessage());
					}

				}
				if (close.equalsIgnoreCase("no")) {
					exit = true;
				}
				break;

			case 4: // deleteById
				int deleteId;
				while (true) {
					try {
						System.out.print("Enter ID: ");
						while (!sc.hasNextInt()) {
							System.err.println("Error: Id must be a number");
							sc.next();
						}
						deleteId = sc.nextInt();
						sc.nextLine();
						CollegeValidator.validateId(deleteId);
						break;
					} catch (CollegeException e) {
						System.err.println("Error: " + e.getMessage());
					}
				}

				try {
					System.out.println("Deleted: " + service.deleteById(deleteId));
				} catch (CollegeException e) {
					System.err.println("Error: " + e.getMessage());
				}

				while (true) {
					try {
						System.out.println("Back to menu (yes) or exit(no):");
						close = sc.nextLine();
						CollegeValidator.validateClose(close);
						break;
					} catch (CollegeException e) {
						System.err.println("Error: " + e.getMessage());
					}

				}
				if (close.equalsIgnoreCase("no")) {
					exit = true;
				}
				break;

			case 5: // getById

				int allId;
				while (true) {
					try {
						System.out.print("Enter ID: ");
						while (!sc.hasNextInt()) {
							System.err.println("Error: Id must be a number");
							sc.next();
						}
						allId = sc.nextInt();
						sc.nextLine();
						CollegeValidator.validateId(allId);
						break;
					} catch (CollegeException e) {
						System.err.println("Error: " + e.getMessage());
					}
				}

				Optional<CollegeDTO> college;
				try {
					college = service.getById(allId);
					if (college.isPresent()) {
						System.out.println(college.get());
					} else {
						System.out.println("College not found.");
					}

				} catch (CollegeException e) {
					e.printStackTrace();
				}

				while (true) {
					try {
						System.out.println("Back to menu (yes) or exit(no):");
						close = sc.nextLine();
						CollegeValidator.validateClose(close);
						break;
					} catch (CollegeException e) {
						System.err.println("Error: " + e.getMessage());
					}

				}
				if (close.equalsIgnoreCase("no")) {
					exit = true;
				}
				break;

			case 6: // getAll
				
				List<CollegeDTO> allColleges;
				try {
					allColleges = service.getAll();
					if (allColleges.isEmpty()) {
						System.out.println("No records found");
					} else {
						for (CollegeDTO clg : allColleges) {
							System.out.println(clg);
						}
					}
				} catch (CollegeException e) {
					System.err.println("Error: " + e.getMessage());
				}
				

				while (true) {
					try {
						System.out.println("Back to menu (yes) or exit(no):");
						close = sc.nextLine();
						CollegeValidator.validateClose(close);
						break;
					} catch (CollegeException e) {
						System.err.println("Error: " + e.getMessage());
					}

				}
				if (close.equalsIgnoreCase("no")) {
					exit = true;
				}
				break;

			case 7: // getByName
				String getName;
				while (true) {
					try {
						System.out.print("Enter name: ");
			            getName = sc.nextLine().trim(); 
			            CollegeValidator.validateString(getName, "Name");
			            break;
					} catch (CollegeException e) {
						System.err.println("Error: " + e.getMessage());
					}
				}
				
				List<CollegeDTO> byName;
				try {
					byName = service.getByName(getName);
					for (CollegeDTO clg : byName) {
						System.out.println(clg);
					}
				} catch (CollegeException e) {
					System.err.println("Error: " + e.getMessage());
				}
				
				while (true) {
					try {
						System.out.println("Back to menu (yes) or exit(no):");
						close = sc.nextLine();
						CollegeValidator.validateClose(close);
						break;
					} catch (CollegeException e) {
						System.err.println("Error: " + e.getMessage());
					}

				}
				if (close.equalsIgnoreCase("no")) {
					exit = true;
				}
				break;

			case 8: // getByLocation
				String getLocation;
				while (true) {
					try {
						System.out.print("Enter location: ");
			            getLocation = sc.nextLine().trim(); 
			            CollegeValidator.validateString(getLocation, "Location");
			            break;
					} catch (CollegeException e) {
						System.err.println("Error: " + e.getMessage());
					}
				}
				
				List<CollegeDTO> byLoc;
				try {
					byLoc = service.getByLocation(getLocation);
					for (CollegeDTO clg : byLoc) {
						System.out.println(clg);
					}
				} catch (CollegeException e) {
					System.err.println("Error: " + e.getMessage());
				}

				while (true) {
					try {
						System.out.println("Back to menu (yes) or exit(no):");
						close = sc.nextLine();
						CollegeValidator.validateClose(close);
						break;
					} catch (CollegeException e) {
						System.err.println("Error: " + e.getMessage());
					}

				}
				if (close.equalsIgnoreCase("no")) {
					exit = true;
				}
				break;

			case 9: // getByUniversity
				String getUniversity;
				while (true) {
					try {
						System.out.print("Enter university: ");
						getUniversity = sc.nextLine().trim(); 
			            CollegeValidator.validateString(getUniversity, "University");
			            break;
					} catch (CollegeException e) {
						System.err.println("Error: " + e.getMessage());
					}
				}
				
				List<CollegeDTO> byUni;
				try {
					byUni = service.getByUniversity(getUniversity);
					for (CollegeDTO clg : byUni) {
						System.out.println(clg);
					}
				} catch (CollegeException e) {
					System.err.println("Error: " + e.getMessage());
				}

				while (true) {
					try {
						System.out.println("Back to menu (yes) or exit(no):");
						close = sc.nextLine();
						CollegeValidator.validateClose(close);
						break;
					} catch (CollegeException e) {
						System.err.println("Error: " + e.getMessage());
					}

				}
				if (close.equalsIgnoreCase("no")) {
					exit = true;
				}
				break;

			case 10: // countOfClg
				try {
					System.out.println("Total colleges: " + service.countOfClg());
				} catch (CollegeException e) {
					System.out.println("Error: " + e.getMessage());
				}
				while (true) {
					try {
						System.out.println("Back to menu (yes) or exit(no):");
						close = sc.nextLine();
						CollegeValidator.validateClose(close);
						break;
					} catch (CollegeException e) {
						System.err.println("Error: " + e.getMessage());
					}

				}
				if (close.equalsIgnoreCase("no")) {
					exit = true;
				}
				break;

			case 11: // minFee
				try {
					System.out.println("Minimum fee: " + service.minFee());
				} catch (CollegeException e) {
					System.out.println("Error: " + e.getMessage());
				}
				while (true) {
					try {
						System.out.println("Back to menu (yes) or exit(no):");
						close = sc.nextLine();
						CollegeValidator.validateClose(close);
						break;
					} catch (CollegeException e) {
						System.err.println("Error: " + e.getMessage());
					}

				}
				if (close.equalsIgnoreCase("no")) {
					exit = true;
				}
				break;

			case 12: // maxFee
				try {
					System.out.println("Maximum fee: " + service.maxFee());
				} catch (CollegeException e) {
					System.out.println("Error: " + e.getMessage());
				}
				while (true) {
					try {
						System.out.println("Back to menu (yes) or exit(no):");
						close = sc.nextLine();
						CollegeValidator.validateClose(close);
						break;
					} catch (CollegeException e) {
						System.err.println("Error: " + e.getMessage());
					}

				}
				if (close.equalsIgnoreCase("no")) {
					exit = true;
				}
				break;

			case 13: // avgFee
				try {
					System.out.println("Average fee: " + service.avgFee());
				} catch (CollegeException e) {
					System.err.println("Error: " + e.getMessage());
				}
				while (true) {
					try {
						System.out.println("Back to menu (yes) or exit(no):");
						close = sc.nextLine();
						CollegeValidator.validateClose(close);
						break;
					} catch (CollegeException e) {
						System.err.println("Error: " + e.getMessage());
					}

				}
				if (close.equalsIgnoreCase("no")) {
					exit = true;
				}
				break;

			case 14: // close
				exit = true;
				System.out.println("Exited");
				break;

			default:
				System.err.println("Invalid option. Try again.");
			}
		}

		sc.close();
	}
}
