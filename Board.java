package Tetris;
//Nan Zhuang
import java.awt.geom.Point2D;

import javax.swing.JComponent;

public class Board extends JComponent{

	/** the number of rows and columns**/
	public static final int NUM_ROW = 18;
	public static final int NUM_COL = 10;
	
	/** the 10*18 array of the game board**/
	private boolean[][] boardArray = new boolean[NUM_ROW][NUM_COL];
	
	/** create a object piece to assign it to different shape**/
	public Piece myPiece;
	
	/**Initialize an int array of length two to keep track of 
	 * the grid position of the current piece (row, col)**/
	private int[] currentLocation;
	/** record the possible location with two ints**/
	private int	numCols;
	private int	numRows;
	


	/** the constructer of the board, builds the array generate the piece**/
	public Board()
	{
		buildArray();
		generatePiece();
		//addPiece();
		
		initCurrentGP();
		//upDateBoard(currentLocation,myPiece);
	}
	/** construct board array**/
	public boolean[][] buildArray ()
	{
		for (int i = 0; i<NUM_ROW; i++)
		{
			
			for (int j = 0; j<NUM_COL; j++)
			{
				boardArray[i][j]= false;
			}
		}
		return boardArray;
	}
	
	/**Initialize an int array of length two to keep track of the grid position
	 *  of the current piece (row, col)**/
	public void initCurrentGP()
	{
		currentLocation = new int[2];
		currentLocation[0] = 0;
		currentLocation[1] = 3;
	
	}
	
	/** randomly generate one of the seven shapes**/
	public void generatePiece()
	{
		int thisOne;
		thisOne = (int) Math.floor(7*Math.random());
		if (thisOne == 0)
		{
			myPiece = new ShapeS();
		}
		else if (thisOne == 1)
		{
			myPiece = new ShapeJ();
		}
		else if (thisOne == 2)
		{
			myPiece = new ShapeO();
		}
		else if (thisOne == 3)
		{
			myPiece = new ShapeL();
		}
		else if (thisOne == 4)
		{
			myPiece = new ShapeI();
		}
		else if (thisOne == 5)
		{
			myPiece = new ShapeZ();
		}
		else{
			myPiece = new ShapeJ();
		}
	}
	
	
	/** when a piece cannot go down anymore, add it to the board **/
	public void landPiece()
	{
		for (int i = 0; i<4; i++)
		{
			for (int j = 0; j<4; j++)
			{
				if (myPiece.withRoatation[myPiece.rotationNum][i][j])
				{
					boardArray[i+currentLocation[0]][j+currentLocation[1]]= true;
					clearLine();
				}
				
				//System.out.println(i+currentLocation[0]);
				//boardArray[i+currentLocation[0]][j+currentLocation[1]]=
						//myPiece.withRoatation[myPiece.rotationNum][i][j];
			}
		}
		
	}
	/**add piece onto the board**/
	/**update the boardArray according to the piece and its location**/	
	public void upDateBoard(int[] location, Piece mePiece)
	{
		for (int i = 0; i<4; i++)
		{
			for (int j = 0; j<4; j++)
			{
				boardArray[i+location[0]][j+location[1]]
						=mePiece.withRoatation[mePiece.rotationNum][i][j];
			}
		}
			
	}
	
	
	
	/** check for every little square if it is on the board or have moved outside**/
	public boolean checkBorder(Piece piece, int[] location,int rota)
	{
		boolean outBoard = false;
		
		for (int i = 0; i<4; i++)
		{
			for (int j = 0; j<4; j++)
			{
				if (piece.withRoatation[rota][i][j])
				{
					
					if (location[0]+i> 17 || location[1]+j>9||location[0]+i<0||location[1]+j<0)
					{
						outBoard = true;
						System.out.println("itiis thrunign talsk");
					}
//					else{
//						outBoard = true;
//					}
				}
			}
		}
		return outBoard;
	}
	
	/** check if the new position will conflict with any existing squares**/
	public boolean checkHit(Piece piece,int[] location, int rota)
	{
		boolean hit = false;
		
		//int[] temp = new int[]{currentLocation[0],currentLocation[1]-1};
		
		for (int i = 0; i<4; i++)
		{
			for (int j = 0; j<4; j++)
			{
				if (piece.withRoatation[rota][i][j]&&!checkBorder( piece,location,rota))
				{
					
					if (boardArray[location[0]+i][location[1]+j])
					{
						hit = true;
					}
					else{
						hit = false;
					}
				}
			}
		}
		System.out.println("hello");
		return hit;
	}
	
	/**get the roatation number**/
	public int getRota()
	{
		return myPiece.rotationNum;
	}
	
	/** check (every time when the piece lands) if there is a line is filled**/
	public boolean checkFullLine(int row)
	{
		boolean clear;
		clear = true;
		
			for (int j = 0; j<NUM_COL;j++ )
			if(!boardArray[row][j])
			{
				clear = false;
			}
		
		return clear;
	}
	
	/** get the 2D array of the piece**/
	public boolean[][] getPieceValue()
	{
		return myPiece.withRoatation[myPiece.rotationNum];
		
	}
	
	/** get the piece object**/
	public Piece getPiece()
	{
		return myPiece;
	}
	
	/** get current piece location**/
	public int[] getPlace()
	{
		return currentLocation;
	}
	
	

	
	/** once a whole line if filled with true value, clear the line and move the 
	 *whole board down by one grid
	 */
	public void clearLine()
	{
		for (int i = 0; i<NUM_ROW; i++)
		{
			if(checkFullLine(i))
			{
				for(int j = 0; j<NUM_COL; j++)
				{
					boardArray[i][j]= false;
					
				}
				for(int k = i; k>0;k--)
				{
					for (int m = 0; m<NUM_COL; m++)
					boardArray[k][m] = boardArray[k-1][m];
				}
			}
			
		}
	}
	
	
	
