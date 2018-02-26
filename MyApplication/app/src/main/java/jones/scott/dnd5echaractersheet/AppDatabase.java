package jones.scott.dnd5echaractersheet;

import android.arch.persistence.db.SupportSQLiteDatabase;
import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;
import android.support.annotation.NonNull;

import java.util.concurrent.Executors;

/**
 * Created by HEYSCOTT on 2/14/18.
 */

@Database(entities = {Race.class,
        RaceFeature.class,
        Language.class,
        Class.class,
        ClassFeature.class,
        WeaponProficiency.class}, version = 1, exportSchema = false)
public abstract class AppDatabase extends RoomDatabase {
    private static AppDatabase INSTANCE;

    public abstract RaceDAO raceDAO();
    public abstract RaceFeatureDAO raceFeatureDAO();
    public abstract LanguageDAO languageDAO();
    public abstract ClassDAO classDAO();
    public abstract ClassFeatureDAO classFeatureDAO();
    public abstract WeaponProficiencyDAO weaponProficiencyDAO();

    public synchronized static AppDatabase getInstance(Context context) {
        if (INSTANCE == null) {
            INSTANCE = buildDatabase(context);
        }
        return INSTANCE;
    }

    //use AppDatabase.buildDatabase(getApplicationContext) to get the instance of the database.
    public static AppDatabase buildDatabase(final Context context) {
        if(INSTANCE == null) {
            INSTANCE = Room.databaseBuilder(context,
                    AppDatabase.class,
                    "database")
                    .addCallback(new Callback() {
                        @Override
                        public void onCreate(@NonNull SupportSQLiteDatabase db) {
                            super.onCreate(db);
                            Executors.newSingleThreadScheduledExecutor().execute(new Runnable() {
                                @Override
                                public void run() {
                                    getInstance(context).raceDAO().insertRaces(Race.populatedData());
                                    getInstance(context).raceFeatureDAO().insertRaceFeatures(RaceFeature.populatedData());
                                    getInstance(context).languageDAO().insertLanguages(Language.populatedData());
                                    getInstance(context).classDAO().insertClasses(Class.populatedData());
                                    getInstance(context).classFeatureDAO().insertClassFeatures(ClassFeature.populatedData());
                                    getInstance(context).weaponProficiencyDAO().insertWeaponProficiencies(WeaponProficiency.populatedData());
                                }
                            });
                        }
                    })
                    .build();
        }
        return INSTANCE;
    }

    public static void destroyInstance() {
        INSTANCE = null;
    }
}
