package jones.scott.dnd5echaractersheet;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by HEYSCOTT on 2/16/18.
 */

@Entity
public class ArmorProficiency {

    @PrimaryKey
    @ColumnInfo(name = "apid")
    private int apid;

    private int light;
    private int medium;
    private int heavy;
    private int shield;


    public ArmorProficiency(int apid, int light, int medium, int heavy, int shield) {
        this.apid = apid;
        this.light = light;
        this.medium = medium;
        this.heavy = heavy;
        this.shield = shield;
    }

    public int getApid() {
        return apid;
    }

    public void setApid(int apid) {
        this.apid = apid;
    }

    public int getLight() {
        return light;
    }

    public void setLight(int light) {
        this.light = light;
    }

    public int getMedium() {
        return medium;
    }

    public void setMedium(int medium) {
        this.medium = medium;
    }

    public int getHeavy() {
        return heavy;
    }

    public void setHeavy(int heavy) {
        this.heavy = heavy;
    }

    public int getShield() {
        return shield;
    }

    public void setShield(int shield) {
        this.shield = shield;
    }

    public static ArmorProficiency[] populatedData() {
        return new ArmorProficiency[]{

        };
    }
}
