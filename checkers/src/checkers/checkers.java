/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package checkers;

import java.util.Scanner;

/**
 *
 * @author Michael
 */
public class checkers {
    Scanner input = new Scanner(System.in);
    
    String name = "bbbbbbb";
    String instructions = "This a a java version of checkers. \nI Hope you enjoy playing this game."
	    + "\nYou can use the help menu any time you want to get help. Have fun!!!";
    int menuItems = 3;
    public String[][] menus = {
        {"S", "Start a new game."}, 
        {"H", "Display the help menu."},
	{"Q", "Quit and exit."},
	};
    String selection = "Default";
    
    public static void main(String[] args) {
	int total = 0;
	GetPoints getpoints = new GetPoints();
	total = getpoints.getpoints();
	if(total >= 0){
	System.out.println(total);
        Winner winner = new Winner();
        total = winner.winner();
        if(total >= 500){
        System.out.println(total);
        }
	}
        
	checkers myGame = new checkers();
	myGame.getName();
	myGame.displayMenu();
	myGame.action();
	
	
	
    }
    public void getName(){
	
	System.out.println("Please enter your name.");
	this.name = input.next().trim();
    }
    public void displayMenu(){
	System.out.println("\nWelcome "+ this.name + "\n");
	System.out.println(this.instructions+"\n");
	
	for(int i = 0; i < this.menuItems; i++){
	    System.out.println(this.menus[i][0]+ "   " +this.menus[i][1]);
	}
	
	System.out.println("\nPlease make your selection now.");
	this.selection = input.next().toUpperCase().trim();	
	
    }
    public void action(){
	System.out.println("----"+this.selection+"----");
	if("S".equals(this.selection)){
	    MenuGame start = new MenuGame();
	    start.displayMenu();
	    System.out.println("sssss");
	}
	else if("H".equals(this.selection)){
	    MenuHelp help = new MenuHelp();
	    System.out.println("Help is on the way.");
	    
	}
	else if("Q".equals(this.selection)){
	    System.out.println("Good Bye");
	}
	else{
	    System.out.println("Incorrect Section");
	}
    }
    
}
