package Tetris;

public class ShapeO extends Piece {

	
	public  boolean WR[][][]= {
			{
				{true, true, false, false},
				{true, true, false, false},
				{false, false, false, false},
				{false, false, false, false},
			},
			{
				{true, true, false, false},
				{true, true, false, false},
				{false, false, false, false},
				{false, false, false, false},
			},
			{
				{true, true, false, false},
				{true, true, false, false},
				{false, false, false, false},
				{false, false, false, false},
			},
			{
				{true, true, false, false},
				{true, true, false, false},
				{false, false, false, false},
				{false, false, false, false},
			},
		};
	
	/** override the original withroatation 
	 * array in the piece to the shape's format**/
	public ShapeO()
	{
		super();
		withRoatation = WR;

	}
//	public static final int NUM = 4;
//	private boolean[][] shape0 = new boolean[NUM][NUM];
//	private boolean[][][] withRoatation = new boolean[4][4][];
//
//	
//		shape0 = super.pieceArray;
//	
//	
//	/** record what the shape would look like after rotation **/
//	
//	shape0[0][1] = true;
//	shape0[0][2] = true;
//	shape0[1][2] = true;
//	shape0[1][1] = true;//yes
//	
//	private boolean[][] shape90 = new boolean[NUM][NUM];
//	private boolean[][] shape180 = new boolean[NUM][NUM];
//	private boolean[][] shape270 = new boolean[NUM][NUM];
//	shape90 = shape0;
//	shape180 = shape0;
//	shape270 = shape0;
//	
//	
//	withRoatation[0]= shape0;
//	withRoatation[1]= shape90;
//	withRoatation[2]= shape180;
//	withRoatation[3]= shape270;
}
