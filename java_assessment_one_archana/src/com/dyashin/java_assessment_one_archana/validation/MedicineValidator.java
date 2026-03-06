package com.dyashin.java_assessment_one_archana.validation;

public class MedicineValidator {

    public static boolean isValidName(String med_name) {
        return med_name != null && !med_name.isBlank() && med_name.length() >= 2;
    }

    public static boolean isValidCategory(String category) {
    	return category != null && !category.isBlank() && category.length() >= 2;
    }
}
