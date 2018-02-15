package se_DungeonsAndDragons;

import java.util.ArrayList;

public class Races {

	private int playerRace;
	private ArrayList<String> raceList;
	
	public Races(ArrayList<String> raceData){
		raceList = new ArrayList<String>(raceData);
		playerRace = -1;
	}
	
	public int getPlayerRace() {
		return playerRace;
	}

	public void setPlayerRace(String playerRace) {
		int location=-1;
		for(int i=0; i<raceList.size(); i++) {
			if(playerRace == raceList.get(i))
				location =i;
		}
		
		this.playerRace = location;
	}
	
/*	public enum Race {
		Dwarf,
		Elf,
		Halfling,
		Human,
		Dragonborn,
		Gnome,
		HalfElf,
		HalfOrc,
		Tiefling
	}*/
}
