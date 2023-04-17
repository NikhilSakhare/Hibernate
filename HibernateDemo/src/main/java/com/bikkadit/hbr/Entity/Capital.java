package com.bikkadit.hbr.Entity;

import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

public class Capital {
	
	@Id
	private int id;
	private String name;
	private String pm;
	@OneToOne
	private Capital capital;
	
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

	public String getPm() {
		return pm;
	}

	public void setPm(String pm) {
		this.pm = pm;
	}

	public Capital getCapital() {
		return capital;
	}

	public void setCapital(Capital capital) {
		this.capital = capital;
	}

	
	@Override
	public String toString() {
		return "Capital [id=" + id + ", name=" + name + ", pm=" + pm + ", capital=" + capital + "]";
	}
	
	
	
	
}
