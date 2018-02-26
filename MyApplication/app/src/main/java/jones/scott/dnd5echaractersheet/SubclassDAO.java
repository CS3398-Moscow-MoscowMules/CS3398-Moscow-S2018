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
public interface SubclassDAO {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    public void insertSubclasses(Subclass... subclasses);

    @Query("SELECT subclass FROM subclasses WHERE cid = :cid")
    public List<String> loadSubclassesForClass(int cid);

    @Query("SELECT * FROM subclasses WHERE scid = :scid")
    public Subclass loadSubclassByID(int scid);
}
