package mules.moscow.dungeonsanddragons5echaractersheet;

import java.util.ArrayList;

public class Alignments {

	private String playerAlignment;
	private ArrayList<String> alignmentList;
	
	public Alignments(ArrayList<String> alignmentData) {
		alignmentList = new ArrayList<String>(alignmentData);
		setPlayerAlignment(null);
	}

	public void setPlayerAlignment(String playerAlignment) {
		this.playerAlignment = playerAlignment;
	}

	public String getPlayerAlignment() {
		return playerAlignment;
	}

	
}
