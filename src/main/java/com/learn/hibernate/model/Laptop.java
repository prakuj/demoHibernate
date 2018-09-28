package com.learn.hibernate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "LAPTOP")
public class Laptop {
	private int lid;
	private String model;
	private String company;
	private Student student;
	
	@OneToOne(mappedBy = "laptop")
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Laptop() {
	}
	@Id
	@GeneratedValue
	@Column(name ="LID", unique=true, nullable=false,precision=5)
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	
	@Column(name="MODEL", nullable=false, length=20)
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	@Column(name ="COMPANY",nullable = false, length=20)
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
}
