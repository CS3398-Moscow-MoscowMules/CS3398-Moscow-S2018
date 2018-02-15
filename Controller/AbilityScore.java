package se_DungeonsAndDragons;

import java.util.ArrayList;

public class AbilityScore {
	private int score;
	private ArrayList<Integer> RaceModifiers = new ArrayList<Integer>();
	private ArrayList<Integer> ClassModifiers = new ArrayList<Integer>();
	
	AbilityScore(int base, ArrayList<Integer> RaceList){
		RaceModifiers.addAll(RaceList);
	}
	
	public void setScore(int num, int raceIndex, int classIndex) {
		this.score = num + RaceModifiers.get(raceIndex) + ClassModifiers.get(classIndex);
	}
	
	public int getScore() {
		return this.score;
	}
}
