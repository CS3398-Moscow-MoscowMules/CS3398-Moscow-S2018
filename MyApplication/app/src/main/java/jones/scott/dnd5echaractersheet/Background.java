package jones.scott.dnd5echaractersheet;

/**
 * Created by HEYSCOTT on 4/2/18.
 */

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.arch.persistence.room.ColumnInfo;

@Entity(tableName = "backgrounds")
public class Background {

    @PrimaryKey
    @ColumnInfo(name = "bid")
    private int bid;

    @ColumnInfo(name = "background")
    private String background;

    @ColumnInfo(name = "skill1")
    private String skill1;

    @ColumnInfo(name = "skill2")
    private String skill2;

    @ColumnInfo(name = "extraLangs")
    private int extraLangs;

    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    public String getSkill1() { return skill1; }

    public void setSkill1(String skill1) { this.skill1 = skill1; }

    public String getSkill2() { return skill2; }

    public void setSkill2(String skill2) { this.skill2 = skill2; }

    public int getExtraLangs() { return extraLangs; }

    public void setExtraLangs(int extraLangs) { this.extraLangs = extraLangs; }

    public Background(int bid, String background, String skill1, String skill2, int extraLangs) {
        this.bid = bid;
        this.background = background;
        this.skill1 = skill1;
        this.skill2 = skill2;
        this.extraLangs = extraLangs;
    }

    public static Background[] populatedData() {
        return new Background[] {
                new Background(1, "Acolyte", "Insight", "Religion", 2),
                new Background(2, "Charlatan", "Deception", "Sleight of Hand", 0),
                new Background(3, "Criminal", "Deception", "Stealth", 0),
                new Background(4, "Entertainer", "Acrobatics", "Performance", 0),
                new Background(5, "Folk Hero", "Animal Handling", "Survival", 0),
                new Background(6, "Guild Artisan", "Insight", "Persuasion", 1),
                new Background(7, "Hermit", "Medicine", "Religion", 1),
                new Background(8, "Noble", "History", "persuasion", 1),
                new Background(9, "Outlander", "Athletics", "Survival", 1),
                new Background(10, "Sage", "Arcana", "History", 2),
                new Background(11, "Sailor", "Athletics", "Perception", 0),
                new Background(12, "Soldier", "Athletics", "Intimidation", 0),
                new Background(13, "Urchin", "Sleight of Hand", "Stealth", 0)
        };
    }
}
