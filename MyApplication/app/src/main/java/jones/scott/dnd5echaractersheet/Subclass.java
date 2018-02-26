package jones.scott.dnd5echaractersheet;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by HEYSCOTT on 2/15/18.
 */

@Entity(tableName = "subclasses")
public class Subclass {
    @PrimaryKey
    @ColumnInfo(name = "scid")
    private int scid;

    private int cid;

    private String subclass;

    private int weaponProf;

    public Subclass(int scid, int cid, String subclass, int weaponProf) {
        this.scid = scid;
        this.cid = cid;
        this.subclass = subclass;
        this.weaponProf = weaponProf;
    }

    public int getScid() {
        return scid;
    }

    public void setScid(int scid) {
        this.scid = scid;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getSubclass() {
        return subclass;
    }

    public void setSubclass(String subclass) {
        this.subclass = subclass;
    }


    public int getWeaponProf() {
        return weaponProf;
    }

    public void setWeaponProf(int weaponProf) {
        this.weaponProf = weaponProf;
    }

    public static Subclass[] populatedData() {
        return new Subclass[] {
                new Subclass(1, 1, "Berserker", 4),
                new Subclass(2, 1, "Totem Warrior", 4),
                new Subclass(3, 2, "Lore", 5),
                new Subclass(4, 2, "Valor", 5),
                new Subclass(5, 3, "Knowledge", 7),
                new Subclass(6, 3, "Life", 7),
                new Subclass(7, 3, "Light", 7),
                new Subclass(8, 3, "Nature", 7),
                new Subclass(9, 3, "Tempest", 4),
                new Subclass(10, 3, "Trickery", 7),
                new Subclass(11, 3, "War", 4),
                new Subclass(12, 4, "Land", 8),
                new Subclass(13, 4, "Moon", 8),
                new Subclass(14, 5, "Champion", 4),
                new Subclass(15, 5, "Battle Master", 4),
                new Subclass(16, 5, "Eldritch Knight", 4),
                new Subclass(17, 6, "Open Hand", 9),
                new Subclass(18, 6, "Shadow", 9),
                new Subclass(19, 6, "Four Elements", 9),
                new Subclass(20, 7, "Devotion", 4),
                new Subclass(21, 7, "Ancients",4),
                new Subclass(22, 7, "Vengeance", 4),
                new Subclass(23, 8, "Hunter", 4),
                new Subclass(24, 9, "Beast Master", 4),
                new Subclass(25, 10, "Thief", 5),
                new Subclass(26, 10, "Assassin", 5),
                new Subclass(27, 10, "Arcane Trickster", 5),
                new Subclass(28, 11, "Draconic Bloodline", 10),
                new Subclass(29, 11, "Wild Magic", 10),
                new Subclass(30, 12, "Archfey", 7),
                new Subclass(31, 12, "Fiend", 7),
                new Subclass(32, 12, "Great Old One", 7),
                new Subclass(33, 13, "Abjuration", 10),
                new Subclass(34, 13, "Conjuration", 10),
                new Subclass(35, 13, "Divination", 10),
                new Subclass(36, 13, "Enchantment", 10),
                new Subclass(37, 13, "Evocation", 10),
                new Subclass(38, 13, "Illusion", 10),
                new Subclass(39, 13, "Necromancy", 10),
                new Subclass(40, 13, "Transmutation", 10)
        };
    }
}
