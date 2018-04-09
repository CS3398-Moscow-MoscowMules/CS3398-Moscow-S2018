package jones.scott.dnd5echaractersheet;

import android.arch.persistence.room.*;

/**
 * Created by HEYSCOTT on 2/15/18.
 */

@Entity(tableName = "languages")
public class Language {

    @PrimaryKey
    @ColumnInfo(name = "lid")
    private int lid;

    @ColumnInfo(name = "language")
    private String language;

    public Language(int lid, String language) {
        this.lid = lid;
        this.language = language;
    }

    public int getLid() {
        return lid;
    }

    public void setLid(int lid) {
        this.lid = lid;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public static Language[] populatedData() {
        return new Language[] {
                new Language(1, "Abyssal"),
                new Language(2, "Aquan"),
                new Language(3, "Auran"),
                new Language(4, "Celestial"),
                new Language(5, "Common"),
                new Language(6, "Deep Speech"),
                new Language(7, "Draconic"),
                new Language(8, "Drow Hand Signs"),
                new Language(9, "Druidic"),
                new Language(10, "Dwarvish"),
                new Language(11, "Elvish"),
                new Language(12, "Giant"),
                new Language(13, "Gnomish"),
                new Language(14, "Goblin"),
                new Language(15, "Gnoll"),
                new Language(16, "Halfling"),
                new Language(17, "Ignan"),
                new Language(18, "Infernal"),
                new Language(19, "Orc"),
                new Language(20, "Primordial"),
                new Language(21, "Silent Speech"),
                new Language(22, "Sylvan"),
                new Language(23, "Terran"),
                new Language(24, "Undercommon")

        };
    }
}
