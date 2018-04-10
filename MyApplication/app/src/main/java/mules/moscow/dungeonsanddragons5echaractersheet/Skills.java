package mules.moscow.dungeonsanddragons5echaractersheet;

import java.util.ArrayList;

public class Skills {

	private ArrayList<Boolean> playerSkills;
	private ArrayList<Boolean> playerSkillOptions;
	private ArrayList<String> skillList;
	private ArrayList<ArrayList<Boolean>> classSkills;
	//private int numSkills;
	
        /**
         * the constructor for the Skills class
         * @param skillData list of available skills
         * @param classSkillsData list of available class skills
         */
	public Skills(ArrayList<String> skillData, ArrayList<ArrayList<Boolean>> classSkillsData){
		skillList = new ArrayList<>(skillData);
		classSkills = new ArrayList<>(classSkillsData);
		//numSkills =2;
	}
	
        /**
         * returns the list of skills known by the player
         * @return the list of skills known by the player
         */
	public ArrayList<Boolean> getPlayerSkills() {
		return playerSkills;
	}

	public void setSkillOptions(int classNum){
	    playerSkillOptions = new ArrayList<>(classSkills.get(classNum));
    }

        /**
         * Adds a skill to the list of skills known by the player
         * @param playerSkill the skill to be given to the player
         */
	public void addPlayerSkill(String playerSkill) {
		int location=-1;
		for(int i=0; i<skillList.size(); i++) {
			if(playerSkill == skillList.get(i))
				location =i;
		}
		
		this.playerSkills.set(location, true);
	}
}
