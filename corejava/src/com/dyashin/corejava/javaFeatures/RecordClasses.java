package com.dyashin.corejava.javaFeatures;

import java.util.Objects;

//class Programmer {
//	private final int id;
//	
//	private final String name;
//
//	public Programmer(int id, String name) {
//		super();
//		this.id = id;
//		this.name = name;
//	}
//
//	public int getId() {
//		return id;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	@Override
//	public String toString() {
//		return "Programmer [id=" + id + ", name=" + name + "]";
//	}
//
//	@Override
//	public int hashCode() {
//		return Objects.hash(id, name);
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Programmer other = (Programmer) obj;
//		return id == other.id && Objects.equals(name, other.name);
//	}
//}

record Programmer(int id, String name) implements Cloneable {

//	public Programmer() {
//		this(0, " ");
//	}

	// canonical constructor
//	public Programmer(int id, String name) {
//		if (id == 0) {
//			throw new IllegalArgumentException("Id cannot be zero");
//		}
//		this.id = id;
//		this.name = name;
//	}

	// compact canonical constructor
	public Programmer {
		if (id == 0) {
			throw new IllegalArgumentException("Id cannot be zero");
		}
	}

	public void show() {

	}
}

public class RecordClasses {
	public static void main(String[] args) {
		Programmer p1 = new Programmer(1, "Archana");
		Programmer p2 = new Programmer(1, "Archana");
//		Programmer p3= new Programmer();
		System.out.println(p1.equals(p2));
		System.out.println(p1.name());
		System.out.println(p1);
		System.out.println(p2);
//		System.out.println(p3);
	}
}
