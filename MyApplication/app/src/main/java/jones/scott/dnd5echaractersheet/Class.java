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

/*    @ColumnInfo(name = "skills")
    private List<Boolean> skills; */

    public Class(int cid, String className, int health/*, List<Boolean> skills*/) {
        this.cid = cid;
        this.className = className;
        this.health = health;
        //this.skills = skills;
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

    public int getHealth() { return health; }

    public static Class[] populatedData() {
        return new Class[] {
                new Class(1, "Barbarian", 12/*, Arrays.asList(false, true, false, true, false, false, false, true, false, false, true, true, false, false, false, false, false, true)*/),
                new Class(2, "Bard", 8/*, Arrays.asList(true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true)*/),
                new Class(3, "Cleric", 8/*, Arrays.asList(false, false, false, false, false, true, true, false, false, true, false, false, false, true, true, false, false, false)*/),
                new Class(4, "Druid", 8/*, Arrays.asList(true, true, false, true, false, true, true, true, false, false, false, true, false, false, false, false, false, true)*/),
                new Class(5, "Fighter", 10/*, Arrays.asList(true, true, false, true, false, true, true, true, false, false, false, true, false, false, false, false, false, true)*/),
                new Class(6, "Monk", 8/*, Arrays.asList(true, false, false, true, false, true, true, false, false, false, false, false, false, false, true, false, true, false)*/),
                new Class(7, "Paladin", 10/*, Arrays.asList(false, false, false, true, false, false, true, true, false, true, false, false, false, true, true, false, false, false)*/),
                new Class(8, "Ranger", 10/*, Arrays.asList(false, true, false, true, false, false, true, false, true, false, true, true, false, false, false, false, true, true)*/),
                new Class(9, "Rogue", 8/*, Arrays.asList(true, false, false, true, true, false, true, true, true, false, false, true, true, true, false, true, true, false)*/),
                new Class(10, "Sorcerer", 6/*, Arrays.asList(false, false, true, false, true, false, true, true, false, false, false, false, false, true, true, false, false, false)*/),
                new Class(11, "Warlock", 8/*, Arrays.asList(false, false, true, false, true, true, false, true, true, false, true, false, false, false, true, false, false, false)*/),
                new Class(12, "Wizard", 6/*, Arrays.asList(false, false, true, false, false, true, true, false, true, true, false, false, false, false, true, false, false, false)*/)
        };

    }
}
