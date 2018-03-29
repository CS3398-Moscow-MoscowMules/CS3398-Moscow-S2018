package jones.scott.dnd5echaractersheet;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.OnConflictStrategy;

import java.util.List;

/**
 * Created by HEYSCOTT on 2/15/18.
 */

@Dao
public interface ClassDAO {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    public void insertClasses(Class... classs);

    @Query("SELECT class FROM classes")
    public List<String> loadClasses();

    @Query("SELECT health FROM classes")
    public List<Integer> loadHealths();

    @Query("SELECT acrobatics FROM classes WHERE class = :className")
    public int loadAcrobatics(String className);

    @Query("SELECT animalHandling FROM classes WHERE class = :className")
    public int loadAnimalHandling(String className);

    @Query("SELECT arcana FROM classes WHERE class = :className")
    public int loadArcana(String className);

    @Query("SELECT athletics FROM classes WHERE class = :className")
    public int loadAthletics(String className);

    @Query("SELECT deception FROM classes WHERE class = :className")
    public int loadDeception(String className);

    @Query("SELECT history FROM classes WHERE class = :className")
    public int loadHistory(String className);

    @Query("SELECT insight FROM classes WHERE class = :className")
    public int loadInsight(String className);

    @Query("SELECT intimidation FROM classes WHERE class = :className")
    public int loadIntimidation(String className);

    @Query("SELECT investigation FROM classes WHERE class = :className")
    public int loadInvestigation(String className);

    @Query("SELECT medicine FROM classes WHERE class = :className")
    public int loadMedicine(String className);

    @Query("SELECT nature FROM classes WHERE class = :className")
    public int loadNature(String className);

    @Query("SELECT perception FROM classes WHERE class = :className")
    public int loadPerception(String className);

    @Query("SELECT performance FROM classes WHERE class = :className")
    public int loadPerformance(String className);

    @Query("SELECT persuasion FROM classes WHERE class = :className")
    public int loadPersuasion(String className);

    @Query("SELECT religion FROM classes WHERE class = :className")
    public int loadReligion(String className);

    @Query("SELECT sleightOfHand FROM classes WHERE class = :className")
    public int loadSleightOfHand(String className);

    @Query("SELECT stealth FROM classes WHERE class = :className")
    public int loadStealth(String className);

    @Query("SELECT survival FROM classes WHERE class = :className")
    public int loadSurvival(String className);
}
