package jones.scott.dnd5echaractersheet;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.arch.persistence.room.ColumnInfo;

/**
 * Created by HEYSCOTT on 2/13/18.
 */

@Entity(tableName = "races")
public class Race {

    @PrimaryKey
    @ColumnInfo(name = "srid")
    private int srid;

    @ColumnInfo(name = "race")
    private String race;

    @ColumnInfo(name = "subrace")
    private String subrace;

    @ColumnInfo(name = "size")
    private char size;

    @ColumnInfo(name = "speed")
    private int speed;

    @ColumnInfo(name = "language1")
    private String language1;

    @ColumnInfo(name = "language2")
    private String language2;

    @ColumnInfo(name = "language3")
    private String language3;

    @ColumnInfo(name = "strMod")
    private int strMod;

    @ColumnInfo(name = "dexMod")
    private int dexMod;

    @ColumnInfo(name = "conMod")
    private int conMod;

    @ColumnInfo(name = "intMod")
    private int intMod;

    @ColumnInfo(name = "wisMod")
    private int wisMod;

    @ColumnInfo(name = "chaMod")
    private int chaMod;

    @ColumnInfo(name = "weaponProfs")
    private int weaponProf;

    public Race(int srid, String race, String subrace, char size, int speed, String language1, String language2, String language3, int strMod, int dexMod, int conMod, int intMod, int wisMod, int chaMod, int weaponProf) {
        this.race = race;
        this.subrace = subrace;
        this.size = size;
        this.speed = speed;
        this.language1 = language1;
        this.language2 = language2;
        this.language3 = language3;
        this.strMod = strMod;
        this.dexMod = dexMod;
        this.conMod = conMod;
        this.intMod = intMod;
        this.wisMod = wisMod;
        this.chaMod = chaMod;
        this.weaponProf = weaponProf;
    }

    public int getSrID() {
        return srid;
    }

    public void setSrID(int srid) {
        this.srid = srid;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getSubrace() {
        return subrace;
    }

    public void setSubrace(String subrace) {
        this.subrace = subrace;
    }


    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getLanguage1() {
        return language1;
    }

    public void setLanguage1(String language1) {
        this.language1 = language1;
    }

    public String getLanguage2() {
        return language2;
    }

    public void setLanguage2(String language2) {
        this.language2 = language2;
    }

    public String getLanguage3() {
        return language3;
    }

    public void setLanguage3(String language3) {
        this.language3 = language3;
    }

    public int getStrMod() {
        return strMod;
    }

    public void setStrMod(int strMod) {
        this.strMod = strMod;
    }

    public int getDexMod() {
        return dexMod;
    }

    public void setDexMod(int dexMod) {
        this.dexMod = dexMod;
    }

    public int getConMod() {
        return conMod;
    }

    public void setConMod(int conMod) {
        this.conMod = conMod;
    }

    public int getIntMod() {
        return intMod;
    }

    public void setIntMod(int intMod) {
        this.intMod = intMod;
    }

    public int getWisMod() {
        return wisMod;
    }

    public void setWisMod(int wisMod) {
        this.wisMod = wisMod;
    }

    public int getChaMod() {
        return chaMod;
    }

    public void setChaMod(int chaMod) {
        this.chaMod = chaMod;
    }

    public int getWeaponProf() {
        return weaponProf;
    }

    public void setWeaponProf(int weaponProf) {
        this.weaponProf = weaponProf;
    }

    public static Race[] populatedData() {
        return new Race[] {
                new Race(1,"Dragonborn", "Dragonborn", 'M', 30, "Common", "Draconic", null, 2, 0, 0, 0, 0, 1, 0),
                new Race(2,"Dwarf", "Hill Dwarf", 'M', 25, "Common", "Dwarvish", null, 0, 0, 2, 0, 1, 0, 1),
                new Race(3, "Dwarf", "Mountain Dwarf", 'M', 25, "Common", "Dwarvish", null,2, 0, 2, 0 ,0 ,0,1),
                new Race(4, "Dwarf", "Duergar", 'M', 25, "Common", "Dwarvish", "Undercommon", 1, 0 ,2, 0 , 0, 0,1),
                new Race(5, "Elf", "Drow", 'M', 30, "Common", "Elvish", "Drow Hand Signs", 0, 2, 0, 0, 0 , 1,3),
                new Race(6, "Elf", "High Elf", 'M', 30, "Common", "Elvish", "Extra", 0, 2, 0, 1, 0, 0, 2),
                new Race(7, "Elf", "Wood Elf", 'M', 35, "Common", "Elvish", null, 0, 2, 0, 0, 1 ,0, 2),
                new Race(8, "Gnome", "Forest Gnome", 'S', 25, "Common", "Gnomish", null,0, 1, 0 ,2, 0,0, 0),
                new Race(9, "Gnome", "Rock Gnome", 'S', 25, "Common", "Gnomish", null, 0, 0, 1 ,2 ,0, 0, 0),
                new Race(10, "Halfling", "Lightfoot Halfling", 'S', 25, "Common", "Halfling", null, 0, 2, 0, 0, 0, 1, 0),
                new Race(11, "Halfling", "Stout Halfling", 'S', 25, "Common", "Halfling", null, 0 ,2, 1, 0 ,0 ,0, 0),
                new Race(12, "Halfling", "Ghostwise Halfling", 'S', 25, "Common", "Halfling", "Silent Speech", 0, 2, 0, 0, 1, 0, 0),
                new Race(13, "Half-Elf", "Half-Elf", 'M', 30, "Common", "Elvish", "Extra", 0, 0, 0, 0, 0, 2, 0),
                new Race(14, "Half-Orc", "Half-Orc", 'M', 30, "Common", "Orc", null, 2, 0 ,1, 0 ,0, 0, 0),
                new Race(15, "Human", "Standard Human", 'M', 30, "Common", "Extra", null, 1, 1, 1, 1, 1, 1, 0),
                new Race(16, "Human", "Variant Human", 'M', 30, "Common", "Extra", null, 0, 0, 0, 0, 0,0, 0),
                new Race(17, "Tiefling", "Standard Tiefling", 'M', 30, "Common", null, null, 0, 0, 0, 0, 0, 2, 0)
        };
    }

}
