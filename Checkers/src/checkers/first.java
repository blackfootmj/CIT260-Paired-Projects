/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package checkers;

import java.util.Scanner;

/**
 *
 * @author michael
 */
public class function_variable.java {
    // Instance variable
    String name;
    String instructions = "This is the game of checkers. \n\n"
            +"You will be playing versus the computer in this game.n\"
            +"I will be \"RED\" and you will be \"BLACK\"\n"
            +"The object of the game is to have all of your peices\n"
            +"remaining at the end of the game. You lose peices if\n"
            +"you are jumped by an opponent. Pieces can be moved in\n"
            +"diagonal places only. \"RED\" pieces are placed on black\n"
            +"\"BLACK\" pieces are on red \"SQUARES\". The squares make\n"
            +"the board. You cannot change square colors unless you are\n"
            +"made into a \"KING\". A king is made when you reach the\n"
            +"the other end of the playing board surface\n\n";
    public static void main(String[] args) {
        
    }
       /*
        * A prompt will be created for the user to enter their name and
        * will ask them to save it
        */     
    
    public void getName() {
           Scanner input = new Scanner(System.in);
           System.out.println("Enter your name: ");
           this.name = input.next();
    }
    /*
     * Displays the main menu screen and the welcome message
     */
    public void displayHelp() {
        System.out.println("\nWelcome " this.name + "\n");
        System.out.println(this.instructions);
    }
}
