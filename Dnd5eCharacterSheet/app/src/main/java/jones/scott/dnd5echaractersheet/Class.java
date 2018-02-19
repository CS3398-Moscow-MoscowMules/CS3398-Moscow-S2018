package jones.scott.dnd5echaractersheet;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.arch.persistence.room.ColumnInfo;

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

    public Class(int cid, String className) {
        this.cid = cid;
        this.className = className;
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

    public static Class[] populatedData() {
        return new Class[] {
                new Class(1, "Barbarian"),
                new Class(2, "Bard"),
                new Class(3, "Cleric"),
                new Class(4, "Druid"),
                new Class(5, "Fighter"),
                new Class(6, "Monk"),
                new Class(7, "Paladin"),
                new Class(8, "Ranger"),
                new Class(9, "Rogue"),
                new Class(10, "Sorcerer"),
                new Class(11, "Warlock"),
                new Class(12, "Wizard")
        };

    }
}
