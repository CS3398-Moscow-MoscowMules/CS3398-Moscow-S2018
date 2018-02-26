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
                new Language(8, "Druidic"),
                new Language(9, "Dwarvish"),
                new Language(10, "Elvish"),
                new Language(11, "Giant"),
                new Language(12, "Gnomish"),
                new Language(13, "Goblin"),
                new Language(14, "Gnoll"),
                new Language(15, "Halfling"),
                new Language(16, "Ignan"),
                new Language(17, "Infernal"),
                new Language(18, "Orc"),
                new Language(19, "Primordial"),
                new Language(20, "Silent Speech"),
                new Language(21, "Sylvan"),
                new Language(22, "Terran"),
                new Language(23, "Undercommon")

        };
    }
}
