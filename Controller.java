package Tetris;

import java.awt.geom.Point2D;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Controller {

	/** create variables**/
	private static TetrisGame game;
	private static TextView view;
	public static String userinput;
	
	
	/**initialize new game and view**/
	public Controller()
	{
		view = new TextView(game.getTetrisBoard());
		game = new TetrisGame();
		
	}
	
	/** set up the game**/
	public static void main( String[] args )
	{       
		initialGrid();
		readInput();
		    
//			moveEntered(readInput());
//			refreshDisplay();
//			while (args.length > 0 &&! args[0].equals("Quit"))
	}
	
	/** initialize the grid**/
	public static void initialGrid()
	{
		game = new TetrisGame();
		view = new TextView(game.getTetrisBoard());
		//view.getBoardString(); 
 		
		
	}
	
	
    
//    /** Get input from the user, looping until the user types "Quit".**/
//    private static String readInput()
//	{
//		
//		Scanner reader = new Scanner(System.in);  // Reading from System.in
//		String n = reader.nextLine(); // Scans the next token of the input as an int.
//		return n;
//	}
	
	
	/** read the letter that the user inputs and call the according functions**/
	public static void readInput()
	{
		BufferedReader in =new BufferedReader(new InputStreamReader(System.in));
		try{
			String line;
			do{

			 System.out.println("Please enter valid movements: d for down, l for move left, r for move right\n "
			 		+ "cw for rotate clockwise, and ccw for rotate counter clockwise");
 				
				line =in.readLine();
				game.attemptMove(moveEntered(line));
				 refreshDisplay();
				 
			}
			while (!line.equals("Quit"));
		}
		catch (IOException ioe){
			ioe.printStackTrace();
		}
	}
    
	/**Print text view of the game. First, print the number of tetrises cleared. Second, 
print the number of lines cleared. Then, print the Tetris board.**/
	private static void refreshDisplay()
	{
		System.out.println("Tetrises cleared: " + game.gettetrisesCleared());
		System.out.println("Lines cleared: " + game.getlinesCleared());
		System.out.println(view.printArray());

		
		
		
	}
	
	/** turn the entered letter into the int that represent each move**/
	private static int moveEntered(java.lang.String move)
	{
		int step = 0;
		if (move.equals("r"))
		{
			step = 1;
		}
	
		else if (move.equals("l"))
	    {
	    	step = 5;
	  	    //game.attemptMove(5);
  	    }
	    
		else if (move.equals("d"))
		{
	    	step = 4;
			//game.attemptMove(4);
		}
	
		else if (move.equals("z"))
	    {
	    	step = 2;

	    	//game.attemptMove(1);
  	    }
	    
		else if (move.equals("x"))
	    {
	    	step = 3;

	  	//game.attemptMove(1);
  	    }
	    return step;
	}
//	private boolean outBoard = false;
//	public Board myBorad = new Board();
	
	
	
	
	
}
