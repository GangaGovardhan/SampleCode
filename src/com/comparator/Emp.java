package com.comparator;

public class Emp implements Comparable<Emp>{
 
	private int id;
	private String name;
	private long phone;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(Long phone) {
		this.phone = phone;
	}
	public Emp(int id, String name, Long phone) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
	}
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public int compareTo(Emp o) {
		// TODO Auto-generated method stub
		return this.id-o.id;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", phone=" + phone + "]";
	}
	
	
	
	
	
	
	
	
}
