package jones.scott.dnd5echaractersheet;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import java.util.List;

/**
 * Created by HEYSCOTT on 2/15/18.
 */

@Dao
public interface ClassFeatureDAO {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    public void insertClassFeatures(ClassFeature... classFeatures);

    @Query("SELECT title FROM class_features WHERE  cfid = :cfid")
    public String loadTitleOfClassFeatureByID(int cfid);

    @Query("SELECT description FROM class_features WHERE cfid = :cfid")
    public String loadDescriptionOfClassFeatureByID(int cfid);
}
