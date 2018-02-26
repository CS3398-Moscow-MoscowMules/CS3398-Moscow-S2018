package jones.scott.dnd5echaractersheet;

import android.arch.persistence.room.*;

import java.util.List;

/**
 * Created by HEYSCOTT on 2/15/18.
 */

@Dao
public interface LanguageDAO {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    public void insertLanguages(Language... languages);

    @Query("SELECT language FROM languages")
    public List<String> loadLanguages();

    @Query("SELECT language FROM languages WHERE lid = :lid")
    public String loadLanguageByID(int lid);
}
