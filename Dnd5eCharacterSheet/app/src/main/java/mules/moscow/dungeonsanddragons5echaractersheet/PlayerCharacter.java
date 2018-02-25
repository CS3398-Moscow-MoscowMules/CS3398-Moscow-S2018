package mules.moscow.dungeonsanddragons5echaractersheet;

import java.util.ArrayList;
import java.util.Arrays;

public class PlayerCharacter {
    private String playerName;
    private String characterName;

    private Races playerRace;
    private Classes playerClass;
    private Backgrounds playerBackground;
    private Skills playerSkills;
    private Alignments playerAlignment;
    private int hitPoints;
    private Features playerFeatures;
    private Traits playerTraits;
    private Languages playerLanguages;
    private Speed playerSpeed;

    private AbilityScore strength;
    private AbilityScore dexterity;
    private AbilityScore constitution;
    private AbilityScore intelligence;
    private AbilityScore wisdom;
    private AbilityScore charisma;

    public PlayerCharacter(ArrayList<String> raceData, ArrayList<String> classData, /*ArrayList<String> backgroundData,*/
                           /*ArrayList<String> skillData,*/  ArrayList<Integer> healthData,
                           ArrayList<String> featuresData, ArrayList<String> traitData,
                           ArrayList<String> languageData, ArrayList<String> startingLangs,
                           ArrayList<Integer> classSpeedData, ArrayList<ArrayList<Integer>> modifierData,
                           ArrayList<ArrayList<Boolean>> classSkillsData){

        int extraLangs=0;
        for(int i =0; i<startingLangs.size(); i++){
            if(startingLangs.get(i).equals(null))
                startingLangs.remove(i);
            else if (startingLangs.get(i).equals("Extra")) {
                extraLangs++;
                startingLangs.remove(i);
            }
        }


        playerRace = new Races(raceData);
        playerClass = new Classes(classData, healthData);
        //playerBackground = new Backgrounds(backgroundData);
        //playerAlignment = new Alignments(alignmentData);
        //playerSkills = new Skills(skillData, classSkillsData);
        hitPoints = playerClass.getBaseHitPoints() + constitution.getModifier();
        playerFeatures = new Features(featuresData);
        playerTraits = new Traits(traitData);
        playerLanguages = new Languages(languageData, startingLangs, extraLangs);
        playerSpeed = new Speed(classSpeedData, playerClass.getPlayerClass());

        strength = new AbilityScore(0, modifierData.get(0));
        dexterity = new AbilityScore(0, modifierData.get(1));
        constitution = new AbilityScore(0, modifierData.get(2));
        intelligence = new AbilityScore(0, modifierData.get(3));
        wisdom = new AbilityScore(0, modifierData.get(4));
        charisma = new AbilityScore(0, modifierData.get(5));
        //increase Half elf by 1 for two of choice
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
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

    public int getHitPoints() {
        return hitPoints;
    }

    public Features getPlayerFeatures() {
        return playerFeatures;
    }

    public ArrayList<String> getPlayerTraits() {
        return playerTraits.getTraitList();
    }

    public void addLanguage(String newLang, boolean classExtra, boolean bgExtra){
        playerLanguages.addLanguage(newLang);
    }

    public ArrayList<String> getPlayerLanguages(){
        return playerLanguages.getLanguageList();
    }

    public Speed getPlayerSpeed() {
        return playerSpeed;
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
