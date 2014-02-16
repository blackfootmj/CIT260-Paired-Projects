/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author michael
 */

package chkrs ;

import java.util.Scanner;

public class MainMenu {
    
    Scanner input = new Scanner(System.in);
    
    String instructions = "Welcome to Checkers! Plese select an option below to begin.";
    String selection= "Default";
    int menuItems = 6;
    boolean valid = false;
    private final static String[][] menus = {
        {"I", "Game play instructions"}, 
        {"N", "Menu Navigation"},
	{"G", "General"},
	{"R", "Return to previous menu"},
        {"1", "1 Player game"},
	{"2", "2 Player game"},

	};
    
    private MainMenuControl mainMenuControl = new MainMenuControl();
    private Checkers returnTo = new Checkers();
    public MainMenu(){
	
    }
   
    public void displayMenu(){
	System.out.println(this.instructions+"\n");
	
	for(int i = 0; i < this.menuItems; i++){
	    System.out.println(MainMenu.menus[i][0]+ "   " +MainMenu.menus[i][1]);
	}
    }
    public void getInput(){
	do{
	displayMenu();
	System.out.println("\nPlease make your selection now.");
	valid = getCommand(selection);
	
	if(valid){
	    switch(selection){
		case "I": this.mainMenuControl.instructions();
		    break;
		case "N": this.mainMenuControl.navigation();
		    break;
		case "G": this.mainMenuControl.general();
		    break;
		case "R": this.returnTo.displayMenu();
		    break;
                case "1": this.mainMenuControl.navigation();
		    break;
                case "2": this.mainMenuControl.navigation();
		    break;
		}
	}
	}while (valid != true);
    }
    
    public boolean getCommand(String string){
	
	
	boolean valid = false;
	do{
	    selection = input.next().trim().toUpperCase();
	    valid = validateCommand(selection);
	    if(!valid){
		new Error().displayError("Invalid command. Please enter a valid command");
	    }
	}while (!valid);
	return true;
    }
    
    private boolean validateCommand(String command){
	
	for(String[] row : MainMenu.menus){
	    if(row[0].equals(selection)){
		return true;
	    }
	}
	return false;
    }
}
