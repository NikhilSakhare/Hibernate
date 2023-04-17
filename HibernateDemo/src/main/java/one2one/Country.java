package one2one;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Country {
	
	@Id
	private int id;
	private String name;
	private String pm;
	
	@OneToOne(fetch=FetchType.LAZY)
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
		return "Country [id=" + id + ", name=" + name + ", pm=" + pm + ", capital=" + capital + "]";
	}

	
}
