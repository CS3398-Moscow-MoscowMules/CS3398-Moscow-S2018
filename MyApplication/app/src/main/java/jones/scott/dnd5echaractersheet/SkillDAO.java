package jones.scott.dnd5echaractersheet;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import java.util.List;

/**
 * Created by Becca on 4/7/2018.
 */

@Dao
public interface SkillDAO {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    public void insertSkills(Skill... skills);

    @Query("SELECT skill FROM skills")
    public List<String> loadSkills();
}
