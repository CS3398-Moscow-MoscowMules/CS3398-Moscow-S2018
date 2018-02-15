package se_DungeonsAndDragons;

import java.util.ArrayList;

public class Classes {

	private int playerClass;
	private ArrayList<String> classList;
	
	public Classes(ArrayList<String> classData){
		classList = new ArrayList<String>(classData);
		playerClass = -1;
	}
	
	public int getPlayerClass() {
		return playerClass;
	}

	public void setPlayerClass(String playerClass) {
		int location=-1;
		for(int i=0; i<classList.size(); i++) {
			if(playerClass == classList.get(i))
				location =i;
		}
		
		this.playerClass = location;
	}

	
	
/*	public enum Class {
		Barbarian,
		Bard,
		Cleric,
		Druid,
		Fighter,
		Monk,
		Paladin,
		Ranger,
		Rogue,
		Sorcerer,
		Warlock,
		Wizard
	}*/
}
