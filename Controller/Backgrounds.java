package se_DungeonsAndDragons;

import java.util.ArrayList;

public class Backgrounds {

	private int playerBackground;
	private ArrayList<String> backgroundList;
	
	public Backgrounds (ArrayList<String> backgroundData){
		backgroundList = new ArrayList<String>(backgroundData);
		playerBackground = -1;
	}

	public int getPlayerBackground() {
		return playerBackground;
	}

	public void setPlayerBackground(String playerBackground) {
		int location=-1;
		for(int i=0; i<backgroundList.size(); i++) {
			if(playerBackground == backgroundList.get(i))
				location =i;
		}
		
		this.playerBackground = location;
	}

	
}
