package jones.scott.dnd5echaractersheet;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by HEYSCOTT on 2/15/18.
 */

@Entity(tableName = "class_features")
public class ClassFeature {

    @PrimaryKey
    @ColumnInfo(name = "cfid")
    private int cfid;
    private int level;

    private String title;
    private String description;

    public ClassFeature(int cfid, int level, String title, String description) {
        this.cfid = cfid;
        this.level = level;
        this.title = title;
        this.description = description;
    }

    public int getCfid() {
        return cfid;
    }

    public void setCfid(int cfid) {
        this.cfid = cfid;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public static ClassFeature[] populatedData() {
        return new ClassFeature[] {
                new ClassFeature(1, 1, "Rage",
                        "As a bonus action on your turn, you can enter a rage.\n" +
                                "You have advantage on Strength checks and Strength saving " +
                                "throws.\nWhen you make a Strength based melee attack, you " +
                                "gain +2 damage on your attacks, increasing to +3 at level " +
                                "9 and +4 at level 16.\nYou have resistance to bludgeoning, " +
                                "piercing, and slashing damage.\nNotes: You cannot cast spells " +
                                "while enraged. You cannot be wearing heavy armor. Your rage " +
                                "lasts until 1 minute is up, you are knocked unconcious, or " +
                                "if you have no attacked or been attacked since your last turn. " +
                                "You can also end your rage at will as a bonus action on your " +
                                "turn.\nNumber of times you can rage: 2, increasing by one at " +
                                "these levels: 3rd, 6th, 12th, and 17th.")
        };
    }
}
