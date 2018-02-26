package mules.moscow.dungeonsanddragons5echaractersheet;

import java.util.ArrayList;

public class Alignments {

	private String playerAlignment;
	private ArrayList<String> alignmentList;
	
        /**
         * constructor for the Alignment class.
         * @param alignmentData includes all available alignments
         */
	public Alignments(ArrayList<String> alignmentData) {
		alignmentList = new ArrayList<String>(alignmentData);
		setPlayerAlignment(null);
	}

        /**
         * sets the player's alignment
         * @param playerAlignment the alignment to be assigned to the player
         */
	public void setPlayerAlignment(String playerAlignment) {
		this.playerAlignment = playerAlignment;
	}

        /**
         * returns the player's alignment
         * @return the player's alignment
         */
	public String getPlayerAlignment() {
		return playerAlignment;
	}

	
}
