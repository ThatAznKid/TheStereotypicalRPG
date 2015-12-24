import java.io.*;
import java.util.*;

public class MyRPG { 
     
    private Character noob;
    private InputStreamReader isr;
    private BufferedReader in;
    
    public MyRPG () { 
    	isr = new InputStreamReader( System.in );
    	in = new BufferedReader( isr );
    	newGame (); 
    }
    
    public static void printWithDelay (String s) { 
	for ( int x = 0 ; x < s.length() ; x++ ) { 
	    System.out.print (s.substring(x,x+1)); 
	    try {
		Thread.sleep(25); 
	    } catch (Exception e) {
		e.printStackTrace();
	    }
	}
    }// end printWithDelay

    public void newGame() { 

	//starting a new game... 
	//let's get that name of yours...
	String s; 
	String name = "";
	int holder = -1;
	s= "Welcome to the Stereotypical RPG!\n"; 
	s+= "What would you like to be called?\n"; 
	s+= "Please enter your name:\n";
	printWithDelay (s); 
	try {
	    name = in.readLine();
	}
	catch ( IOException e ) { }
       
	//done with the intro, time to pick a class
	s= "Ah, I see.\n"; 
	s+= "Pleased to meet you, " + name + ". "; 
	s+= "Well, what class happens to tickle your fancy? "; 
	s+= "You only have a choice between a warrior and a mage right now, but they each have so many paths that you may find it almost diffucult to differentiate between some of your fellow warriors and mages.\n"; 
	s+= "Pick the number choice of the class you'd like.\n"; 
	s+= "1. Warrior\n"; 
	s+= "2. Mage\n"; 
	printWithDelay (s); 
	try {
	    holder = Integer.parseInt(in.readLine());
	}
	catch ( IOException e ) { }

	//time to begin? initialize a new one
	s= "I see...I see...\n"; 
	s+= "Well, it appears it is time to start your adventure..."; 
	printWithDelay (s); 
	if (holder == 1) { 
	    noob = new Warrior (name); 
	} 
	else { 
	    noob = new Mage(name); 
	}
	
    }//end newGame 

    public static void main (String [] args) { 
	MyRPG game = new MyRPG();
    }// end main
    
}//end class myRPG
