package mules.moscow.dungeonsanddragons5echaractersheet;

import android.util.Log;

import java.util.ArrayList;
import java.util.Arrays;

public class Skills {

	private ArrayList<Boolean> playerSkills;
	private ArrayList<Boolean> playerSkillOptions;
	private ArrayList<String> skillList;
	private ArrayList<ArrayList<Boolean>> classSkills;
	private ArrayList<ArrayList<String>> bgSkills;
	private ArrayList<Integer> numSkillsData;
	private int numSkills =2;
	
        /**
         * the constructor for the Skills class
         * @param skillData list of available skills
         * @param classSkillsData list of available class skills
         */
	public Skills(ArrayList<String> skillData, ArrayList<ArrayList<Boolean>> classSkillsData, ArrayList<ArrayList<String>> bgSkills, ArrayList<Integer> numSkillsData){
		playerSkills = new ArrayList<>(Arrays.asList(false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false));
		skillList = new ArrayList<>(skillData);
		classSkills = new ArrayList<>(classSkillsData);
		this.bgSkills = new ArrayList<>(bgSkills);
		this.numSkillsData = new ArrayList<>(numSkillsData);
	}
	
        /**
         * returns the list of skills known by the player
         * @return the list of skills known by the player
         */
	public ArrayList<Boolean> getPlayerSkills() {
		return playerSkills;
	}

	public ArrayList<Boolean> getPlayerSkillOptions() { return playerSkillOptions; }

	public void setSkillOptions(int classNum, int bgNum){
	    playerSkillOptions = new ArrayList<>(classSkills.get(classNum));
		numSkills += numSkillsData.get(classNum);

	    for(int i=0; i<bgSkills.get(bgNum).size();i++){
	        for(int j=0; j<skillList.size(); j++){
	            if(bgSkills.get(bgNum).get(i).equals(skillList.get(j)))
	                playerSkills.set(j, true);
            }
        }
    }

    public ArrayList<String> getSkillList(){return skillList;}

    public ArrayList<String> getSkillListStrings(){
        ArrayList<String> skills = new ArrayList<>();
        for(int i =0; i<skillList.size(); i++){
            if(playerSkills.get(i))
                skills.add(skillList.get(i));
        }
        return skills;
    }

    public int getNumSkills() { return numSkills; }
        /**
         * Adds a skill to the list of skills known by the player
         * @param playerSkill the skill to be given to the player
         */
	public void addPlayerSkill(String playerSkill) {
		int location=-1;

		for(int i =0; i< skillList.size(); i++){
			Log.d("SkillName", skillList.get(i));
		}

		for(int i=0; i<skillList.size(); i++) {
			if(playerSkill.equals(skillList.get(i)))
				location =i;
		}
		
		this.playerSkills.set(location, Boolean.TRUE);
	}
}
