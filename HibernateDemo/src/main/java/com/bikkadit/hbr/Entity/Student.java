package com.bikkadit.hbr.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name="Student_Info")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)   //Autoincrement
	@Column(name="Roll_No")
	private int id;
	@Column(name="Student_Name")
	private String name;
	@Column(name="Student_Dept")
	private String Dept;
	@Column(name="Student_City")
	private String city;
	@Column(name="Student_age")
	private int age;
	@Transient
	private double mark;
	@Lob
	private String eca;
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
	public String getDept() {
		return Dept;
	}
	public void setDept(String dept) {
		Dept = dept;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getMark() {
		return mark;
	}
	public void setMark(double mark) {
		this.mark = mark;
	}
	public String getEca() {
		return eca;
	}
	public void setEca(String eca) {
		this.eca = eca;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", Dept=" + Dept + ", city=" + city + ", age=" + age + ", mark="
				+ mark + ", eca=" + eca + "]";
	}

}
