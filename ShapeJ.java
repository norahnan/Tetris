package Tetris;

public class ShapeJ extends Piece {

	
	
	public  boolean WR[][][]= {
			{
				{false, true, false, false},
				{false, true, false, false},
				{true, true, false, false},
				{false, false, false, false},
			},
			{
				{true, false, false, false},
				{true, true, true, false},
				{false, false, false, false},
				{false, false, false, false},
			},
			{
				{true, true, false, false},
				{true, false, false, false},
				{true, false, false, false},
				{false, false, false, false},
			},
			{
				{false, false, true, false},
				{true, true, true, false},
				{false, false, false, false},
				{false, false, false, false},
			},
		};
	
	/** override the original withroatation 
	 * array in the piece to the shape's format**/
	public ShapeJ()
	{
		super();
		withRoatation = WR;

	}
	
//	private boolean[][][] withRoatation = new boolean[4][4][];
//
//	public static final int NUM = 4;
//	private boolean[][] shape0 = new boolean[NUM][NUM];
//	private boolean[][] shape90 = new boolean[NUM][NUM];
//	private boolean[][] shape180 = new boolean[NUM][NUM];
//	private boolean[][] shape270 = new boolean[NUM][NUM];
//	
//    shape0 = super.pieceArray;
//	shape90 = super.pieceArray;
//	shape180 = super.pieceArray;
//	shape270 = super.pieceArray;
//	
//	/** record what the shape would look like after rotation of x degrees clockwise**/
//	
//	shape0[0][2] = true;
//	shape0[1][2] = true;
//	shape0[2][2] = true;
//	shape0[2][1] = true;//yes
//	
//	shape90[0][1] = true;
//	shape90[1][3] = true;
//	shape90[1][2] = true;
//	shape90[1][1] = true;//yes
//	
//	shape180[0][2] = true;
//	shape180[1][2] = true;
//	shape180[2][2] = true;
//	shape180[0][3] = true;//yes
//	
//	shape270[2][3] = true;
//	shape270[1][3] = true;
//	shape270[1][2] = true;
//	shape270[1][1] = true;//yes
//	
//	withRoatation[0]= shape0;
//	withRoatation[1]= shape90;
//	withRoatation[2]= shape180;
//	withRoatation[3]= shape270;
}
