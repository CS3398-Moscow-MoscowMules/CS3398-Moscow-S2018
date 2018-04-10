package mules.moscow.dungeonsanddragons5echaractersheet;
import java.io.*;
import java.util.ArrayList;

public class DatabaseToGui {
    FileWriter out = null;
    String path = "./app/res/values/strings.xml";
    DatabaseToGui(ArrayList<String> raceData, ArrayList<String> classData,
                  ArrayList<String> backgroundData, ArrayList<String> alignmentData,
                  ArrayList<String> languageData){
        try{
            out = new FileWriter(path);
        } catch (Exception e){
            e.printStackTrace();
        }
        updateStringsXml(raceData, classData, backgroundData, alignmentData, languageData);
    }

    void updateStringsXml(ArrayList<String> raceData, ArrayList<String> classData,
                          ArrayList<String> backgroundData, ArrayList<String> alignmentData,
                          ArrayList<String> languageData){
        try{
            out.append("<resources>\n" +
                    "    <string name=\"app_name\">DnD Character Sheet</string>\n" +
                    "    <string name=\"action_settings\">Settings</string>\n" +
                    "\n" +
                    "    <string name=\"createButton\">Create Character</string>\n" +
                    "    <string name=\"viewButton\">View Character Sheets</string>\n" +
                    "\n" +
                    "    <string-array name=\"race_arrays\">" +
                    "        <item>Select Race</item>\n");

            printRaces(raceData);

            out.append("</string-array>\n\n" +
                    "    <string-array name=\"class_arrays\">\n" +
                    "        <item>Select Class</item>\n");

            printClasses(classData);

            out.append("</string-array>\n\n" +
                    "    <string-array name=\"background_arrays\">\n" +
                    "        <item>Select Background</item>\n");

            printBackgrounds(backgroundData);

            out.append("</string-array>\n\n" +
                    "    <string-array name=\"alignment_arrays\">\n" +
                    "        <item>Select Alignment</item>\n");

            printAlignments(alignmentData);

            out.append("</string-array>\n\n" +
                    "<string-array name=\"alignment_arrays\">\n");

            printLanguages(languageData);

            out.append("    </string-array>\n\n");

            printExtra();

            out.append("</resources>");

        } catch (Exception e){
            e.printStackTrace();;
        }
    }

    void printRaces(ArrayList<String> raceData){
        int i=0;
        while(!raceData.isEmpty()){
            try{
                out.append("        <item>" + raceData.get(i) +"</item>\n");
                raceData.remove(i);
            } catch (Exception e){
                e.printStackTrace();
            }
            i++;
        }
    }

    void printClasses(ArrayList<String> classData){
        int i=0;
        while(!classData.isEmpty()){
            try{
                out.append("        <item>" + classData.get(i) +"</item>\n");
                classData.remove(i);
            } catch (Exception e){
                e.printStackTrace();
            }
            i++;
        }
    }

    void printBackgrounds(ArrayList<String> backgroundData){
        int i=0;
        while(!backgroundData.isEmpty()){
            try{
                out.append("        <item>" + backgroundData.get(i) +"</item>\n");
                backgroundData.remove(i);
            } catch (Exception e){
                e.printStackTrace();
            }
            i++;
        }
    }

    void printAlignments(ArrayList<String> alignmentData){
        int i=0;
        while(!alignmentData.isEmpty()){
            try{
                out.append("        <item>" + alignmentData.get(i) +"</item>\n");
                alignmentData.remove(i);
            } catch (Exception e){
                e.printStackTrace();
            }
            i++;
        }
    }

    void printLanguages(ArrayList<String> languageData){
        int i=0;
        while(!languageData.isEmpty()){
            try{
                out.append("        <item>" + languageData.get(i) +"</item>\n");
                languageData.remove(i);
            } catch (Exception e){
                e.printStackTrace();
            }
            i++;
        }
    }

