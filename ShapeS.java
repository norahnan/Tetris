package Tetris;

public class ShapeS extends Piece {

	
	public  boolean WR[][][]= {
			{
				{false, true, true, false},
				{true, true, false, false},
				{false, false, false, false},
				{false, false, false, false},
			},
			{
				{true, false, false, false},
				{true, true, false, false},
				{false, true, false, false},
				{false, false, false, false},
			},
			{
				{false, true, true, false},
				{true, true, false, false},
				{false, false, false, false},
				{false, false, false, false},
			},
			{
				{true, false, false, false},
				{true, true, false, false},
				{false, true, false, false},
				{false, false, false, false},
			},
		};
	
	/** override the original withroatation 
	 * array in the piece to the shape's format**/
	public ShapeS()
	{
		super();
		withRoatation = WR;

	}
	
//	public static final int NUM = 4;
//	private boolean[][] shape0 = new boolean[NUM][NUM];
//	private boolean[][] shapeTwo = new boolean[NUM][NUM];
//	private boolean[][][] withRoatation = new boolean[4][4][];
//
//	
//	shape0 = super.pieceArray;
//	shapeTwo = super.pieceArray;
//	
//	
//	/** record what the shape would look like after rotation **/
//	
//	shape0[1][1] = true;
//	shape0[1][2] = true;
//	shape0[2][0] = true;
//	shape0[2][1] = true;//yes
//	
//	shape90[0][0] = true;
//	shape90[1][0] = true;
//	shape90[2][1] = true;
//	shape90[1][1] = true;//yes
//	
//	private boolean[][] shape180 = new boolean[NUM][NUM];
//	private boolean[][] shape270 = new boolean[NUM][NUM];
//	shape180 = shape0;
//	shape270 = shape90;
//	
//	
//	withRoatation[0]= shape0;
//	withRoatation[1]= shape90;
//	withRoatation[2]= shape180;
//	withRoatation[3]= shape270;
}
