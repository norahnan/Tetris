package Tetris;

public class TetrisGame {


	/** create class varivles**/
	public static final int	RIGHT = 1;
    public static final int	CCW = 2;
	public static final int	CW = 3;
	public static final int	DOWN = 4; 
	public static final int LEFT = 5;
	
	private Board tetrisBoard ;
	private int	numLines ;
	private int	numTetrises = numLines*10 ;

	
	/**constructor**/
	public TetrisGame()
	{
		tetrisBoard = new Board();
	}
	
	/**Try to move the current piece with RIGHT, LEFT, DOWN, CW, CCW**/
	public  void attemptMove(int moveType)
	{   
	
		if (moveType == 5)
		{
			tetrisBoard.moveLeft();
		}
		//&&tetrisBoard.checkValidRotate(tetrisBoard.getRota(),
				//tetrisBoard.getCurrentPieceGridPosition(),tetrisBoard.getPiece())
		else if (moveType == 2)
		{
			tetrisBoard.rotateCW();
			System.out.println("My rota nuumber is "+tetrisBoard.getRota());
			//tetrisBoard.upDateBoard(tetrisBoard.getCurrentPieceGridPosition(),
					//tetrisBoard.getPiece());
		}
		
		else if (moveType == 3)
		{
			
			tetrisBoard.rotateCW();
			System.out.println("My rota nuumber is "+tetrisBoard.getRota());
			//tetrisBoard.upDateBoard(tetrisBoard.getCurrentPieceGridPosition(),
				//r	tetrisBoard.getPiece());

		}
		
		else if (moveType == 4)
		{
			if(!tetrisBoard.moveDown()){
				System.out.println("should land piece");
				
				
				for (int i = 0; i<tetrisBoard.NUM_ROW; i++)
				{
					if (tetrisBoard.checkFullLine(i))
					{
						numLines++;
						System.out.println(numLines);
					}
				}
					
					tetrisBoard.landPiece();
				
				tetrisBoard.generatePiece();
				tetrisBoard.initCurrentGP();
				//tetrisBoard.upDateBoard(currentLocation,myPiece);
			}
			//tetrisBoard.moveDown();

			
		}
		
		else if (moveType == 1)
		{
			tetrisBoard.moveRight();
		}
	}
	
	
	
	/** return the board**/
	public Board getTetrisBoard() 
	{
		return tetrisBoard;
	}
	
	/** return the linesCleared**/
	public int getlinesCleared()
	{
		return numLines;
	}
	
	/** return the tetrisesCleared**/
	public int gettetrisesCleared()
	{
		return numTetrises;
	}
	
	
	
	
}
