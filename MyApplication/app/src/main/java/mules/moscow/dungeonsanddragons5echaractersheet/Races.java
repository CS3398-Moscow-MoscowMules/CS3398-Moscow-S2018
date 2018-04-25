package mules.moscow.dungeonsanddragons5echaractersheet;

import java.util.ArrayList;


public class Races {

	private int playerRace;
	private ArrayList<String> raceList;
	
        /**
         * constructor for the Race class
         * @param raceData the list of available races
         */
	public Races(ArrayList<String> raceData){
		raceList = new ArrayList<String>(raceData);
		playerRace = -1;
	}
	
        /**
         * returns the player's race
         * @return the player's race
         */
	public int getPlayerRace() {
		return playerRace;
	}

	public String getPlayerRaceString() { return raceList.get(playerRace); }

        /**
         * Sets the player's race
         * @param playerRace the race to be given to the player
         */
	public void setPlayerRace(String playerRace) {
		int location=-1;
		for(int i=0; i<raceList.size(); i++) {
			if(playerRace.equals(raceList.get(i)))
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
