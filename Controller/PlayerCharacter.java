package se_DungeonsAndDragons;

import java.util.ArrayList;
import java.util.Arrays;

public class PlayerCharacter {
	private Races playerRace;
	private Classes playerClass;
	private Backgrounds playerBackground;
	private Skills playerSkills;
	private Alignments playerAlignment;
	
	private AbilityScore strength;
	private AbilityScore dexterity;
	private AbilityScore constitution;
	private AbilityScore intelligence;
	private AbilityScore wisdom;
	private AbilityScore charisma;

	
	public PlayerCharacter(ArrayList<String> raceData, ArrayList<String> classData, ArrayList<String> backgroundData,
						   ArrayList<String> skillData, ArrayList<String> alignmentData){
		ArrayList<ArrayList<Boolean>> classSkillsData = new ArrayList<ArrayList<Boolean>>();
		classSkillsData.add((ArrayList<Boolean>) Arrays.asList(false, true, false, true, false, false, false, true, false, false, true, true, false, false, false, false, false, true));
		classSkillsData.add((ArrayList<Boolean>) Arrays.asList(true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true));
		classSkillsData.add((ArrayList<Boolean>) Arrays.asList(false, false, false, false, false, true, true, false, false, true, false, false, false, true, true, false, false, false));
		classSkillsData.add((ArrayList<Boolean>) Arrays.asList(false, true, true, false, false, false, true, false, false, true, true, true, false, false, true, false, false, true));
		classSkillsData.add((ArrayList<Boolean>) Arrays.asList(true, true, false, true, false, true, true, true, false, false, false, true, false, false, false, false, false, true));
		classSkillsData.add((ArrayList<Boolean>) Arrays.asList(true, false, false, true, false, true, true, false, false, false, false, false, false, false, true, false, true, false));
		classSkillsData.add((ArrayList<Boolean>) Arrays.asList(false, false, false, true, false, false, true, true, false, true, false, false, false, true, true, false, false, false));
		classSkillsData.add((ArrayList<Boolean>) Arrays.asList(false, true, false, true, false, false, true, false, true, false, true, true, false, false, false, false, true, true));
		classSkillsData.add((ArrayList<Boolean>) Arrays.asList(true, false, false, true, true, false, true, true, true, false, false, true, true, true, false, true, true, false));
		classSkillsData.add((ArrayList<Boolean>) Arrays.asList(false, false, true, false, true, false, true, true, false, false, false, false, false, true, true, false, false, false));
		classSkillsData.add((ArrayList<Boolean>) Arrays.asList(false, false, true, false, true, true, false, true, true, false, true, false, false, false, true, false, false, false));
		classSkillsData.add((ArrayList<Boolean>) Arrays.asList(false, false, true, false, false, true, true, false, true, true, false, false, false, false, true, false, false, false));
		
		playerRace = new Races(raceData);
		playerClass = new Classes(classData);
		playerBackground = new Backgrounds(backgroundData);
		playerAlignment = new Alignments(alignmentData);
		playerSkills = new Skills(skillData, classSkillsData);
		
		strength = new AbilityScore(0, new ArrayList<Integer>(Arrays.asList(0, 0, 0, 1, 2, 0, 0, 2, 0)));
		dexterity = new AbilityScore(0, new ArrayList<Integer>(Arrays.asList(0, 2, 2, 1, 0, 0, 0, 0, 0)));
		constitution = new AbilityScore(0, new ArrayList<Integer>(Arrays.asList(2, 0, 0, 1, 0, 0, 0, 1, 0)));
		intelligence = new AbilityScore(0, new ArrayList<Integer>(Arrays.asList(0, 0, 0, 1, 0, 2, 0, 0, 1)));
		wisdom = new AbilityScore(0, new ArrayList<Integer>(Arrays.asList(0, 0, 0, 1, 0, 0, 0, 0, 0)));
		charisma = new AbilityScore(0, new ArrayList<Integer>(Arrays.asList(0, 0, 0, 1, 1, 0, 2, 0, 2)));
		//increase Half elf by 1 for two of choice
	}
	
	public int getPlayerRace() {
		return playerRace.getPlayerRace();
	}

	public int getPlayerClass() {
		return playerClass.getPlayerClass();
	}

	public int getPlayerBackground() {
		return playerBackground.getPlayerBackground();
	}
	
	public ArrayList<Boolean> getPlayerSkills() {
		return playerSkills.getPlayerSkills();
	}

	public String getPlayerAlignment() {
		return playerAlignment.getPlayerAlignment();
	}
	
	public void setStrength(int str) {
		this.strength.setScore(str, this.playerRace.getPlayerRace(), this.playerClass.getPlayerClass());
	}
	
	public int getStrength() {
		return strength.getScore();
	}

	public void setDexterity(int dex) {
		this.dexterity.setScore(dex, this.playerRace.getPlayerRace(), this.playerClass.getPlayerClass());
	}
	
	public int getDexterity() {
		return dexterity.getScore();
	}

	public void setConstitution(int con) {
		this.constitution.setScore(con, this.playerRace.getPlayerRace(), this.playerClass.getPlayerClass());
	}
	
	public int getConstitution() {
		return constitution.getScore();
	}

	public void setIntelligence(int intl) {
		this.intelligence.setScore(intl, this.playerRace.getPlayerRace(), this.playerClass.getPlayerClass());
	}
	
	public int getIntelligence() {
		return intelligence.getScore();
	}
	
	public void setWisdom(int wis) {
		this.wisdom.setScore(wis, this.playerRace.getPlayerRace(), this.playerClass.getPlayerClass());
	}
	
	public int getWisdom() {
		return wisdom.getScore();
	}
	
	public void setCharisma(int chr) {
		this.charisma.setScore(chr, this.playerRace.getPlayerRace(), this.playerClass.getPlayerClass());
	}
	
	public int getCharisma() {
		return charisma.getScore();
	}

	
}
