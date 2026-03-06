package com.dyashin.java_assessment_one_archana.dto;

public class MedicineDTO {
    private int med_id ;
    private String med_name;
    private String category;
    private int price;
    private int quantity;
    
    public MedicineDTO(int med_id, String med_name, String category, int price, int quantity) {
		this.med_id = med_id;
		this.med_name = med_name;
		this.category = category;
		this.price = price;
		this.quantity = quantity;
	}

    
	public int getMed_id() {
		return med_id;
	}
	public void setMed_id(int med_id) {
		this.med_id = med_id;
	}

	public String getMed_name() {
		return med_name;
	}
	public void setMed_name(String med_name) {
		this.med_name = med_name;
	}

	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}

	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	
    @Override
    public String toString() {
        return "med_ID: " + med_id + " | med_Name: " + med_name + " | Category: " + category + " | Price: " + price + " | Quantinty: " + quantity;
    }
}
