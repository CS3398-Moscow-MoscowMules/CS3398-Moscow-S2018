package jones.scott.dnd5echaractersheet;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by HEYSCOTT on 2/16/18.
 */

@Entity(tableName = "weapon_proficiencies")
public class WeaponProficiency {

    @PrimaryKey
    @ColumnInfo(name = "wpid")
    private int wpid;

    //weapons
    private int club;
    private int dagger;
    private int greatclub;
    private int handaxe;
    private int javelin;
    private int lighthammer;
    private int mace;
    private int quarterstaff;
    private int sickle;
    private int spear;
    private int lightcrossbow;
    private int dart;
    private int shortbow;
    private int sling;
    private int battleaxe;
    private int flail;
    private int glaive;
    private int greataxe;
    private int halberd;
    private int lance;
    private int longsword;
    private int maul;
    private int morningstar;
    private int pike;
    private int rapier;
    private int scimitar;
    private int shortsword;
    private int trident;
    private int warpick;
    private int warhammer;
    private int whip;
    private int blowgun;
    private int handcrossbow;
    private int heavycrossbow;
    private int longbow;
    private int net;

    public WeaponProficiency(int wpid, int club, int dagger, int greatclub, int handaxe, int javelin, int lighthammer, int mace, int quarterstaff, int sickle, int spear, int lightcrossbow, int dart, int shortbow, int sling, int battleaxe, int flail, int glaive, int greataxe, int halberd, int lance, int longsword, int maul, int morningstar, int pike, int rapier, int scimitar, int shortsword, int trident, int warpick, int warhammer, int whip, int blowgun, int handcrossbow, int heavycrossbow, int longbow, int net) {
        this.wpid = wpid;
        this.club = club;
        this.dagger = dagger;
        this.greatclub = greatclub;
        this.handaxe = handaxe;
        this.javelin = javelin;
        this.lighthammer = lighthammer;
        this.mace = mace;
        this.quarterstaff = quarterstaff;
        this.sickle = sickle;
        this.spear = spear;
        this.lightcrossbow = lightcrossbow;
        this.dart = dart;
        this.shortbow = shortbow;
        this.sling = sling;
        this.battleaxe = battleaxe;
        this.flail = flail;
        this.glaive = glaive;
        this.greataxe = greataxe;
        this.halberd = halberd;
        this.lance = lance;
        this.longsword = longsword;
        this.maul = maul;
        this.morningstar = morningstar;
        this.pike = pike;
        this.rapier = rapier;
        this.scimitar = scimitar;
        this.shortsword = shortsword;
        this.trident = trident;
        this.warpick = warpick;
        this.warhammer = warhammer;
        this.whip = whip;
        this.blowgun = blowgun;
        this.handcrossbow = handcrossbow;
        this.heavycrossbow = heavycrossbow;
        this.longbow = longbow;
        this.net = net;
    }

    public int getWpid() {
        return wpid;
    }

    public void setWpid(int wpid) {
        this.wpid = wpid;
    }

    public int getClub() {
        return club;
    }

    public void setClub(int club) {
        this.club = club;
    }

    public int getDagger() {
        return dagger;
    }

    public void setDagger(int dagger) {
        this.dagger = dagger;
    }

    public int getGreatclub() {
        return greatclub;
    }

    public void setGreatclub(int greatclub) {
        this.greatclub = greatclub;
    }

    public int getHandaxe() {
        return handaxe;
    }

    public void setHandaxe(int handaxe) {
        this.handaxe = handaxe;
    }

    public int getJavelin() {
        return javelin;
    }

    public void setJavelin(int javelin) {
        this.javelin = javelin;
    }

    public int getLighthammer() {
        return lighthammer;
    }

    public void setLighthammer(int lighthammer) {
        this.lighthammer = lighthammer;
    }

    public int getMace() {
        return mace;
    }

    public void setMace(int mace) {
        this.mace = mace;
    }

    public int getQuarterstaff() {
        return quarterstaff;
    }

    public void setQuarterstaff(int quarterstaff) {
        this.quarterstaff = quarterstaff;
    }

    public int getSickle() {
        return sickle;
    }

    public void setSickle(int sickle) {
        this.sickle = sickle;
    }

    public int getSpear() {
        return spear;
    }

    public void setSpear(int spear) {
        this.spear = spear;
    }

    public int getLightcrossbow() {
        return lightcrossbow;
    }

    public void setLightcrossbow(int lightcrossbow) {
        this.lightcrossbow = lightcrossbow;
    }

    public int getDart() {
        return dart;
    }

    public void setDart(int dart) {
        this.dart = dart;
    }

    public int getShortbow() {
        return shortbow;
    }

    public void setShortbow(int shortbow) {
        this.shortbow = shortbow;
    }

    public int getSling() {
        return sling;
    }

