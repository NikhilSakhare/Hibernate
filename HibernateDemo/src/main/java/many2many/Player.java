package many2many;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class Player {

	@Id
	private int id;
	private String playerName;
	private int jersy;

	@ManyToMany
	@JoinTable(name = "Sport_mapping", joinColumns = { @JoinColumn(name = "sid") }, 
	inverseJoinColumns = {
	@JoinColumn(name = "pid") })
	private List<Sport> sport;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public int getJersy() {
		return jersy;
	}

	public void setJersy(int jersy) {
		this.jersy = jersy;
	}

	public List<Sport> getSport() {
		return sport;
	}

	public void setSport(List<Sport> sport) {
		this.sport = sport;
	}

	@Override
	public String toString() {
		return "Player [id=" + id + ", playerName=" + playerName + ", jersy=" + jersy + ", sport=" + sport + "]";
	}

}
