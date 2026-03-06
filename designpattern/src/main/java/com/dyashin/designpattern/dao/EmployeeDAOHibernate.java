package com.dyashin.designpattern.dao;

import com.dyashin.designpattern.dto.EmployeeDTO;
import jakarta.persistence.*;
import java.util.List;

public class EmployeeDAOHibernate {

    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPersistenceUnit");

    public boolean saveEmp(String name, double salary) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        try {
            tx.begin();
            EmployeeDTO emp = new EmployeeDTO(name, salary);
            em.persist(emp);
            tx.commit();
            System.out.println("Inserted Successfully (Hibernate)");
            return true;
        } catch (Exception e) {
            if (tx.isActive()) tx.rollback();
            e.printStackTrace();
            return false;
        } finally {
            em.close();
        }
    }

    public boolean updateEmp(int id, String name, double salary) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        try {
            tx.begin();
            EmployeeDTO emp = em.find(EmployeeDTO.class, id);
            if (emp != null) {
                emp.setName(name);
                emp.setSalary(salary);
                em.merge(emp);
                System.out.println("Updated Successfully (Hibernate)");
            } else {
                System.out.println("Employee not found for update (Hibernate)");
            }
            tx.commit();
            return true;
        } catch (Exception e) {
            if (tx.isActive()) tx.rollback();
            e.printStackTrace();
            return false;
        } finally {
            em.close();
        }
    }

    public boolean deleteEmp(int id) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        try {
            tx.begin();
            EmployeeDTO emp = em.find(EmployeeDTO.class, id);
            if (emp != null) {
                em.remove(emp);
                System.out.println("Deleted Successfully (Hibernate)");
            } else {
                System.out.println("Employee not found for delete (Hibernate)");
            }
            tx.commit();
            return true;
        } catch (Exception e) {
            if (tx.isActive()) tx.rollback();
            e.printStackTrace();
            return false;
        } finally {
            em.close();
        }
    }

    public void getAllEmployeeData() {
        EntityManager em = emf.createEntityManager();
        try {
            List<EmployeeDTO> list = em.createQuery("FROM EmployeeDTO", EmployeeDTO.class).getResultList();
            System.out.println("\n=== Hibernate Employee List ===");
            list.forEach(System.out::println);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            em.close();
        }
    }

    public void getParticularId(int id) {
        EntityManager em = emf.createEntityManager();
        try {
            EmployeeDTO emp = em.find(EmployeeDTO.class, id);
            if (emp != null)
                System.out.println("\nFetched Employee (Hibernate): " + emp);
            else
                System.out.println("Employee not found (Hibernate)");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            em.close();
        }
    }
    
    public void saveOrUpdateEmployee(int id, String name, double salary) {
        EmployeeDTO emp = new EmployeeDTO(id, name, salary);
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        try {
            tx.begin();

            // Check if employee exists
            EmployeeDTO existing = em.find(EmployeeDTO.class, emp.getId());

            if (existing != null) {
                // 🔁 Update
                em.merge(emp);
                System.out.println("Employee updated successfully (Hibernate)");
            } else {
                // ✅ Insert
                em.persist(emp);
                System.out.println("New employee saved successfully (Hibernate)");
            }

            tx.commit();
        } catch (Exception e) {
            if (tx.isActive()) tx.rollback();
            e.printStackTrace();
        } finally {
            em.close();
        }
    }

}
