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

    public Background(int bid, String background) {
        this.bid = bid;
        this.background = background;
    }

    public static Background[] populatedData() {
        return new Background[] {
                new Background(1, "Acolyte"),
                new Background(2, "Charlatan"),
                new Background(3, "Criminal"),
                new Background(4, "Entertainer"),
                new Background(5, "Folk Hero"),
                new Background(6, "Gladiator"),
                new Background(7, "Guild Artisan"),
                new Background(8, "Hermit"),
                new Background(9, "Knight"),
                new Background(10, "Noble"),
                new Background(11, "Outlander"),
                new Background(12, "Pirate"),
                new Background(13, "Sage"),
                new Background(14, "Sailor"),
                new Background(15, "Soldier"),
                new Background(16, "Urchin")
        };
    }
}