    public void setSling(int sling) {
        this.sling = sling;
    }

    public int getBattleaxe() {
        return battleaxe;
    }

    public void setBattleaxe(int battleaxe) {
        this.battleaxe = battleaxe;
    }

    public int getFlail() {
        return flail;
    }

    public void setFlail(int flail) {
        this.flail = flail;
    }

    public int getGlaive() {
        return glaive;
    }

    public void setGlaive(int glaive) {
        this.glaive = glaive;
    }

    public int getGreataxe() {
        return greataxe;
    }

    public void setGreataxe(int greataxe) {
        this.greataxe = greataxe;
    }

    public int getHalberd() {
        return halberd;
    }

    public void setHalberd(int halberd) {
        this.halberd = halberd;
    }

    public int getLance() {
        return lance;
    }

    public void setLance(int lance) {
        this.lance = lance;
    }

    public int getLongsword() {
        return longsword;
    }

    public void setLongsword(int longsword) {
        this.longsword = longsword;
    }

    public int getMaul() {
        return maul;
    }

    public void setMaul(int maul) {
        this.maul = maul;
    }

    public int getMorningstar() {
        return morningstar;
    }

    public void setMorningstar(int morningstar) {
        this.morningstar = morningstar;
    }

    public int getPike() {
        return pike;
    }

    public void setPike(int pike) {
        this.pike = pike;
    }

    public int getRapier() {
        return rapier;
    }

    public void setRapier(int rapier) {
        this.rapier = rapier;
    }

    public int getScimitar() {
        return scimitar;
    }

    public void setScimitar(int scimitar) {
        this.scimitar = scimitar;
    }

    public int getShortsword() {
        return shortsword;
    }

    public void setShortsword(int shortsword) {
        this.shortsword = shortsword;
    }

    public int getTrident() {
        return trident;
    }

    public void setTrident(int trident) {
        this.trident = trident;
    }

    public int getWarpick() {
        return warpick;
    }

    public void setWarpick(int warpick) {
        this.warpick = warpick;
    }

    public int getWarhammer() {
        return warhammer;
    }

    public void setWarhammer(int warhammer) {
        this.warhammer = warhammer;
    }

    public int getWhip() {
        return whip;
    }

    public void setWhip(int whip) {
        this.whip = whip;
    }

    public int getBlowgun() {
        return blowgun;
    }

    public void setBlowgun(int blowgun) {
        this.blowgun = blowgun;
    }

    public int getHandcrossbow() {
        return handcrossbow;
    }

    public void setHandcrossbow(int handcrossbow) {
        this.handcrossbow = handcrossbow;
    }

    public int getHeavycrossbow() {
        return heavycrossbow;
    }

    public void setHeavycrossbow(int heavycrossbow) {
        this.heavycrossbow = heavycrossbow;
    }

    public int getLongbow() {
        return longbow;
    }

    public void setLongbow(int longbow) {
        this.longbow = longbow;
    }

    public int getNet() {
        return net;
    }

    public void setNet(int net) {
        this.net = net;
    }

    public static WeaponProficiency[] populatedData() {
        return new WeaponProficiency[] {
                //Battleaxe, handaxe, light hammer, warhammer
                new WeaponProficiency(1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0),
                //Longsword, shortsword, shortbow, longbow
                new WeaponProficiency(2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0,1, 0, 0, 0, 0, 0, 0, 0, 1, 0),
                //rapiers, shortswords, hand crossbows
                new WeaponProficiency(3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0),
                //all weapons (simple and martial)
                new WeaponProficiency(4, 1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1),
                //all simple weapons, hand crossbows, longswords, rapiers, shortswords
                new WeaponProficiency(5, 1,1,1,1,1,1,1,1,1,1,1,1,1,1,0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0,0, 0, 1, 0, 0,0),
                //all martial weapons
                new WeaponProficiency(6, 0, 0, 0, 0, 0,0,0,0,0,0,0,0,0,0,1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,1, 1, 1, 1, 1, 1, 1, 1, 1, 1),
                //all simple weapons
                new WeaponProficiency(7, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
                //clubs, daggers, darts, javelins, maces, quarterstaffs, scimtars, sickles, slings, spears
                new WeaponProficiency(8, 1, 1, 0, 0, 1, 0, 1, 1, 1, 1, 0, 1, 0, 1, 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0),
                //simple weapons, shortswords
                new WeaponProficiency(9, 1,1,1,1,1,1,1,1,1,1,1,1,1,1, 0, 0, 0, 0, 0, 0, 0, 0,0, 0, 0, 0, 1,0,0,0,0,0,0,0,0, 0),
                //daggers, darts, slings, quarterstaffs, light crossbows
                new WeaponProficiency(10, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 1, 1, 0, 1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)

        };
    }
}
