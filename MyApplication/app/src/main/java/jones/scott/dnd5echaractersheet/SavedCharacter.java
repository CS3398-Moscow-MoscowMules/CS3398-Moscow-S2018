package jones.scott.dnd5echaractersheet;

/**
 * Created by HEYSCOTT on 4/2/18.
 */

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.arch.persistence.room.ColumnInfo;

@Entity(tableName = "characters")
public class SavedCharacter {

    @PrimaryKey
    @ColumnInfo(name = "pcid")
    private int PCid;

    @ColumnInfo(name = "name")
    private String PCname;

    @ColumnInfo(name = "race")
    private String PCrace;

    @ColumnInfo(name = "class")
    private String PCclass;

    @ColumnInfo(name = "background")
    private String PCbackground;

    @ColumnInfo(name = "alignment")
    private String PCalignment;

    @ColumnInfo(name = "hp")
    private int PChp;

    @ColumnInfo(name = "speed")
    private int PCspeed;

    @ColumnInfo(name = "strength")
    private int PCstrength;

    @ColumnInfo(name = "dexterity")
    private int PCdexterity;

    @ColumnInfo(name = "constitution")
    private int PCconstitution;

    @ColumnInfo(name = "intelligence")
    private int PCintelligence;

    @ColumnInfo(name = "wisdom")
    private int PCwisdom;

    @ColumnInfo(name = "charisma")
    private int PCcharisma;

    public int getPCid() {
        return PCid;
    }

    public void setPCid(int PCid) {
        this.PCid = PCid;
    }

    public String getPCname() {
        return PCname;
    }

    public void setPCname(String PCname) {
        this.PCname = PCname;
    }

    public String getPCrace() {
        return PCrace;
    }

    public void setPCrace(String PCrace) {
        this.PCrace = PCrace;
    }

    public String getPCclass() {
        return PCclass;
    }

    public void setPCclass(String PCclass) {
        this.PCclass = PCclass;
    }

    public String getPCbackground() {
        return PCbackground;
    }

    public void setPCbackground(String PCbackground) {
        this.PCbackground = PCbackground;
    }

    public String getPCalignment() {
        return PCalignment;
    }

    public void setPCalignment(String PCalignment) {
        this.PCalignment = PCalignment;
    }

    public int getPChp() {
        return PChp;
    }

    public void setPChp(int PChp) {
        this.PChp = PChp;
    }

    public int getPCspeed() {
        return PCspeed;
    }

    public void setPCspeed(int PCspeed) {
        this.PCspeed = PCspeed;
    }

    public int getPCstrength() {
        return PCstrength;
    }

    public void setPCstrength(int PCstrength) {
        this.PCstrength = PCstrength;
    }

    public int getPCdexterity() {
        return PCdexterity;
    }

    public void setPCdexterity(int PCdexterity) {
        this.PCdexterity = PCdexterity;
    }

    public int getPCconstitution() {
        return PCconstitution;
    }

    public void setPCconstitution(int PCconstitution) {
        this.PCconstitution = PCconstitution;
    }

    public int getPCintelligence() {
        return PCintelligence;
    }

    public void setPCintelligence(int PCintelligence) {
        this.PCintelligence = PCintelligence;
    }

    public int getPCwisdom() {
        return PCwisdom;
    }

    public void setPCwisdom(int PCwisdom) {
        this.PCwisdom = PCwisdom;
    }

    public int getPCcharisma() {
        return PCcharisma;
    }

    public void setPCcharisma(int PCcharisma) {
        this.PCcharisma = PCcharisma;
    }

    public SavedCharacter(int PCid, String PCname, String PCrace, String PCclass, String PCbackground, String PCalignment, int PChp, int PCspeed, int PCstrength, int PCdexterity, int PCconstitution, int PCintelligence, int PCwisdom, int PCcharisma) {
        this.PCid = PCid;
        this.PCname = PCname;
        this.PCrace = PCrace;
        this.PCclass = PCclass;
        this.PCbackground = PCbackground;
        this.PCalignment = PCalignment;
        this.PChp = PChp;
        this.PCspeed = PCspeed;
        this.PCstrength = PCstrength;
        this.PCdexterity = PCdexterity;
        this.PCconstitution = PCconstitution;
        this.PCintelligence = PCintelligence;
        this.PCwisdom = PCwisdom;
        this.PCcharisma = PCcharisma;
    }
}
