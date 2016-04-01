package Tetris;

import java.awt.geom.Point2D;

public abstract class Piece {

	/**create a 3D array to be the base of different shapes**/
	protected boolean[][][] withRoatation;

//	/** with first dimention indicating what rotation number it is**/
//	protected boolean[][][] withRoatation1 = new boolean[1][4][];

	public int rotationNum = 0;
	private int[] pieceLocation = new int[2];
	/** empty constructor**/
	public Piece ()
	{
		//createArray();
	}
	/** return the piece location**/
	public int[] getPieceLocation()
	{
		return pieceLocation;
	}
	/** create an array that holds the values of a piece**/
	public void createArray()
	{
		for (int i=0;i <4; i++)
		{
			for(int j=0;j <4; j++)
			{
				for(int k=0; k<4;k++)
				{
					withRoatation[i][j][j]=false;

				}
		
			}
		}		
			
	}


	/**Rotate the piece clockwise by 90 degrees.**/
	 
	public int rotateCW()
	{
		return (rotationNum+1)%4;

	}
	
	
	/**Rotate the piece counter-clockwise by 90 degrees.**/
 	public int rotateCCW()
	{
 		return (rotationNum+3)%4;
		
	}
	
	
	
	
}
