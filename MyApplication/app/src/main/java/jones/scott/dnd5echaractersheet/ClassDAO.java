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

/*    @Query("SELECT class FROM classes WHERE cid = :cid")
    public Class loadClassByID(int cid);*/

    @Query("SELECT health FROM classes")
    public List<Integer> loadHealths();

    /*
    @Query("SELECT skills FROM classes")
    public ArrayList<ArrayList<Boolean>> loadSkills(); */

}
