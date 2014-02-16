
package chkrs;
import java.util.Scanner;



/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author michael
 */
public class CheckCoordinate {
    Scanner input = new Scanner(System.in);
    boolean valid = false;
    private final static String[] validCoordinate = {"0"};
    String selection;
    int converted;
        
        private boolean validateCoordinate(String selection){
	for(int i = 0;i >= 1;i++){
	    if(validCoordinate[i].equals(selection)){
		valid = true;
	    }
	}
            if(!valid){
	    new Error().displayError("Invalid command. Please enter a valid command");
	}
	return valid;
    }
}

