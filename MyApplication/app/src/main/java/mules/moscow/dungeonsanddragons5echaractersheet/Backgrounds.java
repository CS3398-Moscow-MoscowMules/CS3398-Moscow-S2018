package mules.moscow.dungeonsanddragons5echaractersheet;

import java.util.ArrayList;

public class Backgrounds {

	private int playerBackground;
	private ArrayList<String> backgroundList;
	
        /**
         * The constructor for backgrounds. Uses backgroundData to construct an array of available backgrounds.
         * @param backgroundData contains all available player backgrounds
         */
	public Backgrounds (ArrayList<String> backgroundData){
		backgroundList = new ArrayList<String>(backgroundData);
		playerBackground = -1;
	}

        /**
         * Returns the player's background
         * @return playerBackground the player's background
         */
	public int getPlayerBackground() {
		return playerBackground;
	}

	public String getPlayerBackgroundString() { return backgroundList.get(playerBackground); }
        /**
         * Sets the player's background to the background passed
         * @param playerBackground the background to be set for the player
         */
	public void setPlayerBackground(String playerBackground) {
		int location=-1;
		for(int i=0; i<backgroundList.size(); i++) {
			if(playerBackground.equals(backgroundList.get(i)))
				location =i;
		}
		
		this.playerBackground = location;
	}

	
}
