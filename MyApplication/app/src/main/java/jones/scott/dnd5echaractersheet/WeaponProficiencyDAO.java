package jones.scott.dnd5echaractersheet;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

/**
 * Created by HEYSCOTT on 2/16/18.
 */

@Dao
public interface WeaponProficiencyDAO {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    public void insertWeaponProficiencies(WeaponProficiency... weaponProficiencies);

    @Query("SELECT * FROM weapon_proficiencies WHERE wpid = :wpid")
    public WeaponProficiency loadWeaponProficiencyByID(int wpid);

}
