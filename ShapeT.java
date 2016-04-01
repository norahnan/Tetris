package Tetris;

public class ShapeT extends Piece {

	
	public  boolean WR[][][]= {
			{
				{false, true, false, false},
				{true, true, true, false},
				{false, false, false, false},
				{false, false, false, false},
			},
			{
				{false, true, false, false},
				{false, true, true, false},
				{false, true, false, false},
				{false, false, false, false},
			},
			{
				{true, true, true, false},
				{false, true, false, false},
				{false, false, false, false},
				{false, false, false, false},
			},
			{
				{false, true, false, false},
				{true, true, false, false},
				{false, true, false, false},
				{false, false, false, false},
			},
		};
	
	/** override the original withroatation 
	 * array in the piece to the shape's format**/
	public ShapeT()
	{
		super();
		withRoatation = WR;

	}
	
//	public static final int NUM = 4;
//	private boolean[][] shape0 = new boolean[NUM][NUM];
//	private boolean[][] shape180 = new boolean[NUM][NUM];
//    private boolean[][] shape90 = new boolean[NUM][NUM];
//    private boolean[][] shape270 = new boolean[NUM][NUM];
//	private boolean[][][] withRoatation = new boolean[4][4][];
//
//	
//    shape0 = super.pieceArray;
//    shape180 = super.pieceArray;
//	shape90 = super.pieceArray;
//	shape270 = super.pieceArray;
//
//	
//	/** record what the shape would look like after rotation **/
//	
//	shape0[1][1] = true;
//	shape0[1][2] = true;
//	shape0[1][0] = true;
//	shape0[2][1] = true;//yes
//	
//	shape180[0][1] = true;
//	shape180[1][0] = true;
//	shape180[1][2] = true;
//	shape180[1][1] = true;//yes
//	
//	shape90[0][1] = true;
//	shape90[2][1] = true;
//	shape90[1][0] = true;
//	shape90[1][1] = true;//yes
//	
//	shape270[0][1] = true;
//	shape270[2][1] = true;
//	shape270[1][2] = true;
//	shape270[1][1] = true;//yes
//	
//	
//	withRoatation[0]= shape0;
//	withRoatation[1]= shape90;
//	withRoatation[2]= shape180;
//	withRoatation[3]= shape270;
}
