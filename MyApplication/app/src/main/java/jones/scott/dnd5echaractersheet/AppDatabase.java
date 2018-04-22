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
        WeaponProficiency.class,
        Background.class,
        Skill.class}, version = 1, exportSchema = false)
public abstract class AppDatabase extends RoomDatabase {
    private static AppDatabase INSTANCE = null;

    public abstract RaceDAO raceDAO();
    public abstract RaceFeatureDAO raceFeatureDAO();
    public abstract LanguageDAO languageDAO();
    public abstract ClassDAO classDAO();
    public abstract ClassFeatureDAO classFeatureDAO();
    public abstract WeaponProficiencyDAO weaponProficiencyDAO();
    public abstract BackgroundDAO backgroundDAO();
    public abstract SkillDAO skillDAO();

    public synchronized static AppDatabase getInstance(Context context) {
        INSTANCE.destroyInstance();
        if (INSTANCE == null) {

            INSTANCE = buildDatabase(context);
        }
        return INSTANCE;
    }

    //use AppDatabase.buildDatabase(getApplicationContext) to get the instance of the database.
    private static AppDatabase buildDatabase(final Context context) {
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
                                    INSTANCE.raceDAO().insertRaces(Race.populatedData());
                                    INSTANCE.raceFeatureDAO().insertRaceFeatures(RaceFeature.populatedData());
                                    INSTANCE.languageDAO().insertLanguages(Language.populatedData());
                                    INSTANCE.classDAO().insertClasses(Class.populatedData());
                                    INSTANCE.classFeatureDAO().insertClassFeatures(ClassFeature.populatedData());
                                    INSTANCE.backgroundDAO().insertBackgrounds(Background.populatedData());
                                    INSTANCE.skillDAO().insertSkills(Skill.populatedData());
                                    INSTANCE.weaponProficiencyDAO().insertWeaponProficiencies(WeaponProficiency.populatedData());
                                }
                            });
                        }
                    })
                    .allowMainThreadQueries().build();
        return INSTANCE;
    }

    public static void destroyInstance() {
        INSTANCE = null;
    }
}