	/** given the rotation angle and shape of the piece, check if rotation is valid**/
	public boolean checkValidRotate(int rotation,int[] location,Piece myePiece)
	{
		int temp = rotation;
		boolean good = false;
		boolean[][] pieceArray = new boolean[4][4];
		pieceArray = myePiece.withRoatation[rotation];
		
		if (!checkHit(myePiece,location,rotation)&&!checkBorder(myePiece,location,rotation))
		{
			good = true;
			System.out.println("rota is good");
		}
		
		return good;
	}
	
	

	/**Check if rotating clockwise is valid. If so, 
	 * rotate the current piece clockwise by 90 degrees.**/
	 
	public void rotateCW()
	{
		if(checkValidRotate(myPiece.rotateCW(),currentLocation,myPiece))
		{
			myPiece.rotationNum = myPiece.rotateCW();
		}
	}
	
	

		/**Check if rotating counterclockwise is valid. If so, 
		 * rotate the current piece clockwise by 90 degrees.**/
		 
	public void rotateCCW()
	{
	    if(checkValidRotate(myPiece.rotateCCW(),currentLocation,myPiece))
			{
				myPiece.rotationNum = myPiece.rotateCCW();
			}
	}
	
	
	
	/** calculate the new location after the movements of a piece, check if the new location
	 * would cause an error if no change the current location to the 
	 * intended one**/
	public boolean moveLeft()
	{
		boolean canMoveL = false;
//		int[] newL = new int[2];
//		newL[0] = currentLocation[0];
		int[] temp = new int[]{currentLocation[0],currentLocation[1]-1};
		
		if (!checkBorder(myPiece,temp,myPiece.rotationNum))
		{ if(!checkHit(myPiece,temp,myPiece.rotationNum))	
		{
			canMoveL = true;
			currentLocation = temp;
			for (int i = 0; i<4; i++)
			{
				for (int j = 0; j<4; j++)
				{
					if (myPiece.withRoatation[myPiece.rotationNum][i][j])
					{
						boardArray[0+i][3+j]= false;
						//System.out.println("is moving left");
					}
				}
					
			}
		}
		}
		return canMoveL;
		
	}
	
	
	/** calculate the new location after the movements of a piece, check if the new location
	 * would cause an error if no change the current location to the 
	 * intended one**/
	public boolean moveRight()
	{
		boolean canMoveR = false;
		int[] temp = new int[]{currentLocation[0],currentLocation[1]+1};
		
		if (!checkBorder(myPiece,temp,myPiece.rotationNum))
		{ if(!checkHit(myPiece,temp,myPiece.rotationNum))
		  {
			canMoveR = true;
			currentLocation= temp;
			for (int i = 0; i<4; i++)
			{
				for (int j = 0; j<4; j++)
				{
					if (myPiece.withRoatation[myPiece.rotationNum][i][j])
					{
						boardArray[0+i][3+j]= false;
					}
				}
					
			}

		}
		}
		return canMoveR;
	}
	
	
	/** calculate the new location after the movements of a piece, check if the new location
	 * would cause an error if no change the current location to the 
	 * intended one**/
	public boolean moveDown()
	{
		boolean canMoveD = false;
		int[] temp = new int[]{currentLocation[0]+1,currentLocation[1]};
		
		if (!checkBorder(myPiece,temp,myPiece.rotationNum))
		{ if(!checkHit(myPiece,temp,myPiece.rotationNum))
		{
			canMoveD = true;
			currentLocation[0]++;
			//System.out.println("This is " + currentLocation[0]+"   "+currentLocation[1]);
			
			for (int i = 0; i<4; i++)
			{
				for (int j = 0; j<4; j++)
				{
					if (myPiece.withRoatation[myPiece.rotationNum][i][j])
					{
						boardArray[0+i][3+j]= false;
					}
				}
					
			}
				
			
		}
			
		}
		System.out.println(currentLocation[0]+"    "+ currentLocation[1]); 
		return canMoveD;
	}
	
	/**get number of columns**/
	public int getNumCols()
	{
		return numCols;
	}
	
	/**get number of rows**/
	public int getNumRows()
	{
		return numRows;
	}
	
	
	/** get current location**/
	public int[] getCurrentPieceGridPosition() 
	{
		return currentLocation;
	}
	
	/**	Check if there is a block in the row and column.**/
	public boolean	hasBlock(int row, int col)
	{
		//System.out.println("Current piece board is "+currentLocation[0]);
		int[] temp = new int[]{currentLocation[0],currentLocation[1]};
        boolean value = false;
		if (boardArray[row][col]==true)
		{
			value = true;
		}
			else
			{
				for (int i = 0; i<4; i++)
			    {
				    for (int j = 0; j<4; j++)
			        	{
					      
					      if (myPiece.withRoatation[myPiece.rotationNum][i][j])
							      {
//					    	  System.out.print("temp0 is "+ 
//                                          temp[0]+"\n"+"temp1 is "+temp[1]+"\n"
//                                        		  +"col is "+col+"\n"+
//                                          "row is " + row+"\n");
					    	          if (i+temp[0]==row)
					                       {
					    	        	       if(j+temp[1]==col) 
					    	        	           {
                                                       value=  true;
                                              System.out.println(row+" hasblock "+col );
						                           }
					                       }
							      }
					      
				         }
			    }
				
			}
				
		
			return value;
	}
	
	
	
	
	
	
	
	
	
}
