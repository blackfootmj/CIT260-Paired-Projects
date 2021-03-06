/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package chkrs;

import java.util.Scanner;

/**
 *
 * @author bensmac
 */
public class SelectColMove {
    Scanner input = new Scanner(System.in);
    String instructions = "Please Select the column of where you want to move the piece";
    boolean valid = false;
    private final static String[] validInputs = {"A","B","C","D","E","F","G","H","a","b","c","d","e","f","g","h"};
    String selection;
    public int converted;
    public SelectColMove(){
	
    }
    public int getInput(){
	while(!valid){
	System.out.println(instructions);
	selection = input.next();
	valid = validateCommand(selection);
	    if(valid){
		converted = convertAlpha(selection);
	    }
	}
	return converted;
    }
    private boolean validateCommand(String selection){
	for(int i = 0;i < 16;i++){
	    if(validInputs[i].equals(selection)){
		valid = true;
	    }
	}
	if(!valid){
	    new Error().displayError("Invalid command. Please enter a valid command");
	}
	return valid;
    }
    private int convertAlpha(String selection){
	switch(selection){
	    case "A": converted = 0;
		break;
	    case "B": converted = 1;
		break;
	    case "C": converted = 2;
		break;
	    case "D": converted = 3;
		break;
	    case "E": converted = 4;
		break;
	    case "F": converted = 5;
		break;
	    case "G": converted = 6;
		break;
	    case "H": converted = 7;
		break;
	    case "a": converted = 0;
		break;
	    case "b": converted = 1;
		break;
	    case "c": converted = 2;
		break;
	    case "d": converted = 3;
		break;
	    case "e": converted = 4;
		break;
	    case "f": converted = 5;
		break;
	    case "g": converted = 6;
		break;
	    case "h": converted = 7;
		break;
	}
	
	return converted;
    }
}
