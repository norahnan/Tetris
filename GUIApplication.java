package Tetris;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

import Assignment2Part2.TreeCollagePanel;

public class GUIApplication {

	/** empty constructer**/
	public GUIApplication()
	{
		
	}
	 //static TetrisGame myGame = new TetrisGame();
	public static final int WIDTH = 400;
	public static final int HEIGHT = 720;
	
	/** the main method that creates a frame add the view to it**/
	public static void main( String[] args )
	{
		
		
		JFrame guiFrame = new JFrame();
		
        guiFrame.setSize( WIDTH, HEIGHT );
		
        guiFrame.add( new GUIController() );
		

	    guiFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

	    guiFrame.setVisible( true );
	}
	
	
	
}
