package mules.moscow.dungeonsanddragons5echaractersheet;

import java.util.ArrayList;

public class Classes {

	private int playerClass;
	private ArrayList<String> classList;
        private ArrayList<Integer> healthList;
	private int baseHitPoints;
	
        /**
         * constructor for Classes class
         * @param classData contains all available player classes
         * @param healthData contains health data
         */
	public Classes(ArrayList<String> classData, ArrayList<Integer> healthData){
		classList = new ArrayList<String>(classData);
		healthList = new ArrayList<Integer>(healthData);
		playerClass = -1;
	}
	
        /**
         * returns the player's class
         * @return the player's class
         */
	public int getPlayerClass() {
		return playerClass;
	}

        /**
         * Sets the player's class
         * @param playerClass the class to be given to the player
         */
	public void setPlayerClass(String playerClass) {
		int location=-1;
		for(int i=0; i<classList.size(); i++) {
			if(playerClass.equals(classList.get(i)))
				location =i;
		}
		
		this.playerClass = location;
	}

        /**
         * returns the player's base hit points
         * @return the player's bas hit points
         */
        public int getBaseHitPoints() {
            return baseHitPoints;
        }

        /**
         * Sets the player's base hit points based on the player's class
         */
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
