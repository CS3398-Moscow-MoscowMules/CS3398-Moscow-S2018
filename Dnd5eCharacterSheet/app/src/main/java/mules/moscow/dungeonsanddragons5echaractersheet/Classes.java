package mules.moscow.dungeonsanddragons5echaractersheet;

import java.util.ArrayList;

public class Classes {

	private int playerClass;
	private ArrayList<String> classList;
    private ArrayList<Integer> healthList;
	private int baseHitPoints;
	
	public Classes(ArrayList<String> classData, ArrayList<Integer> healthData){
		classList = new ArrayList<String>(classData);
		healthList = new ArrayList<Integer>(healthData);
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

    public int getBaseHitPoints() {
        return baseHitPoints;
    }

    public void setBaseHitPoints() {
        this.baseHitPoints = healthList.get(playerClass);
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
