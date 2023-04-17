package embedable;

public class HOD {
	
	private int hodID;
	private String hodName;
	public int getHodID() {
		return hodID;
	}
	public void setHodID(int hodID) {
		this.hodID = hodID;
	}
	public String getHodName() {
		return hodName;
	}
	public void setHodName(String hodName) {
		this.hodName = hodName;
	}
	@Override
	public String toString() {
		return "HOD [hodID=" + hodID + ", hodName=" + hodName + "]";
	}
	
	
	
	
	
	
	
}
