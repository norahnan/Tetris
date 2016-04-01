package Tetris;

public class TextView {

	/** create class variables**/
	Board board;
	//TetrisGame game;
	
	/** constructor takes a board and print the array**/
	public TextView(Board b)
	{
		//board = new Board();
        board = b;
		System.out.println(printArray());
	}
	
	/** check the whole boardArray for true values 
	 * and for every spot of true, print x**/
	public java.lang.String printArray()
	{
		String celling="------------------\n";
		String thisOne = "";
		String floor="------------------";
		
		for(int i=0; i<Board.NUM_ROW; i++)
		{
			thisOne = thisOne+"";
			for (int j=0; j<Board.NUM_COL; j++)
			{
				if (board.hasBlock(i,j))
					thisOne = thisOne +"x";
				else
					thisOne = thisOne + "-";	
			}
			thisOne = thisOne +"\n";
		}
		
		
		
		return celling+ thisOne + floor;
	}
			
	
	
	
	
	
}