    void printExtra(){
        try{
            out.append("    <string-array name=\"armor_arrays\">\n" +
                    "        <item>Select Armor</item>\n" +
                    "        <item>Padded</item>\n" +
                    "        <item>Leather</item>\n" +
                    "        <item>Studded Leather</item>\n" +
                    "        <item>Hide</item>\n" +
                    "        <item>Chain Shirt</item>\n" +
                    "        <item>Scale Mail</item>\n" +
                    "        <item>Breastplate</item>\n" +
                    "        <item>Half Plate</item>\n" +
                    "        <item>Ring Mail</item>\n" +
                    "        <item>Chain Mail</item>\n" +
                    "        <item>Splint</item>\n" +
                    "        <item>Plate</item>\n" +
                    "    </string-array>\n" +
                    "\n" +
                    "    <string-array name=\"shield_arrays\">\n" +
                    "        <item>Select Shield</item>\n" +
                    "        <item>None</item>\n" +
                    "        <item>Wood</item>\n" +
                    "        <item>Metal</item>\n" +
                    "    </string-array>\n" +
                    "\n" +
                    "    <string-array name=\"weapons_arrays\">\n" +
                    "        <item>Select Weapon</item>\n" +
                    "        <item>Club</item>\n" +
                    "        <item>Dagger</item>\n" +
                    "        <item>Greatclub</item>\n" +
                    "        <item>Handaxe</item>\n" +
                    "        <item>Javelin</item>\n" +
                    "        <item>Light Hammer</item>\n" +
                    "        <item>Mace</item>\n" +
                    "        <item>Quarterstaff</item>\n" +
                    "        <item>Sickle</item>\n" +
                    "        <item>Spear</item>\n" +
                    "        <item>Crossbow, light</item>\n" +
                    "        <item>Dart</item>\n" +
                    "        <item>Shortbow</item>\n" +
                    "        <item>Sling</item>\n" +
                    "        <item>Battleaxe</item>\n" +
                    "        <item>Flail</item>\n" +
                    "        <item>Glaive</item>\n" +
                    "        <item>Greataxe</item>\n" +
                    "        <item>Greatsword</item>\n" +
                    "        <item>Halberd</item>\n" +
                    "        <item>Lance</item>\n" +
                    "        <item>Longsword</item>\n" +
                    "        <item>Maul</item>\n" +
                    "        <item>Morningstar Pike</item>\n" +
                    "        <item>Rapier</item>\n" +
                    "        <item>Scimitar</item>\n" +
                    "        <item>Shortsword</item>\n" +
                    "        <item>Trident</item>\n" +
                    "        <item>War Pick</item>\n" +
                    "        <item>Warhammer</item>\n" +
                    "        <item>Whip</item>\n" +
                    "        <item>Blowgun</item>\n" +
                    "        <item>Crossbow, hand</item>\n" +
                    "        <item>Crossbow, heavy</item>\n" +
                    "        <item>Longbow</item>\n" +
                    "        <item>Net</item>\n" +
                    "    </string-array>\n" +
                    "\n" +
                    "    <string-array name=\"spells_arrays\">\n" +
                    "        <item>Select Spell</item>\n" +
                    "        <item>Acid Splash</item>\n" +
                    "        <item>Aid</item>\n" +
                    "        <item>Alarm</item>\n" +
                    "        <item>Alter Self</item>\n" +
                    "        <item>Animal Friendship</item>\n" +
                    "        <item>Animal Messenger</item>\n" +
                    "        <item>Animal Shapes</item>\n" +
                    "        <item>Animate Dead</item>\n" +
                    "        <item>Animate Objects</item>\n" +
                    "        <item>Antilife Shell</item>\n" +
                    "        <item>Antimagic Field</item>\n" +
                    "        <item>Antipathy/Sympathy</item>\n" +
                    "        <item>Arcane Eye</item>\n" +
                    "        <item>Arcane Gate</item>\n" +
                    "        <item>Arcane Lock</item>\n" +
                    "        <item>Armor of Agathys</item>\n" +
                    "        <item>Arms of Hadar</item>\n" +
                    "        <item>Astral Projection</item>\n" +
                    "        <item>Augury</item>\n" +
                    "        <item>Aura of Life</item>\n" +
                    "        <item>Aura of Purity</item>\n" +
                    "        <item>Aura of Vitality</item>\n" +
                    "        <item>Awaken</item>\n" +
                    "        <item>Bane</item>\n" +
                    "        <item>Banishing Smite</item>\n" +
                    "        <item>Banishment</item>\n" +
                    "        <item>Barkskin</item>\n" +
                    "        <item>Beacon of Hope</item>\n" +
                    "        <item>Beast Sense</item>\n" +
                    "        <item>Bestow Curse</item>\n" +
                    "        <item>Bigby's Hand</item>\n" +
                    "        <item>Blade Barrier</item>\n" +
                    "        <item>Blade Ward</item>\n" +
                    "        <item>Bless</item>\n" +
                    "        <item>Blight</item>\n" +
                    "        <item>Blinding Smite</item>\n" +
                    "        <item>Blindness/Deafness</item>\n" +
                    "        <item>Blink</item>\n" +
                    "        <item>Blur</item>\n" +
                    "        <item>Branding Smite</item>\n" +
                    "        <item>Burning Hands</item>\n" +
                    "        <item>Call Lightning</item>\n" +
                    "        <item>Calm Emotions</item>\n" +
                    "        <item>Chain Lightning</item>\n" +
                    "        <item>Charm Person</item>\n" +
                    "        <item>Chill Touch</item>\n" +
                    "        <item>Chromatic Orb</item>\n" +
                    "        <item>Circle of Death</item>\n" +
                    "        <item>Circle of Power</item>\n" +
                    "        <item>Clairvoyance</item>\n" +
                    "        <item>Clone</item>\n" +
                    "        <item>Cloud of Daggers</item>\n" +
                    "        <item>Cloudkill</item>\n" +
                    "        <item>Color Spray</item>\n" +
                    "        <item>Command</item>\n" +
                    "        <item>Commune</item>\n" +
                    "        <item>Commune with Nature</item>\n" +
                    "        <item>Compelled Duel</item>\n" +
                    "        <item>Comprehend Languages</item>\n" +
                    "        <item>Compulsion</item>\n" +
                    "        <item>Cone of Cold</item>\n" +
                    "        <item>Confusion</item>\n" +
                    "        <item>Conjure Animals</item>\n" +
                    "        <item>Conjure Barrage</item>\n" +
                    "        <item>Conjure Celestial</item>\n" +
                    "        <item>Conjure Elemental</item>\n" +
                    "        <item>Conjure Fey</item>\n" +
                    "        <item>Conjure Minor Elementals</item>\n" +
                    "        <item>Conjure Volley</item>\n" +
                    "        <item>Conjure Woodland Beings</item>\n" +
                    "        <item>Contact Other Plane</item>\n" +
                    "        <item>Contagion</item>\n" +
                    "        <item>Contingency</item>\n" +
                    "        <item>Continual Flame</item>\n" +
                    "        <item>Control Water</item>\n" +
                    "        <item>Control Weather</item>\n" +
                    "        <item>Cordon of Arrows</item>\n" +
                    "        <item>Counterspell</item>\n" +
                    "        <item>Create Food and Water</item>\n" +
                    "        <item>Create Undead</item>\n" +
                    "        <item>Create or Destroy Water</item>\n" +
                    "        <item>Creation</item>\n" +
                    "        <item>Crown of Madness</item>\n" +
                    "        <item>Crusader's Mantle</item>\n" +
                    "        <item>Cure Wounds</item>\n" +
                    "        <item>Dancing Lights</item>\n" +
                    "        <item>Darkness</item>\n" +
                    "        <item>Darkvision</item>\n" +
                    "        <item>Daylight</item>\n" +
                    "        <item>Death Ward</item>\n" +
                    "        <item>Delayed Blast Fireball</item>\n" +
                    "        <item>Demiplane</item>\n" +
                    "        <item>Destructive Wave</item>\n" +
                    "        <item>Detect Evil and Good</item>\n" +
                    "        <item>Detect Magic</item>\n" +
                    "        <item>Detect Poison and Disease</item>\n" +
                    "        <item>Detect Thoughts</item>\n" +
                    "        <item>Dimension Door</item>\n" +
                    "        <item>Disguise Self</item>\n" +
                    "        <item>Disintegrate</item>\n" +
                    "        <item>Dispel Evil and Good</item>\n" +
                    "        <item>Dispel Magic</item>\n" +
                    "        <item>Dissonant Whispers</item>\n" +
                    "        <item>Divination</item>\n" +
                    "        <item>Divine Favor</item>\n" +
                    "        <item>Divine Word</item>\n" +
                    "        <item>Dominate Beast</item>\n" +
                    "        <item>Dominate Monster</item>\n" +
                    "        <item>Dominate Person</item>\n" +
                    "        <item>Drawmij's Instant Summons</item>\n" +
                    "        <item>Dream</item>\n" +
                    "        <item>Druidcraft</item>\n" +
                    "        <item>Earthquake</item>\n" +
                    "        <item>Eldritch Blast</item>\n" +
                    "        <item>Elemental Weapon</item>\n" +
                    "        <item>Enhance Ability</item>\n" +
                    "        <item>Enlarge/Reduce</item>\n" +
                    "        <item>Ensnaring Strike</item>\n" +
                    "        <item>Entangle</item>\n" +
                    "        <item>Enthrall</item>\n" +
                    "        <item>Etherealness</item>\n" +
                    "        <item>Evard's Black Tentacles</item>\n" +
                    "        <item>Expeditious Retreat</item>\n" +
                    "        <item>Eyebite</item>\n" +
                    "        <item>Fabricate</item>\n" +
                    "        <item>Faerie Fire</item>\n" +
                    "        <item>False Life</item>\n" +
                    "        <item>Fear</item>\n" +
                    "        <item>Feather Fall</item>\n" +
                    "        <item>Feeblemind</item>\n" +
                    "        <item>Feign Death</item>\n" +
                    "        <item>Find Familiar</item>\n" +
                    "        <item>Find Steed</item>\n" +
                    "        <item>Find Traps</item>\n" +
                    "        <item>Find the Path</item>\n" +
                    "        <item>Finger of Death</item>\n" +
                    "        <item>Fire Bolt</item>\n" +
                    "        <item>Fire Shield</item>\n" +
                    "        <item>Fire Storm</item>\n" +
                    "        <item>Fireball</item>\n" +
                    "        <item>Flame Blade</item>\n" +
                    "        <item>Flame Strike</item>\n" +
                    "        <item>Flaming Sphere</item>\n" +
                    "        <item>Flesh to Stone</item>\n" +
                    "        <item>Fly</item>\n" +
                    "        <item>Fog Cloud</item>\n" +
                    "        <item>Forbiddance</item>\n" +
                    "        <item>Forcecage</item>\n" +
                    "        <item>Foresight</item>\n" +
                    "        <item>Freedom of Movement</item>\n" +
                    "        <item>Friends</item>\n" +
                    "        <item>Gaseous Form</item>\n" +
                    "        <item>Gate</item>\n" +
                    "        <item>Geas</item>\n" +
                    "        <item>Gentle Repose</item>\n" +
                    "        <item>Giant Insect</item>\n" +
                    "        <item>Glibness</item>\n" +
                    "        <item>Globe of Invulnerability</item>\n" +
                    "        <item>Glyph of Warding</item>\n" +
                    "        <item>Goodberry</item>\n" +
                    "        <item>Grasping Vine</item>\n" +
                    "        <item>Grease</item>\n" +
                    "        <item>Greater Invisibility</item>\n" +
                    "        <item>Greater Restoration</item>\n" +
                    "        <item>Guardian of Faith</item>\n" +
                    "        <item>Guards and Wards</item>\n" +
                    "        <item>Guidance</item>\n" +
                    "        <item>Guiding Bolt</item>\n" +
                    "        <item>Gust of Wind</item>\n" +
                    "        <item>Hail of Thorns</item>\n" +
                    "        <item>Hallow</item>\n" +
                    "        <item>Hallucinatory Terrain</item>\n" +
                    "        <item>Harm</item>\n" +
                    "        <item>Haste</item>\n" +
                    "        <item>Heal</item>\n" +
                    "        <item>Healing Word</item>\n" +
                    "        <item>Heat Metal</item>\n" +
                    "        <item>Hellish Rebuke</item>\n" +
                    "        <item>Heroes' Feast</item>\n" +
                    "        <item>Heroism</item>\n" +
                    "        <item>Hex</item>\n" +
                    "        <item>Hold Monster</item>\n" +
                    "        <item>Hold Person</item>\n" +
                    "        <item>Holy Aura</item>\n" +
                    "        <item>Hunger of Hadar</item>\n" +
                    "        <item>Hunter's Mark</item>\n" +
                    "        <item>Hypnotic Pattern</item>\n" +
                    "        <item>Ice Storm</item>\n" +
                    "        <item>Identify</item>\n" +
                    "        <item>Illusory Script</item>\n" +
                    "        <item>Imprisonment</item>\n" +
                    "        <item>Incendiary Cloud</item>\n" +
                    "        <item>Inflict Wounds</item>\n" +
                    "        <item>Insect Plague</item>\n" +
                    "        <item>Invisibility</item>\n" +
                    "        <item>Jump</item>\n" +
                    "        <item>Knock</item>\n" +
                    "        <item>Legend Lore</item>\n" +
                    "        <item>Leomund's Secret Chest</item>\n" +
                    "        <item>Leomund's Tiny Hut</item>\n" +
                    "        <item>Lesser Restoration</item>\n" +
                    "        <item>Levitate</item>\n" +
                    "        <item>Light</item>\n" +
                    "        <item>Lightning Arrow</item>\n" +
                    "        <item>Lightning Bolt</item>\n" +
                    "        <item>Locate Animals or Plants</item>\n" +
                    "        <item>Locate Creature</item>\n" +
                    "        <item>Locate Object</item>\n" +
                    "        <item>Longstrider</item>\n" +
                    "        <item>Mage Armor</item>\n" +
                    "        <item>Mage Hand</item>\n" +
                    "        <item>Magic Circle</item>\n" +
                    "        <item>Magic Jar</item>\n" +
                    "        <item>Magic Missile</item>\n" +
                    "        <item>Magic Mouth</item>\n" +
                    "        <item>Magic Weapon</item>\n" +
                    "        <item>Major Image</item>\n" +
                    "        <item>Mass Cure Wounds</item>\n" +
                    "        <item>Mass Heal</item>\n" +
                    "        <item>Mass Healing Word</item>\n" +
                    "        <item>Mass Suggestion</item>\n" +
                    "        <item>Maze</item>\n" +
                    "        <item>Meld into Stone</item>\n" +
                    "        <item>Melf's Acid Arrow</item>\n" +
                    "        <item>Mending</item>\n" +
                    "        <item>Message</item>\n" +
                    "        <item>Meteor Swarm</item>\n" +
                    "        <item>Mind Blank</item>\n" +
                    "        <item>Minor Illusion</item>\n" +
                    "        <item>Mirage Arcane</item>\n" +
                    "        <item>Mirror Image</item>\n" +
                    "        <item>Mislead</item>\n" +
                    "        <item>Misty Step</item>\n" +
                    "        <item>Modify Memory</item>\n" +
                    "        <item>Moonbeam</item>\n" +
                    "        <item>Mordenkainen's Faithful Hound</item>\n" +
                    "        <item>Mordenkainen's Magnificent Mansion</item>\n" +
                    "        <item>Mordenkainen's Private Sanctum</item>\n" +
                    "        <item>Mordenkainen's Sword</item>\n" +
                    "        <item>Move Earth</item>\n" +
                    "        <item>Nondetection</item>\n" +
                    "        <item>Nystul's Magic Aura</item>\n" +
                    "        <item>Otiluke's Freezing Sphere</item>\n" +
                    "        <item>Otiluke's Resilient Sphere</item>\n" +
                    "        <item>Otto's Irresistible Dance</item>\n" +
                    "        <item>Pass without Trace</item>\n" +
                    "        <item>Passwall</item>\n" +
                    "        <item>Phantasmal Force</item>\n" +
                    "        <item>Phantasmal Killer</item>\n" +
                    "        <item>Phantom Steed</item>\n" +
                    "        <item>Planar Ally</item>\n" +
                    "        <item>Planar Binding</item>\n" +
                    "        <item>Plane Shift</item>\n" +
                    "        <item>Plant Growth</item>\n" +
                    "        <item>Poison Spray</item>\n" +
                    "        <item>Polymorph</item>\n" +
                    "        <item>Power Word Heal</item>\n" +
                    "        <item>Power Word Kill</item>\n" +
                    "        <item>Power Word Stun</item>\n" +
                    "        <item>Prayer of Healing</item>\n" +
                    "        <item>Prestidigitation</item>\n" +
                    "        <item>Prismatic Spray</item>\n" +
                    "        <item>Prismatic Wall</item>\n" +
                    "        <item>Produce Flame</item>\n" +
                    "        <item>Programmed Illusion</item>\n" +
                    "        <item>Project Image</item>\n" +
                    "        <item>Protection from Energy</item>\n" +
                    "        <item>Protection from Evil and Good</item>\n" +
                    "        <item>Protection from Poison</item>\n" +
                    "        <item>Purify Food and Drink</item>\n" +
                    "        <item>Raise Dead</item>\n" +
                    "        <item>Rary's Telepathic Bond</item>\n" +
                    "        <item>Ray of Enfeeblement</item>\n" +
                    "        <item>Ray of Frost</item>\n" +
                    "        <item>Ray of Sickness</item>\n" +
                    "        <item>Regenerate</item>\n" +
                    "        <item>Reincarnate</item>\n" +
                    "        <item>Remove Curse</item>\n" +
                    "        <item>Resistance</item>\n" +
                    "        <item>Resurrection</item>\n" +
                    "        <item>Reverse Gravity</item>\n" +
                    "        <item>Revivify</item>\n" +
                    "        <item>Rope Trick</item>\n" +
                    "        <item>Sacred Flame</item>\n" +
                    "        <item>Sanctuary</item>\n" +
                    "        <item>Scorching Ray</item>\n" +
                    "        <item>Scrying</item>\n" +
                    "        <item>Searing Smite</item>\n" +
                    "        <item>See Invisibility</item>\n" +
                    "        <item>Seeming</item>\n" +
                    "        <item>Sending</item>\n" +
                    "        <item>Sequester</item>\n" +
                    "        <item>Shapechange</item>\n" +
                    "        <item>Shatter</item>\n" +
                    "        <item>Shield</item>\n" +
                    "        <item>Shield of Faith</item>\n" +
                    "        <item>Shillelagh</item>\n" +
                    "        <item>Shocking Grasp</item>\n" +
                    "        <item>Silence</item>\n" +
                    "        <item>Silent Image</item>\n" +
                    "        <item>Simulacrum</item>\n" +
                    "        <item>Sleep</item>\n" +
                    "        <item>Sleet Storm</item>\n" +
                    "        <item>Slow</item>\n" +
                    "        <item>Spare The Dying</item>\n" +
                    "        <item>Speak with Animals</item>\n" +
                    "        <item>Speak with Dead</item>\n" +
                    "        <item>Speak with Plants</item>\n" +
                    "        <item>Spider Climb</item>\n" +
                    "        <item>Spike Growth</item>\n" +
                    "        <item>Spirit Guardians</item>\n" +
                    "        <item>Spiritual Weapon</item>\n" +
                    "        <item>Staggering Smite</item>\n" +
                    "        <item>Stinking Cloud</item>\n" +
                    "        <item>Stone Shape</item>\n" +
                    "        <item>Stoneskin</item>\n" +
                    "        <item>Storm of Vengeance</item>\n" +
                    "        <item>Suggestion</item>\n" +
                    "        <item>Sunbeam</item>\n" +
                    "        <item>Sunburst</item>\n" +
                    "        <item>Swift Quiver</item>\n" +
                    "        <item>Symbol</item>\n" +
                    "        <item>Tasha's Hideous Laughter</item>\n" +
                    "        <item>Telekinesis</item>\n" +
                    "        <item>Telepathy</item>\n" +
                    "        <item>Teleport</item>\n" +
                    "        <item>Teleportation Circle</item>\n" +
                    "        <item>Tenser's Floating Disk</item>\n" +
                    "        <item>Thaumaturgy</item>\n" +
                    "        <item>Thorn Whip</item>\n" +
                    "        <item>Thunderous Smite</item>\n" +
                    "        <item>Thunderwave</item>\n" +
                    "        <item>Time Stop</item>\n" +
                    "        <item>Tongues</item>\n" +
                    "        <item>Transport via Plants</item>\n" +
                    "        <item>Tree Stride</item>\n" +
                    "        <item>True Polymorph</item>\n" +
                    "        <item>True Resurrection</item>\n" +
                    "        <item>True Seeing</item>\n" +
                    "        <item>True Strike</item>\n" +
                    "        <item>Tsunami</item>\n" +
                    "        <item>Unseen Servant</item>\n" +
                    "        <item>Vampiric Touch</item>\n" +
                    "        <item>Vicious Mockery</item>\n" +
                    "        <item>Wall of Fire</item>\n" +
                    "        <item>Wall of Force</item>\n" +
                    "        <item>Wall of Ice</item>\n" +
                    "        <item>Wall of Stone</item>\n" +
                    "        <item>Wall of Thorns</item>\n" +
                    "        <item>Warding Bond</item>\n" +
                    "        <item>Water Breathing</item>\n" +
                    "        <item>Water Walk</item>\n" +
                    "        <item>Web</item>\n" +
                    "        <item>Weird</item>\n" +
                    "        <item>Wind Walk</item>\n" +
                    "        <item>Wind Wall</item>\n" +
                    "        <item>Wish</item>\n" +
                    "        <item>Witch Bolt</item>\n" +
                    "        <item>Word of Recall</item>\n" +
                    "        <item>Wrathful Smite</item>\n" +
                    "        <item>Zone of Truth</item>\n" +
                    "    </string-array>");
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
