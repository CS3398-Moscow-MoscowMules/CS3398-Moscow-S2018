package mules.moscow.dungeonsanddragons5echaractersheet;

import java.util.ArrayList;

public class Skills {

	private ArrayList<Boolean> playerSkills;
	private ArrayList<String> skillList;
	private ArrayList<ArrayList<Boolean>> classSkills;
	//private int numSkills;
	
	public Skills(ArrayList<String> skillData, ArrayList<ArrayList<Boolean>> classSkillsData){
		skillList = new ArrayList<String>(skillData);
		classSkills = new ArrayList<ArrayList<Boolean>>(classSkillsData);
		//numSkills =2;
	}
	
	public ArrayList<Boolean> getPlayerSkills() {
		return playerSkills;
	}

	public void addPlayerSkill(String playerSkill) {
		int location=-1;
		for(int i=0; i<skillList.size(); i++) {
			if(playerSkill == skillList.get(i))
				location =i;
		}
		
		this.playerSkills.set(location, true);
	}
}
