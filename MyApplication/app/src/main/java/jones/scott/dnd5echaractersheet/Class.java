package jones.scott.dnd5echaractersheet;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.arch.persistence.room.ColumnInfo;

import java.util.Arrays;
import java.util.List;

/**
 * Created by HEYSCOTT on 2/15/18.
 */

@Entity(tableName = "classes")
public class Class {

    @PrimaryKey
    @ColumnInfo(name = "cid")
    private int cid;

    @ColumnInfo(name = "class")
    private String className;

    @ColumnInfo(name = "health")
    private int health;

    @ColumnInfo(name = "acrobatics")
    private String acrobatics;

    @ColumnInfo(name = "animalHandling")
    private String animalHandling;

    @ColumnInfo(name = "arcana")
    private String arcana;

    @ColumnInfo(name = "athletics")
    private String athletics;

    @ColumnInfo(name = "deception")
    private String deception;

    @ColumnInfo(name = "history")
    private String history;

    @ColumnInfo(name = "insight")
    private String insight;

    @ColumnInfo(name = "intimidation")
    private String intimidation;

    @ColumnInfo(name = "investigation")
    private String investigation;

    @ColumnInfo(name = "medicine")
    private String medicine;

    @ColumnInfo(name = "nature")
    private String nature;

    @ColumnInfo(name = "perception")
    private String perception;

    @ColumnInfo(name = "performance")
    private String performance;

    @ColumnInfo(name = "persuasion")
    private String persuasion;

    @ColumnInfo(name = "religion")
    private String religion;

    @ColumnInfo(name = "sleightOfHand")
    private String sleightOfHand;

    @ColumnInfo(name = "stealth")
    private String stealth;

    @ColumnInfo(name = "survival")
    private String survival;

    public Class(int cid, String className, int health, String acrobatics, String animalHandling, String arcana, String athletics, String deception, String history, String insight, String intimidation, String investigation, String medicine, String nature, String perception, String performance, String persuasion, String religion, String sleightOfHand, String stealth, String survival) {
        this.cid = cid;
        this.className = className;
        this.health = health;
        this.acrobatics = acrobatics;
        this.animalHandling = animalHandling;
        this.arcana = arcana;
        this.athletics = athletics;
        this.deception = deception;
        this.history = history;
        this.insight = insight;
        this.intimidation = intimidation;
        this.investigation = investigation;
        this.medicine = medicine;
        this.nature = nature;
        this.perception = perception;
        this.performance = performance;
        this.persuasion = persuasion;
        this.religion = religion;
        this.sleightOfHand = sleightOfHand;
        this.stealth = stealth;
        this.survival = survival;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getAcrobatics() {
        return acrobatics;
    }

    public void setAcrobatics(String acrobatics) {
        this.acrobatics = acrobatics;
    }

    public String getAnimalHandling() {
        return animalHandling;
    }

    public void setAnimalHandling(String animalHandling) {
        this.animalHandling = animalHandling;
    }

    public String getArcana() {
        return arcana;
    }

    public void setArcana(String arcana) {
        this.arcana = arcana;
    }

    public String getAthletics() {
        return athletics;
    }

    public void setAthletics(String athletics) {
        this.athletics = athletics;
    }

    public String getDeception() {
        return deception;
    }

    public void setDeception(String deception) {
        this.deception = deception;
    }

    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history;
    }

    public String getInsight() {
        return insight;
    }

    public void setInsight(String insight) {
        this.insight = insight;
    }

    public String getIntimidation() {
        return intimidation;
    }

    public void setIntimidation(String intimidation) {
        this.intimidation = intimidation;
    }

    public String getInvestigation() {
        return investigation;
    }

    public void setInvestigation(String investigation) {
        this.investigation = investigation;
    }

    public String getMedicine() {
        return medicine;
    }

    public void setMedicine(String medicine) {
        this.medicine = medicine;
    }

    public String getNature() {
        return nature;
    }

    public void setNature(String nature) {
        this.nature = nature;
    }

    public String getPerception() {
        return perception;
    }

    public void setPerception(String perception) {
        this.perception = perception;
    }

    public String getPerformance() {
        return performance;
    }

    public void setPerformance(String performance) {
        this.performance = performance;
    }

    public String getPersuasion() {
        return persuasion;
    }

    public void setPersuasion(String persuasion) {
        this.persuasion = persuasion;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public String getSleightOfHand() {
        return sleightOfHand;
    }

    public void setSleightOfHand(String sleightOfHand) {
        this.sleightOfHand = sleightOfHand;
    }

    public String getStealth() {
        return stealth;
    }

    public void setStealth(String stealth) {
        this.stealth = stealth;
    }

    public String getSurvival() {
        return survival;
    }

    public void setSurvival(String survival) {
        this.survival = survival;
    }

    public static Class[] populatedData() {
        return new Class[] {
                new Class(1, "Barbarian", 12, "false", "true", "false", "true", "false", "false", "false", "true", "false", "false", "true", "true", "false", "false", "false", "false", "false", "true"),
                new Class(2, "Bard", 8, "true", "true", "true", "true", "true", "true", "true", "true", "true", "true", "true", "true", "true", "true", "true", "true", "true", "true"),
                new Class(3, "Cleric", 8, "false", "false", "false", "false", "false", "true", "true", "false", "false", "true", "false", "false", "false", "true", "true", "false", "false", "false"),
                new Class(4, "Druid", 8, "true", "true", "false", "true", "false", "true", "true", "true", "false", "false", "false", "true", "false", "false", "false", "false", "false", "true"),
                new Class(5, "Fighter", 10, "true", "true", "false", "true", "false", "true", "true", "true", "false", "false", "false", "true", "false", "false", "false", "false", "false", "true"),
                new Class(6, "Monk", 8, "true", "false", "false", "true", "false", "true", "true", "false", "false", "false", "false", "false", "false", "false", "true", "false", "true", "false"),
                new Class(7, "Paladin", 10, "false", "false", "false", "true", "false", "false", "true", "true", "false", "true", "false", "false", "false", "true", "true", "false", "false", "false"),
                new Class(8, "Ranger", 10, "false", "true", "false", "true", "false", "false", "true", "false", "true", "false", "true", "true", "false", "false", "false", "false", "true", "true"),
                new Class(9, "Rogue", 8, "true", "false", "false", "true", "true", "false", "true", "true", "true", "false", "false", "true", "true", "true", "false", "true", "true", "false"),
                new Class(10, "Sorcerer", 6, "false", "false", "true", "false", "true", "false", "true", "true", "false", "false", "false", "false", "false", "true", "true", "false", "false", "false"),
                new Class(11, "Warlock", 8, "false", "false", "true", "false", "true", "true", "false", "true", "true", "false", "true", "false", "false", "false", "true", "false", "false", "false"),
                new Class(12, "Wizard", 6, "false", "false", "true", "false", "false", "true", "true", "false", "true", "true", "false", "false", "false", "false", "true", "false", "false", "false")
        };

    }
}
