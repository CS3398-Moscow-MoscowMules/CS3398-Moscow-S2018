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
    private Boolean acrobatics;

    @ColumnInfo(name = "animalHandling")
    private Boolean animalHandling;

    @ColumnInfo(name = "arcana")
    private Boolean arcana;

    @ColumnInfo(name = "athletics")
    private Boolean athletics;

    @ColumnInfo(name = "deception")
    private Boolean deception;

    @ColumnInfo(name = "history")
    private Boolean history;

    @ColumnInfo(name = "insight")
    private Boolean insight;

    @ColumnInfo(name = "intimidation")
    private Boolean intimidation;

    @ColumnInfo(name = "investigation")
    private Boolean investigation;

    @ColumnInfo(name = "medicine")
    private Boolean medicine;

    @ColumnInfo(name = "nature")
    private Boolean nature;

    @ColumnInfo(name = "perception")
    private Boolean perception;

    @ColumnInfo(name = "performance")
    private Boolean performance;

    @ColumnInfo(name = "persuasion")
    private Boolean persuasion;

    @ColumnInfo(name = "religion")
    private Boolean religion;

    @ColumnInfo(name = "sleightOfHand")
    private Boolean sleightOfHand;

    @ColumnInfo(name = "stealth")
    private Boolean stealth;

    @ColumnInfo(name = "survival")
    private Boolean survival;

    public Class(int cid, String className, int health, Boolean acrobatics, Boolean animalHandling, Boolean arcana, Boolean athletics, Boolean deception, Boolean history, Boolean insight, Boolean intimidation, Boolean investigation, Boolean medicine, Boolean nature, Boolean perception, Boolean performance, Boolean persuasion, Boolean religion, Boolean sleightOfHand, Boolean stealth, Boolean survival) {
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

    public Boolean getAcrobatics() {
        return acrobatics;
    }

    public void setAcrobatics(Boolean acrobatics) {
        this.acrobatics = acrobatics;
    }

    public Boolean getAnimalHandling() {
        return animalHandling;
    }

    public void setAnimalHandling(Boolean animalHandling) {
        this.animalHandling = animalHandling;
    }

    public Boolean getArcana() {
        return arcana;
    }

    public void setArcana(Boolean arcana) {
        this.arcana = arcana;
    }

    public Boolean getAthletics() {
        return athletics;
    }

    public void setAthletics(Boolean athletics) {
        this.athletics = athletics;
    }

    public Boolean getDeception() {
        return deception;
    }

    public void setDeception(Boolean deception) {
        this.deception = deception;
    }

    public Boolean getHistory() {
        return history;
    }

    public void setHistory(Boolean history) {
        this.history = history;
    }

    public Boolean getInsight() {
        return insight;
    }

    public void setInsight(Boolean insight) {
        this.insight = insight;
    }

    public Boolean getIntimidation() {
        return intimidation;
    }

    public void setIntimidation(Boolean intimidation) {
        this.intimidation = intimidation;
    }

    public Boolean getInvestigation() {
        return investigation;
    }

    public void setInvestigation(Boolean investigation) {
        this.investigation = investigation;
    }

    public Boolean getMedicine() {
        return medicine;
    }

    public void setMedicine(Boolean medicine) {
        this.medicine = medicine;
    }

    public Boolean getNature() {
        return nature;
    }

    public void setNature(Boolean nature) {
        this.nature = nature;
    }

    public Boolean getPerception() {
        return perception;
    }

    public void setPerception(Boolean perception) {
        this.perception = perception;
    }

    public Boolean getPerformance() {
        return performance;
    }

    public void setPerformance(Boolean performance) {
        this.performance = performance;
    }

    public Boolean getPersuasion() {
        return persuasion;
    }

    public void setPersuasion(Boolean persuasion) {
        this.persuasion = persuasion;
    }

    public Boolean getReligion() {
        return religion;
    }

    public void setReligion(Boolean religion) {
        this.religion = religion;
    }

    public Boolean getSleightOfHand() {
        return sleightOfHand;
    }

    public void setSleightOfHand(Boolean sleightOfHand) {
        this.sleightOfHand = sleightOfHand;
    }

    public Boolean getStealth() {
        return stealth;
    }

    public void setStealth(Boolean stealth) {
        this.stealth = stealth;
    }

    public Boolean getSurvival() {
        return survival;
    }

    public void setSurvival(Boolean survival) {
        this.survival = survival;
    }

    public static Class[] populatedData() {
        return new Class[] {
                new Class(1, "Barbarian", 12, false, true, false, true, false, false, false, true, false, false, true, true, false, false, false, false, false, true),
                new Class(2, "Bard", 8, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true),
                new Class(3, "Cleric", 8, false, false, false, false, false, true, true, false, false, true, false, false, false, true, true, false, false, false),
                new Class(4, "Druid", 8, true, true, false, true, false, true, true, true, false, false, false, true, false, false, false, false, false, true),
                new Class(5, "Fighter", 10, true, true, false, true, false, true, true, true, false, false, false, true, false, false, false, false, false, true),
                new Class(6, "Monk", 8, true, false, false, true, false, true, true, false, false, false, false, false, false, false, true, false, true, false),
                new Class(7, "Paladin", 10, false, false, false, true, false, false, true, true, false, true, false, false, false, true, true, false, false, false),
                new Class(8, "Ranger", 10, false, true, false, true, false, false, true, false, true, false, true, true, false, false, false, false, true, true),
                new Class(9, "Rogue", 8, true, false, false, true, true, false, true, true, true, false, false, true, true, true, false, true, true, false),
                new Class(10, "Sorcerer", 6, false, false, true, false, true, false, true, true, false, false, false, false, false, true, true, false, false, false),
                new Class(11, "Warlock", 8, false, false, true, false, true, true, false, true, true, false, true, false, false, false, true, false, false, false),
                new Class(12, "Wizard", 6, false, false, true, false, false, true, true, false, true, true, false, false, false, false, true, false, false, false)
        };

    }
}
