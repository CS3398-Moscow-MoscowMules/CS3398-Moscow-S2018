package jones.scott.dnd5echaractersheet;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by Becca on 4/7/2018.
 */
@Entity(tableName = "skills")
public class Skill {

        @PrimaryKey
        @ColumnInfo(name = "sid")
        private int sid;

        @ColumnInfo(name = "skill")
        private String skill;

        public int getSid() {
            return sid;
        }

        public void setSid(int sid) {
            this.sid = sid;
        }

        public String getSkill() {
            return skill;
        }

        public void setSkill(String skill) {
            this.skill = skill;
        }

        public Skill(int sid, String skill) {
            this.sid = sid;
            this.skill = skill;
        }

        public static Skill[] populatedData() {
            return new Skill[] {
                    new Skill(1, "Acrobatics"),
                    new Skill(2, "Animal Handling"),
                    new Skill(3, "Arcana"),
                    new Skill(4, "Athletics"),
                    new Skill(5, "Deception"),
                    new Skill(6, "History"),
                    new Skill(7, "Insight"),
                    new Skill(8, "Intimidation"),
                    new Skill(9, "Investigation"),
                    new Skill(10, "Medicine"),
                    new Skill(11, "Nature"),
                    new Skill(12, "Perception"),
                    new Skill(13, "Performance"),
                    new Skill(14, "Persuasion"),
                    new Skill(15, "Religion"),
                    new Skill(16, "Sleight of Hand"),
                    new Skill(17, "Stealth"),
                    new Skill(18, "Survival")
            };
        }

}
