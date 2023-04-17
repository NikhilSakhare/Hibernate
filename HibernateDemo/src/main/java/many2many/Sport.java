package many2many;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Sport {
	
	@Id
	private int sportId;
	private String sportName;
	
	@ManyToMany(mappedBy = "sport")
	
	private List<Player>  player;

	public int getSportId() {
		return sportId;
	}

	public void setSportId(int sportId) {
		this.sportId = sportId;
	}

	public String getSportName() {
		return sportName;
	}

	public void setSportName(String sportName) {
		this.sportName = sportName;
	}

	public List<Player> getPlayer() {
		return player;
	}

	public void setPlayer(List<Player> player) {
		this.player = player;
	}

	@Override
	public String toString() {
		return "Sport [sportId=" + sportId + ", sportName=" + sportName + ", player=" + player + "]";
	}
	
	
	
}
