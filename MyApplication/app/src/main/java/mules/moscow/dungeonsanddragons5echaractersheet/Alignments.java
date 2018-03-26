package mules.moscow.dungeonsanddragons5echaractersheet;

import java.util.ArrayList;
import java.util.Arrays;

public class Alignments {

	private String playerAlignment;
	private ArrayList<String> alignmentList;
	
        /**
         * constructor for the Alignment class.
         */
	public Alignments() {
		alignmentList = new ArrayList<String>(Arrays.asList("Lawful Good", "Neutral Good", "Chaotic Good", "Lawful Neutral",
				"True Neutral", "Chaotic Neutral", "Lawful Evil", "Neutral Evil", "Chaotic Evil"));
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

	public ArrayList<String> getAlignmentList(){
	    return alignmentList;
    }

	
}
