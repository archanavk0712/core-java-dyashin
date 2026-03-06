package com.dyashin.java_assessment_one_archana.dao;

import java.util.List;

import com.dyashin.java_assessment_one_archana.dto.MedicineDTO;
import com.dyashin.java_assessment_one_archana.exception.MedicineNotFoundException;

public interface MedicineDAO {
    void addMedicine(MedicineDTO song);
    void updateMedicine(MedicineDTO song);
    void deleteMedicine(int med_id) throws MedicineNotFoundException;
    MedicineDTO getMedicineById(int med_id);
    List<MedicineDTO> getAllMedicine();
    boolean exists(int med_id);
}
