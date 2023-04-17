package embedable;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import one2one.Country;

@Entity
public class Capital {
	
	@Id
	private int cid;
	private String C_Name;
	
	@OneToOne
	private Country country;

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getC_Name() {
		return C_Name;
	}

	public void setC_Name(String c_Name) {
		C_Name = c_Name;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Capital [cid=" + cid + ", C_Name=" + C_Name + ", country=" + country + "]";
	}
	
	

}