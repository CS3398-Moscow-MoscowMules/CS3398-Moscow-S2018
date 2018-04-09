package mules.moscow.dungeonsanddragons5echaractersheet;

import java.util.ArrayList;
import java.util.Arrays;

public class PlayerCharacter {
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

    //placeholders for not yet implemented features
    private String weapon;
    private String armor;
    private String shield;
    private String spell;

    private ArrayList<ArrayList<String>> startingLangs;

    /**
     * Player character constructor. Initializes the all the player's fields.
     * @param raceData
     * @param classData
     * @param featuresData
     * @param traitData
     * @param languageData
     * @param startingLangs 
     */
    public PlayerCharacter(ArrayList<String> raceData, ArrayList<String> classData, ArrayList<String> backgroundData,
                           ArrayList<String> skillData,  ArrayList<Integer> healthData,
                           ArrayList<String> featuresData, ArrayList<String> traitData,
                           ArrayList<String> languageData, ArrayList<ArrayList<String>> startingLangs,
                           ArrayList<Integer> classSpeedData, ArrayList<ArrayList<Integer>> modifierData,
                           ArrayList<ArrayList<Boolean>> classSkillsData){

        int extraLangs=0;
        for(int i =0; i<startingLangs.size(); i++){
            if(startingLangs.get(i).equals("None"))
                startingLangs.remove(i);
            else if (startingLangs.get(i).equals("Extra")) {
                extraLangs++;
                startingLangs.remove(i);
            }
        }


        playerRace = new Races(raceData);
        playerClass = new Classes(classData, healthData);
        playerBackground = new Backgrounds(backgroundData);
        playerAlignment = new Alignments();
<<<<<<< HEAD
        //playerSkills = new Skills(skillData, classSkillsData);
        hitPoints = playerClass.getBaseHitPoints() + constitution.getModifier();
        playerFeatures = new Features(featuresData);                                //Does this need anything aditional to make it happen? (looks like no?)
        playerTraits = new Traits(traitData);                                       //Does this need anything aditional to make it happen? (looks like no?)
        //playerLanguages = new Languages(languageData, startingLangs, extraLangs);
              
=======
        playerSkills = new Skills(skillData, classSkillsData);

        playerFeatures = new Features(featuresData);                                //Does this need anything aditional to make it happen? (looks like no)
        playerTraits = new Traits(traitData);                                       //Does this need anything aditional to make it happen? (looks like no)
        playerLanguages = new Languages(languageData, extraLangs);
        this.startingLangs = startingLangs;
        playerSpeed = new Speed(classSpeedData, playerClass.getPlayerClass());      //Does this need anything aditional to make it happen? (looks like no)
>>>>>>> 309f2939a5cd03d0b6b218c28193eb10699f7952

        strength = new AbilityScore(0, modifierData.get(0));
        dexterity = new AbilityScore(0, modifierData.get(1));
        constitution = new AbilityScore(0, modifierData.get(2));
        intelligence = new AbilityScore(0, modifierData.get(3));
        wisdom = new AbilityScore(0, modifierData.get(4));
        charisma = new AbilityScore(0, modifierData.get(5));

        hitPoints = playerClass.getBaseHitPoints() + constitution.getModifier();
    }


    public void updateModifiers(){
        //increase Half elf by 1 for two of choice
    }

    // Things that don't depend on other things when being set
    /**
     * returns the character's name
     * @return the character's name
     */
    public String getCharacterName() {
        return characterName;
    }

    /**
     * allows the character's name to be set individually from PlayerCharacter
     * @param characterName the player's chosen name
     */
    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    /**
     * allows the playerRace to be set individually from PlayerCharacter
     * @param givenRace the player's chosen race
     */
    public void setPlayerRace( String givenRace ) {
        playerRace.setPlayerRace( givenRace );
    }
    
