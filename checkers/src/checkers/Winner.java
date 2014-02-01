/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package checkers;

import java.util.Scanner;
 
public class Winner {
    int won = 12;
    int lost = 6;
    int total = 0;
    
    Scanner input = new Scanner(System.in);
    private int Win;
    private int Loss;

    public int winner (){
	if (won > 11){
	    System.out.println("You Win");
	    return Win;
	}
	if (lost > 11 ){
	    System.out.println("You Lose");
	    return Loss;
        }
  
   
	total = ((won * 100) + (lost * 50));

         return total; 
    }
    
    
    
}
