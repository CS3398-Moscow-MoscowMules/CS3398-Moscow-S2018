package jones.scott.dnd5echaractersheet;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.OnConflictStrategy;
import java.util.List;
import java.util.ArrayList;
/**
 * Created by HEYSCOTT on 2/13/18.
 */

@Dao
public interface RaceDAO {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    public void insertRaces(Race... races);

    @Query("SELECT subrace FROM races")
    public List<String> loadRaces();

    //@Query("SELECT subrace FROM races")
    //public List<String> loadSubraces();

    @Query("SELECT subrace FROM races WHERE race = :race")
    public List<String> loadSubracesForRace(String race);

    @Query("SELECT * FROM races WHERE subrace = :subrace")
    public Race loadRaceInfo(String subrace);

    @Query("SELECT language1 FROM races WHERE race = :race")
    public String loadLanguage1(String race);

    @Query("SELECT language2 FROM races WHERE race = :race")
    public String loadLanguage2(String race);

    @Query("SELECT language3 FROM races WHERE race = :race")
    public String loadLanguage3(String race);

    @Query("SELECT speed FROM races")
    public List<Integer> loadSpeeds();

    @Query("SELECT strMod FROM races")
    public List<Integer> loadStrMods();

    @Query("SELECT dexMod FROM races")
    public List<Integer> loadDexMods();

    @Query("SELECT conMod FROM races")
    public List<Integer> loadConMods();

    @Query("SELECT intMod FROM races")
    public List<Integer> loadIntMods();

    @Query("SELECT wisMod FROM races")
    public List<Integer> loadWisMods();

    @Query("SELECT chaMod FROM races")
    public List<Integer> loadChaMods();

}
