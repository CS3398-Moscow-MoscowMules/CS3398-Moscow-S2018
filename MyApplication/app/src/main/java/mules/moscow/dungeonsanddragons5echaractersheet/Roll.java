/*
    class for rolling a random number between 1 and the value given
*/

package mules.moscow.dungeonsanddragons5echaractersheet;
import java.util.Random;


public class Roll {
          
    /**
     * constructor for Roll. takes an integer and sets result to a random number between 1 and that integer.
     * @param max_roll the max number that can be generated
     * @return the random number generated
     */
    public int Roll( int max_roll ){
        
        Random rand = new Random();
        int result = rand.nextInt( max_roll ) + 1;
        return( result );
        
    }
    

    
}