    /**
     * allows the playerClass to be set individually from PlayerCharacter
     * @param givenClass the player's chosen class
     */
<<<<<<< HEAD
    public void setPlayerClass( String playerClass ) {
        playerClass.setPlayerClass( playerClass );
        setPlayerSpeed( playerClass );
=======
    public void setPlayerClass( String givenClass ) {
        playerClass.setPlayerClass( givenClass );
>>>>>>> 309f2939a5cd03d0b6b218c28193eb10699f7952
    }
    
    /**
     * allows the playerAlignment to be set individually from PlayerCharacter
     * @param givenAlignment the player's chosen alignment
     */
    public void setPlayerAlignment( String givenAlignment ) {
        playerAlignment.setPlayerAlignment( givenAlignment );
    }

    /**
     * allows the playerBackground to be set individually from PlayerCharacter
     * @param givenBackground the player's chosen background
     */
    public void setPlayerBackground(String givenBackground){
        playerBackground.setPlayerBackground(givenBackground);
    }

    /**
     * updates known languages based on players class
     * can only be used after class has been set
     */
    public void setKnownLanguages(){
        playerLanguages.setKnownLanguages(startingLangs, playerClass.getPlayerClass());
    }
<<<<<<< HEAD
    
    //background (make later)
    
    
    /**
     * This is called automatically when playerClass is set
     * @param p 
     */
    public void setPlayerSpeed( playerClass p )
    {
        playerSpeed = new Speed(classSpeedData, p.getPlayerClass());
    }
    
=======
>>>>>>> 309f2939a5cd03d0b6b218c28193eb10699f7952

    /**
     * returns the player's race
     * @return the player's race
     */
    public int getPlayerRace() {
        return playerRace.getPlayerRace();
    }

    /**
     * returns the player's class
     * @return the player's class
     */
    public int getPlayerClass() {
        return playerClass.getPlayerClass();
    }

    /**
     * returns the player's background
     * @return the player's background
     */
    public int getPlayerBackground() {
        return playerBackground.getPlayerBackground();
    }

    /**
     * returns a list of the player's skills
     * @return a list of the player's skills
     */
    public ArrayList<Boolean> getPlayerSkills() {
        return playerSkills.getPlayerSkills();
    }


    public void setSkillOptions(){ playerSkills.setSkillOptions(playerClass.getPlayerClass());}

    public void addPlayerSkill(String skill){playerSkills.addPlayerSkill(skill);}

    /**
     * returns the player's alignment
     * @return the player's alignment
     */
    public String getPlayerAlignment() {
        return playerAlignment.getPlayerAlignment();
    }

    /**
     * returns the player's hit points
     * @return the player's hit points
     */
    public int getHitPoints() {
        return hitPoints;
    }

    /**
     * returns the list of features the player has
     * @return the list of features the player has
     */
    public Features getPlayerFeatures() {
        return playerFeatures;
    }

    /**
     * returns the list of traits the player has
     * @return the list of traits the player has
     */
    public ArrayList<String> getPlayerTraits() {
        return playerTraits.getTraitList();
    }

    /**
     * Adds a language to the list of languages spoken by the player
     * @param newLang the language that has been learned
     */
    public void addLanguage(String newLang){
        playerLanguages.addLanguage(newLang);
    }

    /**
     * returns the languages spoken by the player
     * @return the list of languages spoken by the player
     */
    public ArrayList<String> getPlayerLanguages(){
        return playerLanguages.getLanguageList();
    }

    /**
     * returns the player's speed
     * @return the player's speed
     */
    public Speed getPlayerSpeed() {
        return playerSpeed;
    }

<<<<<<< HEAD
    //ability scores (race and class)
    
=======
    public void setPlayerRace(Races playerRace) {
        this.playerRace = playerRace;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public void setArmor(String armor) {
        this.armor = armor;
    }

    public void setShield(String shield) {
        this.shield = shield;
    }

    public void setSpell(String spell) {
        this.spell = spell;
    }

>>>>>>> 309f2939a5cd03d0b6b218c28193eb10699f7952
    /**
     * Sets the player's strength score
     * @param str the strength rolled for the player
     */
    public void setStrength(int str) {
        this.strength.setScore(str, this.playerRace.getPlayerRace(), this.playerClass.getPlayerClass());
    }

    /**
     * return the player's strength score
     * @return the player's strength score
     */
    public int getStrength() {
        return strength.getScore();
    }

    /**
     * Sets the player's dexterity score
     * @param dex the dexterity rolled for the player
     */
    public void setDexterity(int dex) {
        this.dexterity.setScore(dex, this.playerRace.getPlayerRace(), this.playerClass.getPlayerClass());
    }

    /**
     * return the player's dexterity score
     * @return the player's dexterity score
     */
    public int getDexterity() {
        return dexterity.getScore();
    }

    /**
     * Sets the player's constitution score
     * @param con the constitution rolled for the player
     */
    public void setConstitution(int con) {
        this.constitution.setScore(con, this.playerRace.getPlayerRace(), this.playerClass.getPlayerClass());
    }

    /**
     * return the player's constitution score
     * @return the player's constitution score
     */
    public int getConstitution() {
        return constitution.getScore();
    }

    /**
     * Sets the player's intelligence score
     * @param intl the intelligence rolled for the player
     */
    public void setIntelligence(int intl) {
        this.intelligence.setScore(intl, this.playerRace.getPlayerRace(), this.playerClass.getPlayerClass());
    }

    /**
     * return the player's intelligence score
     * @return the player's intelligence score
     */
    public int getIntelligence() {
        return intelligence.getScore();
    }

    /**
     * Sets the player's wisdom score
     * @param wis the wisdom rolled for the player
     */
    public void setWisdom(int wis) {
        this.wisdom.setScore(wis, this.playerRace.getPlayerRace(), this.playerClass.getPlayerClass());
    }

    /**
     * return the player's wisdom score
     * @return the player's wisdom score
     */
    public int getWisdom() {
        return wisdom.getScore();
    }

    /**
     * Sets the player's charisma score
     * @param chr the charisma rolled for the player
     */
    public void setCharisma(int chr) {
        this.charisma.setScore(chr, this.playerRace.getPlayerRace(), this.playerClass.getPlayerClass());
    }

    /**
     * return the player's charisma score
     * @return the player's charisma score
     */
    public int getCharisma() {
        return charisma.getScore();
    }

}
