package jones.scott.dnd5echaractersheet;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.arch.persistence.room.ColumnInfo;

/**
 * Created by HEYSCOTT on 2/13/18.
 */

@Entity(tableName = "race_features")
public class RaceFeature {

    @PrimaryKey
    @ColumnInfo(name = "rfid")
    private int rfid;

    @ColumnInfo(name = "title")
    private String title;

    @ColumnInfo(name = "description")
    private String description;

    public RaceFeature(int fid, String title, String description) {
        this.title = title;
        this.description = description;
    }

    public int getFid() {
        return rfid;
    }

    public void setFid(int rfid) {
        this.rfid = rfid;
    }

    public String getRFTitle() {
        return title;
    }

    public void setRFTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public static RaceFeature[] populatedData() {
        return new RaceFeature[] {
                new RaceFeature(1, "Darkvision",
                        "60 foot range: You can see dim light as if it were " +
                                        "bright light, and darkness as if it were dim light " +
                                        "(black and white only)."),
                new RaceFeature(2, "Dwarven Resilience",
                        "Resistance to poison damage, advantage on saving throws" +
                                " against poison."),
                new RaceFeature(3, "Dwarven Combot Training",
                        "Proficiency with battleaxes, handaxes, light hammers," +
                                " and warhammers."),
                new RaceFeature(4, "Tool Proficiency",
                        "Proficiency in one of the following artisan's tools:" +
                                "smith's tools, brewer's supplies, or mason's tools."),
                new RaceFeature(5,"Stonecunning",
                        "When making an Intelligence (History) check related to the " +
                                "origin of stonework, you are considered proficient in the " +
                                "History skill. Also, add double your proficiency bonus instead" +
                                " of your normal proficiency bonus."),
                new RaceFeature(6, "Dwarven Toughness",
                        "Your hit point maximum increases by 1, and it increases by " +
                                "1 every time you gain a level."),
                new RaceFeature(7, "Dwarven Armor Training",
                        "Proficiency with light and medium armor."),
                new RaceFeature(8, "Keen Senses",
                        "You have proficiency in the Perception skill."),
                new RaceFeature(9, "Fey Ancestry",
                        "Advantage on saving throws against being charmed, and magic " +
                                "cannot put you to sleep."),
                new RaceFeature(10, "Trance",
                        "Elves don't need to sleep. Instead, they meditate deeply for" +
                                " 4 horus a day, giving them the same amount of rest."),
                new RaceFeature(11, "Elf Weapon Training",
                        "Proficiency with longswords, shortswords, longbows, and " +
                                "shortbows."),
                new RaceFeature(12 ,"Cantrip",
                        "You know one cantrip of your choice from the wizard " +
                                "spell list. Intelligence is your Spellcasting ability for it."),
                new RaceFeature(13, "Fleet of Foot",
                        "Your base walking speed is 35 feet."),
                new RaceFeature(14, "Mask of the Wild",
                        "You can attempt to hide when only lightly obscured by foliage," +
                                " heavy rain, falling snow, and other natural phenomenon."),
                new RaceFeature(15,"Superior Darkvision",
                        "120 foot range: You can see dim light as if it were " +
                                "bright light, and darkness as if it were dim light " +
                                "(black and white only)."),
                new RaceFeature(16, "Sunlight Sensitivity",
                        "Disadvantage on attack rolls and Wisdom (Perception) " +
                                "checks that rely on sight when you, the target of your attack, " +
                                "or whatever you are trying to perceive is in direct sunlight."),
                new RaceFeature(17, "Drow Magic",
                        "You know the dancing lights cantrip. At 3rd level, you can" +
                                " cast the faerie fire spell once per long rest. When you reach" +
                                " 5th level, you can cast the darkness spell once per long rest." +
                                " Charisma is your spellcasting ability for these spells."),
                new RaceFeature(18, "Drow Weapon Training",
                        "Proficiency with rapiers, shortswords, and hand crossbows."),
                new RaceFeature(19, "Lucky",
                        "When you roll a 1 on a d20 for an attack roll, ability " +
                                "check, or saving throw, you can reroll the die and must use the" +
                                " new roll."),
                new RaceFeature(20, "Brave",
                        "Advantage on saving throws against being frightened."),
                new RaceFeature(21, "Halfling Nimbleness",
                        "You can move through the occupied space of any creature that" +
                                " is of a size larger than yours."),
                new RaceFeature(22, "Naturally Stealthy",
                        "You can attempt to hide even when you are obscured only by " +
                                "the a creature that is at least one size latger than you."),
                new RaceFeature(23, "Stout Resilience",
                        "Advantage on saving throws against poison, resistance " +
                                "against poison damage."),
                new RaceFeature(24, "Variant Human",
                        "Instead of the normal Human traits, any 2 ability scores of " +
                                "your choice increase by one, you gain proficiency in one " +
                                "skill, and one feat of your choice."),
                new RaceFeature(25, "Draconic Ancestry",
                        "You get a breath weapon and damage resistance are " +
                                "determined by the dragon type of your choice."),
                new RaceFeature(26, "Breath Weapon",
                        "You can use your action (once per long rest) to exhale " +
                                "destructive energy. The DC for this saving throw is 8 + " +
                                "your Constitution modifier + your proficiency bonus. The " +
                                "target takes 2d6 damage on a failed saved, and half as much on" +
                                " a successful one. The damage increases to 3d6 at 6th level, " +
                                "4d6 at 11th level, and 5d6 at 16th level."),
                new RaceFeature(27, "Gnome Cunning",
                        "Advantage on all Intelligence, Wisdom, and Charisma saving " +
                                "throws against magic."),
                new RaceFeature(28, "Natural Illusionist",
                        "You know the minor illusion cantrip. Intelligence is your " +
                                "spellcasting ability for it."),
                new RaceFeature(29, "Speak with Small Beasts",
                        "Through sounds and gestures, you can communicate simple " +
                                "ideas with Small or smaller beasts."),
                new RaceFeature(30, "Artificer's Lore",
                        "You can add 2 times your proficiency bonus to Intelligence " +
                                "(History) checks related to magical items, alchemical objects," +
                                " or technological devices."),
                new RaceFeature(31, "Tinker",
                        "Proficiency with artisan's tools (tinker's tools). " +
                                "Using those tools, you can spend 1 hour and 10 gp worth of " +
                                "materials to construct a Tiny clockwork device (AC 5, 1 hp). " +
                                "The device ceases to function after 24 hours (unless you spend 1" +
                                " hour repairing it to keep the device functioning), or when " +
                                "you use your action to dismantle it; at that time, you can " +
                                "reclaim the materials used to create it. You can have up to " +
                                "three such devices active at a time." +
                                " When you create a device, choose one of the following options:\n" +
                                "Clockwork Toy: A clockwork animal, monster, or person, such as " +
                                "a frog, mouse, bird, dragon, or soldier. When placed on the " +
                                "ground, the toy moves five feet across the ground on each " +
                                "of your turns in a random direction. It makes noises " +
                                "appropriate to the creature it represents.\n" +
                                "Fire Starter: The device produces a miniature flame, which " +
                                "you can use to light a candle, torch, or campfire. Using " +
                                "the device requires your action.\n" +
                                "Music Box: When opened, this music box plays a single song at " +
                                "a moderate volume. The box stops playing when it reaches the " +
                                "song's end or the box is closed."),
                new RaceFeature(32, "Skill Versatility",
                        "Proficiency in two skills of your choice."),
                new RaceFeature(33, "Menacing",
                        "Proficiency in the Intimidation skill"),
                new RaceFeature(34, "Relentless Endurance",
                        "When reduced to 0 HP but not killed outright, you can " +
                                "instead drop to 1 HP, once per long rest."),
                new RaceFeature(35, "Savage Attacks",
                        "On a critical hit with a melee weapon attack, you can " +
                                "roll one of the weapon's damage dice one additional time and " +
                                "add it to the extra damage of the critical hit."),
                new RaceFeature(36, "Hellish Resistance",
                        "Resistance to fire damage."),
                new RaceFeature(37, "Infernal Legacy",
                        "You know the thaumaturgy cantrip. When you reach 3rd level, " +
                                "you can cast the hellish rebuke spell using this feature " +
                                "once per long rest. " +
                                "When you reach 5th level, you can cast the darkness spell " +
                                "using this feature " +
                                "once per long rest. Charisma is your spell casting ability for " +
                                "these spells.")
        };
    }
}
