package jones.scott.dnd5echaractersheet;

/**
 * Created by HEYSCOTT on 4/2/18.
 */

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.OnConflictStrategy;

import java.util.List;

@Dao
public interface BackgroundDAO {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    public void insertBackgrounds(Background... backgrounds);

    @Query("SELECT background FROM backgrounds")
    public List<String> loadBackgrounds();
}
