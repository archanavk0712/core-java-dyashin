package com.dyashin.java_assessment_one_archana.dao;

import java.util.*;

import com.dyashin.java_assessment_one_archana.dto.MedicineDTO;
import com.dyashin.java_assessment_one_archana.exception.MedicineNotFoundException;

public class MedicineDAOImpl implements MedicineDAO {
    private final Map<Integer, MedicineDTO> medicines = new TreeMap<>();

    @Override
    public void addMedicine(MedicineDTO medicine) {
        medicines.put(medicine.getMed_id() , medicine);
    }

    @Override
    public void updateMedicine(MedicineDTO medicine) {
        medicines.put(medicine.getMed_id(), medicine);
    }

    @Override
    public void deleteMedicine(int med_id) throws MedicineNotFoundException {
        if (!medicines.containsKey(med_id)) {
            throw new MedicineNotFoundException("No song found with ID: " + med_id);
        }
        medicines.remove(med_id);
    }

    @Override
    public MedicineDTO getMedicineById(int med_id) {
        return medicines.get(med_id);
    }

    @Override
    public List<MedicineDTO> getAllMedicine() {
        return new ArrayList<>(medicines.values());
    }

    @Override
    public boolean exists(int med_id) {
        return medicines.containsKey(med_id);
    }
}
