package mules.moscow.dungeonsanddragons5echaractersheet;
import java.util.ArrayList;

public class AbilityScore {
	private int score;
	private int modifier;
	private ArrayList<Integer> RaceModifiers = new ArrayList<Integer>();
	private ArrayList<Integer> ClassModifiers = new ArrayList<Integer>();
	
        /**
         * AbilityScore constructor. Adds all race modifiers to the ability score.
         * @param base The base score rolled for the player
         * @param RaceList List containing races and their modifiers(?)
         */
	AbilityScore(int base, ArrayList<Integer> RaceList){
		RaceModifiers.addAll(RaceList);
	}
	
        /**
         * Sets the modifier for the player's ability score
         * @param num The base score rolled for the player
         * @param raceIndex The modifier for the score given the player's race
         * @param classIndex The modifier for the score given the player's class(?)
         */
	public void setScore(int num, int raceIndex, int classIndex) {
		this.score = num + RaceModifiers.get(raceIndex) + ClassModifiers.get(classIndex);

		if(score >= 19) {
			this.modifier = 5;
		} else if(score >= 17 && score <19) {
			this.modifier = 4;
		} else if(score >= 15 && score <17) {
			this.modifier = 3;
		} else if(score >= 13 && score <15) {
			this.modifier = 2;
		} else if(score >= 11 && score <13) {
			this.modifier = 1;
		} else if(score == 10) {
			this.modifier = 0;
		} else if(score >= 8 && score <10) {
			this.modifier = -1;
		} else if(score >= 6 && score <8) {
			this.modifier = -2;
		} else if(score >= 4 && score <6) {
			this.modifier = -3;
		} else if(score >= 2 && score <4) {
			this.modifier = -4;
		} else if(score <2){
			this.modifier= -5;
		}
	}
	
        /**
         * returns the player's ability score
         * @return the player's ability score
         */
	public int getScore() {
		return this.score;
	}

        /**
         * returns the player's ability score modifier
         * @return the player's ability score modifier
         */
	public int getModifier() { return this.modifier; }
}
