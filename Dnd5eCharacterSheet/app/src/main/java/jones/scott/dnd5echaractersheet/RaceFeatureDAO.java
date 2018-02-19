package jones.scott.dnd5echaractersheet;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.OnConflictStrategy;

/**
 * Created by HEYSCOTT on 2/13/18.
 */

@Dao
public interface RaceFeatureDAO {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    public void insertRaceFeatures(RaceFeature... raceFeatures);

    @Query("SELECT * FROM RaceFeature WHERE fid = :fid")
    public RaceFeature loadRaceFeature(int fid);
}
